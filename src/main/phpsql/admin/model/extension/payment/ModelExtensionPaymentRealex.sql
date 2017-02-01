install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."realex_order_transaction` (
			  `realex_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `realex_order_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('auth', 'payment', 'rebate', 'void') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`realex_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."realex_order` SET `void_status` = '".(int)$status."' WHERE `realex_order_id` = '".(int)$realex_order_id."'")
#END
getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."realex_order_transaction` WHERE `realex_order_id` = '".(int)$realex_order_id."' AND (`type` = 'payment' OR `type` = 'rebate')")
#END
updateForRebate=$this->db->query("UPDATE `".DB_PREFIX."realex_order` SET `order_ref_previous` = '_multisettle_".$this->db->escape($order_ref)."', `pasref_previous` = '".$this->db->escape($pas_ref)."' WHERE `realex_order_id` = '".(int)$realex_order_id."' LIMIT 1")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."realex_order` (
			  `realex_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `order_ref` CHAR(50) NOT NULL,
			  `order_ref_previous` CHAR(50) NOT NULL,
			  `pasref` VARCHAR(50) NOT NULL,
			  `pasref_previous` VARCHAR(50) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `capture_status` INT(1) DEFAULT NULL,
			  `void_status` INT(1) DEFAULT NULL,
			  `settle_type` INT(1) DEFAULT NULL,
			  `rebate_status` INT(1) DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `authcode` VARCHAR(30) NOT NULL,
			  `account` VARCHAR(30) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`realex_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
updateRebateStatus=$this->db->query("UPDATE `".DB_PREFIX."realex_order` SET `rebate_status` = '".(int)$status."' WHERE `realex_order_id` = '".(int)$realex_order_id."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."realex_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."realex_order_transaction` WHERE `realex_order_id` = '".(int)$realex_order_id."'")
#END
getTotalRebated=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."realex_order_transaction` WHERE `realex_order_id` = '".(int)$realex_order_id."' AND 'rebate'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."realex_order_transaction` SET `realex_order_id` = '".(int)$realex_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(float)$total."'")
#END
updateCaptureStatus=$this->db->query("UPDATE `".DB_PREFIX."realex_order` SET `capture_status` = '".(int)$status."' WHERE `realex_order_id` = '".(int)$realex_order_id."'")
#END
