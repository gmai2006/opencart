getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_server_order_transaction` WHERE `sagepay_server_order_id` = '".(int)$sagepay_server_order_id."'")
#END
getProfile=$this->db->query("SELECT * FROM ".DB_PREFIX."order_recurring WHERE order_recurring_id = ".(int)$order_recurring_id)
#END
getRecurringOrder=$this->db->query("SELECT * FROM ".DB_PREFIX."sagepay_server_order_recurring WHERE order_recurring_id = '".(int)$order_recurring_id."'")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."sagepay_server_order` SET `VPSTxId` = '".$this->db->escape($vps_txn_id)."', `TxAuthNo` = '".$this->db->escape($tx_auth_no)."' WHERE `order_id` = '".(int)$order_info['order_id']."'")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE geo_zone_id = '".(int)$this->config->get('sagepay_server_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
deleteOrder1=$this->db->query("DELETE FROM `".DB_PREFIX."order_recurring` WHERE order_id = '".(int)$order_id."'")
#END
getCards=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_server_card` WHERE customer_id = '".(int)$customer_id."'")
#END
addCard=$this->db->query("INSERT into `".DB_PREFIX."sagepay_server_card` SET customer_id = '".$this->db->escape($data['customer_id'])."', token = '".$this->db->escape($data['Token'])."', digits = '".$this->db->escape($data['Last4Digits'])."', expiry = '".$this->db->escape($data['ExpiryDate'])."', type = '".$this->db->escape($data['CardType'])."'")
#END
getRecurringOrders=$this->db->query("SELECT * FROM `".DB_PREFIX."order_recurring` WHERE order_id = '".(int)$order_id."'")
#END
addRecurringTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."order_recurring_transaction` SET `order_recurring_id` = '".(int)$order_recurring_id."', `date_added` = NOW(), `amount` = '".(float)$response_data['Amount']."', `type` = '".(int)$type."', `reference` = '".$this->db->escape($response_data['VendorTxCode'])."'")
#END
updateCronJobRunTime1=$this->db->query("INSERT INTO `".DB_PREFIX."setting` (`store_id`, `code`, `key`, `value`, `serialized`) VALUES (0, 'sagepay_server', 'sagepay_server_last_cron_job_run', NOW(), 0)")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."sagepay_server_order` WHERE `order_id` = '".(int)$order_id."' OR `VPSTxId` = '".$this->db->escape($vpstx_id)."' LIMIT 1")
#END
addRecurringOrder=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_server_order_recurring` SET `order_id` = '".(int)$order_id."', `order_recurring_id` = '".(int)$order_recurring_id."', `VPSTxId` = '".$this->db->escape($response_data['VPSTxId'])."', `VendorTxCode` = '".$this->db->escape($response_data['VendorTxCode'])."', `SecurityKey` = '".$this->db->escape($response_data['SecurityKey'])."', `TxAuthNo` = '".$this->db->escape($response_data['TxAuthNo'])."', `date_added` = now(), `date_modified` = now(), `next_payment` = now(), `trial_end` = '".$trial_end."', `subscription_end` = '".$subscription_end."', `currency_code` = '".$this->db->escape($response_data['Currency'])."', `total` = '".$this->currency->format($response_data['Amount'],$response_data['Currency'],false,false)."'")
#END
updateCronJobRunTime=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `code` = 'sagepay_server' AND `key` = 'sagepay_server_last_cron_job_run'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_server_order` SET `order_id` = '".(int)$order_info['order_id']."', `customer_id` = '".(int)$this->customer->getId()."', `VPSTxId` = '".$this->db->escape($order_info['VPSTxId'])."',  `VendorTxCode` = '".$this->db->escape($order_info['VendorTxCode'])."', `SecurityKey` = '".$this->db->escape($order_info['SecurityKey'])."', `date_added` = now(), `date_modified` = now(), `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."sagepay_server_order_transaction` SET `sagepay_server_order_id` = '".(int)$sagepay_server_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
getCard=$this->db->query("SELECT * FROM ".DB_PREFIX."sagepay_server_card WHERE (card_id = '".$this->db->escape($card_id)."' OR token = '".$this->db->escape($token)."') AND customer_id = '".(int)$this->customer->getId()."'")
#END
updateRecurringOrder=$this->db->query("UPDATE `".DB_PREFIX."sagepay_server_order_recurring` SET `next_payment` = '".$next_payment."', `date_modified` = now() WHERE `order_recurring_id` = '".(int)$order_recurring_id."'")
#END
deleteOrder=$this->db->query("DELETE FROM `".DB_PREFIX."sagepay_server_order` WHERE order_id = '".(int)$order_id."'")
#END
deleteCard=$this->db->query("DELETE FROM ".DB_PREFIX."sagepay_server_card WHERE card_id = '".(int)$card_id."'")
#END
