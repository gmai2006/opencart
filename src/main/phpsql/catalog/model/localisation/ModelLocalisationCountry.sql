getCountries=$this->db->query("SELECT * FROM ".DB_PREFIX."country WHERE status = '1' ORDER BY name ASC")
#END
getCountry=$this->db->query("SELECT * FROM ".DB_PREFIX."country WHERE country_id = '".(int)$country_id."' AND status = '1'")
#END
