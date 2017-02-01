getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."cardinity_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
addOrder=$this->db->query("INSERT INTO `".DB_PREFIX."cardinity_order` SET `order_id` = '".(int)$data['order_id']."', `payment_id` = '".$this->db->escape($data['payment_id'])."'")
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('cardinity_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
