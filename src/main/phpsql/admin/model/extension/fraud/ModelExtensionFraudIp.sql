uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."ip`")
#END
install=$this->db->query("
		CREATE TABLE IF NOT EXISTS `".DB_PREFIX."fraud_ip` (
		  `ip` varchar(40) NOT NULL,
		  `date_added` datetime NOT NULL,
		  PRIMARY KEY (`ip`)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		")
#END
removeIp=$this->db->query("DELETE FROM `".DB_PREFIX."fraud_ip` WHERE `ip` = '".$this->db->escape($ip)."'")
#END
getTotalIpsByIp=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."fraud_ip` WHERE ip = '".$this->db->escape($ip)."'")
#END
addIp=$this->db->query("INSERT INTO `".DB_PREFIX."fraud_ip` SET `ip` = '".$this->db->escape($ip)."', date_added = NOW()")
#END
getIps=$this->db->query("SELECT * FROM `".DB_PREFIX."fraud_ip` ORDER BY `ip` ASC LIMIT ".(int)$start.",".(int)$limit)
#END
getTotalIps=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."fraud_ip`")
#END
