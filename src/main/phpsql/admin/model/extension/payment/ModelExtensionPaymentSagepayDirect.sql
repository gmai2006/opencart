install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."sagepay_direct_order_transaction` (
			  `sagepay_direct_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `sagepay_direct_order_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('auth', 'payment', 'rebate', 'void') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`sagepay_direct_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."sagepay_direct_order_recurring` (
			  `sagepay_direct_order_recurring_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `order_recurring_id` INT(11) NOT NULL,
			  `VPSTxId` VARCHAR(50),
			  `VendorTxCode` VARCHAR(50) NOT NULL,
			  `SecurityKey` CHAR(50) NOT NULL,
			  `TxAuthNo` INT(50),
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `next_payment` DATETIME NOT NULL,
			  `trial_end` datetime DEFAULT NULL,
			  `subscription_end` datetime DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`sagepay_direct_order_recurring_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."sagepay_direct_order_transaction`;")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_direct_order_transaction` WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."'")
#END
getTotalRebated=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."sagepay_direct_order_transaction` WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."' AND 'rebate'")
#END
install3=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."sagepay_direct_card` (
			  `card_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `customer_id` INT(11) NOT NULL,
			  `token` VARCHAR(50) NOT NULL,
			  `digits` VARCHAR(4) NOT NULL,
			  `expiry` VARCHAR(5) NOT NULL,
			  `type` VARCHAR(50) NOT NULL,
			  PRIMARY KEY (`card_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
updateReleaseStatus=$this->db->query("UPDATE `".DB_PREFIX."sagepay_direct_order` SET `release_status` = '".(int)$status."' WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."'")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."sagepay_direct_order` SET `void_status` = '".(int)$status."' WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."'")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."sagepay_direct_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."sagepay_direct_order` (
			  `sagepay_direct_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `VPSTxId` VARCHAR(50),
			  `VendorTxCode` VARCHAR(50) NOT NULL,
			  `SecurityKey` CHAR(50) NOT NULL,
			  `TxAuthNo` INT(50),
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `release_status` INT(1) DEFAULT NULL,
			  `void_status` INT(1) DEFAULT NULL,
			  `settle_type` INT(1) DEFAULT NULL,
			  `rebate_status` INT(1) DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  `card_id` INT(11),
			  PRIMARY KEY (`sagepay_direct_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
updateRebateStatus=$this->db->query("UPDATE `".DB_PREFIX."sagepay_direct_order` SET `rebate_status` = '".(int)$status."' WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_direct_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_direct_order_transaction` SET `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(float)$total."'")
#END
getTotalReleased=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."sagepay_direct_order_transaction` WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."' AND (`type` = 'payment' OR `type` = 'rebate')")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."sagepay_direct_order_recurring`;")
#END
uninstall3=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."sagepay_direct_card`;")
#END
