login=$this->db->query("SELECT * FROM ".DB_PREFIX."api WHERE username = '".$this->db->escape($username)."' AND password = '".$this->db->escape($password)."'")
#END
