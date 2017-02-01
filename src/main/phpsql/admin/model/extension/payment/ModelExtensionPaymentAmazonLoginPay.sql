install1=$this->db->query("
			CREATE TABLE `".DB_PREFIX."amazon_login_pay_order_total_tax` (
				`order_total_id`  INT,
				`code` VARCHAR(255),
				`tax` DECIMAL(10, 4) NOT NULL,
				PRIMARY KEY (`order_total_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazon_login_pay_order_transaction` (
			  `amazon_login_pay_order_transaction_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `amazon_login_pay_order_id` INT(11) NOT NULL,
			  `amazon_authorization_id` varchar(255),
			  `amazon_capture_id` varchar(255),
			  `amazon_refund_id` varchar(255),
			  `date_added` DATETIME NOT NULL,
			  `type` ENUM('authorization', 'capture', 'refund', 'cancel') DEFAULT NULL,
			  `status` ENUM('Open', 'Pending', 'Completed', 'Suspended', 'Declined', 'Closed', 'Canceled') DEFAULT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`amazon_login_pay_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
			")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazon_login_pay_order_total_tax`;")
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."amazon_login_pay_order_transaction` WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."' AND 'refund'")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."amazon_login_pay_order_transaction` WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."'")
#END
updateRefundStatus=$this->db->query("UPDATE `".DB_PREFIX."amazon_login_pay_order` SET `refund_status` = '".(int)$status."' WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."'")
#END
updateCaptureStatus=$this->db->query("UPDATE `".DB_PREFIX."amazon_login_pay_order` SET `capture_status` = '".(int)$status."' WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."'")
#END
getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `total` FROM `".DB_PREFIX."amazon_login_pay_order_transaction` WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."' AND (`type` = 'capture' OR `type` = 'refund') AND (`status` = 'Completed' OR `status` = 'Closed')")
#END
getUnCaptured=$this->db->query("SELECT * FROM `".DB_PREFIX."amazon_login_pay_order_transaction` WHERE (`type` = 'refund' OR `type` = 'capture') AND `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."' ORDER BY `date_added`")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazon_login_pay_order`;")
#END
install=$this->db->query("
			CREATE TABLE `".DB_PREFIX."amazon_login_pay_order` (
				`amazon_login_pay_order_id` INT(11) NOT NULL AUTO_INCREMENT,
				`order_id` int(11) NOT NULL,
				`amazon_order_reference_id` varchar(255) NOT NULL,
				`amazon_authorization_id` varchar(255) NOT NULL,
				`free_shipping`  tinyint NOT NULL DEFAULT 0,
				`date_added` DATETIME NOT NULL,
				`modified` DATETIME NOT NULL,
				`capture_status` INT(1) DEFAULT NULL,
				`cancel_status` INT(1) DEFAULT NULL,
				`refund_status` INT(1) DEFAULT NULL,
				`currency_code` CHAR(3) NOT NULL,
				`total` DECIMAL( 10, 2 ) NOT NULL,
				KEY `amazon_order_reference_id` (`amazon_order_reference_id`),
				PRIMARY KEY `amazon_login_pay_order_id` (`amazon_login_pay_order_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."amazon_login_pay_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
updateCancelStatus=$this->db->query("UPDATE `".DB_PREFIX."amazon_login_pay_order` SET `cancel_status` = '".(int)$status."' WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."'")
#END
getCapturesRemaining=$this->db->query("SELECT * FROM `".DB_PREFIX."amazon_login_pay_order_transaction` WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."' AND capture_remaining != '0' ORDER BY `date_added`")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."amazon_login_pay_order_transaction` SET `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."',`amazon_authorization_id` = '".$this->db->escape($amazon_authorization_id)."',`amazon_capture_id` = '".$this->db->escape($amazon_capture_id)."',`amazon_refund_id` = '".$this->db->escape($amazon_refund_id)."',  `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(double)$total."', `status` = '".$this->db->escape($status)."'")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazon_login_pay_order_transaction`;")
#END
