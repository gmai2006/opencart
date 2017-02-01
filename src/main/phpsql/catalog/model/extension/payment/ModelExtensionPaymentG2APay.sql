getG2aOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."g2apay_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."g2apay_order` SET `g2apay_transaction_id` = '".$this->db->escape($g2apay_transaction_id)."', `modified` = now() WHERE `order_id` = '".(int)$order_info['order_id']."'")
#END
addTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."g2apay_order_transaction` SET `g2apay_order_id` = '".(int)$g2apay_order_id."', `date_added` = now(), `type` = '".$this->db->escape($type)."', `amount` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('g2apay_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
addG2aOrder=$this->db->query("INSERT INTO `".DB_PREFIX."g2apay_order` SET `order_id` = '".(int)$order_info['order_id']."', `date_added` = now(), `modified` = now(), `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$this->currency->format($order_info['total'],$order_info['currency_code'],false,false)."'")
#END
