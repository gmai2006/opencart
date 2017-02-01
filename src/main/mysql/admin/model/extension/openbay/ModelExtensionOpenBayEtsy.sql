install1=
				CREATE TABLE IF NOT EXISTS  oc_etsy_listing (
				  etsy_listing_id int(11) NOT NULL AUTO_INCREMENT,
				  etsy_item_id char(100) NOT NULL,
				  product_id int(11) NOT NULL,
				  status SMALLINT(3) NOT NULL DEFAULT '1',
				  created DATETIME NOT NULL,
				  PRIMARY KEY (etsy_listing_id),
  				  KEY product_id (product_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install2=
				CREATE TABLE IF NOT EXISTS  oc_etsy_order (
				  etsy_order_id int(11) NOT NULL AUTO_INCREMENT,
				  order_id int(11) NOT NULL,
				  receipt_id int(11) NOT NULL,
				  paid int(1) NOT NULL,
				  shipped int(1) NOT NULL,
				  PRIMARY KEY (etsy_order_id),
  				  KEY order_id (order_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install=
				CREATE TABLE IF NOT EXISTS  oc_etsy_setting_option (
					etsy_setting_option_id INT(11) NOT NULL AUTO_INCREMENT,
					key VARCHAR(100) NOT NULL,
					last_updated DATETIME NOT NULL,
					data TEXT NOT NULL,
					PRIMARY KEY (etsy_setting_option_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install3=
				CREATE TABLE IF NOT EXISTS  oc_etsy_order_lock (
				  order_id int(11) NOT NULL,
				  PRIMARY KEY (order_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=utf8;
#END
