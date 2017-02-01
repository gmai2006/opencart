editLayout4=$this->db->query("INSERT INTO ".DB_PREFIX."layout_module SET layout_id = '".(int)$layout_id."', code = '".$this->db->escape($layout_module['code'])."', position = '".$this->db->escape($layout_module['position'])."', sort_order = '".(int)$layout_module['sort_order']."'")
#END
getLayoutRoutes=$this->db->query("SELECT * FROM ".DB_PREFIX."layout_route WHERE layout_id = '".(int)$layout_id."'")
#END
addLayout2=$this->db->query("INSERT INTO ".DB_PREFIX."layout_module SET layout_id = '".(int)$layout_id."', code = '".$this->db->escape($layout_module['code'])."', position = '".$this->db->escape($layout_module['position'])."', sort_order = '".(int)$layout_module['sort_order']."'")
#END
addLayout1=$this->db->query("INSERT INTO ".DB_PREFIX."layout_route SET layout_id = '".(int)$layout_id."', store_id = '".(int)$layout_route['store_id']."', route = '".$this->db->escape($layout_route['route'])."'")
#END
deleteLayout=$this->db->query("DELETE FROM ".DB_PREFIX."layout WHERE layout_id = '".(int)$layout_id."'")
#END
deleteLayout5=$this->db->query("DELETE FROM ".DB_PREFIX."information_to_layout WHERE layout_id = '".(int)$layout_id."'")
#END
deleteLayout4=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_layout WHERE layout_id = '".(int)$layout_id."'")
#END
getLayoutModules=$this->db->query("SELECT * FROM ".DB_PREFIX."layout_module WHERE layout_id = '".(int)$layout_id."' ORDER BY position ASC, sort_order ASC")
#END
deleteLayout3=$this->db->query("DELETE FROM ".DB_PREFIX."category_to_layout WHERE layout_id = '".(int)$layout_id."'")
#END
deleteLayout2=$this->db->query("DELETE FROM ".DB_PREFIX."layout_module WHERE layout_id = '".(int)$layout_id."'")
#END
getLayout=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."layout WHERE layout_id = '".(int)$layout_id."'")
#END
deleteLayout1=$this->db->query("DELETE FROM ".DB_PREFIX."layout_route WHERE layout_id = '".(int)$layout_id."'")
#END
editLayout=$this->db->query("UPDATE ".DB_PREFIX."layout SET name = '".$this->db->escape($data['name'])."' WHERE layout_id = '".(int)$layout_id."'")
#END
getTotalLayouts=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."layout")
#END
addLayout=$this->db->query("INSERT INTO ".DB_PREFIX."layout SET name = '".$this->db->escape($data['name'])."'")
#END
editLayout1=$this->db->query("DELETE FROM ".DB_PREFIX."layout_route WHERE layout_id = '".(int)$layout_id."'")
#END
editLayout3=$this->db->query("DELETE FROM ".DB_PREFIX."layout_module WHERE layout_id = '".(int)$layout_id."'")
#END
editLayout2=$this->db->query("INSERT INTO ".DB_PREFIX."layout_route SET layout_id = '".(int)$layout_id."', store_id = '".(int)$layout_route['store_id']."', route = '".$this->db->escape($layout_route['route'])."'")
#END
