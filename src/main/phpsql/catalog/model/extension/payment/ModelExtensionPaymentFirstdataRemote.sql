storeCard=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_remote_card` SET `customer_id` = '".(int)$customer_id."', `date_added` = now(), `token` = '".$this->db->escape($token)."', `card_type` = '".$this->db->escape($type)."', `expire_month` = '".$this->db->escape($month)."', `expire_year` = '".$this->db->escape($year)."', `digits` = '".$this->db->escape($digits)."'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_remote_order` SET `order_id` = '".(int)$order_info['order_id']."', `order_ref` = '".$this->db->escape($capture_result['order_id'])."', `authcode` = '".$this->db->escape($capture_result['approval_code'])."', `tdate` = '".$this->db->escape($capture_result['t_date'])."', `date_added` = now(), `date_modified` = now(), `capture_status` = '".(int)$settle_status."', `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],$order_info['currency_value'],false)."'")
#END
getStoredCards=$this->db->query("SELECT * FROM ".DB_PREFIX."firstdata_remote_card WHERE customer_id = '".(int)$customer_id."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_remote_order_transaction` SET `firstdata_remote_order_id` = '".(int)$firstdata_remote_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(float)$amount."'")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE `geo_zone_id` = '".(int)$this->config->get('firstdata_geo_zone_id')."' AND `country_id` = '".(int)$address['country_id']."' AND (`zone_id` = '".(int)$address['zone_id']."' OR `zone_id` = '0')")
#END
addHistory=$this->db->query("INSERT INTO `".DB_PREFIX."order_history` SET `order_id` = '".(int)$order_id."', `order_status_id` = '".(int)$order_status_id."', `notify` = '0', `comment` = '".$this->db->escape($comment)."', `date_added` = NOW()")
#END
