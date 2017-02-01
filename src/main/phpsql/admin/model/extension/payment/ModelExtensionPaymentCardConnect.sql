install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."cardconnect_order` (
			  `cardconnect_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL DEFAULT '0',
			  `customer_id` INT(11) NOT NULL DEFAULT '0',
			  `payment_method` VARCHAR(255) NOT NULL DEFAULT '',
			  `retref` VARCHAR(12) NOT NULL DEFAULT '',
			  `authcode` VARCHAR(6) NOT NULL DEFAULT '',
			  `currency_code` VARCHAR(3) NOT NULL DEFAULT '',
			  `total` DECIMAL(10, 2) NOT NULL DEFAULT '0.00',
			  `date_added` DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  PRIMARY KEY (`cardconnect_order_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci")
#END
getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."cardconnect_order_transaction` WHERE `cardconnect_order_id` = '".(int)$cardconnect_order_id."' AND (`type` = 'payment' OR `type` = 'refund')")
#END
updateTransactionStatusByRetref=$this->db->query("UPDATE `".DB_PREFIX."cardconnect_order_transaction` SET `status` = '".$this->db->escape($status)."', `date_modified` = NOW() WHERE `retref` = '".$this->db->escape($retref)."'")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."cardconnect_order_transaction` (
			  `cardconnect_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `cardconnect_order_id` INT(11) NOT NULL DEFAULT '0',
			  `type` VARCHAR(50) NOT NULL DEFAULT '',
			  `retref` VARCHAR(12) NOT NULL DEFAULT '',
			  `amount` DECIMAL(10, 2) NOT NULL DEFAULT '0.00',
			  `status` VARCHAR(255) NOT NULL DEFAULT '',
			  `date_modified` DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  `date_added` DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  PRIMARY KEY (`cardconnect_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."cardconnect_order`")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."cardconnect_card`")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."cardconnect_card` (
			  `cardconnect_card_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `cardconnect_order_id` INT(11) NOT NULL DEFAULT '0',
			  `customer_id` INT(11) NOT NULL DEFAULT '0',
			  `profileid` VARCHAR(16) NOT NULL DEFAULT '',
			  `token` VARCHAR(19) NOT NULL DEFAULT '',
			  `type` VARCHAR(50) NOT NULL DEFAULT '',
			  `account` VARCHAR(4) NOT NULL DEFAULT '',
			  `expiry` VARCHAR(4) NOT NULL DEFAULT '',
			  `date_added` DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  PRIMARY KEY (`cardconnect_card_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."cardconnect_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."cardconnect_order_transaction` WHERE `cardconnect_order_id` = '".(int)$cardconnect_order_id."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."cardconnect_order_transaction` SET `cardconnect_order_id` = '".(int)$cardconnect_order_id."', `type` = '".$this->db->escape($type)."', `retref` = '".$this->db->escape($retref)."', `amount` = '".(float)$amount."', `status` = '".$this->db->escape($status)."', `date_modified` = NOW(), `date_added` = NOW()")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."cardconnect_order_transaction`")
#END
