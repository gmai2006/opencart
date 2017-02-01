addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."bluepay_hosted_order` SET `order_id` = '".(int)$order_info['order_id']."', `transaction_id` = '".$this->db->escape($response_data['RRNO'])."', `date_added` = now(), `date_modified` = now(), `release_status` = '".(int)$release_status."', `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."bluepay_hosted_order_transaction` SET `bluepay_hosted_order_id` = '".(int)$bluepay_hosted_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE geo_zone_id = '".(int)$this->config->get('bluepay_hosted_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
