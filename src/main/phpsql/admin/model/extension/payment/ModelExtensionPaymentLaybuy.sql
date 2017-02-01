install1=$this->db->query("CREATE TABLE IF NOT EXISTS `".DB_PREFIX."laybuy_revise_request` (
			`laybuy_revise_request_id` int(11) NOT NULL AUTO_INCREMENT,
			`laybuy_transaction_id` int(11) DEFAULT '0',
			`type` varchar(250) NOT NULL DEFAULT '',
			`order_id` int(11) NOT NULL DEFAULT '0',
			`firstname` varchar(32) NOT NULL DEFAULT '',
			`lastname` varchar(32) NOT NULL DEFAULT '',
			`address` text,
			`suburb` varchar(128) NOT NULL DEFAULT '',
			`state` varchar(128) NOT NULL DEFAULT '',
			`country` varchar(32) NOT NULL DEFAULT '',
			`postcode` varchar(10) NOT NULL DEFAULT '',
			`email` varchar(96) NOT NULL DEFAULT '',
			`amount` double NOT NULL,
			`currency` varchar(5) NOT NULL,
			`downpayment` double NOT NULL,
			`months` int(11) NOT NULL,
			`downpayment_amount` double NOT NULL,
			`payment_amounts` double NOT NULL,
			`first_payment_due` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			`last_payment_due` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			`store_id` int(11) NOT NULL DEFAULT '0',
			`status` int(11) NOT NULL DEFAULT '1',
			`report` text,
			`transaction` int(11) NOT NULL DEFAULT '2',
			`paypal_profile_id` varchar(250) NOT NULL DEFAULT '',
			`laybuy_ref_no` int(11) NOT NULL DEFAULT '0',
			`payment_type` tinyint(1) NOT NULL DEFAULT '1',
			`date_added` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			PRIMARY KEY (`laybuy_revise_request_id`)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."laybuy_revise_request`")
