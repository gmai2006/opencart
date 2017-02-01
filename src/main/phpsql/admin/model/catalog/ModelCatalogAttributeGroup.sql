addAttributeGroup1=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_group_description SET attribute_group_id = '".(int)$attribute_group_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getAttributeGroupDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."attribute_group_description WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
getAttributeGroup=$this->db->query("SELECT * FROM ".DB_PREFIX."attribute_group WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
getTotalAttributeGroups=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."attribute_group")
#END
editAttributeGroup=$this->db->query("UPDATE ".DB_PREFIX."attribute_group SET sort_order = '".(int)$data['sort_order']."' WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
deleteAttributeGroup=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_group WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
addAttributeGroup=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_group SET sort_order = '".(int)$data['sort_order']."'")
#END
deleteAttributeGroup1=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_group_description WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
editAttributeGroup2=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_group_description SET attribute_group_id = '".(int)$attribute_group_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editAttributeGroup1=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_group_description WHERE attribute_group_id = '".(int)$attribute_group_id."'")
#END
