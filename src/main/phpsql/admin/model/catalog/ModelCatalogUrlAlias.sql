getUrlAlias=$this->db->query("SELECT * FROM ".DB_PREFIX."url_alias WHERE keyword = '".$this->db->escape($keyword)."'")
#END
