addCustomerGroup=$this->db->query("INSERT INTO ".DB_PREFIX."customer_group SET approval = '".(int)$data['approval']."', sort_order = '".(int)$data['sort_order']."'")
#END
getTotalCustomerGroups=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_group")
#END
getCustomerGroup=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."customer_group cg LEFT JOIN ".DB_PREFIX."customer_group_description cgd ON (cg.customer_group_id = cgd.customer_group_id) WHERE cg.customer_group_id = '".(int)$customer_group_id."' AND cgd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteCustomerGroup=$this->db->query("DELETE FROM ".DB_PREFIX."customer_group WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
editCustomerGroup=$this->db->query("UPDATE ".DB_PREFIX."customer_group SET approval = '".(int)$data['approval']."', sort_order = '".(int)$data['sort_order']."' WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
addCustomerGroup1=$this->db->query("INSERT INTO ".DB_PREFIX."customer_group_description SET customer_group_id = '".(int)$customer_group_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."', description = '".$this->db->escape($value['description'])."'")
#END
editCustomerGroup1=$this->db->query("DELETE FROM ".DB_PREFIX."customer_group_description WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
editCustomerGroup2=$this->db->query("INSERT INTO ".DB_PREFIX."customer_group_description SET customer_group_id = '".(int)$customer_group_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."', description = '".$this->db->escape($value['description'])."'")
#END
deleteCustomerGroup1=$this->db->query("DELETE FROM ".DB_PREFIX."customer_group_description WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
deleteCustomerGroup2=$this->db->query("DELETE FROM ".DB_PREFIX."product_discount WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
getCustomerGroupDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_group_description WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
deleteCustomerGroup3=$this->db->query("DELETE FROM ".DB_PREFIX."product_special WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
deleteCustomerGroup4=$this->db->query("DELETE FROM ".DB_PREFIX."product_reward WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
deleteCustomerGroup5=$this->db->query("DELETE FROM ".DB_PREFIX."tax_rate_to_customer_group WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
