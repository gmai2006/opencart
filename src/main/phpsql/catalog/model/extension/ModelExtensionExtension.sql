getExtensions=$this->db->query("SELECT * FROM ".DB_PREFIX."extension WHERE `type` = '".$this->db->escape($type)."'")
#END
