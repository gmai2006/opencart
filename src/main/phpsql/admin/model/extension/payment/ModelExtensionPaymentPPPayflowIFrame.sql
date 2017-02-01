install1=$this->db->query("
			CREATE TABLE `".DB_PREFIX."paypal_payflow_iframe_order_transaction` (
				`order_id` int(11) NOT NULL,
				`transaction_reference` varchar(255) NOT NULL,
				`transaction_type` char(1) NOT NULL,
				`time` datetime NOT NULL,
				`amount` decimal(10,4) DEFAULT NULL,
				PRIMARY KEY (`transaction_reference`),
				KEY `order_id` (`order_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."paypal_payflow_iframe_order_transaction`;")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."paypal_payflow_iframe_order`;")
#END
install=$this->db->query("
			CREATE TABLE `".DB_PREFIX."paypal_payflow_iframe_order` (
				`order_id` int(11) DEFAULT NULL,
				`secure_token_id` varchar(255) NOT NULL,
				`transaction_reference` varchar(255) DEFAULT NULL,
				`transaction_type` varchar(1) DEFAULT NULL,
				`complete` tinyint(4) NOT NULL DEFAULT '0',
				PRIMARY KEY(`order_id`),
				KEY `secure_token_id` (`secure_token_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci")
#END
getOrder=$this->db->query("SELECT * FROM ".DB_PREFIX."paypal_payflow_iframe_order WHERE order_id = ".(int)$order_id)
#END
getTransactions=$this->db->query("
			SELECT *
			FROM ".DB_PREFIX."paypal_payflow_iframe_order_transaction
			WHERE order_id = ".(int)$order_id."
			ORDER BY `time` ASC")->rows
#END
addTransaction=$this->db->query("
			INSERT INTO ".DB_PREFIX."paypal_payflow_iframe_order_transaction
			SET order_id = ".(int)$data['order_id'].",
				transaction_reference = '".$this->db->escape($data['transaction_reference'])."',
				transaction_type = '".$this->db->escape($data['type'])."',
				`time` = NOW(),
				`amount` = '".$this->db->escape($data['amount'])."'
		")
#END
updateOrderStatus=$this->db->query("
			UPDATE ".DB_PREFIX."paypal_payflow_iframe_order
			SET `complete` = ".(int)$status."
			WHERE order_id = '".(int)$order_id."'
		")
#END
getTransaction=$this->db->query("
			SELECT *
			FROM ".DB_PREFIX."paypal_payflow_iframe_order_transaction
			WHERE transaction_reference = '".$this->db->escape($transaction_reference)."'")->row
#END
