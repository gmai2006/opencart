getOrderId=$this->db->query("SELECT `order_id` FROM `".DB_PREFIX."paypal_payflow_iframe_order` WHERE `secure_token_id` = '".$this->db->escape($secure_token_id)."'")->row
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."paypal_payflow_iframe_order` SET `order_id` = '".(int)$order_id."', `secure_token_id` = '".$this->db->escape($secure_token_id)."'")
#END
updateOrder=$this->db->query("
			UPDATE `".DB_PREFIX."paypal_payflow_iframe_order`
			SET `transaction_reference` = '".$this->db->escape($data['transaction_reference'])."',
				`transaction_type` = '".$this->db->escape($data['transaction_type'])."',
				`complete` = ".(int)$data['complete']."
			WHERE `secure_token_id` = '".$this->db->escape($data['secure_token_id'])."'
		")
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
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('pp_payflow_iframe_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
