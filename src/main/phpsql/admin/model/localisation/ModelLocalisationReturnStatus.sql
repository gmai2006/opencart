addReturnStatus1=$this->db->query("INSERT INTO ".DB_PREFIX."return_status SET language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editReturnStatus=$this->db->query("DELETE FROM ".DB_PREFIX."return_status WHERE return_status_id = '".(int)$return_status_id."'")
#END
getReturnStatusDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."return_status WHERE return_status_id = '".(int)$return_status_id."'")
#END
getReturnStatus=$this->db->query("SELECT * FROM ".DB_PREFIX."return_status WHERE return_status_id = '".(int)$return_status_id."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getReturnStatuses=$this->db->query("SELECT return_status_id, name FROM ".DB_PREFIX."return_status WHERE language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY name")
#END
addReturnStatus=$this->db->query("INSERT INTO ".DB_PREFIX."return_status SET return_status_id = '".(int)$return_status_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editReturnStatus1=$this->db->query("INSERT INTO ".DB_PREFIX."return_status SET return_status_id = '".(int)$return_status_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getTotalReturnStatuses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."return_status WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteReturnStatus=$this->db->query("DELETE FROM ".DB_PREFIX."return_status WHERE return_status_id = '".(int)$return_status_id."'")
#END
