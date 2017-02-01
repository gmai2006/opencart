addOrderStatus=$this->db->query("INSERT INTO ".DB_PREFIX."order_status SET order_status_id = '".(int)$order_status_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getOrderStatuses=$this->db->query("SELECT order_status_id, name FROM ".DB_PREFIX."order_status WHERE language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY name")
#END
getTotalOrderStatuses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."order_status WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editOrderStatus=$this->db->query("DELETE FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."'")
#END
deleteOrderStatus=$this->db->query("DELETE FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."'")
#END
getOrderStatus=$this->db->query("SELECT * FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editOrderStatus1=$this->db->query("INSERT INTO ".DB_PREFIX."order_status SET order_status_id = '".(int)$order_status_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
addOrderStatus1=$this->db->query("INSERT INTO ".DB_PREFIX."order_status SET language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getOrderStatusDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."'")
#END
