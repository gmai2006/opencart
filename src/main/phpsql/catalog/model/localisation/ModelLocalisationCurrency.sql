getCurrencies=$this->db->query("SELECT * FROM ".DB_PREFIX."currency ORDER BY title ASC")
#END
getCurrencyByCode=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."currency WHERE code = '".$this->db->escape($currency)."'")
#END
