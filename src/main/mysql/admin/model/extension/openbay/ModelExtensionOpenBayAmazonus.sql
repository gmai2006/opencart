getProductStatus5=SELECT * FROM  oc_amazonus_product  WHERE  product_id  = ?1 AND version = 3
#END
uninstall1=DROP TABLE IF EXISTS  oc_amazonus_order_product
#END
getUnlinkedProducts1=
				SELECT  p . product_id ,  p . model ,  p . sku ,  pd . name  as  product_name , '' as  var , '' as  combination 
				FROM  oc_product  as  p 
				LEFT JOIN  oc_product_description  as  pd 
				ON  p . product_id  =  pd . product_id 
				LEFT JOIN  oc_amazonus_product_link  as  apl 
				ON  apl . product_id  =  p . product_id 
				WHERE  apl . amazonus_sku  IS NULL
				AND  pd . language_id  = ?1
#END
getProductStatus3=
			SELECT COUNT(*) count
			FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND status = 'saved'
#END
getProductStatus=
			SELECT COUNT(*) count
			FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND status = 'uploaded'
#END
getProductStatus4=
			SELECT COUNT(*) as count
			FROM  oc_amazonus_product_link 
			WHERE  product_id  = ?1
#END
saveProduct=
			REPLACE INTO  oc_amazonus_product 
			SET  product_id  = ?1,
				 sku  = ?2,
				 category  = ?3,
				 data  = ?4,
				 status  = 'saved',
				 insertion_id  = '',
				 price  = ?5,
				 var  = ?6,
				 marketplaces  = ?7
#END
getProductStatus1=
			SELECT COUNT(*) count
			FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND status = 'ok'
#END
getProductStatus2=
			SELECT COUNT(*) count
			FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND status = 'error'
