getMarketingByCode=$this->db->query("SELECT * FROM ".DB_PREFIX."marketing WHERE code = '".$this->db->escape($code)."'")
#END
