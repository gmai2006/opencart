addCountry=$this->db->query("INSERT INTO ".DB_PREFIX."country SET name = '".$this->db->escape($data['name'])."', iso_code_2 = '".$this->db->escape($data['iso_code_2'])."', iso_code_3 = '".$this->db->escape($data['iso_code_3'])."', address_format = '".$this->db->escape($data['address_format'])."', postcode_required = '".(int)$data['postcode_required']."', status = '".(int)$data['status']."'")
#END
getCountries=$this->db->query("SELECT * FROM ".DB_PREFIX."country ORDER BY name ASC")
#END
getCountry=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."country WHERE country_id = '".(int)$country_id."'")
#END
editCountry=$this->db->query("UPDATE ".DB_PREFIX."country SET name = '".$this->db->escape($data['name'])."', iso_code_2 = '".$this->db->escape($data['iso_code_2'])."', iso_code_3 = '".$this->db->escape($data['iso_code_3'])."', address_format = '".$this->db->escape($data['address_format'])."', postcode_required = '".(int)$data['postcode_required']."', status = '".(int)$data['status']."' WHERE country_id = '".(int)$country_id."'")
#END
deleteCountry=$this->db->query("DELETE FROM ".DB_PREFIX."country WHERE country_id = '".(int)$country_id."'")
#END
getTotalCountries=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."country")
#END
