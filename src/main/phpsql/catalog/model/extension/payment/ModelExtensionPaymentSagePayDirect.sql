getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_direct_order_transaction` WHERE `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."'")
#END
getProfile=$this->db->query("SELECT * FROM ".DB_PREFIX."order_recurring WHERE order_recurring_id = ".(int)$order_recurring_id)
#END
getRecurringOrder=$this->db->query("SELECT * FROM ".DB_PREFIX."sagepay_direct_order_recurring WHERE order_recurring_id = '".(int)$order_recurring_id."'")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."sagepay_direct_order` SET `SecurityKey` = '".$this->db->escape($data['SecurityKey'])."',  `VPSTxId` = '".$this->db->escape($data['VPSTxId'])."', `TxAuthNo` = '".$this->db->escape($data['TxAuthNo'])."' WHERE `order_id` = '".(int)$order_info['order_id']."'")
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('sagepay_direct_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
updateCard=$this->db->query("UPDATE ".DB_PREFIX."sagepay_direct_card SET token = '".$this->db->escape($token)."' WHERE card_id = '".(int)$card_id."'")
#END
getCards=$this->db->query("SELECT * FROM ".DB_PREFIX."sagepay_direct_card WHERE customer_id = '".(int)$customer_id."' ORDER BY card_id")
#END
addCard=$this->db->query("INSERT into ".DB_PREFIX."sagepay_direct_card SET customer_id = '".$this->db->escape($card_data['customer_id'])."', digits = '".$this->db->escape($card_data['Last4Digits'])."', expiry = '".$this->db->escape($card_data['ExpiryDate'])."', type = '".$this->db->escape($card_data['CardType'])."', token = '".$this->db->escape($card_data['Token'])."'")
#END
addRecurringTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."order_recurring_transaction` SET `order_recurring_id` = '".(int)$order_recurring_id."', `date_added` = NOW(), `amount` = '".(float)$response_data['Amount']."', `type` = '".(int)$type."', `reference` = '".$this->db->escape($response_data['VendorTxCode'])."'")
#END
updateCronJobRunTime1=$this->db->query("INSERT INTO `".DB_PREFIX."setting` (`store_id`, `code`, `key`, `value`, `serialized`) VALUES (0, 'sagepay_direct', 'sagepay_direct_last_cron_job_run', NOW(), 0)")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_direct_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addRecurringOrder=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_direct_order_recurring` SET `order_id` = '".(int)$order_id."', `order_recurring_id` = '".(int)$order_recurring_id."', `VPSTxId` = '".$this->db->escape($response_data['VPSTxId'])."', `VendorTxCode` = '".$this->db->escape($response_data['VendorTxCode'])."', `SecurityKey` = '".$this->db->escape($response_data['SecurityKey'])."', `TxAuthNo` = '".$this->db->escape($response_data['TxAuthNo'])."', `date_added` = now(), `date_modified` = now(), `next_payment` = now(), `trial_end` = '".$trial_end."', `subscription_end` = '".$subscription_end."', `currency_code` = '".$this->db->escape($response_data['Currency'])."', `total` = '".$this->currency->format($response_data['Amount'],$response_data['Currency'],false,false)."'")
#END
updateCronJobRunTime=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `code` = 'sagepay_direct' AND `key` = 'sagepay_direct_last_cron_job_run'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_direct_order` SET `order_id` = '".(int)$order_id."', `VPSTxId` = '".$this->db->escape($response_data['VPSTxId'])."', `VendorTxCode` = '".$this->db->escape($payment_data['VendorTxCode'])."', `SecurityKey` = '".$this->db->escape($response_data['SecurityKey'])."', `TxAuthNo` = '".$this->db->escape($response_data['TxAuthNo'])."', `date_added` = now(), `date_modified` = now(), `currency_code` = '".$this->db->escape($payment_data['Currency'])."', `total` = '".$this->currency->format($payment_data['Amount'],$payment_data['Currency'],false,false)."', `card_id` = '".$this->db->escape($card_id)."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_direct_order_transaction` SET `sagepay_direct_order_id` = '".(int)$sagepay_direct_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
getCard=$this->db->query("SELECT * FROM ".DB_PREFIX."sagepay_direct_card WHERE (card_id = '".$this->db->escape($card_id)."' OR token = '".$this->db->escape($token)."') AND customer_id = '".(int)$this->customer->getId()."'")
#END
updateRecurringOrder=$this->db->query("UPDATE `".DB_PREFIX."sagepay_direct_order_recurring` SET `next_payment` = '".$next_payment."', `date_modified` = now() WHERE `order_recurring_id` = '".(int)$order_recurring_id."'")
#END
deleteOrder=$this->db->query("DELETE FROM `".DB_PREFIX."sagepay_direct_order` WHERE order_id = '".$vendor_tx_code."'")
#END
deleteCard=$this->db->query("DELETE FROM ".DB_PREFIX."sagepay_direct_card WHERE card_id = '".(int)$card_id."'")
#END
