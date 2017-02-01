install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."divido_lookup` (
				`order_id` INT(11) NOT NULL,
				`salt` CHAR(64) NOT NULL,
				`proposal_id` CHAR(40),
				`application_id` CHAR(40),
				`deposit_amount` NUMERIC(6,2),
			  PRIMARY KEY (`order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."divido_lookup`;")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."divido_product`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."divido_product` (
				`product_id` INT(11) NOT NULL,
				`display` CHAR(7) NOT NULL,
				`plans` text,
				PRIMARY KEY (`product_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
getLookupByOrderId=$this->db->query("SELECT * FROM `".DB_PREFIX."divido_lookup` WHERE `order_id` = ".(int)$order_id)
#END
