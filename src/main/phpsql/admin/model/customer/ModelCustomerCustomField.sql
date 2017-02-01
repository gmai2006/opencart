addCustomField4=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_value_description SET custom_field_value_id = '".(int)$custom_field_value_id."', language_id = '".(int)$language_id."', custom_field_id = '".(int)$custom_field_id."', name = '".$this->db->escape($custom_field_value_description['name'])."'")
#END
editCustomField1=$this->db->query("DELETE FROM ".DB_PREFIX."custom_field_description WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
getCustomFieldValue=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_value cfv LEFT JOIN ".DB_PREFIX."custom_field_value_description cfvd ON (cfv.custom_field_value_id = cfvd.custom_field_value_id) WHERE cfv.custom_field_value_id = '".(int)$custom_field_value_id."' AND cfvd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editCustomField2=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_description SET custom_field_id = '".(int)$custom_field_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editCustomField3=$this->db->query("DELETE FROM ".DB_PREFIX."custom_field_customer_group WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
addCustomField=$this->db->query("INSERT INTO `".DB_PREFIX."custom_field` SET type = '".$this->db->escape($data['type'])."', value = '".$this->db->escape($data['value'])."', validation = '".$this->db->escape($data['validation'])."', location = '".$this->db->escape($data['location'])."', status = '".(int)$data['status']."', sort_order = '".(int)$data['sort_order']."'")
#END
addCustomField1=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_description SET custom_field_id = '".(int)$custom_field_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editCustomField4=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_customer_group SET custom_field_id = '".(int)$custom_field_id."', customer_group_id = '".(int)$custom_field_customer_group['customer_group_id']."', required = '".(int)(isset($custom_field_customer_group['required'])?1:0)."'")
#END
addCustomField2=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_customer_group SET custom_field_id = '".(int)$custom_field_id."', customer_group_id = '".(int)$custom_field_customer_group['customer_group_id']."', required = '".(int)(isset($custom_field_customer_group['required'])?1:0)."'")
#END
editCustomField5=$this->db->query("DELETE FROM ".DB_PREFIX."custom_field_value WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
addCustomField3=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_value SET custom_field_id = '".(int)$custom_field_id."', sort_order = '".(int)$custom_field_value['sort_order']."'")
#END
editCustomField6=$this->db->query("DELETE FROM ".DB_PREFIX."custom_field_value_description WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
editCustomField7=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_value SET custom_field_value_id = '".(int)$custom_field_value['custom_field_value_id']."', custom_field_id = '".(int)$custom_field_id."', sort_order = '".(int)$custom_field_value['sort_order']."'")
#END
editCustomField8=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_value SET custom_field_id = '".(int)$custom_field_id."', sort_order = '".(int)$custom_field_value['sort_order']."'")
#END
getCustomFieldCustomerGroups=$this->db->query("SELECT * FROM `".DB_PREFIX."custom_field_customer_group` WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
editCustomField9=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_value_description SET custom_field_value_id = '".(int)$custom_field_value_id."', language_id = '".(int)$language_id."', custom_field_id = '".(int)$custom_field_id."', name = '".$this->db->escape($custom_field_value_description['name'])."'")
#END
getCustomFieldDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_description WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
editCustomField=$this->db->query("UPDATE `".DB_PREFIX."custom_field` SET type = '".$this->db->escape($data['type'])."', value = '".$this->db->escape($data['value'])."', validation = '".$this->db->escape($data['validation'])."', location = '".$this->db->escape($data['location'])."', status = '".(int)$data['status']."', sort_order = '".(int)$data['sort_order']."' WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
deleteCustomField=$this->db->query("DELETE FROM `".DB_PREFIX."custom_field` WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
getCustomFieldValues=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_value cfv LEFT JOIN ".DB_PREFIX."custom_field_value_description cfvd ON (cfv.custom_field_value_id = cfvd.custom_field_value_id) WHERE cfv.custom_field_id = '".(int)$custom_field_id."' AND cfvd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY cfv.sort_order ASC")
#END
getCustomFieldValueDescriptions1=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_value_description WHERE custom_field_value_id = '".(int)$custom_field_value['custom_field_value_id']."'")
#END
getCustomField=$this->db->query("SELECT * FROM `".DB_PREFIX."custom_field` cf LEFT JOIN ".DB_PREFIX."custom_field_description cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.custom_field_id = '".(int)$custom_field_id."' AND cfd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteCustomField2=$this->db->query("DELETE FROM `".DB_PREFIX."custom_field_customer_group` WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
deleteCustomField3=$this->db->query("DELETE FROM `".DB_PREFIX."custom_field_value` WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
deleteCustomField4=$this->db->query("DELETE FROM `".DB_PREFIX."custom_field_value_description` WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
deleteCustomField1=$this->db->query("DELETE FROM `".DB_PREFIX."custom_field_description` WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
getTotalCustomFields=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."custom_field`")
#END
getCustomFieldValueDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_value WHERE custom_field_id = '".(int)$custom_field_id."'")
#END
