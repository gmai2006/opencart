install1=$this->db->query("
			CREATE TABLE `".DB_PREFIX."google_base_category_to_category` (
				`google_base_category_id` INT(11) NOT NULL,
				`category_id` INT(11) NOT NULL,
				PRIMARY KEY (`google_base_category_id`, `category_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."google_base_category_to_category`")
#END
import1=$this->db->query("INSERT INTO ".DB_PREFIX."google_base_category SET google_base_category_id = '".(int)$part[0]."', name = '".$this->db->escape($part[1])."'")
#END
getTotalCategories=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."google_base_category_to_category`")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."google_base_category`")
#END
import=$this->db->query("DELETE FROM ".DB_PREFIX."google_base_category")
#END
install=$this->db->query("
			CREATE TABLE `".DB_PREFIX."google_base_category` (
				`google_base_category_id` INT(11) NOT NULL AUTO_INCREMENT,
				`name` varchar(255) NOT NULL,
				PRIMARY KEY (`google_base_category_id`)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		")
#END
deleteCategory=$this->db->query("DELETE FROM ".DB_PREFIX."google_base_category_to_category WHERE category_id = '".(int)$category_id."'")
#END
addCategory1=$this->db->query("INSERT INTO ".DB_PREFIX."google_base_category_to_category SET google_base_category_id = '".(int)$data['google_base_category_id']."', category_id = '".(int)$data['category_id']."'")
#END
addCategory=$this->db->query("DELETE FROM ".DB_PREFIX."google_base_category_to_category WHERE category_id = '".(int)$data['category_id']."'")
#END
