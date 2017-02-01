install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."eway_transactions` (
			  `eway_order_transaction_id` int(11) NOT NULL AUTO_INCREMENT,
			  `eway_order_id` int(11) NOT NULL,
			  `transaction_id` VARCHAR(24) NOT NULL,
			  `created` DATETIME NOT NULL,
			  `type` ENUM('auth', 'payment', 'refund', 'void') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`eway_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."eway_card` (
			  `card_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `customer_id` INT(11) NOT NULL,
			  `order_id` INT(11) NOT NULL,
			  `token` VARCHAR(50) NOT NULL,
			  `digits` VARCHAR(4) NOT NULL,
			  `expiry` VARCHAR(5) NOT NULL,
			  `type` VARCHAR(50) NOT NULL,
			  PRIMARY KEY (`card_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."eway_transactions`;")
#END
updateTransactionId=$this->db->query("UPDATE `".DB_PREFIX."eway_order` SET `transaction_id` = '".$transaction_id."' WHERE `eway_order_id` = '".(int)$eway_order_id."'")
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."eway_transactions` WHERE `eway_order_id` = '".(int)$eway_order_id."' AND `type` = 'refund'")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."eway_transactions` WHERE `eway_order_id` = '".(int)$eway_order_id."'")
#END
updateRefundStatus=$this->db->query("UPDATE `".DB_PREFIX."eway_order` SET `refund_status` = '".(int)$status."' WHERE `eway_order_id` = '".(int)$eway_order_id."'")
#END
updateCaptureStatus=$this->db->query("UPDATE `".DB_PREFIX."eway_order` SET `capture_status` = '".(int)$status."' WHERE `eway_order_id` = '".(int)$eway_order_id."'")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."eway_order` SET `void_status` = '".(int)$status."' WHERE `eway_order_id` = '".(int)$eway_order_id."'")
#END
getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."eway_transactions` WHERE `eway_order_id` = '".(int)$eway_order_id."' AND `type` = 'payment' ")
#END
addRefundRecord=$this->db->query("UPDATE `".DB_PREFIX."eway_order` SET `modified` = NOW(), refund_amount = '".(double)$refund_amount."', `refund_transaction_id` = '".$this->db->escape($order['refund_transaction_id'])."' WHERE eway_order_id = '".$order['eway_order_id']."'")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."eway_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."eway_order` (
			  `eway_order_id` int(11) NOT NULL AUTO_INCREMENT,
			  `order_id` int(11) NOT NULL,
			  `created` DATETIME NOT NULL,
			  `modified` DATETIME NOT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `transaction_id` VARCHAR(24) NOT NULL,
			  `debug_data` TEXT,
			  `capture_status` INT(1) DEFAULT NULL,
			  `void_status` INT(1) DEFAULT NULL,
			  `refund_status` INT(1) DEFAULT NULL,
			  PRIMARY KEY (`eway_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."eway_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."eway_transactions` SET `eway_order_id` = '".(int)$eway_order_id."', `created` = NOW(), `transaction_id` = '".$this->db->escape($transactionid)."', `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($total,$currency,false,false)."'")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."eway_card`;")
#END
