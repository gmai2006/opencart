deleteOption1=$this->db->query("DELETE FROM ".DB_PREFIX."option_description WHERE option_id = '".(int)$option_id."'")
#END
getOptionDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."option_description WHERE option_id = '".(int)$option_id."'")
#END
deleteOption3=$this->db->query("DELETE FROM ".DB_PREFIX."option_value_description WHERE option_id = '".(int)$option_id."'")
#END
deleteOption2=$this->db->query("DELETE FROM ".DB_PREFIX."option_value WHERE option_id = '".(int)$option_id."'")
#END
getOptionValueDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."option_value WHERE option_id = '".(int)$option_id."' ORDER BY sort_order")
#END
deleteOption=$this->db->query("DELETE FROM `".DB_PREFIX."option` WHERE option_id = '".(int)$option_id."'")
#END
getOption=$this->db->query("SELECT * FROM `".DB_PREFIX."option` o LEFT JOIN ".DB_PREFIX."option_description od ON (o.option_id = od.option_id) WHERE o.option_id = '".(int)$option_id."' AND od.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getOptionValueDescriptions1=$this->db->query("SELECT * FROM ".DB_PREFIX."option_value_description WHERE option_value_id = '".(int)$option_value['option_value_id']."'")
#END
editOption=$this->db->query("UPDATE `".DB_PREFIX."option` SET type = '".$this->db->escape($data['type'])."', sort_order = '".(int)$data['sort_order']."' WHERE option_id = '".(int)$option_id."'")
#END
editOption2=$this->db->query("INSERT INTO ".DB_PREFIX."option_description SET option_id = '".(int)$option_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editOption1=$this->db->query("DELETE FROM ".DB_PREFIX."option_description WHERE option_id = '".(int)$option_id."'")
#END
addOption=$this->db->query("INSERT INTO `".DB_PREFIX."option` SET type = '".$this->db->escape($data['type'])."', sort_order = '".(int)$data['sort_order']."'")
#END
editOption6=$this->db->query("INSERT INTO ".DB_PREFIX."option_value SET option_id = '".(int)$option_id."', image = '".$this->db->escape(html_entity_decode($option_value['image'],ENT_QUOTES,'UTF-8'))."', sort_order = '".(int)$option_value['sort_order']."'")
#END
editOption5=$this->db->query("INSERT INTO ".DB_PREFIX."option_value SET option_value_id = '".(int)$option_value['option_value_id']."', option_id = '".(int)$option_id."', image = '".$this->db->escape(html_entity_decode($option_value['image'],ENT_QUOTES,'UTF-8'))."', sort_order = '".(int)$option_value['sort_order']."'")
#END
editOption4=$this->db->query("DELETE FROM ".DB_PREFIX."option_value_description WHERE option_id = '".(int)$option_id."'")
#END
editOption3=$this->db->query("DELETE FROM ".DB_PREFIX."option_value WHERE option_id = '".(int)$option_id."'")
#END
getOptionValue=$this->db->query("SELECT * FROM ".DB_PREFIX."option_value ov LEFT JOIN ".DB_PREFIX."option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE ov.option_value_id = '".(int)$option_value_id."' AND ovd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getOptionValues=$this->db->query("SELECT * FROM ".DB_PREFIX."option_value ov LEFT JOIN ".DB_PREFIX."option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE ov.option_id = '".(int)$option_id."' AND ovd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY ov.sort_order, ovd.name")
#END
addOption1=$this->db->query("INSERT INTO ".DB_PREFIX."option_description SET option_id = '".(int)$option_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editOption7=$this->db->query("INSERT INTO ".DB_PREFIX."option_value_description SET option_value_id = '".(int)$option_value_id."', language_id = '".(int)$language_id."', option_id = '".(int)$option_id."', name = '".$this->db->escape($option_value_description['name'])."'")
#END
addOption3=$this->db->query("INSERT INTO ".DB_PREFIX."option_value_description SET option_value_id = '".(int)$option_value_id."', language_id = '".(int)$language_id."', option_id = '".(int)$option_id."', name = '".$this->db->escape($option_value_description['name'])."'")
#END
getTotalOptions=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."option`")
#END
addOption2=$this->db->query("INSERT INTO ".DB_PREFIX."option_value SET option_id = '".(int)$option_id."', image = '".$this->db->escape(html_entity_decode($option_value['image'],ENT_QUOTES,'UTF-8'))."', sort_order = '".(int)$option_value['sort_order']."'")
#END
