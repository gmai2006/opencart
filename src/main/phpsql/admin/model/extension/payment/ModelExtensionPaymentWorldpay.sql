install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."worldpay_order_transaction` (
			  `worldpay_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `worldpay_order_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('payment', 'refund') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`worldpay_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."worldpay_order_recurring` (
			  `worldpay_order_recurring_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `order_recurring_id` INT(11) NOT NULL,
			  `order_code` VARCHAR(50),
			  `token` VARCHAR(50),
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `next_payment` DATETIME NOT NULL,
			  `trial_end` datetime DEFAULT NULL,
			  `subscription_end` datetime DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`worldpay_order_recurring_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."worldpay_order_transaction`;")
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."worldpay_order_transaction` WHERE `worldpay_order_id` = '".(int)$worldpay_order_id."' AND 'refund'")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."worldpay_order_transaction` WHERE `worldpay_order_id` = '".(int)$worldpay_order_id."'")
#END
updateRefundStatus=$this->db->query("UPDATE `".DB_PREFIX."worldpay_order` SET `refund_status` = '".(int)$status."' WHERE `worldpay_order_id` = '".(int)$worldpay_order_id."'")
#END
install3=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."worldpay_card` (
			  `card_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `customer_id` INT(11) NOT NULL,
			  `order_id` INT(11) NOT NULL,
			  `token` VARCHAR(50) NOT NULL,
			  `digits` VARCHAR(22) NOT NULL,
			  `expiry` VARCHAR(5) NOT NULL,
			  `type` VARCHAR(50) NOT NULL,
			  PRIMARY KEY (`card_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."worldpay_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."worldpay_order` (
			  `worldpay_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `order_code` VARCHAR(50),
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `refund_status` INT(1) DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`worldpay_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."worldpay_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."worldpay_order_transaction` SET `worldpay_order_id` = '".(int)$worldpay_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(double)$total."'")
#END
getTotalReleased=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."worldpay_order_transaction` WHERE `worldpay_order_id` = '".(int)$worldpay_order_id."' AND (`type` = 'payment' OR `type` = 'refund')")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."worldpay_order_recurring`;")
#END
uninstall3=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."worldpay_card`;")
#END
