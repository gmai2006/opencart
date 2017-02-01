install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."g2apay_order_transaction` (
			  `g2apay_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `g2apay_order_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('payment', 'refund') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`g2apay_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
			")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."g2apay_order_transaction`;")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."g2apay_order`;")
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."g2apay_order_transaction` WHERE `g2apay_order_id` = '".(int)$g2apay_order_id."' AND 'refund'")
#END
install=$this->db->query("
			CREATE TABLE `".DB_PREFIX."g2apay_order` (
				`g2apay_order_id` INT(11) NOT NULL AUTO_INCREMENT,
				`order_id` int(11) NOT NULL,
				`g2apay_transaction_id` varchar(255) NOT NULL,
				`date_added` DATETIME NOT NULL,
				`modified` DATETIME NOT NULL,
				`refund_status` INT(1) DEFAULT NULL,
				`currency_code` CHAR(3) NOT NULL,
				`total` DECIMAL( 10, 2 ) NOT NULL,
				KEY `g2apay_transaction_id` (`g2apay_transaction_id`),
				PRIMARY KEY `g2apay_order_id` (`g2apay_order_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."g2apay_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."g2apay_order_transaction` WHERE `g2apay_order_id` = '".(int)$g2apay_order_id."'")
#END
updateRefundStatus=$this->db->query("UPDATE `".DB_PREFIX."g2apay_order` SET `refund_status` = '".(int)$status."' WHERE `g2apay_order_id` = '".(int)$g2apay_order_id."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."g2apay_order_transaction` SET `g2apay_order_id` = '".(int)$g2apay_order_id."',`date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(double)$total."'")
#END
getTotalReleased=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."g2apay_order_transaction` WHERE `g2apay_order_id` = '".(int)$g2apay_order_id."' AND (`type` = 'payment' OR `type` = 'refund')")
#END
