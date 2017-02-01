addReturnReason1=$this->db->query("INSERT INTO ".DB_PREFIX."return_reason SET language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
addReturnReason=$this->db->query("INSERT INTO ".DB_PREFIX."return_reason SET return_reason_id = '".(int)$return_reason_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
deleteReturnReason=$this->db->query("DELETE FROM ".DB_PREFIX."return_reason WHERE return_reason_id = '".(int)$return_reason_id."'")
#END
editReturnReason=$this->db->query("DELETE FROM ".DB_PREFIX."return_reason WHERE return_reason_id = '".(int)$return_reason_id."'")
#END
getReturnReasons=$this->db->query("SELECT return_reason_id, name FROM ".DB_PREFIX."return_reason WHERE language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY name")
#END
getTotalReturnReasons=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."return_reason WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getReturnReasonDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."return_reason WHERE return_reason_id = '".(int)$return_reason_id."'")
#END
editReturnReason1=$this->db->query("INSERT INTO ".DB_PREFIX."return_reason SET return_reason_id = '".(int)$return_reason_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getReturnReason=$this->db->query("SELECT * FROM ".DB_PREFIX."return_reason WHERE return_reason_id = '".(int)$return_reason_id."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
