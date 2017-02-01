uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."cardinity_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."cardinity_order` (
			  `cardinity_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `payment_id` VARCHAR(255),
			  PRIMARY KEY (`cardinity_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
		")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."cardinity_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
