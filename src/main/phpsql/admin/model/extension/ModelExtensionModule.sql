getModule=$this->db->query("SELECT * FROM `".DB_PREFIX."module` WHERE `module_id` = '".(int)$module_id."'")
#END
deleteModulesByCode=$this->db->query("DELETE FROM `".DB_PREFIX."module` WHERE `code` = '".$this->db->escape($code)."'")
#END
getModulesByCode=$this->db->query("SELECT * FROM `".DB_PREFIX."module` WHERE `code` = '".$this->db->escape($code)."' ORDER BY `name`")
#END
deleteModulesByCode1=$this->db->query("DELETE FROM `".DB_PREFIX."layout_module` WHERE `code` LIKE '".$this->db->escape($code)."' OR `code` LIKE '".$this->db->escape($code.'.%')."'")
#END
editModule=$this->db->query("UPDATE `".DB_PREFIX."module` SET `name` = '".$this->db->escape($data['name'])."', `setting` = '".$this->db->escape(json_encode($data))."' WHERE `module_id` = '".(int)$module_id."'")
#END
getModules=$this->db->query("SELECT * FROM `".DB_PREFIX."module` ORDER BY `code`")
#END
addModule=$this->db->query("INSERT INTO `".DB_PREFIX."module` SET `name` = '".$this->db->escape($data['name'])."', `code` = '".$this->db->escape($code)."', `setting` = '".$this->db->escape(json_encode($data))."'")
#END
deleteModule1=$this->db->query("DELETE FROM `".DB_PREFIX."layout_module` WHERE `code` LIKE '%.".(int)$module_id."'")
#END
deleteModule=$this->db->query("DELETE FROM `".DB_PREFIX."module` WHERE `module_id` = '".(int)$module_id."'")
#END
