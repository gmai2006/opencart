updateTrackingNumber=$this->db->query("UPDATE `".DB_PREFIX."pilibaba_order` SET `tracking` = '".$this->db->escape($tracking_number)."' WHERE `order_id` = '".(int)$order_id."'")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."pilibaba_order`")
#END
install=$this->db->query("CREATE TABLE IF NOT EXISTS `".DB_PREFIX."pilibaba_order` (
			`pilibaba_order_id` int(11) NOT NULL AUTO_INCREMENT,
			`order_id` int(11) NOT NULL DEFAULT '0',
			`amount` double NOT NULL,
			`fee` double NOT NULL,
			`tracking` VARCHAR(50) NOT NULL DEFAULT '',
			`date_added` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			PRIMARY KEY (`pilibaba_order_id`)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."pilibaba_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
disablePiliExpress=$this->db->query("DELETE FROM `".DB_PREFIX."extension` WHERE `type` = 'shipping' AND `code` = 'pilibaba'")
#END
enablePiliExpress=$this->db->query("SELECT * FROM `".DB_PREFIX."extension` WHERE `type` = 'shipping' AND `code` = 'pilibaba'")
#END
enablePiliExpress1=$this->db->query("INSERT INTO `".DB_PREFIX."extension` SET `type` = 'shipping', `code` = 'pilibaba'")
#END
