getSetting=$this->db->query("SELECT * FROM ".DB_PREFIX."setting WHERE store_id = '".(int)$store_id."' AND `code` = '".$this->db->escape($code)."'")
#END
