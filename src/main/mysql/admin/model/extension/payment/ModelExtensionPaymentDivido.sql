install1=
			CREATE TABLE IF NOT EXISTS  oc_divido_lookup (
				order_id INT(11) NOT NULL,
				salt CHAR(64) NOT NULL,
				proposal_id CHAR(40),
				application_id CHAR(40),
				deposit_amount NUMERIC(6,2),
			  PRIMARY KEY (order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_divido_lookup;
#END
uninstall=DROP TABLE IF EXISTS  oc_divido_product;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_divido_product (
				product_id INT(11) NOT NULL,
				display CHAR(7) NOT NULL,
				plans text,
				PRIMARY KEY (product_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
getLookupByOrderId=SELECT * FROM  oc_divido_lookup  WHERE  order_id  = ?1
#END
