editTaxClass=$this->db->query("UPDATE ".DB_PREFIX."tax_class SET title = '".$this->db->escape($data['title'])."', description = '".$this->db->escape($data['description'])."', date_modified = NOW() WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
addTaxClass=$this->db->query("INSERT INTO ".DB_PREFIX."tax_class SET title = '".$this->db->escape($data['title'])."', description = '".$this->db->escape($data['description'])."', date_added = NOW()")
#END
getTaxClass=$this->db->query("SELECT * FROM ".DB_PREFIX."tax_class WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
deleteTaxClass=$this->db->query("DELETE FROM ".DB_PREFIX."tax_class WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
getTotalTaxClasses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."tax_class")
#END
editTaxClass2=$this->db->query("INSERT INTO ".DB_PREFIX."tax_rule SET tax_class_id = '".(int)$tax_class_id."', tax_rate_id = '".(int)$tax_rule['tax_rate_id']."', based = '".$this->db->escape($tax_rule['based'])."', priority = '".(int)$tax_rule['priority']."'")
#END
getTotalTaxRulesByTaxRateId=$this->db->query("SELECT COUNT(DISTINCT tax_class_id) AS total FROM ".DB_PREFIX."tax_rule WHERE tax_rate_id = '".(int)$tax_rate_id."'")
#END
editTaxClass1=$this->db->query("DELETE FROM ".DB_PREFIX."tax_rule WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
getTaxRules=$this->db->query("SELECT * FROM ".DB_PREFIX."tax_rule WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
deleteTaxClass1=$this->db->query("DELETE FROM ".DB_PREFIX."tax_rule WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
getTaxClasses=$this->db->query("SELECT * FROM ".DB_PREFIX."tax_class")
#END
addTaxClass1=$this->db->query("INSERT INTO ".DB_PREFIX."tax_rule SET tax_class_id = '".(int)$tax_class_id."', tax_rate_id = '".(int)$tax_rule['tax_rate_id']."', based = '".$this->db->escape($tax_rule['based'])."', priority = '".(int)$tax_rule['priority']."'")
#END
