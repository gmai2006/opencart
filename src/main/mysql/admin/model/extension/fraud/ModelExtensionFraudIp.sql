uninstall=DROP TABLE IF EXISTS  oc_ip
#END
install=
		CREATE TABLE IF NOT EXISTS  oc_fraud_ip (
		  ip varchar(40) NOT NULL,
		  date_added datetime NOT NULL,
		  PRIMARY KEY (ip)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		
#END
removeIp=DELETE FROM  oc_fraud_ip  WHERE  ip  = ?1
#END
getTotalIpsByIp=SELECT COUNT(*) AS total FROM  oc_fraud_ip  WHERE ip = ?1
#END
addIp=INSERT INTO  oc_fraud_ip  SET  ip  = ?1, date_added = NOW()
#END
getIps=SELECT * FROM  oc_fraud_ip  ORDER BY  ip  ASC LIMIT ?1,?2
#END
getTotalIps=SELECT COUNT(*) AS total FROM  oc_fraud_ip
#END
