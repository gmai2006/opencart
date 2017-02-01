install1=
			CREATE TABLE  oc_google_base_category_to_category (
				google_base_category_id INT(11) NOT NULL,
				category_id INT(11) NOT NULL,
				PRIMARY KEY (google_base_category_id, category_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		
#END
uninstall1=DROP TABLE IF EXISTS  oc_google_base_category_to_category
#END
import1=INSERT INTO oc_google_base_category SET google_base_category_id = ?1, name = ?2
#END
getTotalCategories=SELECT COUNT(*) AS total FROM  oc_google_base_category_to_category
#END
uninstall=DROP TABLE IF EXISTS  oc_google_base_category
#END
import=DELETE FROM oc_google_base_category
#END
install=
			CREATE TABLE  oc_google_base_category (
				google_base_category_id INT(11) NOT NULL AUTO_INCREMENT,
				name varchar(255) NOT NULL,
				PRIMARY KEY (google_base_category_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		
#END
deleteCategory=DELETE FROM oc_google_base_category_to_category WHERE category_id = ?1
#END
addCategory1=INSERT INTO oc_google_base_category_to_category SET google_base_category_id = ?1, category_id = ?2
#END
addCategory=DELETE FROM oc_google_base_category_to_category WHERE category_id = ?1
#END
