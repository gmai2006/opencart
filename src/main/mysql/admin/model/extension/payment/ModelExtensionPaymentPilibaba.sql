updateTrackingNumber=UPDATE  oc_pilibaba_order  SET  tracking  = ?1 WHERE  order_id  = ?2
#END
uninstall=DROP TABLE IF EXISTS  oc_pilibaba_order
#END
install=CREATE TABLE IF NOT EXISTS  oc_pilibaba_order (
			pilibaba_order_id int(11) NOT NULL AUTO_INCREMENT,
			order_id int(11) NOT NULL DEFAULT '0',
			amount double NOT NULL,
			fee double NOT NULL,
			tracking VARCHAR(50) NOT NULL DEFAULT '',
			date_added datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			PRIMARY KEY (pilibaba_order_id)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci
#END
getOrder=SELECT * FROM  oc_pilibaba_order  WHERE  order_id  = ?1 LIMIT 1
#END
disablePiliExpress=DELETE FROM  oc_extension WHERE type = 'shipping' AND code = 'pilibaba'
#END
enablePiliExpress=SELECT * FROM  oc_extension WHERE type = 'shipping' AND code = 'pilibaba'
#END
enablePiliExpress1=INSERT INTO  oc_extension SET type = 'shipping', code = 'pilibaba'
#END
