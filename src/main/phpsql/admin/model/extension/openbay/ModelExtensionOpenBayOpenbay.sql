faqDbTableCheck=$this->db->query("CREATE TABLE IF NOT EXISTS `".DB_PREFIX."openbay_faq` (`id` int(11) NOT NULL AUTO_INCREMENT,`route` text NOT NULL, PRIMARY KEY (`id`)) ENGINE=MyISAM DEFAULT CHARSET=utf8;")
#END
faqDismiss=$this->db->query("INSERT INTO `".DB_PREFIX."openbay_faq` SET `route` = '".$this->db->escape($route)."'")
#END
faqIsDismissed=$this->db->query("SELECT * FROM `".DB_PREFIX."openbay_faq` WHERE `route` = '".$this->db->escape($route)."'")
#END
faqClear=$this->db->query("TRUNCATE `".DB_PREFIX."openbay_faq`")
#END
