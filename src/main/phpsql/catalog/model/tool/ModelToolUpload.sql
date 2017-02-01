getUploadByCode=$this->db->query("SELECT * FROM `".DB_PREFIX."upload` WHERE code = '".$this->db->escape($code)."'")
#END
addUpload=$this->db->query("INSERT INTO `".DB_PREFIX."upload` SET `name` = '".$this->db->escape($name)."', `filename` = '".$this->db->escape($filename)."', `code` = '".$this->db->escape($code)."', `date_added` = NOW()")
#END
