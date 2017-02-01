updateTransactionStatusByRetref=$this->db->query("UPDATE `".DB_PREFIX."cardconnect_order_transaction` SET `status` = '".$this->db->escape($status)."', `date_modified` = NOW() WHERE `retref` = '".$this->db->escape($retref)."'")
#END
updateCronRunTime=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `key` = 'cardconnect_cron_time'")
#END
updateCronRunTime1=$this->db->query("INSERT INTO `".DB_PREFIX."setting` SET `store_id` = '0', `code` = 'cardconnect', `key` = 'cardconnect_cron_time', `value` = NOW(), `serialized` = '0'")
#END
getCards=$this->db->query("SELECT * FROM `".DB_PREFIX."cardconnect_card` WHERE `customer_id` = '".(int)$customer_id."'")
#END
addCard=$this->db->query("INSERT INTO `".DB_PREFIX."cardconnect_card` SET `cardconnect_order_id` = '".(int)$cardconnect_order_id."', `customer_id` = '".(int)$customer_id."', `profileid` = '".$this->db->escape($profileid)."', `token` = '".$this->db->escape($token)."', `type` = '".$this->db->escape($type)."', `account` = '".$this->db->escape($account)."', `expiry` = '".$this->db->escape($expiry)."', `date_added` = NOW()")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."cardconnect_order` SET `order_id` = '".(int)$order_info['order_id']."', `customer_id` = '".(int)$this->customer->getId()."', `payment_method` = '".$this->db->escape($payment_method)."', `retref` = '".$this->db->escape($order_info['retref'])."', `authcode` = '".$this->db->escape($order_info['authcode'])."', `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."', `date_added` = NOW()")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."cardconnect_order_transaction` SET `cardconnect_order_id` = '".(int)$cardconnect_order_id."', `type` = '".$this->db->escape($type)."', `retref` = '".$this->db->escape($order_info['retref'])."', `amount` = '".(float)$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."', `status` = '".$this->db->escape($status)."', `date_modified` = NOW(), `date_added` = NOW()")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE `geo_zone_id` = '".(int)$this->config->get('cardconnect_geo_zone')."' AND `country_id` = '".(int)$address['country_id']."' AND (`zone_id` = '".(int)$address['zone_id']."' OR `zone_id` = '0')")
#END
getCard=$this->db->query("SELECT * FROM `".DB_PREFIX."cardconnect_card` WHERE `token` = '".$this->db->escape($token)."' AND `customer_id` = '".(int)$customer_id."'")
#END
deleteCard=$this->db->query("DELETE FROM `".DB_PREFIX."cardconnect_card` WHERE `token` = '".$this->db->escape($token)."' AND `customer_id` = '".(int)$customer_id."'")
#END
