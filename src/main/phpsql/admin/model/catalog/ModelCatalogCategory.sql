editCategory10=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$data['parent_id']."' ORDER BY level ASC")
#END
getCategoryStores=$this->db->query("SELECT * FROM ".DB_PREFIX."category_to_store WHERE category_id = '".(int)$category_id."'")
#END
editCategory17=$this->db->query("DELETE FROM ".DB_PREFIX."category_to_layout WHERE category_id = '".(int)$category_id."'")
#END
editCategory18=$this->db->query("INSERT INTO ".DB_PREFIX."category_to_layout SET category_id = '".(int)$category_id."', store_id = '".(int)$store_id."', layout_id = '".(int)$layout_id."'")
#END
repairCategories=$this->db->query("SELECT * FROM ".DB_PREFIX."category WHERE parent_id = '".(int)$parent_id."'")
#END
editCategory15=$this->db->query("DELETE FROM ".DB_PREFIX."category_to_store WHERE category_id = '".(int)$category_id."'")
#END
editCategory16=$this->db->query("INSERT INTO ".DB_PREFIX."category_to_store SET category_id = '".(int)$category_id."', store_id = '".(int)$store_id."'")
#END
editCategory13=$this->db->query("DELETE FROM ".DB_PREFIX."category_filter WHERE category_id = '".(int)$category_id."'")
#END
editCategory14=$this->db->query("INSERT INTO ".DB_PREFIX."category_filter SET category_id = '".(int)$category_id."', filter_id = '".(int)$filter_id."'")
#END
editCategory11=$this->db->query("INSERT INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category_id."', `path_id` = '".(int)$result['path_id']."', level = '".(int)$level."'")
#END
editCategory12=$this->db->query("REPLACE INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category_id."', `path_id` = '".(int)$category_id."', level = '".(int)$level."'")
#END
editCategory19=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'category_id=".(int)$category_id."'")
#END
editCategory20=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'category_id=".(int)$category_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
getCategoryFilters=$this->db->query("SELECT * FROM ".DB_PREFIX."category_filter WHERE category_id = '".(int)$category_id."'")
#END
getCategory=$this->db->query("SELECT DISTINCT *, (SELECT GROUP_CONCAT(cd1.name ORDER BY level SEPARATOR '&nbsp;&nbsp;&gt;&nbsp;&nbsp;') FROM ".DB_PREFIX."category_path cp LEFT JOIN ".DB_PREFIX."category_description cd1 ON (cp.path_id = cd1.category_id AND cp.category_id != cp.path_id) WHERE cp.category_id = c.category_id AND cd1.language_id = '".(int)$this->config->get('config_language_id')."' GROUP BY cp.category_id) AS path, (SELECT DISTINCT keyword FROM ".DB_PREFIX."url_alias WHERE query = 'category_id=".(int)$category_id."') AS keyword FROM ".DB_PREFIX."category c LEFT JOIN ".DB_PREFIX."category_description cd2 ON (c.category_id = cd2.category_id) WHERE c.category_id = '".(int)$category_id."' AND cd2.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editCategory=$this->db->query("UPDATE ".DB_PREFIX."category SET parent_id = '".(int)$data['parent_id']."', `top` = '".(isset($data['top'])?(int)$data['top']:0)."', `column` = '".(int)$data['column']."', sort_order = '".(int)$data['sort_order']."', status = '".(int)$data['status']."', date_modified = NOW() WHERE category_id = '".(int)$category_id."'")
#END
addCategory7=$this->db->query("INSERT INTO ".DB_PREFIX."category_to_store SET category_id = '".(int)$category_id."', store_id = '".(int)$store_id."'")
#END
addCategory8=$this->db->query("INSERT INTO ".DB_PREFIX."category_to_layout SET category_id = '".(int)$category_id."', store_id = '".(int)$store_id."', layout_id = '".(int)$layout_id."'")
#END
addCategory9=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'category_id=".(int)$category_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
addCategory3=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$data['parent_id']."' ORDER BY `level` ASC")
#END
addCategory4=$this->db->query("INSERT INTO `".DB_PREFIX."category_path` SET `category_id` = '".(int)$category_id."', `path_id` = '".(int)$result['path_id']."', `level` = '".(int)$level."'")
#END
addCategory5=$this->db->query("INSERT INTO `".DB_PREFIX."category_path` SET `category_id` = '".(int)$category_id."', `path_id` = '".(int)$category_id."', `level` = '".(int)$level."'")
#END
addCategory6=$this->db->query("INSERT INTO ".DB_PREFIX."category_filter SET category_id = '".(int)$category_id."', filter_id = '".(int)$filter_id."'")
#END
addCategory1=$this->db->query("UPDATE ".DB_PREFIX."category SET image = '".$this->db->escape($data['image'])."' WHERE category_id = '".(int)$category_id."'")
#END
getCategoryLayouts=$this->db->query("SELECT * FROM ".DB_PREFIX."category_to_layout WHERE category_id = '".(int)$category_id."'")
#END
addCategory=$this->db->query("INSERT INTO ".DB_PREFIX."category SET parent_id = '".(int)$data['parent_id']."', `top` = '".(isset($data['top'])?(int)$data['top']:0)."', `column` = '".(int)$data['column']."', sort_order = '".(int)$data['sort_order']."', status = '".(int)$data['status']."', date_modified = NOW(), date_added = NOW()")
#END
addCategory2=$this->db->query("INSERT INTO ".DB_PREFIX."category_description SET category_id = '".(int)$category_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."', description = '".$this->db->escape($value['description'])."', meta_title = '".$this->db->escape($value['meta_title'])."', meta_description = '".$this->db->escape($value['meta_description'])."', meta_keyword = '".$this->db->escape($value['meta_keyword'])."'")
#END
getCategoryDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."category_description WHERE category_id = '".(int)$category_id."'")
#END
repairCategories2=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$parent_id."' ORDER BY level ASC")
#END
repairCategories1=$this->db->query("DELETE FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$category['category_id']."'")
#END
repairCategories4=$this->db->query("REPLACE INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category['category_id']."', `path_id` = '".(int)$category['category_id']."', level = '".(int)$level."'")
#END
repairCategories3=$this->db->query("INSERT INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category['category_id']."', `path_id` = '".(int)$result['path_id']."', level = '".(int)$level."'")
#END
getTotalCategoriesByLayoutId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."category_to_layout WHERE layout_id = '".(int)$layout_id."'")
#END
editCategory9=$this->db->query("DELETE FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$category_id."'")
#END
editCategory8=$this->db->query("REPLACE INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category_path['category_id']."', `path_id` = '".(int)$path_id."', level = '".(int)$level."'")
#END
getCategoryPath=$this->db->query("SELECT category_id, path_id, level FROM ".DB_PREFIX."category_path WHERE category_id = '".(int)$category_id."'")
#END
deleteCategory9=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_category WHERE category_id = '".(int)$category_id."'")
#END
deleteCategory=$this->db->query("DELETE FROM ".DB_PREFIX."category_path WHERE category_id = '".(int)$category_id."'")
#END
getTotalCategories=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."category")
#END
editCategory1=$this->db->query("UPDATE ".DB_PREFIX."category SET image = '".$this->db->escape($data['image'])."' WHERE category_id = '".(int)$category_id."'")
#END
deleteCategory5=$this->db->query("DELETE FROM ".DB_PREFIX."category_to_store WHERE category_id = '".(int)$category_id."'")
#END
deleteCategory6=$this->db->query("DELETE FROM ".DB_PREFIX."category_to_layout WHERE category_id = '".(int)$category_id."'")
#END
editCategory3=$this->db->query("INSERT INTO ".DB_PREFIX."category_description SET category_id = '".(int)$category_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."', description = '".$this->db->escape($value['description'])."', meta_title = '".$this->db->escape($value['meta_title'])."', meta_description = '".$this->db->escape($value['meta_description'])."', meta_keyword = '".$this->db->escape($value['meta_keyword'])."'")
#END
deleteCategory7=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_category WHERE category_id = '".(int)$category_id."'")
#END
editCategory2=$this->db->query("DELETE FROM ".DB_PREFIX."category_description WHERE category_id = '".(int)$category_id."'")
#END
deleteCategory8=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'category_id=".(int)$category_id."'")
#END
editCategory5=$this->db->query("DELETE FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$category_path['category_id']."' AND level < '".(int)$category_path['level']."'")
#END
deleteCategory1=$this->db->query("SELECT * FROM ".DB_PREFIX."category_path WHERE path_id = '".(int)$category_id."'")
#END
editCategory4=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE path_id = '".(int)$category_id."' ORDER BY level ASC")
#END
deleteCategory2=$this->db->query("DELETE FROM ".DB_PREFIX."category WHERE category_id = '".(int)$category_id."'")
#END
editCategory7=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$category_path['category_id']."' ORDER BY level ASC")
#END
deleteCategory3=$this->db->query("DELETE FROM ".DB_PREFIX."category_description WHERE category_id = '".(int)$category_id."'")
#END
editCategory6=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$data['parent_id']."' ORDER BY level ASC")
#END
deleteCategory4=$this->db->query("DELETE FROM ".DB_PREFIX."category_filter WHERE category_id = '".(int)$category_id."'")
#END
