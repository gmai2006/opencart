editLengthClass=$this->db->query("UPDATE ".DB_PREFIX."length_class SET value = '".(float)$data['value']."' WHERE length_class_id = '".(int)$length_class_id."'")
#END
editLengthClass1=$this->db->query("DELETE FROM ".DB_PREFIX."length_class_description WHERE length_class_id = '".(int)$length_class_id."'")
#END
getLengthClass=$this->db->query("SELECT * FROM ".DB_PREFIX."length_class lc LEFT JOIN ".DB_PREFIX."length_class_description lcd ON (lc.length_class_id = lcd.length_class_id) WHERE lc.length_class_id = '".(int)$length_class_id."' AND lcd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editLengthClass2=$this->db->query("INSERT INTO ".DB_PREFIX."length_class_description SET length_class_id = '".(int)$length_class_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($value['title'])."', unit = '".$this->db->escape($value['unit'])."'")
#END
getLengthClassDescriptionByUnit=$this->db->query("SELECT * FROM ".DB_PREFIX."length_class_description WHERE unit = '".$this->db->escape($unit)."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getLengthClassDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."length_class_description WHERE length_class_id = '".(int)$length_class_id."'")
#END
addLengthClass=$this->db->query("INSERT INTO ".DB_PREFIX."length_class SET value = '".(float)$data['value']."'")
#END
addLengthClass1=$this->db->query("INSERT INTO ".DB_PREFIX."length_class_description SET length_class_id = '".(int)$length_class_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($value['title'])."', unit = '".$this->db->escape($value['unit'])."'")
#END
deleteLengthClass1=$this->db->query("DELETE FROM ".DB_PREFIX."length_class_description WHERE length_class_id = '".(int)$length_class_id."'")
#END
getTotalLengthClasses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."length_class")
#END
deleteLengthClass=$this->db->query("DELETE FROM ".DB_PREFIX."length_class WHERE length_class_id = '".(int)$length_class_id."'")
#END
getLengthClasses=$this->db->query("SELECT * FROM ".DB_PREFIX."length_class lc LEFT JOIN ".DB_PREFIX."length_class_description lcd ON (lc.length_class_id = lcd.length_class_id) WHERE lcd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
