install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."paypal_iframe_order_transaction` (
			  `paypal_iframe_order_transaction_id` int(11) NOT NULL AUTO_INCREMENT,
			  `paypal_iframe_order_id` int(11) NOT NULL,
			  `transaction_id` CHAR(20) NOT NULL,
			  `parent_id` CHAR(20) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `note` VARCHAR(255) NOT NULL,
			  `msgsubid` CHAR(38) NOT NULL,
			  `receipt_id` CHAR(20) NOT NULL,
			  `payment_type` ENUM('none','echeck','instant', 'refund', 'void') DEFAULT NULL,
			  `payment_status` CHAR(20) NOT NULL,
			  `pending_reason` CHAR(50) NOT NULL,
			  `transaction_entity` CHAR(50) NOT NULL,
			  `amount` DECIMAL( 10, 2 ) NOT NULL,
			  `debug_data` TEXT NOT NULL,
			  `call_data` TEXT NOT NULL,
			  PRIMARY KEY (`paypal_iframe_order_transaction_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."paypal_iframe_order`;")
#END
updateRefundTransaction=$this->db->query("UPDATE `".DB_PREFIX."paypal_iframe_order_transaction` SET `payment_status` = '".$this->db->escape($transaction_type)."' WHERE `transaction_id` = '".$this->db->escape($transaction_id)."' LIMIT 1")
#END
getLocalTransaction=$this->db->query("
			SELECT *
			FROM ".DB_PREFIX."paypal_iframe_order_transaction
			WHERE transaction_id = '".$this->db->escape($transaction_id)."'
		")->row
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `amount` FROM `".DB_PREFIX."paypal_iframe_order_transaction` WHERE `paypal_iframe_order_id` = '".(int)$paypal_iframe_order_id."' AND `payment_status` = 'Refunded'")
#END
getTotalRefundedTransaction=$this->db->query("SELECT SUM(`amount`) AS `amount` FROM `".DB_PREFIX."paypal_iframe_order_transaction` WHERE `parent_id` = '".$this->db->escape($transaction_id)."' AND `payment_type` = 'refund'")
#END
getTransactions=$this->db->query("SELECT `ot`.*, ( SELECT count(`ot2`.`paypal_iframe_order_id`) FROM `".DB_PREFIX."paypal_iframe_order_transaction` `ot2` WHERE `ot2`.`parent_id` = `ot`.`transaction_id` ) AS `children` FROM `".DB_PREFIX."paypal_iframe_order_transaction` `ot` WHERE `paypal_iframe_order_id` = '".(int)$paypal_iframe_order_id."'")
#END
updateTransaction=$this->db->query("
			UPDATE ".DB_PREFIX."paypal_iframe_order_transaction
			SET paypal_iframe_order_id = ".(int)$transaction['paypal_iframe_order_id'].",
				transaction_id = '".$this->db->escape($transaction['transaction_id'])."',
				parent_id = '".$this->db->escape($transaction['parent_id'])."',
				date_added = '".$this->db->escape($transaction['date_added'])."',
				note = '".$this->db->escape($transaction['note'])."',
				msgsubid = '".$this->db->escape($transaction['msgsubid'])."',
				receipt_id = '".$this->db->escape($transaction['receipt_id'])."',
				payment_type = '".$this->db->escape($transaction['payment_type'])."',
				payment_status = '".$this->db->escape($transaction['payment_status'])."',
				pending_reason = '".$this->db->escape($transaction['pending_reason'])."',
				transaction_entity = '".$this->db->escape($transaction['transaction_entity'])."',
				amount = '".$this->db->escape($transaction['amount'])."',
				debug_data = '".$this->db->escape($transaction['debug_data'])."',
				call_data = '".$this->db->escape($transaction['call_data'])."'
			WHERE paypal_iframe_order_transaction_id = ".(int)$transaction['paypal_iframe_order_transaction_id']."
		")
#END
getOrderId=$this->db->query("SELECT `o`.`order_id` FROM `".DB_PREFIX."paypal_iframe_order_transaction` `ot` LEFT JOIN `".DB_PREFIX."paypal_iframe_order` `o`  ON `o`.`paypal_iframe_order_id` = `ot`.`paypal_iframe_order_id`  WHERE `ot`.`transaction_id` = '".$this->db->escape($transaction_id)."' LIMIT 1")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."paypal_iframe_order` SET `date_modified` = now(), `capture_status` = '".$this->db->escape($capture_status)."' WHERE `order_id` = '".(int)$order_id."'")
#END
addTransaction1=$this->db->query("
				UPDATE ".DB_PREFIX."paypal_iframe_order_transaction
				SET call_data = '".$this->db->escape($serialized_data)."'
				WHERE paypal_iframe_order_transaction_id = ".(int)$paypal_iframe_order_transaction_id."
				LIMIT 1
			")
#END
getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `amount` FROM `".DB_PREFIX."paypal_iframe_order_transaction` WHERE `paypal_iframe_order_id` = '".(int)$paypal_iframe_order_id."' AND `pending_reason` != 'authorization' AND (`payment_status` = 'Partially-Refunded' OR `payment_status` = 'Completed' OR `payment_status` = 'Pending') AND `transaction_entity` = 'payment'")
#END
getFailedTransaction=$this->db->query("
			SELECT *
			FROM ".DB_PREFIX."paypal_iframe_order_transaction
			WHERE paypal_iframe_order_transaction_id = ".(int)$paypl_iframe_order_transaction_id."
		")->row
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."paypal_iframe_order_transaction`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."paypal_iframe_order` (
			  `paypal_iframe_order_id` int(11) NOT NULL AUTO_INCREMENT,
			  `order_id` int(11) NOT NULL,
			  `date_added` DATETIME NOT NULL,
			  `date_modified` DATETIME NOT NULL,
			  `capture_status` ENUM('Complete','NotComplete') DEFAULT NULL,
			  `currency_code` CHAR(3) NOT NULL,
			  `authorization_id` VARCHAR(30) NOT NULL,
			  `total` DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (`paypal_iframe_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."paypal_iframe_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."paypal_iframe_order_transaction` SET `paypal_iframe_order_id` = '".(int)$transaction_data['paypal_iframe_order_id']."', `transaction_id` = '".$this->db->escape($transaction_data['transaction_id'])."', `parent_id` = '".$this->db->escape($transaction_data['parent_id'])."', `date_added` = NOW(), `note` = '".$this->db->escape($transaction_data['note'])."', `msgsubid` = '".$this->db->escape($transaction_data['msgsubid'])."', `receipt_id` = '".$this->db->escape($transaction_data['receipt_id'])."', `payment_type` = '".$this->db->escape($transaction_data['payment_type'])."', `payment_status` = '".$this->db->escape($transaction_data['payment_status'])."', `pending_reason` = '".$this->db->escape($transaction_data['pending_reason'])."', `transaction_entity` = '".$this->db->escape($transaction_data['transaction_entity'])."', `amount` = '".(float)$transaction_data['amount']."', `debug_data` = '".$this->db->escape($transaction_data['debug_data'])."'")
#END
updateAuthorizationId=$this->db->query("
			UPDATE `".DB_PREFIX."paypal_iframe_order`
			SET `authorization_id` = '".$this->db->escape($authorization_id)."'
			WHERE `paypal_iframe_order_id` = '".$this->db->escape($paypal_iframe_order_id)."'
		")
#END
