editFilter1=$this->db->query("DELETE FROM ".DB_PREFIX."filter_group_description WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
deleteFilter=$this->db->query("DELETE FROM `".DB_PREFIX."filter_group` WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
getFilterGroup=$this->db->query("SELECT * FROM `".DB_PREFIX."filter_group` fg LEFT JOIN ".DB_PREFIX."filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE fg.filter_group_id = '".(int)$filter_group_id."' AND fgd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteFilter3=$this->db->query("DELETE FROM `".DB_PREFIX."filter_description` WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
getFilterDescriptions1=$this->db->query("SELECT * FROM ".DB_PREFIX."filter_description WHERE filter_id = '".(int)$filter['filter_id']."'")
#END
getFilter=$this->db->query("SELECT *, (SELECT name FROM ".DB_PREFIX."filter_group_description fgd WHERE f.filter_group_id = fgd.filter_group_id AND fgd.language_id = '".(int)$this->config->get('config_language_id')."') AS `group` FROM ".DB_PREFIX."filter f LEFT JOIN ".DB_PREFIX."filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id = '".(int)$filter_id."' AND fd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editFilter=$this->db->query("UPDATE `".DB_PREFIX."filter_group` SET sort_order = '".(int)$data['sort_order']."' WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
deleteFilter1=$this->db->query("DELETE FROM `".DB_PREFIX."filter_group_description` WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
deleteFilter2=$this->db->query("DELETE FROM `".DB_PREFIX."filter` WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
addFilter2=$this->db->query("INSERT INTO ".DB_PREFIX."filter SET filter_group_id = '".(int)$filter_group_id."', sort_order = '".(int)$filter['sort_order']."'")
#END
addFilter1=$this->db->query("INSERT INTO ".DB_PREFIX."filter_group_description SET filter_group_id = '".(int)$filter_group_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
addFilter3=$this->db->query("INSERT INTO ".DB_PREFIX."filter_description SET filter_id = '".(int)$filter_id."', language_id = '".(int)$language_id."', filter_group_id = '".(int)$filter_group_id."', name = '".$this->db->escape($filter_description['name'])."'")
#END
editFilter7=$this->db->query("INSERT INTO ".DB_PREFIX."filter_description SET filter_id = '".(int)$filter_id."', language_id = '".(int)$language_id."', filter_group_id = '".(int)$filter_group_id."', name = '".$this->db->escape($filter_description['name'])."'")
#END
addFilter=$this->db->query("INSERT INTO `".DB_PREFIX."filter_group` SET sort_order = '".(int)$data['sort_order']."'")
#END
editFilter6=$this->db->query("INSERT INTO ".DB_PREFIX."filter SET filter_group_id = '".(int)$filter_group_id."', sort_order = '".(int)$filter['sort_order']."'")
#END
getFilterGroupDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."filter_group_description WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
getFilterDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."filter WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
editFilter3=$this->db->query("DELETE FROM ".DB_PREFIX."filter WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
editFilter2=$this->db->query("INSERT INTO ".DB_PREFIX."filter_group_description SET filter_group_id = '".(int)$filter_group_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getTotalFilterGroups=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."filter_group`")
#END
editFilter5=$this->db->query("INSERT INTO ".DB_PREFIX."filter SET filter_id = '".(int)$filter['filter_id']."', filter_group_id = '".(int)$filter_group_id."', sort_order = '".(int)$filter['sort_order']."'")
#END
editFilter4=$this->db->query("DELETE FROM ".DB_PREFIX."filter_description WHERE filter_group_id = '".(int)$filter_group_id."'")
#END
