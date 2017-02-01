getTotalCaptured=$this->db->query("SELECT SUM(`amount`) AS `amount` FROM `".DB_PREFIX."paypal_order_transaction` WHERE `paypal_order_id` = '".(int)$paypal_order_id."' AND `pending_reason` != 'authorization' AND `pending_reason` != 'paymentreview' AND (`payment_status` = 'Partially-Refunded' OR `payment_status` = 'Completed' OR `payment_status` = 'Pending') AND `transaction_entity` = 'payment'")
#END
getTransactionRow=$this->db->query("SELECT * FROM `".DB_PREFIX."paypal_order_transaction` `pt` LEFT JOIN `".DB_PREFIX."paypal_order` `po` ON `pt`.`paypal_order_id` = `po`.`paypal_order_id`  WHERE `pt`.`transaction_id` = '".$this->db->escape($transaction_id)."' LIMIT 1")
#END
getTotalRefunded=$this->db->query("SELECT SUM(`amount`) AS `amount` FROM `".DB_PREFIX."paypal_order_transaction` WHERE `paypal_order_id` = '".(int)$paypal_order_id."' AND `payment_status` = 'Refunded'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."paypal_order` SET
			`order_id` = '".(int)$order_data['order_id']."',
			`date_added` = NOW(),
			`date_modified` = NOW(),
			`capture_status` = '".$this->db->escape($order_data['capture_status'])."',
			`currency_code` = '".$this->db->escape($order_data['currency_code'])."',
			`total` = '".(float)$order_data['total']."',
			`authorization_id` = '".$this->db->escape($order_data['authorization_id'])."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."paypal_order_transaction` SET
			`paypal_order_id` = '".(int)$transaction_data['paypal_order_id']."',
			`transaction_id` = '".$this->db->escape($transaction_data['transaction_id'])."',
			`parent_id` = '".$this->db->escape($transaction_data['parent_id'])."',
			`date_added` = NOW(),
			`note` = '".$this->db->escape($transaction_data['note'])."',
			`msgsubid` = '".$this->db->escape($transaction_data['msgsubid'])."',
			`receipt_id` = '".$this->db->escape($transaction_data['receipt_id'])."',
			`payment_type` = '".$this->db->escape($transaction_data['payment_type'])."',
			`payment_status` = '".$this->db->escape($transaction_data['payment_status'])."',
			`pending_reason` = '".$this->db->escape($transaction_data['pending_reason'])."',
			`transaction_entity` = '".$this->db->escape($transaction_data['transaction_entity'])."',
			`amount` = '".(float)$transaction_data['amount']."',
			`debug_data` = '".$this->db->escape($transaction_data['debug_data'])."'")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."paypal_order` SET `date_modified` = now(), `capture_status` = '".$this->db->escape($capture_status)."' WHERE `order_id` = '".(int)$order_id."'")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE `geo_zone_id` = '".(int)$this->config->get('pp_express_geo_zone_id')."' AND `country_id` = '".(int)$address['country_id']."' AND (`zone_id` = '".(int)$address['zone_id']."' OR `zone_id` = '0')")
#END
