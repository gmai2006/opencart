addStockStatus=$this->db->query("INSERT INTO ".DB_PREFIX."stock_status SET stock_status_id = '".(int)$stock_status_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editStockStatus1=$this->db->query("INSERT INTO ".DB_PREFIX."stock_status SET stock_status_id = '".(int)$stock_status_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
deleteStockStatus=$this->db->query("DELETE FROM ".DB_PREFIX."stock_status WHERE stock_status_id = '".(int)$stock_status_id."'")
#END
addStockStatus1=$this->db->query("INSERT INTO ".DB_PREFIX."stock_status SET language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editStockStatus=$this->db->query("DELETE FROM ".DB_PREFIX."stock_status WHERE stock_status_id = '".(int)$stock_status_id."'")
#END
getStockStatus=$this->db->query("SELECT * FROM ".DB_PREFIX."stock_status WHERE stock_status_id = '".(int)$stock_status_id."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getStockStatuses=$this->db->query("SELECT stock_status_id, name FROM ".DB_PREFIX."stock_status WHERE language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY name")
#END
getTotalStockStatuses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."stock_status WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getStockStatusDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."stock_status WHERE stock_status_id = '".(int)$stock_status_id."'")
#END
