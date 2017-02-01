editOrder=$this->db->query("UPDATE `".DB_PREFIX."order` SET  payment_firstname = '".$this->db->escape($order['payment_firstname'])."', payment_lastname = '".$this->db->escape($order['payment_lastname'])."', payment_address_1 = '".$this->db->escape($order['payment_address_1'])."', payment_address_2 = '".$this->db->escape($order['payment_address_2'])."', payment_city = '".$this->db->escape($order['payment_city'])."', payment_zone = '".$this->db->escape($order['payment_zone'])."', payment_zone_id = ".(int)$order['payment_zone_id'].", payment_country = '".$this->db->escape($order['payment_country'])."', payment_country_id = ".(int)$order['payment_country_id'].", payment_postcode = '".$this->db->escape($order['payment_postcode'])."' WHERE order_id = ".(int)$order_id)
#END
getAdditionalCharges=$this->db->query("SELECT `ot`.`title`, `ot`.`order_total_id`, `value` + IF(`tax` IS NULL, 0, `tax`) AS 'price' FROM `".DB_PREFIX."order_total` `ot` LEFT JOIN `".DB_PREFIX."amazon_login_pay_order_total_tax` `ott` USING(`order_total_id`)  WHERE `ott`.`code` NOT IN ('shipping', 'total', 'sub_total', 'tax') AND `value` > 0 AND `order_id` = ".(int)$order_id)->rows
#END
getCountry=$this->db->query("SELECT `country_id`, `name`, `iso_code_2`, `iso_code_3`, `address_format` FROM `".DB_PREFIX."country` WHERE `iso_code_2` = '".$this->db->escape(strtoupper($iso2))."' AND `status` = 1 LIMIT 1")->row
#END
setOrderShipping=$this->db->query("INSERT INTO `".DB_PREFIX."amazon_login_pay_order` SET `order_id` = '".(int)$order_id."', `free_shipping` = '".(int)$has_free_shipping."',`date_added` = now(), `modified` = now() ")
#END
addAddress=$this->db->query("SELECT * FROM `".DB_PREFIX."address` WHERE `firstname` = '".$this->db->escape($address['firstname'])."' AND `lastname` = '".$this->db->escape($address['lastname'])."' AND `address_1` = '".$this->db->escape($address['address_1'])."' AND `address_2` = '".$this->db->escape($address['address_2'])."' AND `postcode` = '".$this->db->escape($address['postcode'])."' AND `city` = '".$this->db->escape($address['city'])."' AND `zone_id` = '".$this->db->escape($address['zone_id'])."' AND `country_id` = '".$this->db->escape($address['country_id'])."'")
#END
getTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."amazon_login_pay_order_transaction` WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."'")
#END
getZone=$this->db->query("SELECT `zone_id`, `code` FROM `".DB_PREFIX."zone` WHERE (LOWER(`name`) LIKE '".$this->db->escape(strtolower($name))."' OR `code` LIKE '".$this->db->escape(strtolower($name))."') AND `country_id` = ".(int)$country_id." LIMIT 1")->row
#END
getShippingPrice=$this->db->query("SELECT `value` + IF(`tax` IS NULL, 0, `tax`) AS 'price' FROM `".DB_PREFIX."order_total` `ot` LEFT JOIN `".DB_PREFIX."amazon_login_pay_order_total_tax` `ott` USING(`order_total_id`) WHERE `ot`.`code` = 'shipping' AND `order_id` = ".(int)$order_id)
#END
updateCaptureStatus=$this->db->query("UPDATE `".DB_PREFIX."amazon_login_pay_order` SET `capture_status` = '".(int)$status."' WHERE `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."'")
#END
addCustomer=$this->db->query("INSERT INTO ".DB_PREFIX."customer SET customer_group_id = '".(int)$customer_group_id."', store_id = '".(int)$this->config->get('config_store_id')."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(isset($data['custom_field']['account'])?json_encode($data['custom_field']['account']):'')."', salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."', newsletter = '".(isset($data['newsletter'])?(int)$data['newsletter']:0)."', ip = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."', status = '1', approved = '".(int)!$customer_group_info['approval']."', date_added = NOW()")
#END
hasFreeShipping=$this->db->query("SELECT `free_shipping` FROM `".DB_PREFIX."amazon_login_pay_order` WHERE `order_id` = ".(int)$order_id)->row['free_shipping']
#END
updateStatus=$this->db->query("UPDATE `".DB_PREFIX."amazon_login_pay_order_transaction` SET `status` = '".$this->db->escape($status)."' WHERE `amazon_".$type."_id` = '".$this->db->escape($amazon_id)."' AND `type` = '".$this->db->escape($type)."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."amazon_login_pay_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."amazon_login_pay_order_transaction` SET `amazon_login_pay_order_id` = '".(int)$amazon_login_pay_order_id."', `amazon_authorization_id` = '".$this->db->escape($amazon_authorization_id)."', `amazon_capture_id` = '".$this->db->escape($amazon_capture_id)."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `status` = '".$this->db->escape($status)."', `amount` = '".$total."'")
#END
addAmazonOrderId=$this->db->query("UPDATE `".DB_PREFIX."amazon_login_pay_order` SET `amazon_order_reference_id` = '".$this->db->escape($this->session->data['lpa']['AmazonOrderReferenceId'])."', `amazon_authorization_id` = '".$this->db->escape($amazon_authorization_id)."', `modified` = now(), `capture_status` = '".$this->db->escape($capture_status)."', `currency_code` = '".$this->db->escape($currency_code)."', `total` = '".$total."' WHERE `order_id` = '".(int)$order_id."'")
#END
addTaxesForTotals=$this->db->query("INSERT INTO `".DB_PREFIX."amazon_login_pay_order_total_tax` (`order_total_id`, `code`, `tax`) SELECT `order_total_id`, `code`, ".(float)$total['lpa_tax']." FROM `".DB_PREFIX."order_total` WHERE `order_id` = ".(int)$order_id." AND `code` = '".$this->db->escape($total['code'])."' AND `title` = '".$this->db->escape($total['title'])."'")
#END
