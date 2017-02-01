install11=
				CREATE TABLE IF NOT EXISTS  oc_ebay_image_import (
				  id int(11) NOT NULL AUTO_INCREMENT,
				  image_original text NOT NULL,
				  image_new text NOT NULL,
				  name text NOT NULL,
				  product_id int(11) NOT NULL,
				  imgcount int(11) NOT NULL,
				  PRIMARY KEY (id)
				) ENGINE=MyISAM  DEFAULT CHARSET=utf8;
#END
getProductAttributes1=SELECT a.attribute_id, ad.name, pa.text FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE pa.product_id = ?1 AND a.attribute_group_id = ?2 AND ad.language_id = ?3 AND pa.language_id = ?4 ORDER BY a.sort_order, ad.name
#END
install10=
				CREATE TABLE IF NOT EXISTS  oc_ebay_setting_option (
					ebay_setting_option_id INT(11) NOT NULL AUTO_INCREMENT,
					key VARCHAR(100) NOT NULL,
					last_updated DATETIME NOT NULL,
					data TEXT NOT NULL,
					PRIMARY KEY (ebay_setting_option_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
uninstall1=DROP TABLE IF EXISTS  oc_ebay_category_history;
#END
install15=
				CREATE TABLE IF NOT EXISTS  oc_ebay_template (
				  template_id INT(11) NOT NULL AUTO_INCREMENT,
				  name VARCHAR(100) NOT NULL,
				  html MEDIUMTEXT NOT NULL,
				  PRIMARY KEY (template_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=utf8;
#END
install14=
				CREATE TABLE IF NOT EXISTS  oc_ebay_order_lock (
				  smp_id int(11) NOT NULL,
				  PRIMARY KEY (smp_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=utf8;
#END
getProductAttributes=SELECT ag.attribute_group_id, agd.name FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_group ag ON (a.attribute_group_id = ag.attribute_group_id) LEFT JOIN oc_attribute_group_description agd ON (ag.attribute_group_id = agd.attribute_group_id) WHERE pa.product_id = ?1 AND agd.language_id = ?2 GROUP BY ag.attribute_group_id ORDER BY ag.sort_order, agd.name
#END
install13=
				CREATE TABLE IF NOT EXISTS  oc_ebay_stock_reserve (
				  id int(11) NOT NULL AUTO_INCREMENT,
				  product_id int(11) NOT NULL,
				  variant_id varchar(100) NOT NULL,
				  item_id varchar(100) NOT NULL,
				  reserve int(11) NOT NULL,
				  PRIMARY KEY (id),
  					KEY product_id (product_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=utf8;
#END
install12=
				CREATE TABLE IF NOT EXISTS  oc_ebay_shipping_location_exclude (
					ebay_shipping_exclude_id int(11) NOT NULL AUTO_INCREMENT,
					description varchar(100) NOT NULL,
					location varchar(100) NOT NULL,
					region varchar(100) NOT NULL,
					PRIMARY KEY (ebay_shipping_exclude_id)
				) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
uninstall=DROP TABLE IF EXISTS  oc_ebay_category;
#END
uninstall8=DROP TABLE IF EXISTS  oc_ebay_order;
#END
uninstall9=DROP TABLE IF EXISTS  oc_ebay_profile;
#END
logCategoryUsed=SELECT  used  FROM  oc_ebay_category_history  WHERE  CategoryID  = ?1 LIMIT 1
#END
uninstall6=DROP TABLE IF EXISTS  oc_ebay_payment_method;
#END
getLiveListingArray=SELECT  product_id ,  ebay_item_id  FROM  oc_ebay_listing WHERE status = 1
#END
uninstall7=DROP TABLE IF EXISTS  oc_ebay_transaction;
#END
uninstall4=DROP TABLE IF EXISTS  oc_ebay_shipping;
#END
getShippingService=SELECT * FROM  oc_ebay_shipping  WHERE  InternationalService  = ?1 AND  ValidForSellingFlow  = '1' AND  ServiceType  LIKE '%?2%'
#END
uninstall5=DROP TABLE IF EXISTS  oc_ebay_shipping_location;
#END
uninstall2=DROP TABLE IF EXISTS  oc_ebay_listing;
#END
uninstall3=DROP TABLE IF EXISTS  oc_ebay_listing_pending;
#END
getProductStock=SELECT * FROM  oc_product  WHERE  product_id  = ?1 LIMIT 1
#END
install1=
					CREATE TABLE IF NOT EXISTS  oc_ebay_category_history (
					  ebay_category_history_id int(11) NOT NULL AUTO_INCREMENT,
					  CategoryID int(11) NOT NULL,
					  breadcrumb varchar(255) NOT NULL,
					  used int(6) NOT NULL,
					  PRIMARY KEY (ebay_category_history_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install2=
					CREATE TABLE IF NOT EXISTS  oc_ebay_listing (
					  ebay_listing_id int(11) NOT NULL AUTO_INCREMENT,
					  ebay_item_id char(100) NOT NULL,
					  product_id int(11) NOT NULL,
					  variant int(11) NOT NULL,
					  status SMALLINT(3) NOT NULL DEFAULT '1',
					  PRIMARY KEY (ebay_listing_id),
  						KEY product_id (product_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install9=
					CREATE TABLE IF NOT EXISTS  oc_ebay_profile (
						ebay_profile_id int(11) NOT NULL AUTO_INCREMENT,
						name varchar(100) NOT NULL,
						description text NOT NULL,
						type int(11) NOT NULL,
						default TINYINT(1) NOT NULL,
						data text NOT NULL,
						PRIMARY KEY (ebay_profile_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
getCategory=SELECT * FROM  oc_ebay_category WHERE CategoryID = CategoryParentID
#END
install7=
					CREATE TABLE IF NOT EXISTS  oc_ebay_transaction (
						ebay_transaction_id int(11) NOT NULL AUTO_INCREMENT,
						order_id int(11) NOT NULL,
						product_id int(11) NOT NULL,
						sku varchar(100) NOT NULL,
						txn_id varchar(100) NOT NULL,
						item_id varchar(100) NOT NULL,
						containing_order_id varchar(100) NOT NULL,
						order_line_id varchar(100) NOT NULL,
						qty int(11) NOT NULL,
						smp_id int(11) NOT NULL,
						created DATETIME NOT NULL,
						modified DATETIME NOT NULL,
					PRIMARY KEY (ebay_transaction_id),
  						KEY product_id (product_id),
  						KEY order_id (order_id),
  						KEY smp_id (smp_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install8=
					CREATE TABLE IF NOT EXISTS  oc_ebay_order (
					  ebay_order_id int(11) NOT NULL AUTO_INCREMENT,
					  parent_ebay_order_id int(11) NOT NULL,
					  order_id int(11) NOT NULL,
					  smp_id int(11) NOT NULL,
					  tracking_no varchar(100) NOT NULL,
					  carrier_id varchar(100) NOT NULL,
					  PRIMARY KEY (ebay_order_id),
  						KEY order_id (order_id),
  						KEY smp_id (smp_id),
  						KEY parent_ebay_order_id (parent_ebay_order_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
getSellerStoreCategories=SHOW TABLES LIKE oc_ebay_store_category'
#END
install5=
					CREATE TABLE IF NOT EXISTS  oc_ebay_shipping_location (
					  ebay_shipping_id int(11) NOT NULL AUTO_INCREMENT,
					  description varchar(100) NOT NULL,
					  detail_version varchar(100) NOT NULL,
					  shipping_location varchar(100) NOT NULL,
					  update_time varchar(100) NOT NULL,
					  PRIMARY KEY (ebay_shipping_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install6=
					CREATE TABLE IF NOT EXISTS  oc_ebay_payment_method (
					  ebay_payment_method_id int(11) NOT NULL AUTO_INCREMENT,
					  ebay_name char(50) NOT NULL,
					  local_name char(50) NOT NULL,
					  PRIMARY KEY (ebay_payment_method_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5;
#END
getCategoryStructure=SELECT * FROM  oc_ebay_category  WHERE  CategoryID  = ?1 LIMIT 1
#END
install3=
					CREATE TABLE IF NOT EXISTS  oc_ebay_listing_pending (
					  ebay_listing_pending_id int(11) NOT NULL AUTO_INCREMENT,
					  ebay_item_id char(25) NOT NULL,
					  product_id int(11) NOT NULL,
					  key char(50) NOT NULL,
					  variant int(11) NOT NULL,
					  PRIMARY KEY (ebay_listing_pending_id),
  						KEY product_id (product_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
install4=
					CREATE TABLE IF NOT EXISTS  oc_ebay_shipping (
					  ebay_shipping_id int(11) NOT NULL AUTO_INCREMENT,
					  description varchar(100) NOT NULL,
					  InternationalService tinyint(4) NOT NULL,
					  ShippingService varchar(100) NOT NULL,
					  ShippingServiceID int(11) NOT NULL,
					  ServiceType varchar(100) NOT NULL,
					  ValidForSellingFlow tinyint(4) NOT NULL,
					  ShippingCategory varchar(100) NOT NULL,
					  ShippingTimeMin int(11) NOT NULL,
					  ShippingTimeMax int(11) NOT NULL,
					  PRIMARY KEY (ebay_shipping_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
getPaymentTypes=SELECT * FROM  oc_ebay_payment_method
#END
install=
					CREATE TABLE IF NOT EXISTS  oc_ebay_category (
					  ebay_category_id int(11) NOT NULL AUTO_INCREMENT,
					  CategoryID int(11) NOT NULL,
					  CategoryParentID int(11) NOT NULL,
					  CategoryLevel smallint(6) NOT NULL,
					  CategoryName char(100) NOT NULL,
					  BestOfferEnabled tinyint(1) NOT NULL,
					  AutoPayEnabled tinyint(1) NOT NULL,
					  PRIMARY KEY (ebay_category_id)
					) ENGINE=MyISAM  DEFAULT CHARSET=latin1;
#END
getPopularCategories=SELECT * FROM  oc_ebay_category_history ORDER BY used DESC LIMIT 5
#END
getSellerStoreCategories1=SELECT * FROM  oc_ebay_store_category WHERE parent_id = '0' ORDER BY CategoryName ASC
#END
getShippingLocations=SELECT * FROM  oc_ebay_shipping_location WHERE shipping_location != 'None' AND shipping_location != 'Worldwide'
#END
getSellerStoreCategories2=SELECT * FROM  oc_ebay_store_category  WHERE  parent_id  = ?1 ORDER BY CategoryName ASC
#END
getSellerStoreCategories3=SELECT * FROM  oc_ebay_store_category  WHERE  parent_id  = ?1 ORDER BY CategoryName ASC
#END
logCategoryUsed2=INSERT INTO  oc_ebay_category_history  SET  CategoryID  = ?1,  breadcrumb  = ?2, used = '1'
#END
getCategory1=SELECT * FROM  oc_ebay_category  WHERE  CategoryParentID  = ?1
#END
logCategoryUsed1=UPDATE  oc_ebay_category_history  SET  used  = ?1 WHERE  CategoryID  = ?2 LIMIT 1
#END
