editReturnAction=$this->db->query("DELETE FROM ".DB_PREFIX."return_action WHERE return_action_id = '".(int)$return_action_id."'")
#END
editReturnAction1=$this->db->query("INSERT INTO ".DB_PREFIX."return_action SET return_action_id = '".(int)$return_action_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getTotalReturnActions=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."return_action WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteReturnAction=$this->db->query("DELETE FROM ".DB_PREFIX."return_action WHERE return_action_id = '".(int)$return_action_id."'")
#END
getReturnAction=$this->db->query("SELECT * FROM ".DB_PREFIX."return_action WHERE return_action_id = '".(int)$return_action_id."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getReturnActions=$this->db->query("SELECT return_action_id, name FROM ".DB_PREFIX."return_action WHERE language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY name")
#END
getReturnActionDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."return_action WHERE return_action_id = '".(int)$return_action_id."'")
#END
addReturnAction1=$this->db->query("INSERT INTO ".DB_PREFIX."return_action SET language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
addReturnAction=$this->db->query("INSERT INTO ".DB_PREFIX."return_action SET return_action_id = '".(int)$return_action_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
