getCountriesByGeoZone=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$geo_zone_id."' GROUP BY `country_id` ORDER BY `country_id` ASC")
#END
getCountryByIsoCode2=$this->db->query("SELECT * FROM ".DB_PREFIX."country WHERE `iso_code_2` = '".$this->db->escape($iso_code_2)."' AND `status` = '1'")
#END
updateOcOrder=$this->db->query("UPDATE `".DB_PREFIX."order` SET `firstname` = '".$this->db->escape($data['firstname'])."', `lastname` = '".$this->db->escape($data['lastname'])."', `telephone` = '".$this->db->escape($data['telephone'])."', `payment_firstname` = '".$this->db->escape($data['payment_firstname'])."', `payment_lastname` = '".$this->db->escape($data['payment_lastname'])."', `payment_address_1` = '".$this->db->escape($data['payment_address_1'])."', `payment_address_2` = '".$this->db->escape($data['payment_address_2'])."', `payment_city` = '".$this->db->escape($data['payment_city'])."', `payment_postcode` = '".$this->db->escape($data['payment_postcode'])."', `payment_zone` = '".$this->db->escape($data['payment_zone'])."', `payment_zone_id` = '".(int)$data['payment_zone_id']."', `payment_country` = '".$this->db->escape($data['payment_country'])."', `payment_country_id` = '".(int)$data['payment_country_id']."', `payment_address_format` = '".$this->db->escape($data['payment_address_format'])."', `shipping_firstname` = '".$this->db->escape($data['shipping_firstname'])."', `shipping_lastname` = '".$this->db->escape($data['shipping_lastname'])."', `shipping_address_1` = '".$this->db->escape($data['shipping_address_1'])."', `shipping_address_2` = '".$this->db->escape($data['shipping_address_2'])."', `shipping_city` = '".$this->db->escape($data['shipping_city'])."', `shipping_postcode` = '".$this->db->escape($data['shipping_postcode'])."', `shipping_zone` = '".$this->db->escape($data['shipping_zone'])."', `shipping_zone_id` = '".(int)$data['shipping_zone_id']."', `shipping_country` = '".$this->db->escape($data['shipping_country'])."', `shipping_country_id` = '".(int)$data['shipping_country_id']."', `shipping_address_format` = '".$this->db->escape($data['shipping_address_format'])."' WHERE `order_id` = '".(int)$order_id."'")
#END
subscribeNewsletter=$this->db->query("UPDATE ".DB_PREFIX."customer SET newsletter = '1' WHERE customer_id = '".(int)$customer_id."'")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."klarna_checkout_order` WHERE `order_ref` = '".$this->db->escape($order_ref)."' LIMIT 1")->row
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."klarna_checkout_order` SET `order_id` = '".(int)$order_id."', `order_ref` = '".$this->db->escape($order_ref)."', `data` = '".$this->db->escape($data)."'")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."klarna_checkout_order` SET `order_id` = '".(int)$order_id."', `data` = '".$this->db->escape($data)."' WHERE `order_ref` = '".$this->db->escape($order_ref)."'")
#END
getZoneByCode=$this->db->query("SELECT * FROM ".DB_PREFIX."zone WHERE (`code` = '".$this->db->escape($code)."' OR `name` = '".$this->db->escape($code)."') AND `country_id` = '".(int)$country_id."' AND `status` = '1'")
#END
getCountryByIsoCode3=$this->db->query("SELECT * FROM ".DB_PREFIX."country WHERE `iso_code_3` = '".$this->db->escape($iso_code_3)."' AND `status` = '1'")
#END
checkForPaymentTaxes=$this->db->query("SELECT COUNT(*) AS `total` FROM ".DB_PREFIX."tax_rule WHERE `based` = 'payment' AND `tax_class_id` = '".(int)$product['tax_class_id']."'")
#END
getOrderByOrderId=$this->db->query("SELECT * FROM `".DB_PREFIX."klarna_checkout_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")->row
#END
updateOcOrderEmail=$this->db->query("UPDATE `".DB_PREFIX."order` SET `email` = '".$this->db->escape($email)."' WHERE `order_id` = '".(int)$order_id."'")
#END
