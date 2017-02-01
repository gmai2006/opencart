uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."klarna_checkout_order`;")
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."klarna_checkout_order` (
			  `klarna_checkout_order_id` INT(11) NOT NULL AUTO_INCREMENT,
			  `order_id` INT(11) NOT NULL,
			  `order_ref` VARCHAR(255) NOT NULL,
			  `data` text NOT NULL,
			  PRIMARY KEY (`klarna_checkout_order_id`)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."klarna_checkout_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")->row
#END
checkForPaymentTaxes=$this->db->query("SELECT COUNT(*) AS `total` FROM ".DB_PREFIX."product p LEFT JOIN ".DB_PREFIX."tax_rule tr ON (`tr`.`tax_class_id` = `p`.`tax_class_id`) WHERE `tr`.`based` = 'payment'")
#END
