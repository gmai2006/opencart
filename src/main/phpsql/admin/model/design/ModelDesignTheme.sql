editTheme1=$this->db->query("INSERT INTO `".DB_PREFIX."theme` SET store_id = '".(int)$store_id."', theme = '".$this->db->escape($theme)."', route = '".$this->db->escape($route)."', code = '".$this->db->escape($code)."'")
#END
getTheme=$this->db->query("SELECT * FROM `".DB_PREFIX."theme` WHERE store_id = '".(int)$store_id."' AND theme = '".$this->db->escape($theme)."' AND route = '".$this->db->escape($route)."'")
#END
editTheme=$this->db->query("DELETE FROM `".DB_PREFIX."theme` WHERE store_id = '".(int)$store_id."' AND theme = '".$this->db->escape($theme)."' AND route = '".$this->db->escape($route)."'")
#END
deleteTheme=$this->db->query("DELETE FROM `".DB_PREFIX."theme` WHERE store_id = '".(int)$store_id."' AND theme = '".$this->db->escape($theme)."' AND route = '".$this->db->escape($route)."'")
#END
