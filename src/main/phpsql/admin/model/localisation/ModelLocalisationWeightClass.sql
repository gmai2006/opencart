editWeightClass1=$this->db->query("DELETE FROM ".DB_PREFIX."weight_class_description WHERE weight_class_id = '".(int)$weight_class_id."'")
#END
getTotalWeightClasses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."weight_class")
#END
deleteWeightClass=$this->db->query("DELETE FROM ".DB_PREFIX."weight_class WHERE weight_class_id = '".(int)$weight_class_id."'")
#END
getWeightClassDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."weight_class_description WHERE weight_class_id = '".(int)$weight_class_id."'")
#END
deleteWeightClass1=$this->db->query("DELETE FROM ".DB_PREFIX."weight_class_description WHERE weight_class_id = '".(int)$weight_class_id."'")
#END
getWeightClassDescriptionByUnit=$this->db->query("SELECT * FROM ".DB_PREFIX."weight_class_description WHERE unit = '".$this->db->escape($unit)."' AND language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addWeightClass1=$this->db->query("INSERT INTO ".DB_PREFIX."weight_class_description SET weight_class_id = '".(int)$weight_class_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($value['title'])."', unit = '".$this->db->escape($value['unit'])."'")
#END
editWeightClass2=$this->db->query("INSERT INTO ".DB_PREFIX."weight_class_description SET weight_class_id = '".(int)$weight_class_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($value['title'])."', unit = '".$this->db->escape($value['unit'])."'")
#END
addWeightClass=$this->db->query("INSERT INTO ".DB_PREFIX."weight_class SET value = '".(float)$data['value']."'")
#END
editWeightClass=$this->db->query("UPDATE ".DB_PREFIX."weight_class SET value = '".(float)$data['value']."' WHERE weight_class_id = '".(int)$weight_class_id."'")
#END
getWeightClass=$this->db->query("SELECT * FROM ".DB_PREFIX."weight_class wc LEFT JOIN ".DB_PREFIX."weight_class_description wcd ON (wc.weight_class_id = wcd.weight_class_id) WHERE wc.weight_class_id = '".(int)$weight_class_id."' AND wcd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getWeightClasses=$this->db->query("SELECT * FROM ".DB_PREFIX."weight_class wc LEFT JOIN ".DB_PREFIX."weight_class_description wcd ON (wc.weight_class_id = wcd.weight_class_id) WHERE wcd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
