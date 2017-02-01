uninstall1=$this->db->query("DELETE FROM ".DB_PREFIX."setting WHERE `code` = '".$this->db->escape($code)."'")
#END
uninstall=$this->db->query("DELETE FROM ".DB_PREFIX."extension WHERE `type` = '".$this->db->escape($type)."' AND `code` = '".$this->db->escape($code)."'")
#END
install=$this->db->query("INSERT INTO ".DB_PREFIX."extension SET `type` = '".$this->db->escape($type)."', `code` = '".$this->db->escape($code)."'")
#END
getInstalled=$this->db->query("SELECT * FROM ".DB_PREFIX."extension WHERE `type` = '".$this->db->escape($type)."' ORDER BY code")
#END
