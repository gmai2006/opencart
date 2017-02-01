deleteMenu=$this->db->query("DELETE FROM ".DB_PREFIX."menu WHERE menu_id = '".(int)$menu_id."'")
#END
addMenu1=$this->db->query("INSERT INTO ".DB_PREFIX."menu_description SET menu_id = '".(int)$menu_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
addMenu=$this->db->query("INSERT INTO ".DB_PREFIX."menu SET store_id = '".(int)$data['store_id']."', type = '".$this->db->escape($data['type'])."', link = '".$this->db->escape($data['link'])."', sort_order = '".(int)$data['sort_order']."', status = '".(int)$data['status']."'")
#END
editMenu3=$this->db->query("DELETE FROM ".DB_PREFIX."menu_module WHERE menu_id = '".(int)$menu_id."'")
#END
editMenu4=$this->db->query("INSERT INTO ".DB_PREFIX."menu_description SET menu_id = '".(int)$menu_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editMenu1=$this->db->query("DELETE FROM ".DB_PREFIX."menu_description WHERE menu_id = '".(int)$menu_id."'")
#END
editMenu2=$this->db->query("INSERT INTO ".DB_PREFIX."menu_description SET menu_id = '".(int)$menu_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editMenu=$this->db->query("UPDATE ".DB_PREFIX."menu SET store_id = '".(int)$data['store_id']."', type = '".$this->db->escape($data['type'])."', link = '".$this->db->escape($data['link'])."', sort_order = '".(int)$data['sort_order']."', status = '".(int)$data['status']."' WHERE menu_id = '".(int)$menu_id."'")
#END
getMenuModules=$this->db->query("SELECT * FROM ".DB_PREFIX."menu_module WHERE menu_id = '".(int)$menu_id."'")
#END
deleteMenu2=$this->db->query("DELETE FROM ".DB_PREFIX."menu_module WHERE menu_id = '".(int)$menu_id."'")
#END
getMenuDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."menu_description WHERE menu_id = '".(int)$menu_id."'")
#END
getTotalMenus=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."menu")
#END
getMenu=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."menu WHERE menu_id = '".(int)$menu_id."'")
#END
deleteMenu1=$this->db->query("DELETE FROM ".DB_PREFIX."menu_description WHERE menu_id = '".(int)$menu_id."'")
#END
