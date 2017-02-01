install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."bluepay_hosted_order_transaction` (
			  `bluepay_hosted_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `bluepay_hosted_order_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('auth', 'payment', 'rebate', 'void') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`bluepay_hosted_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."bluepay_hosted_card` (
			  `card_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `customer_id` INT(11) NOT NULL,
			  `token` VARCHAR(50) NOT NULL,
			  `digits` VARCHAR(4) NOT NULL,
			  `expiry` VARCHAR(5) NOT NULL,
			  `type` VARCHAR(50) NOT NULL,
			  PRIMARY KEY (`card_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."bluepay_hosted_order_transaction`;")
#END
updateTransactionId=$this->db->query("UPDATE `".DB_PREFIX."bluepay_hosted_order` SET `transaction_id` = '".(int)$transaction_id."' WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."'")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."bluepay_hosted_order_transaction` WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."'")
#END
getTotalRebated=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."bluepay_hosted_order_transaction` WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."' AND 'rebate'")
#END
updateReleaseStatus=$this->db->query("UPDATE `".DB_PREFIX."bluepay_hosted_order` SET `release_status` = '".(int)$status."' WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."'")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."bluepay_hosted_order` SET `void_status` = '".(int)$status."' WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."'")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."bluepay_hosted_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."bluepay_hosted_order` (
			  `bluepay_hosted_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `transaction_id` VARCHAR(50),
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `release_status` INT(1) DEFAULT 0,
			  `void_status` INT(1) DEFAULT 0,
			  `rebate_status` INT(1) DEFAULT 0,
			  `currency_code` CHAR(3) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`bluepay_hosted_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
updateRebateStatus=$this->db->query("UPDATE `".DB_PREFIX."bluepay_hosted_order` SET `rebate_status` = '".(int)$status."' WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."bluepay_hosted_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."bluepay_hosted_order_transaction` SET `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(float)$total."'")
#END
getTotalReleased=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."bluepay_hosted_order_transaction` WHERE `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."' AND (`type` = 'payment' OR `type` = 'rebate')")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."bluepay_hosted_card`;")
#END
