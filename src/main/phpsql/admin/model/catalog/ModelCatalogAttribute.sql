editAttribute1=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_description WHERE attribute_id = '".(int)$attribute_id."'")
#END
getAttribute=$this->db->query("SELECT * FROM ".DB_PREFIX."attribute a LEFT JOIN ".DB_PREFIX."attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE a.attribute_id = '".(int)$attribute_id."' AND ad.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addAttribute=$this->db->query("INSERT INTO ".DB_PREFIX."attribute SET attribute_group_id = '".(int)$data['attribute_group_id']."', sort_order = '".(int)$data['sort_order']."'")
#END
getTotalAttributes=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."attribute")
#END
editAttribute=$this->db->query("UPDATE ".DB_PREFIX."attribute SET attribute_group_id = '".(int)$data['attribute_group_id']."', sort_order = '".(int)$data['sort_order']."' WHERE attribute_id = '".(int)$attribute_id."'")
#END
deleteAttribute=$this->db->query("DELETE FROM ".DB_PREFIX."attribute WHERE attribute_id = '".(int)$attribute_id."'")
#END
deleteAttribute1=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_description WHERE attribute_id = '".(int)$attribute_id."'")
#END
getTotalAttributesByAttributeGroupId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."attribute WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
addAttribute1=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_description SET attribute_id = '".(int)$attribute_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editAttribute2=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_description SET attribute_id = '".(int)$attribute_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getAttributeDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."attribute_description WHERE attribute_id = '".(int)$attribute_id."'")
#END
