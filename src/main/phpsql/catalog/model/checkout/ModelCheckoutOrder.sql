editOrder=$this->db->query("UPDATE `".DB_PREFIX."order` SET invoice_prefix = '".$this->db->escape($data['invoice_prefix'])."', store_id = '".(int)$data['store_id']."', store_name = '".$this->db->escape($data['store_name'])."', store_url = '".$this->db->escape($data['store_url'])."', customer_id = '".(int)$data['customer_id']."', customer_group_id = '".(int)$data['customer_group_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(json_encode($data['custom_field']))."', payment_firstname = '".$this->db->escape($data['payment_firstname'])."', payment_lastname = '".$this->db->escape($data['payment_lastname'])."', payment_company = '".$this->db->escape($data['payment_company'])."', payment_address_1 = '".$this->db->escape($data['payment_address_1'])."', payment_address_2 = '".$this->db->escape($data['payment_address_2'])."', payment_city = '".$this->db->escape($data['payment_city'])."', payment_postcode = '".$this->db->escape($data['payment_postcode'])."', payment_country = '".$this->db->escape($data['payment_country'])."', payment_country_id = '".(int)$data['payment_country_id']."', payment_zone = '".$this->db->escape($data['payment_zone'])."', payment_zone_id = '".(int)$data['payment_zone_id']."', payment_address_format = '".$this->db->escape($data['payment_address_format'])."', payment_custom_field = '".$this->db->escape(json_encode($data['payment_custom_field']))."', payment_method = '".$this->db->escape($data['payment_method'])."', payment_code = '".$this->db->escape($data['payment_code'])."', shipping_firstname = '".$this->db->escape($data['shipping_firstname'])."', shipping_lastname = '".$this->db->escape($data['shipping_lastname'])."', shipping_company = '".$this->db->escape($data['shipping_company'])."', shipping_address_1 = '".$this->db->escape($data['shipping_address_1'])."', shipping_address_2 = '".$this->db->escape($data['shipping_address_2'])."', shipping_city = '".$this->db->escape($data['shipping_city'])."', shipping_postcode = '".$this->db->escape($data['shipping_postcode'])."', shipping_country = '".$this->db->escape($data['shipping_country'])."', shipping_country_id = '".(int)$data['shipping_country_id']."', shipping_zone = '".$this->db->escape($data['shipping_zone'])."', shipping_zone_id = '".(int)$data['shipping_zone_id']."', shipping_address_format = '".$this->db->escape($data['shipping_address_format'])."', shipping_custom_field = '".$this->db->escape(json_encode($data['shipping_custom_field']))."', shipping_method = '".$this->db->escape($data['shipping_method'])."', shipping_code = '".$this->db->escape($data['shipping_code'])."', comment = '".$this->db->escape($data['comment'])."', total = '".(float)$data['total']."', affiliate_id = '".(int)$data['affiliate_id']."', commission = '".(float)$data['commission']."', date_modified = NOW() WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder7=$this->db->query("DELETE FROM `".DB_PREFIX."affiliate_transaction` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder3=$this->db->query("DELETE FROM `".DB_PREFIX."order_voucher` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder4=$this->db->query("DELETE FROM `".DB_PREFIX."order_total` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder5=$this->db->query("DELETE FROM `".DB_PREFIX."order_history` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder6=$this->db->query("DELETE `or`, ort FROM `".DB_PREFIX."order_recurring` `or`, `".DB_PREFIX."order_recurring_transaction` `ort` WHERE order_id = '".(int)$order_id."' AND ort.order_recurring_id = `or`.order_recurring_id")
#END
deleteOrder1=$this->db->query("DELETE FROM `".DB_PREFIX."order_product` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder2=$this->db->query("DELETE FROM `".DB_PREFIX."order_option` WHERE order_id = '".(int)$order_id."'")
#END
addOrderHistory=$this->db->query("SELECT * FROM `".DB_PREFIX."order_total` WHERE order_id = '".(int)$order_id."' ORDER BY sort_order ASC")
#END
addOrder4=$this->db->query("UPDATE ".DB_PREFIX."order_voucher SET voucher_id = '".(int)$voucher_id."' WHERE order_voucher_id = '".(int)$order_voucher_id."'")
#END
addOrder3=$this->db->query("INSERT INTO ".DB_PREFIX."order_voucher SET order_id = '".(int)$order_id."', description = '".$this->db->escape($voucher['description'])."', code = '".$this->db->escape($voucher['code'])."', from_name = '".$this->db->escape($voucher['from_name'])."', from_email = '".$this->db->escape($voucher['from_email'])."', to_name = '".$this->db->escape($voucher['to_name'])."', to_email = '".$this->db->escape($voucher['to_email'])."', voucher_theme_id = '".(int)$voucher['voucher_theme_id']."', message = '".$this->db->escape($voucher['message'])."', amount = '".(float)$voucher['amount']."'")
#END
addOrder2=$this->db->query("INSERT INTO ".DB_PREFIX."order_option SET order_id = '".(int)$order_id."', order_product_id = '".(int)$order_product_id."', product_option_id = '".(int)$option['product_option_id']."', product_option_value_id = '".(int)$option['product_option_value_id']."', name = '".$this->db->escape($option['name'])."', `value` = '".$this->db->escape($option['value'])."', `type` = '".$this->db->escape($option['type'])."'")
#END
addOrder1=$this->db->query("INSERT INTO ".DB_PREFIX."order_product SET order_id = '".(int)$order_id."', product_id = '".(int)$product['product_id']."', name = '".$this->db->escape($product['name'])."', model = '".$this->db->escape($product['model'])."', quantity = '".(int)$product['quantity']."', price = '".(float)$product['price']."', total = '".(float)$product['total']."', tax = '".(float)$product['tax']."', reward = '".(int)$product['reward']."'")
#END
addOrder5=$this->db->query("INSERT INTO ".DB_PREFIX."order_total SET order_id = '".(int)$order_id."', code = '".$this->db->escape($total['code'])."', title = '".$this->db->escape($total['title'])."', `value` = '".(float)$total['value']."', sort_order = '".(int)$total['sort_order']."'")
#END
addOrderHistory20=$this->db->query("SELECT * FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."' AND language_id = '".(int)$order_info['language_id']."'")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."order` SET invoice_prefix = '".$this->db->escape($data['invoice_prefix'])."', store_id = '".(int)$data['store_id']."', store_name = '".$this->db->escape($data['store_name'])."', store_url = '".$this->db->escape($data['store_url'])."', customer_id = '".(int)$data['customer_id']."', customer_group_id = '".(int)$data['customer_group_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(isset($data['custom_field'])?json_encode($data['custom_field']):'')."', payment_firstname = '".$this->db->escape($data['payment_firstname'])."', payment_lastname = '".$this->db->escape($data['payment_lastname'])."', payment_company = '".$this->db->escape($data['payment_company'])."', payment_address_1 = '".$this->db->escape($data['payment_address_1'])."', payment_address_2 = '".$this->db->escape($data['payment_address_2'])."', payment_city = '".$this->db->escape($data['payment_city'])."', payment_postcode = '".$this->db->escape($data['payment_postcode'])."', payment_country = '".$this->db->escape($data['payment_country'])."', payment_country_id = '".(int)$data['payment_country_id']."', payment_zone = '".$this->db->escape($data['payment_zone'])."', payment_zone_id = '".(int)$data['payment_zone_id']."', payment_address_format = '".$this->db->escape($data['payment_address_format'])."', payment_custom_field = '".$this->db->escape(isset($data['payment_custom_field'])?json_encode($data['payment_custom_field']):'')."', payment_method = '".$this->db->escape($data['payment_method'])."', payment_code = '".$this->db->escape($data['payment_code'])."', shipping_firstname = '".$this->db->escape($data['shipping_firstname'])."', shipping_lastname = '".$this->db->escape($data['shipping_lastname'])."', shipping_company = '".$this->db->escape($data['shipping_company'])."', shipping_address_1 = '".$this->db->escape($data['shipping_address_1'])."', shipping_address_2 = '".$this->db->escape($data['shipping_address_2'])."', shipping_city = '".$this->db->escape($data['shipping_city'])."', shipping_postcode = '".$this->db->escape($data['shipping_postcode'])."', shipping_country = '".$this->db->escape($data['shipping_country'])."', shipping_country_id = '".(int)$data['shipping_country_id']."', shipping_zone = '".$this->db->escape($data['shipping_zone'])."', shipping_zone_id = '".(int)$data['shipping_zone_id']."', shipping_address_format = '".$this->db->escape($data['shipping_address_format'])."', shipping_custom_field = '".$this->db->escape(isset($data['shipping_custom_field'])?json_encode($data['shipping_custom_field']):'')."', shipping_method = '".$this->db->escape($data['shipping_method'])."', shipping_code = '".$this->db->escape($data['shipping_code'])."', comment = '".$this->db->escape($data['comment'])."', total = '".(float)$data['total']."', affiliate_id = '".(int)$data['affiliate_id']."', commission = '".(float)$data['commission']."', marketing_id = '".(int)$data['marketing_id']."', tracking = '".$this->db->escape($data['tracking'])."', language_id = '".(int)$data['language_id']."', currency_id = '".(int)$data['currency_id']."', currency_code = '".$this->db->escape($data['currency_code'])."', currency_value = '".(float)$data['currency_value']."', ip = '".$this->db->escape($data['ip'])."', forwarded_ip = '".$this->db->escape($data['forwarded_ip'])."', user_agent = '".$this->db->escape($data['user_agent'])."', accept_language = '".$this->db->escape($data['accept_language'])."', date_added = NOW(), date_modified = NOW()")
#END
deleteOrder=$this->db->query("DELETE FROM `".DB_PREFIX."order` WHERE order_id = '".(int)$order_id."'")
#END
editOrder3=$this->db->query("INSERT INTO ".DB_PREFIX."order_product SET order_id = '".(int)$order_id."', product_id = '".(int)$product['product_id']."', name = '".$this->db->escape($product['name'])."', model = '".$this->db->escape($product['model'])."', quantity = '".(int)$product['quantity']."', price = '".(float)$product['price']."', total = '".(float)$product['total']."', tax = '".(float)$product['tax']."', reward = '".(int)$product['reward']."'")
#END
addOrderHistory6=$this->db->query("INSERT INTO ".DB_PREFIX."order_history SET order_id = '".(int)$order_id."', order_status_id = '".(int)$order_status_id."', notify = '".(int)$notify."', comment = '".$this->db->escape($comment)."', date_added = NOW()")
#END
editOrder2=$this->db->query("DELETE FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."'")
#END
addOrderHistory5=$this->db->query("UPDATE `".DB_PREFIX."order` SET order_status_id = '".(int)$order_status_id."', date_modified = NOW() WHERE order_id = '".(int)$order_id."'")
#END
editOrder1=$this->db->query("DELETE FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
getOrder4=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$order_query->row['shipping_zone_id']."'")
#END
addOrderHistory4=$this->db->query("UPDATE ".DB_PREFIX."product_option_value SET quantity = (quantity - ".(int)$order_product['quantity'].") WHERE product_option_value_id = '".(int)$option['product_option_value_id']."' AND subtract = '1'")
#END
addOrderHistory3=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$order_product['order_product_id']."'")
#END
getOrder2=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$order_query->row['payment_zone_id']."'")
#END
addOrderHistory2=$this->db->query("UPDATE ".DB_PREFIX."product SET quantity = (quantity - ".(int)$order_product['quantity'].") WHERE product_id = '".(int)$order_product['product_id']."' AND subtract = '1'")
#END
getOrder3=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$order_query->row['shipping_country_id']."'")
#END
addOrderHistory1=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
getOrder1=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$order_query->row['payment_country_id']."'")
#END
addOrderHistory10=$this->db->query("UPDATE ".DB_PREFIX."product_option_value SET quantity = (quantity + ".(int)$product['quantity'].") WHERE product_option_value_id = '".(int)$option['product_option_value_id']."' AND subtract = '1'")
#END
addOrderHistory11=$this->db->query("SELECT * FROM `".DB_PREFIX."order_total` WHERE order_id = '".(int)$order_id."' ORDER BY sort_order ASC")
#END
editOrder9=$this->db->query("INSERT INTO ".DB_PREFIX."order_total SET order_id = '".(int)$order_id."', code = '".$this->db->escape($total['code'])."', title = '".$this->db->escape($total['title'])."', `value` = '".(float)$total['value']."', sort_order = '".(int)$total['sort_order']."'")
#END
editOrder8=$this->db->query("DELETE FROM ".DB_PREFIX."order_total WHERE order_id = '".(int)$order_id."'")
#END
editOrder7=$this->db->query("UPDATE ".DB_PREFIX."order_voucher SET voucher_id = '".(int)$voucher_id."' WHERE order_voucher_id = '".(int)$order_voucher_id."'")
#END
editOrder6=$this->db->query("INSERT INTO ".DB_PREFIX."order_voucher SET order_id = '".(int)$order_id."', description = '".$this->db->escape($voucher['description'])."', code = '".$this->db->escape($voucher['code'])."', from_name = '".$this->db->escape($voucher['from_name'])."', from_email = '".$this->db->escape($voucher['from_email'])."', to_name = '".$this->db->escape($voucher['to_name'])."', to_email = '".$this->db->escape($voucher['to_email'])."', voucher_theme_id = '".(int)$voucher['voucher_theme_id']."', message = '".$this->db->escape($voucher['message'])."', amount = '".(float)$voucher['amount']."'")
#END
addOrderHistory9=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$product['order_product_id']."'")
#END
editOrder5=$this->db->query("DELETE FROM ".DB_PREFIX."order_voucher WHERE order_id = '".(int)$order_id."'")
#END
addOrderHistory8=$this->db->query("UPDATE `".DB_PREFIX."product` SET quantity = (quantity + ".(int)$product['quantity'].") WHERE product_id = '".(int)$product['product_id']."' AND subtract = '1'")
#END
editOrder4=$this->db->query("INSERT INTO ".DB_PREFIX."order_option SET order_id = '".(int)$order_id."', order_product_id = '".(int)$order_product_id."', product_option_id = '".(int)$option['product_option_id']."', product_option_value_id = '".(int)$option['product_option_value_id']."', name = '".$this->db->escape($option['name'])."', `value` = '".$this->db->escape($option['value'])."', `type` = '".$this->db->escape($option['type'])."'")
#END
getOrder=$this->db->query("SELECT *, (SELECT os.name FROM `".DB_PREFIX."order_status` os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status FROM `".DB_PREFIX."order` o WHERE o.order_id = '".(int)$order_id."'")
#END
addOrderHistory7=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
addOrderHistory18=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".$product['order_product_id']."'")
#END
addOrderHistory19=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".$product['order_product_id']."'")
#END
addOrderHistory16=$this->db->query("SELECT * FROM ".DB_PREFIX."order_voucher WHERE order_id = '".(int)$order_id."'")
#END
addOrderHistory17=$this->db->query("SELECT * FROM `".DB_PREFIX."order_total` WHERE order_id = '".(int)$order_id."' ORDER BY sort_order ASC")
#END
addOrderHistory14=$this->db->query("SELECT * FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."' AND language_id = '".(int)$order_info['language_id']."'")
#END
addOrderHistory15=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$product['order_product_id']."'")
#END
addOrderHistory12=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
addOrderHistory13=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."product_to_download` WHERE product_id = '".(int)$order_product['product_id']."'")
#END
