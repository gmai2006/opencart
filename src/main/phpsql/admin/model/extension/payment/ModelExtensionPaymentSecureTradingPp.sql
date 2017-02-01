install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."securetrading_pp_order_transaction` (
			  `securetrading_pp_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `securetrading_pp_order_id` INT(11) NOT NULL,
			  `created` DATETIME NOT NULL,
			  `type` ENUM('auth', 'payment', 'rebate', 'reversed') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`securetrading_pp_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."securetrading_pp_order_transaction`;")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."securetrading_pp_order_transaction` WHERE `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."'")
#END
getTotalRebated=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."securetrading_pp_order_transaction` WHERE `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."' AND 'rebate'")
#END
updateReleaseStatus=$this->db->query("UPDATE `".DB_PREFIX."securetrading_pp_order` SET `release_status` = '".(int)$status."' WHERE `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."'")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."securetrading_pp_order` SET `void_status` = '".(int)$status."' WHERE `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."'")
#END
updateForRebate=$this->db->query("UPDATE `".DB_PREFIX."securetrading_pp_order` SET `order_ref_previous` = '_multisettle_".$this->db->escape($order_ref)."' WHERE `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."' LIMIT 1")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS ".DB_PREFIX."securetrading_pp_order")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."securetrading_pp_order` (
			  `securetrading_pp_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `transaction_reference` varchar(127) DEFAULT NULL,
			  `created` DATETIME NOT NULL,
			  `modified` DATETIME NOT NULL,
			  `release_status` INT(1) DEFAULT NULL,
			  `void_status` INT(1) DEFAULT NULL,
			  `settle_type` INT(1) DEFAULT NULL,
			  `rebate_status` INT(1) DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`securetrading_pp_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
increaseRefundedAmount=$this->db->query("UPDATE ".DB_PREFIX."securetrading_pp_order SET refunded = refunded + ".(double)$amount." WHERE order_id = ".(int)$order_id)
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."securetrading_pp_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."securetrading_pp_order_transaction` SET `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."', `created` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(double)$total."'")
#END
getTotalReleased=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."securetrading_pp_order_transaction` WHERE `securetrading_pp_order_id` = '".(int)$securetrading_pp_order_id."' AND (`type` = 'payment' OR `type` = 'rebate')")
#END
