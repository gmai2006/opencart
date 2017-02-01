getCategoryFilters=$this->db->query("SELECT filter_id FROM ".DB_PREFIX."category_filter WHERE category_id = '".(int)$category_id."'")
#END
getTotalCategoriesByCategoryId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."category c LEFT JOIN ".DB_PREFIX."category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = '".(int)$parent_id."' AND c2s.store_id = '".(int)$this->config->get('config_store_id')."' AND c.status = '1'")
#END
getCategoryLayoutId=$this->db->query("SELECT * FROM ".DB_PREFIX."category_to_layout WHERE category_id = '".(int)$category_id."' AND store_id = '".(int)$this->config->get('config_store_id')."'")
#END
getCategories=$this->db->query("SELECT * FROM ".DB_PREFIX."category c LEFT JOIN ".DB_PREFIX."category_description cd ON (c.category_id = cd.category_id) LEFT JOIN ".DB_PREFIX."category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = '".(int)$parent_id."' AND cd.language_id = '".(int)$this->config->get('config_language_id')."' AND c2s.store_id = '".(int)$this->config->get('config_store_id')."'  AND c.status = '1' ORDER BY c.sort_order, LCASE(cd.name)")
#END
getCategory=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."category c LEFT JOIN ".DB_PREFIX."category_description cd ON (c.category_id = cd.category_id) LEFT JOIN ".DB_PREFIX."category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.category_id = '".(int)$category_id."' AND cd.language_id = '".(int)$this->config->get('config_language_id')."' AND c2s.store_id = '".(int)$this->config->get('config_store_id')."' AND c.status = '1'")
#END
getCategoryFilters2=$this->db->query("SELECT DISTINCT f.filter_id, fd.name FROM ".DB_PREFIX."filter f LEFT JOIN ".DB_PREFIX."filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id IN (".implode(',',$implode).") AND f.filter_group_id = '".(int)$filter_group['filter_group_id']."' AND fd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY f.sort_order, LCASE(fd.name)")
#END
getCategoryFilters1=$this->db->query("SELECT DISTINCT f.filter_group_id, fgd.name, fg.sort_order FROM ".DB_PREFIX."filter f LEFT JOIN ".DB_PREFIX."filter_group fg ON (f.filter_group_id = fg.filter_group_id) LEFT JOIN ".DB_PREFIX."filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE f.filter_id IN (".implode(',',$implode).") AND fgd.language_id = '".(int)$this->config->get('config_language_id')."' GROUP BY f.filter_group_id ORDER BY fg.sort_order, LCASE(fgd.name)")
#END
