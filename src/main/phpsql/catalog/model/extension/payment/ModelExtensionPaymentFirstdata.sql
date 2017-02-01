storeCard=$this->db->query("SELECT * FROM `".DB_PREFIX."firstdata_card` WHERE `token` = '".$this->db->escape($token)."' AND `customer_id` = '".(int)$customer_id."' LIMIT 1")
#END
storeCard1=$this->db->query("UPDATE `".DB_PREFIX."firstdata_card` SET `expire_month` = '".$this->db->escape($month)."', `expire_year` = '".$this->db->escape($year)."', `digits` = '".$this->db->escape($digits)."'")
#END
updateVoidStatus=$this->db->query("UPDATE `".DB_PREFIX."firstdata_order` SET `void_status` = '".(int)$status."' WHERE `order_id` = '".(int)$order_id."'")
#END
storeCard2=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_card` SET `customer_id` = '".(int)$customer_id."', `date_added` = now(), `token` = '".$this->db->escape($token)."', `expire_month` = '".$this->db->escape($month)."', `expire_year` = '".$this->db->escape($year)."', `digits` = '".$this->db->escape($digits)."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."firstdata_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_order` SET `order_id` = '".(int)$order_info['order_id']."', `order_ref` = '".$this->db->escape($order_ref)."', `tdate` = '".$this->db->escape($transaction_date)."', `date_added` = now(), `date_modified` = now(), `capture_status` = '".(int)$settle_status."', `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],$order_info['currency_value'],false)."'")
#END
getStoredCards=$this->db->query("SELECT * FROM `".DB_PREFIX."firstdata_card` WHERE `customer_id` = '".(int)$customer_id."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."firstdata_order_transaction` SET `firstdata_order_id` = '".(int)$fd_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".(float)$amount."'")
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('firstdata_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
updateCaptureStatus=$this->db->query("UPDATE `".DB_PREFIX."firstdata_order` SET `capture_status` = '".(int)$status."' WHERE `order_id` = '".(int)$order_id."'")
#END
addHistory=$this->db->query("INSERT INTO ".DB_PREFIX."order_history SET order_id = '".(int)$order_id."', order_status_id = '".(int)$order_status_id."', notify = '0', comment = '".$this->db->escape($comment)."', date_added = NOW()")
#END
