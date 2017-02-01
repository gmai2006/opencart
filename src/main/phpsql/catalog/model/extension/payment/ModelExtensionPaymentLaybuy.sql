updateCronRunTime=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `key` = 'laybuy_cron_time'")
#END
deleteRevisedTransaction=$this->db->query("DELETE FROM `".DB_PREFIX."laybuy_revise_request` WHERE `laybuy_revise_request_id` = '".(int)$id."'")
#END
getTransactionByLayBuyRefId=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `laybuy_ref_no` = '".(int)$laybuy_ref_id."'")
#END
updateTransaction=$this->db->query("UPDATE `".DB_PREFIX."laybuy_transaction` SET `status` = '".(int)$status."', `report` = '".$this->db->escape($report)."', `transaction` = '".(int)$transaction."' WHERE `laybuy_transaction_id` = '".(int)$id."'")
#END
deleteTransactionByOrderId=$this->db->query("DELETE FROM `".DB_PREFIX."laybuy_transaction` WHERE `order_id` = '".(int)$order_id."'")
#END
getMethod=$this->db->query("SELECT * FROM `".DB_PREFIX."zone_to_geo_zone` WHERE `geo_zone_id` = '".(int)$this->config->get('laybuy_geo_zone')."' AND `country_id` = '".(int)$address['country_id']."' AND (`zone_id` = '".(int)$address['zone_id']."' OR `zone_id` = '0')")
#END
getPayPalProfileIds=$this->db->query("SELECT `paypal_profile_id` FROM `".DB_PREFIX."laybuy_transaction` WHERE `status` = '1'")
#END
updateCronRunTime1=$this->db->query("INSERT INTO `".DB_PREFIX."setting` SET `store_id` = '0', `code` = 'laybuy', `key` = 'laybuy_cron_time', `value` = NOW(), `serialized` = '0'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."laybuy_transaction` SET `order_id` = '".(int)$data['order_id']."', `firstname` = '".$this->db->escape($data['firstname'])."', `lastname` = '".$this->db->escape($data['lastname'])."', `address` = '".$this->db->escape($data['address'])."', `suburb` = '".$this->db->escape($data['suburb'])."', `state` = '".$this->db->escape($data['state'])."', `country` = '".$this->db->escape($data['country'])."', `postcode` = '".$this->db->escape($data['postcode'])."', `email` = '".$this->db->escape($data['email'])."', `amount` = '".(float)$data['amount']."', `currency` = '".$this->db->escape($data['currency'])."', `downpayment` = '".$this->db->escape($data['downpayment'])."', `months` = '".(int)$data['months']."', `downpayment_amount` = '".(float)$data['downpayment_amount']."', `payment_amounts` = '".(float)$data['payment_amounts']."', `first_payment_due` = '".$this->db->escape($data['first_payment_due'])."', `last_payment_due` = '".$this->db->escape($data['last_payment_due'])."', `store_id` = '".(int)$data['store_id']."', `status` = '".(int)$status."', `report` = '".$this->db->escape($data['report'])."', `paypal_profile_id` = '".$this->db->escape($data['paypal_profile_id'])."', `laybuy_ref_no` = '".(int)$data['laybuy_ref_no']."', `date_added` = NOW()")
#END
getMethod1=$this->db->query("SELECT GROUP_CONCAT(`category_id`) as `categories` FROM `".DB_PREFIX."product_to_category` WHERE `product_id` = '".(int)$cart_product['product_id']."'")
#END
getRevisedTransaction=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_revise_request` WHERE `laybuy_revise_request_id` = '".(int)$id."'")
#END
deleteTransactionByOrderId1=$this->db->query("DELETE FROM `".DB_PREFIX."laybuy_revise_request` WHERE `order_id` = '".(int)$order_id."'")
#END
getTransaction=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `laybuy_transaction_id` = '".(int)$id."'")
#END
