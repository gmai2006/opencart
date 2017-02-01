getWorldpayOrder=$this->db->query("SELECT * FROM ".DB_PREFIX."worldpay_order WHERE order_code = ".(int)$worldpay_order_id)
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."worldpay_order_transaction` WHERE `worldpay_order_id` = '".(int)$worldpay_order_id."'")
#END
getProfile=$this->db->query("SELECT * FROM ".DB_PREFIX."order_recurring WHERE order_recurring_id = ".(int)$order_recurring_id)
#END
getRecurringOrder=$this->db->query("SELECT * FROM ".DB_PREFIX."worldpay_order_recurring WHERE order_recurring_id = '".(int)$order_recurring_id."'")
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('worldpay_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
getCards=$this->db->query("SELECT * FROM ".DB_PREFIX."worldpay_card WHERE customer_id = '".(int)$customer_id."'")
#END
addCard=$this->db->query("INSERT into ".DB_PREFIX."worldpay_card SET customer_id = '".$this->db->escape($card_data['customer_id'])."', order_id = '".$this->db->escape($order_id)."', digits = '".$this->db->escape($card_data['Last4Digits'])."', expiry = '".$this->db->escape($card_data['ExpiryDate'])."', type = '".$this->db->escape($card_data['CardType'])."', token = '".$this->db->escape($card_data['Token'])."'")
#END
updateCronJobRunTime1=$this->db->query("INSERT INTO `".DB_PREFIX."setting` (`store_id`, `code`, `key`, `value`, `serialized`) VALUES (0, 'worldpay', 'worldpay_last_cron_job_run', NOW(), 0)")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."worldpay_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addProfileTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."order_recurring_transaction` SET `order_recurring_id` = '".(int)$order_recurring_id."', `date_added` = NOW(), `amount` = '".(float)$price."', `type` = '".(int)$type."', `reference` = '".$this->db->escape($order_code)."'")
#END
addRecurringOrder=$this->db->query("INSERT INTO `".DB_PREFIX."worldpay_order_recurring` SET `order_id` = '".(int)$order_info['order_id']."', `order_recurring_id` = '".(int)$order_recurring_id."', `order_code` = '".$this->db->escape($order_code)."', `token` = '".$this->db->escape($token)."', `date_added` = now(), `date_modified` = now(), `next_payment` = now(), `trial_end` = '".$trial_end."', `subscription_end` = '".$subscription_end."', `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($price,$order_info['currency_code'],false,false)."'")
#END
updateCronJobRunTime=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `code` = 'worldpay' AND `key` = 'worldpay_last_cron_job_run'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."worldpay_order` SET `order_id` = '".(int)$order_info['order_id']."', `order_code` = '".$this->db->escape($order_code)."', `date_added` = now(), `date_modified` = now(), `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."worldpay_order_transaction` SET `worldpay_order_id` = '".(int)$worldpay_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
updateRecurringOrder=$this->db->query("UPDATE `".DB_PREFIX."worldpay_order_recurring` SET `next_payment` = '".$next_payment."', `date_modified` = now() WHERE `order_recurring_id` = '".(int)$order_recurring_id."'")
#END
deleteCard=$this->db->query("DELETE FROM ".DB_PREFIX."worldpay_card WHERE customer_id = '".$this->customer->isLogged()."' AND token = '".$this->db->escape($token)."'")
#END
