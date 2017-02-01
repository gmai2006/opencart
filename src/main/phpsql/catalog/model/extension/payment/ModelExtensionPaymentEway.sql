getCards=$this->db->query("SELECT * FROM ".DB_PREFIX."eway_card WHERE customer_id = '".(int)$customer_id."'")
#END
addCard=$this->db->query("INSERT into ".DB_PREFIX."eway_card SET customer_id = '".$this->db->escape($card_data['customer_id'])."', order_id = '".$this->db->escape($order_id)."', digits = '".$this->db->escape($card_data['Last4Digits'])."', expiry = '".$this->db->escape($card_data['ExpiryDate'])."', type = '".$this->db->escape($card_data['CardType'])."'")
#END
updateFullCard=$this->db->query("UPDATE ".DB_PREFIX."eway_card SET token = '".$this->db->escape($token)."', digits = '".$this->db->escape($card_data['Last4Digits'])."', expiry = '".$this->db->escape($card_data['ExpiryDate'])."', type = '".$this->db->escape($card_data['CardType'])."' WHERE card_id = '".(int)$card_id."'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."eway_order` SET `order_id` = '".(int)$order_data['order_id']."', `created` = NOW(), `modified` = NOW(), `debug_data` = '".$this->db->escape($order_data['debug_data'])."', `amount` = '".$this->currency->format($order_data['amount'],$order_data['currency_code'],false,false)."', `currency_code` = '".$this->db->escape($order_data['currency_code'])."', `transaction_id` = '".$this->db->escape($order_data['transaction_id'])."'$cap")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."eway_transactions` SET `eway_order_id` = '".(int)$eway_order_id."', `created` = NOW(), `transaction_id` = '".$this->db->escape($transactionid)."', `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('eway_standard_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
checkToken=$this->db->query("SELECT * FROM ".DB_PREFIX."eway_card WHERE token_id = '".(int)$token_id."'")
#END
updateCard=$this->db->query("UPDATE ".DB_PREFIX."eway_card SET token = '".$this->db->escape($token)."' WHERE order_id = '".(int)$order_id."'")
#END
deleteCard=$this->db->query("DELETE FROM ".DB_PREFIX."eway_card WHERE order_id = '".(int)$order_id."'")
#END
