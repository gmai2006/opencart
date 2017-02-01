uninstall=DROP TABLE IF EXISTS  oc_cardinity_order;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_cardinity_order (
			  cardinity_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  payment_id VARCHAR(255),
			  PRIMARY KEY (cardinity_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
		
#END
getOrder=SELECT * FROM  oc_cardinity_order  WHERE  order_id  = ?1 LIMIT 1
#END
