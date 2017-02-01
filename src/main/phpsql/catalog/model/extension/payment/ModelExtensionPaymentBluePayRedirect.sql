getCards=$this->db->query("SELECT * FROM `".DB_PREFIX."bluepay_redirect_card` WHERE customer_id = '".(int)$customer_id."'")
#END
addCard=$this->db->query("INSERT into `".DB_PREFIX."bluepay_redirect_card` SET customer_id = '".$this->db->escape($card_data['customer_id'])."', token = '".$this->db->escape($card_data['Token'])."', digits = '".$this->db->escape($card_data['Last4Digits'])."', expiry = '".$this->db->escape($card_data['ExpiryDate'])."', type = '".$this->db->escape($card_data['CardType'])."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."bluepay_redirect_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."bluepay_redirect_order_transaction` WHERE `bluepay_redirect_order_id` = '".(int)$bluepay_redirect_order_id."'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."bluepay_redirect_order` SET `order_id` = '".(int)$order_info['order_id']."', `transaction_id` = '".$this->db->escape($response_data['RRNO'])."', `date_added` = now(), `date_modified` = now(), `release_status` = '".(int)$release_status."',  `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."bluepay_redirect_order_transaction` SET `bluepay_redirect_order_id` = '".(int)$bluepay_redirect_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE geo_zone_id = '".(int)$this->config->get('bluepay_redirect_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