#END
updateAmazonusOrderTracking=UPDATE  oc_amazonus_order  SET  courier_id  = ?1,  courier_other  = ?2,  tracking_no  = ?3 WHERE  order_id  = ?4
#END
getUnlinkedItemsFromReport=
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, oc_sku.pov_id
				FROM oc_amazonus_listing_report alr
				LEFT JOIN (
				  SELECT p.product_id, if (por.product_id IS NULL, p.sku, por.sku) AS 'sku', if (por.product_id IS NULL, NULL, por.sku) AS 'var', if (por.product_id IS NULL, p.quantity, por.stock) AS 'quantity', por.product_option_variant_id AS pov_id
				  FROM oc_product p
				  LEFT JOIN oc_product_option_variant por USING(product_id)
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN oc_amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN oc_product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ?1
				WHERE apl.product_id IS NULL
				ORDER BY alr.sku
				LIMIT ?2,?3
#END
getProductErrors=
			SELECT  messages  FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND version = 3
#END
getProductsWithErrors=
			SELECT  product_id ,  sku  FROM  oc_amazonus_product
			WHERE status = 'error' AND version = 2
#END
updateAmazonSkusQuantities1=
				SELECT apl.amazonus_sku, p.quantity
				FROM oc_amazonus_product_link apl
				JOIN oc_product p ON apl.product_id = p.product_id
				WHERE apl.amazonus_sku IN (?1)
			
#END
uninstall8=DROP TABLE IF EXISTS  oc_amazonus_product_search
#END
uninstall9=DROP TABLE IF EXISTS  oc_amazonus_listing_report
#END
uninstall6=DROP TABLE IF EXISTS  oc_amazonus_product_error
#END
uninstall7=DROP TABLE IF EXISTS  oc_amazonus_process
#END
uninstall4=DROP TABLE IF EXISTS  oc_amazonus_product_link
#END
uninstall5=DROP TABLE IF EXISTS  oc_amazonus_product_unshipped
#END
setProductUploaded=UPDATE  oc_amazonus_product 
			SET  status  = 'uploaded',  insertion_id  = ?1
			WHERE  product_id  = ?2 AND  var  = ?3 AND version = 2
#END
deleteProduct=DELETE FROM  oc_amazonus_product 
			WHERE  product_id  = ?1
#END
getTotalUnlinkedItemsFromReport1=
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, '' AS combination
				FROM oc_amazonus_listing_report alr
				LEFT JOIN (
					SELECT p.product_id, p.sku, NULL AS 'var', p.quantity
					FROM oc_product p
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN oc_amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN oc_product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ?1
				WHERE apl.product_id IS NULL
				ORDER BY alr.sku
			
#END
uninstall2=DROP TABLE IF EXISTS  oc_amazonus_product2
#END
uninstall3=DROP TABLE IF EXISTS  oc_amazonus_product
#END
getOrderStatusString=
			SELECT  s . key 
			FROM  oc_order   o 
			JOIN  oc_setting   s  ON  o . order_id  = ?1 AND s.value = o.order_status_id
			WHERE s.key = 'openbay_amazonus_order_status_shipped' OR s.key = 'openbay_amazonus_order_status_canceled'
			LIMIT 1
#END
removeProductLink=DELETE FROM  oc_amazonus_product_link 
			WHERE  amazonus_sku  = ?1
#END
getTotalUnlinkedItemsFromReport=
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, oc_sku.pov_id
				FROM oc_amazonus_listing_report alr
				LEFT JOIN (
				  SELECT p.product_id, if (por.product_id IS NULL, p.sku, por.sku) AS 'sku', if (por.product_id IS NULL, NULL, por.sku) AS 'var', if (por.product_id IS NULL, p.quantity, por.stock) AS 'quantity', por.product_option_variant_id AS pov_id
				  FROM oc_product p
				  LEFT JOIN oc_product_option_variant por USING(product_id)
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN oc_amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN oc_product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ?1
				WHERE apl.product_id IS NULL
			
#END
getUnlinkedProducts=
				SELECT  p . product_id ,  p . model ,  p . sku ,  pd . name  as  product_name , '' as  var , '' as  combination ,  p . has_option 
				FROM  oc_product  as  p 
				LEFT JOIN  oc_product_description  as  pd 
				ON  p . product_id  =  pd . product_id 
				AND  pd . language_id  = ?1
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_amazonus_order (
			  order_id int(11) NOT NULL ,
			  amazonus_order_id char(19) NOT NULL ,
			  courier_id varchar(255) NOT NULL ,
			  courier_other tinyint(1) NOT NULL,
			  tracking_no varchar(255) NOT NULL ,
			  PRIMARY KEY (order_id, amazonus_order_id)
		) DEFAULT COLLATE=utf8_general_ci;
#END
removeAdvancedErrors=
			SELECT  insertion_id  FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND version = 2
#END
uninstall10=DELETE FROM  oc_setting WHERE code = 'openbay_amazonus'
#END
linkProduct1=INSERT INTO  oc_amazonus_product_link  SET  product_id  = ?1,  amazonus_sku  = ?2,  var  = ?3
#END
uninstall=DROP TABLE IF EXISTS  oc_amazonus_order
#END
getProductErrors2=SELECT * FROM  oc_amazonus_product_error  WHERE  sku  = ?1 AND  insertion_id  = ?2
#END
removeAdvancedErrors2=UPDATE  oc_amazonus_product 
			SET  status  = 'saved',  insertion_id  = ''
			WHERE  product_id  = ?1 AND status = 'error' AND version = 2
#END
getProductLinks=
#END
getProductErrors1=SELECT  sku ,  insertion_id  FROM  oc_amazonus_product  WHERE  product_id  = ?1 AND version = 2
#END
removeAdvancedErrors1=DELETE FROM  oc_amazonus_product_error 
				WHERE  insertion_id  = ?1
#END
getUnlinkedItemsFromReport1=
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, '' AS combination
				FROM oc_amazonus_listing_report alr
				LEFT JOIN (
					SELECT p.product_id, p.sku, NULL AS 'var', p.quantity
					FROM oc_product p
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN oc_amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN oc_product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ?1
				WHERE apl.product_id IS NULL
				ORDER BY alr.sku
				LIMIT ?2,?3
#END
install1=
			CREATE TABLE IF NOT EXISTS  oc_amazonus_order_product (
				order_product_id int(11) NOT NULL ,
				amazonus_order_item_id varchar(255) NOT NULL,
				PRIMARY KEY(order_product_id, amazonus_order_item_id)
		);
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_amazonus_product_unshipped (
				order_id int(11) NOT NULL,
				product_id int(11) NOT NULL,
				quantity int(11) NOT NULL DEFAULT '0',
				PRIMARY KEY (order_id,product_id)
			) DEFAULT COLLATE=utf8_general_ci;
#END
getProduct=
			SELECT * FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND  var  = ?2 AND version = 2
#END
productLinkExists=SELECT * FROM  oc_amazonus_product_link  WHERE  product_id  = ?1 AND var = ?2
#END
deleteListingReports=
			DELETE FROM oc_amazonus_listing_report
		
#END
getAmazonusOrderedProducts=
			SELECT  aop . amazonus_order_item_id ,  op . quantity 
			FROM  oc_amazonus_order_product   aop 
			JOIN  oc_order_product   op  ON  op . order_product_id  =  aop . order_product_id 
				AND  op . order_id  = ?1
#END
getSavedProducts=
			SELECT  ap . status ,  ap . product_id ,  ap . sku  as  amazonus_sku ,  pd . name  as  product_name ,  p . model  as  product_model ,  p . sku  as  product_sku ,  ap . var  as  var 
			FROM  oc_amazonus_product  as  ap 
			LEFT JOIN  oc_product_description  as  pd 
			ON  ap . product_id  =  pd . product_id 
			LEFT JOIN  oc_product  as  p 
			ON  ap . product_id  =  p . product_id 
			WHERE  ap . status  = 'saved'
			AND  pd . language_id  = ?1
#END
install7=
			CREATE TABLE IF NOT EXISTS oc_amazonus_listing_report (
				sku varchar(255) NOT NULL,
				quantity int(10) unsigned NOT NULL,
				asin varchar(255) NOT NULL,
				price decimal(10,4) NOT NULL,
				PRIMARY KEY (sku)
			) DEFAULT COLLATE=utf8_general_ci;
		
#END
install5=
		CREATE TABLE IF NOT EXISTS  oc_amazonus_product_link (
		  id int(11) NOT NULL AUTO_INCREMENT,
		  amazonus_sku varchar(255) NOT NULL,
		  var char(100) NOT NULL DEFAULT '',
		  product_id int(11) NOT NULL,
		  PRIMARY KEY (id)
		) DEFAULT COLLATE=utf8_general_ci;
#END
deleteSaved=DELETE FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND  var  = ?2
#END
install6=
		CREATE TABLE IF NOT EXISTS  oc_amazonus_product_search (
			product_id int(11) NOT NULL,
			status enum('searching','finished') NOT NULL,
			matches int(11) DEFAULT NULL,
			data text,
			PRIMARY KEY (product_id)
		) DEFAULT COLLATE=utf8_general_ci;
#END
install3=
		CREATE TABLE IF NOT EXISTS  oc_amazonus_product (
		  version int(11) NOT NULL DEFAULT 2,
		  product_id  int(11) NOT NULL ,
		  category  varchar(255) NOT NULL ,
		  sku  varchar(255) NOT NULL ,
		  insertion_id varchar(255) NOT NULL ,
		  data  text NOT NULL ,
		  status enum('saved','uploaded','ok','error') NOT NULL ,
		  price  decimal(15,4) NOT NULL COMMENT 'Price on Amazonus' ,
		  var char(100) NOT NULL DEFAULT '',
		  marketplaces text NOT NULL ,
		  messages text NOT NULL,
		  PRIMARY KEY (product_id, var)
		);
#END
install4=
		CREATE TABLE IF NOT EXISTS  oc_amazonus_product_error (
		  error_id int(11) NOT NULL AUTO_INCREMENT,
		  sku varchar(255) NOT NULL ,
		  insertion_id varchar(255) NOT NULL ,
		  error_code int(11) NOT NULL ,
		  message text NOT NULL ,
		  PRIMARY KEY (error_id)
		);
#END
updateAmazonSkusQuantities=
				SELECT apl.amazonus_sku, if (por.product_id IS NULL, p.quantity, por.stock) AS 'quantity'
				FROM oc_amazonus_product_link apl
				JOIN oc_product p ON apl.product_id = p.product_id
				LEFT JOIN oc_product_option_variant por ON apl.product_id = por.product_id AND apl.var = por.sku
				WHERE apl.amazonus_sku IN (?1)
			
#END
getProductCategory=
			SELECT  category  FROM  oc_amazonus_product 
			WHERE  product_id  = ?1 AND  var  = ?2 AND version = 2
#END
linkProduct=SELECT COUNT(*) as  count  FROM  oc_amazonus_product_link  WHERE  product_id  = ?1 AND  amazonus_sku  = ?2 AND  var  = ?3 LIMIT 1
#END
resetUploaded=UPDATE  oc_amazonus_product 
			SET  status  = 'saved',  insertion_id  = ''
			WHERE  insertion_id  = ?1 AND version = 2
#END
getAmazonusOrderId=
			SELECT  amazonus_order_id 
			FROM  oc_amazonus_order 
			WHERE  order_id  = ?1
			LIMIT 1
#END
getSavedProductsData=
			SELECT * FROM  oc_amazonus_product
			WHERE status = 'saved' AND version = 2
#END
