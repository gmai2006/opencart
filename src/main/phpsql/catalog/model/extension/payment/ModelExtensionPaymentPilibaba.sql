getOrderTaxAmount=$this->db->query("SELECT SUM(`value`) AS `value` FROM `".DB_PREFIX."order_total` WHERE `order_id` = '".(int)$order_id."' AND `code` = 'tax'")
#END
addPilibabaOrder=$this->db->query("INSERT INTO `".DB_PREFIX."pilibaba_order` SET `order_id` = '".(int)$response_data['orderNo']."', `amount` = '".(float)$response_data['orderAmount']."', `fee` = '".(float)$response_data['fee']."', `tracking` = '', `date_added` = NOW()")
#END
updateOrderInfo=$this->db->query("UPDATE `".DB_PREFIX."order` SET `firstname` = '".$this->db->escape($data['firstname'])."', `lastname` = '".$this->db->escape($data['lastname'])."', `email` = '".$this->db->escape($data['email'])."', `telephone` = '".$this->db->escape($data['mobile'])."', `payment_firstname` = '".$this->db->escape($data['firstname'])."', `payment_lastname` = '".$this->db->escape($data['lastname'])."', `payment_address_1` = '".$this->db->escape($data['address'])."', `payment_city` = '".$this->db->escape($data['city'])."', `payment_postcode` = '".$this->db->escape($data['zipcode'])."', `payment_country` = '".$this->db->escape($data['country'])."', `payment_zone` = '".$this->db->escape($data['district'])."', `shipping_firstname` = '".$this->db->escape($data['firstname'])."', `shipping_lastname` = '".$this->db->escape($data['lastname'])."', `shipping_address_1` = '".$this->db->escape($data['address'])."', `shipping_city` = '".$this->db->escape($data['city'])."', `shipping_postcode` = '".$this->db->escape($data['zipcode'])."', `shipping_country` = '".$this->db->escape($data['country'])."', `shipping_zone` = '".$this->db->escape($data['district'])."', `date_modified` = NOW() WHERE `order_id` = '".(int)$order_id."'")
#END