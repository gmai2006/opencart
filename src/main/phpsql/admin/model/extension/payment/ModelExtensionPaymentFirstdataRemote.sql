install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."firstdata_remote_order_transaction` (
			  `firstdata_remote_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `firstdata_remote_order_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('auth', 'payment', 'refund', 'void') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`firstdata_remote_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."firstdata_remote_card` (
			  `firstdata_remote_card_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `customer_id` INT(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `digits` CHAR(4) NOT NULL,
			  `expire_month` INT(2) NOT NULL,
			  `expire_year` INT(2) NOT NULL,
			  `card_type` CHAR(15) NOT NULL,
			  `token` CHAR(64) NOT NULL,
			  PRIMARY KEY (`firstdata_remote_card_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."firstdata_remote_order_transaction`;")
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."firstdata_remote_order_transaction` WHERE `firstdata_remote_order_id` = '".(int)$firstdata_order_id."' AND 'refund'")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."firstdata_remote_order_transaction` WHERE `firstdata_remote_order_id` = '".(int)$firstdata_remote_order_id."'")
#END
updateRefundStatus=$this->db->query("UPDATE `".DB_PREFIX."firstdata_remote_order` SET `refund_status` = '".(int)$status."' WHERE `firstdata_remote_order_id` = '".(int)$firstdata_remote_order_id."'")
#END
updateCaptureStatus=$this->db->query("UPDATE `".DB_PREFIX."firstdata_remote_order` SET `capture_status` = '".(int)$status."' WHERE `firstdata_remote_order_id` = '".(int)$firstdata_remote_order_id."'")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."firstdata_remote_order` SET `void_status` = '".(int)$status."' WHERE `firstdata_remote_order_id` = '".(int)$firstdata_remote_order_id."'")
#END
getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."firstdata_remote_order_transaction` WHERE `firstdata_remote_order_id` = '".(int)$firstdata_order_id."' AND (`type` = 'payment' OR `type` = 'refund')")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."firstdata_remote_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."firstdata_remote_order` (
			  `firstdata_remote_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `order_ref` CHAR(50) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `tdate` VARCHAR(30) NOT NULL,
			  `capture_status` INT(1) DEFAULT NULL,
			  `void_status` INT(1) DEFAULT NULL,
			  `refund_status` INT(1) DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `authcode` VARCHAR(30) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`firstdata_remote_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."firstdata_remote_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_remote_order_transaction` SET `firstdata_remote_order_id` = '".(int)$firstdata_remote_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(float)$total."'")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."firstdata_remote_card`;")
#END