#END
addRevisedTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."laybuy_revise_request` SET `laybuy_transaction_id` = '".(int)$data['transaction_id']."', `type` = '".$this->db->escape($data['type'])."', `order_id` = '".(int)$data['order_id']."', `firstname` = '".$this->db->escape($data['firstname'])."', `lastname` = '".$this->db->escape($data['lastname'])."', `address` = '".$this->db->escape($data['address'])."', `suburb` = '".$this->db->escape($data['suburb'])."', `state` = '".$this->db->escape($data['state'])."', `country` = '".$this->db->escape($data['country'])."', `postcode` = '".$this->db->escape($data['postcode'])."', `email` = '".$this->db->escape($data['email'])."', `amount` = '".(float)$data['amount']."', `currency` = '".$this->db->escape($data['currency'])."', `downpayment` = '".$this->db->escape($data['downpayment'])."', `months` = '".(int)$data['months']."', `downpayment_amount` = '".(float)$data['downpayment_amount']."', `payment_amounts` = '".(float)$data['payment_amounts']."', `first_payment_due` = '".$this->db->escape($data['first_payment_due'])."', `last_payment_due` = '".$this->db->escape($data['last_payment_due'])."', `store_id` = '".(int)$data['store_id']."', `status` = '".(int)$data['status']."', `report` = '".$this->db->escape($data['report'])."', `transaction` = '".(int)$data['transaction']."', `paypal_profile_id` = '".$this->db->escape($data['paypal_profile_id'])."', `laybuy_ref_no` = '".(int)$data['laybuy_ref_no']."', `payment_type` = '".(int)$data['payment_type']."', `date_added` = NOW()")
#END
getCustomerIdByOrderId=$this->db->query("SELECT `customer_id` FROM `".DB_PREFIX."order` WHERE `order_id` = '".(int)$order_id."'")
#END
getTransactionByLayBuyRefId=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `laybuy_ref_no` = '".(int)$laybuy_ref_id."'")
#END
updateTransaction=$this->db->query("UPDATE `".DB_PREFIX."laybuy_transaction` SET `status` = '".(int)$status."', `report` = '".$this->db->escape($report)."', `transaction` = '".(int)$transaction."' WHERE `laybuy_transaction_id` = '".(int)$id."'")
#END
getRevisedTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_revise_request` WHERE `laybuy_revise_request_id` = '".(int)$id."'")
#END
updateOrderStatus1=$this->db->query("INSERT INTO `".DB_PREFIX."order_history` SET `order_id` = '".(int)$order_id."', `order_status_id` = '".(int)$order_status_id."', `notify` = '0', `comment` = '".$this->db->escape($comment)."', `date_added` = NOW()")
#END
updateOrderStatus=$this->db->query("UPDATE `".DB_PREFIX."order` SET `order_status_id` = '".(int)$order_status_id."', `date_modified` = NOW() WHERE `order_id` = '".(int)$order_id."'")
#END
getPayPalProfileIds=$this->db->query("SELECT `paypal_profile_id` FROM `".DB_PREFIX."laybuy_transaction` WHERE `status` = '1'")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."laybuy_transaction`")
#END
getTransactionByOrderId=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `order_id` = '".(int)$order_id."' ORDER BY `laybuy_ref_no` DESC LIMIT 1")
#END
install=$this->db->query("CREATE TABLE IF NOT EXISTS `".DB_PREFIX."laybuy_transaction` (
			`laybuy_transaction_id` int(11) NOT NULL AUTO_INCREMENT,
			`order_id` int(11) NOT NULL DEFAULT '0',
			`firstname` varchar(32) NOT NULL DEFAULT '',
			`lastname` varchar(32) NOT NULL DEFAULT '',
			`address` text,
			`suburb` varchar(128) NOT NULL DEFAULT '',
			`state` varchar(128) NOT NULL DEFAULT '',
			`country` varchar(32) NOT NULL DEFAULT '',
			`postcode` varchar(10) NOT NULL DEFAULT '',
			`email` varchar(96) NOT NULL DEFAULT '',
			`amount` double NOT NULL,
			`currency` varchar(5) NOT NULL,
			`downpayment` double NOT NULL,
			`months` int(11) NOT NULL,
			`downpayment_amount` double NOT NULL,
			`payment_amounts` double NOT NULL,
			`first_payment_due` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			`last_payment_due` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			`store_id` int(11) NOT NULL DEFAULT '0',
			`status` int(11) NOT NULL DEFAULT '1',
			`report` text,
			`transaction` int(11) NOT NULL DEFAULT '2',
			`paypal_profile_id` varchar(250) NOT NULL DEFAULT '',
			`laybuy_ref_no` int(11) NOT NULL DEFAULT '0',
			`date_added` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			PRIMARY KEY (`laybuy_transaction_id`)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci")
#END
getRevisedTransaction=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_revise_request` WHERE `laybuy_revise_request_id` = '".(int)$id."'")
#END
updateTransactionStatus=$this->db->query("UPDATE `".DB_PREFIX."laybuy_transaction` SET `status` = '".(int)$status."' WHERE `laybuy_transaction_id` = '".(int)$id."'")
#END
updateRevisedTransaction=$this->db->query("UPDATE `".DB_PREFIX."laybuy_revise_request` SET `laybuy_transaction_id` = '".(int)$data['transaction_id']."', `type` = '".$this->db->escape($data['type'])."', `order_id` = '".(int)$data['order_id']."', `firstname` = '".$this->db->escape($data['firstname'])."', `lastname` = '".$this->db->escape($data['lastname'])."', `address` = '".$this->db->escape($data['address'])."', `suburb` = '".$this->db->escape($data['suburb'])."', `state` = '".$this->db->escape($data['state'])."', `country` = '".$this->db->escape($data['country'])."', `postcode` = '".$this->db->escape($data['postcode'])."', `email` = '".$this->db->escape($data['email'])."', `amount` = '".(float)$data['amount']."', `currency` = '".$this->db->escape($data['currency'])."', `downpayment` = '".$this->db->escape($data['downpayment'])."', `months` = '".(int)$data['months']."', `downpayment_amount` = '".(float)$data['downpayment_amount']."', `payment_amounts` = '".(float)$data['payment_amounts']."', `first_payment_due` = '".$this->db->escape($data['first_payment_due'])."', `last_payment_due` = '".$this->db->escape($data['last_payment_due'])."', `store_id` = '".(int)$data['store_id']."', `status` = '".(int)$data['status']."', `report` = '".$this->db->escape($data['report'])."', `transaction` = '".(int)$data['transaction']."', `paypal_profile_id` = '".$this->db->escape($data['paypal_profile_id'])."', `laybuy_ref_no` = '".(int)$data['laybuy_ref_no']."', `payment_type` = '".(int)$data['payment_type']."', `date_added` = NOW() WHERE `laybuy_revise_request_id` = '".(int)$id."'")
#END
getTransaction=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `laybuy_transaction_id` = '".(int)$id."'")
#END
