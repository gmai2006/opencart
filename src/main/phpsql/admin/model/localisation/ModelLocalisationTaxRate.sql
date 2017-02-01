addTaxRate=$this->db->query("INSERT INTO ".DB_PREFIX."tax_rate SET name = '".$this->db->escape($data['name'])."', rate = '".(float)$data['rate']."', `type` = '".$this->db->escape($data['type'])."', geo_zone_id = '".(int)$data['geo_zone_id']."', date_added = NOW(), date_modified = NOW()")
#END
editTaxRate2=$this->db->query("INSERT INTO ".DB_PREFIX."tax_rate_to_customer_group SET tax_rate_id = '".(int)$tax_rate_id."', customer_group_id = '".(int)$customer_group_id."'")
#END
getTaxRate=$this->db->query("SELECT tr.tax_rate_id, tr.name AS name, tr.rate, tr.type, tr.geo_zone_id, gz.name AS geo_zone, tr.date_added, tr.date_modified FROM ".DB_PREFIX."tax_rate tr LEFT JOIN ".DB_PREFIX."geo_zone gz ON (tr.geo_zone_id = gz.geo_zone_id) WHERE tr.tax_rate_id = '".(int)$tax_rate_id."'")
#END
editTaxRate1=$this->db->query("DELETE FROM ".DB_PREFIX."tax_rate_to_customer_group WHERE tax_rate_id = '".(int)$tax_rate_id."'")
#END
getTaxRateCustomerGroups=$this->db->query("SELECT * FROM ".DB_PREFIX."tax_rate_to_customer_group WHERE tax_rate_id = '".(int)$tax_rate_id."'")
#END
editTaxRate=$this->db->query("UPDATE ".DB_PREFIX."tax_rate SET name = '".$this->db->escape($data['name'])."', rate = '".(float)$data['rate']."', `type` = '".$this->db->escape($data['type'])."', geo_zone_id = '".(int)$data['geo_zone_id']."', date_modified = NOW() WHERE tax_rate_id = '".(int)$tax_rate_id."'")
#END
deleteTaxRate=$this->db->query("DELETE FROM ".DB_PREFIX."tax_rate WHERE tax_rate_id = '".(int)$tax_rate_id."'")
#END
getTotalTaxRates=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."tax_rate")
#END
deleteTaxRate1=$this->db->query("DELETE FROM ".DB_PREFIX."tax_rate_to_customer_group WHERE tax_rate_id = '".(int)$tax_rate_id."'")
#END
addTaxRate1=$this->db->query("INSERT INTO ".DB_PREFIX."tax_rate_to_customer_group SET tax_rate_id = '".(int)$tax_rate_id."', customer_group_id = '".(int)$customer_group_id."'")
#END
getTotalTaxRatesByGeoZoneId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."tax_rate WHERE geo_zone_id = '".(int)$geo_zone_id."'")
#END
