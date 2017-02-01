createVariants1=INSERT INTO  oc_product_option_variant  SET  product_id  = ?1, sku = '', stock = '0', active = '0', subtract = '1', price = '0.00', image = '', weight = '0.00'
#END
lengthClassExists1=INSERT INTO  oc_length_class SET value = '1'
#END
weightClassExists=SELECT  weight_class_id  FROM  oc_weight_class_description  WHERE LCASE( title ) = ?1 LIMIT 1
#END
lengthClassExists2=INSERT INTO  oc_length_class_description  SET  language_id  = ?1,  length_class_id  = ?2,  title  = ?3,  unit  = ?4
#END
lengthClassExists=SELECT  length_class_id  FROM  oc_length_class_description  WHERE LCASE( title ) = ?1 LIMIT 1
#END
repairCategories=SELECT * FROM oc_category WHERE parent_id = ?1
#END
getOption=SELECT * FROM  oc_option   o  LEFT JOIN  oc_option_description   od  ON ( od . option_id  =  o . option_id ) WHERE  od . name  = ?1LIMIT 1
#END
getProductOption=SELECT * FROM  oc_product_option WHERE product_id = ?1 AND option_id = ?2 LIMIT 1
#END
attributeAdd=SELECT * FROM  oc_product_attribute  WHERE  product_id  = ?1 AND  attribute_id  = ?2 AND  language_id  = ?3
#END
createVariants2=INSERT INTO  oc_product_option_variant_value  SET  product_option_variant_id  = ?1,  product_option_value_id  = ?2,  product_id  = ?3,  sort_order  = ?4
#END
createVariants3=UPDATE  oc_product_option_variant  SET  product_id  = ?1,  sku  = ?2,  stock  = ?3,  active  = 1,  price  = ?4 WHERE  product_option_variant_id  = ?5
#END
attributeGroupExists1=SELECT  sort_order  FROM   oc_attribute_group ORDER BY sort_order DESC LIMIT 1
#END
attributeGroupExists2=INSERT INTO  oc_attribute_group  SET  sort_order  = ?1
#END
attributeGroupExists3=INSERT INTO  oc_attribute_group_description  SET  attribute_group_id  = ?1,  language_id  = ?2,  name  = ?3
#END
attributeGroupExists=SELECT * FROM   oc_attribute_group_description  WHERE  name  = ?1 AND  language_id  = ?2 LIMIT 1
#END
importItems16=INSERT INTO  oc_category_description  SET  name  = ?1,  language_id  = ?2,  category_id  = ?3
#END
importItems17=INSERT INTO  oc_category_to_store  SET  category_id  = ?1, store_id = '0'
#END
importItems18=
					INSERT INTO  oc_product  SET
						 quantity               = ?1,
						 manufacturer_id        = ?2,
						 stock_status_id        = '6',
						 price                  = ?3,
						 tax_class_id           = '9',
						 location               = ?4,
						 mpn               		= ?5,
						 sku               		= ?6,
						 model               	= ?7,
						 isbn               	= ?8,
						 ean               		= ?9,
						 upc               		= ?10,
						 weight        			= ?11,
						 weight_class_id        = ?12,
						 length        			= ?13,
						 width        			= ?14,
						 height        			= ?15,
						 length_class_id        = ?16,
						 subtract               = '1',
						 minimum                = '1',
						 status                 = '1',
						?17
						date_available        = now(),
						date_added            = now(),
						date_modified         = now()
				
#END
importItems19=INSERT INTO  oc_product_description  SET  product_id  = ?1,  language_id  = ?2,  name  = ?3,  description  = ?4
#END
addImage=INSERT INTO  oc_ebay_image_import  SET  image_original  = ?1,  image_new  = ?2,  name  = ?3,  product_id  = ?4,  imgcount  = ?5
#END
createVariants=UPDATE  oc_product_option_value  SET subtract = '0', price = '0.000', quantity = '0' WHERE product_id = ?1
#END
createCategoryLink=INSERT INTO  oc_product_to_category  SET  product_id  = ?1,  category_id  = ?2
#END
createOption2=INSERT INTO  oc_option_description  SET  language_id  = ?1,  name  = ?2,  option_id  = ?3
#END
createOption1=SELECT * FROM  oc_option  WHERE  option_id  = ?1 LIMIT 1
#END
manufacturerExists3=INSERT INTO  oc_manufacturer_to_store  SET  manufacturer_id  = ?1, store_id = '0'
#END
manufacturerExists2=INSERT INTO  oc_manufacturer  SET  sort_order  = ?1,  name  = ?2
#END
attributeExists=SELECT * FROM  oc_attribute_description   ad ,  oc_attribute   a  WHERE  ad . name  = ?1 AND  ad . language_id  = ?2 AND  a . attribute_id  =  ad . attribute_id  AND  a . attribute_group_id  = ?3 LIMIT 1
#END
manufacturerExists1=SELECT  sort_order  FROM   oc_manufacturer ORDER BY sort_order DESC LIMIT 1
#END
importItems2=SELECT * FROM  oc_category ,  oc_category_description  WHERE  oc_category . parent_id  = '0' AND  oc_category_description . name  = ?1 LIMIT 1
#END
importItems1=CREATE TABLE IF NOT EXISTS  oc_ebay_image_import (id int(11) NOT NULL AUTO_INCREMENT, image_original text NOT NULL, image_new text NOT NULL, name text NOT NULL, product_id int(11) NOT NULL, imgcount int(11) NOT NULL, PRIMARY KEY (id)) ENGINE=MyISAM  DEFAULT CHARSET=utf8;
#END
attributeExists1=SELECT  sort_order  FROM   oc_attribute ORDER BY sort_order DESC LIMIT 1
#END
manufacturerExists=SELECT * FROM   oc_manufacturer  WHERE LCASE( name ) = ?1 LIMIT 1
#END
attributeExists3=INSERT INTO  oc_attribute_description  SET  attribute_id  = ?1,  language_id  = ?2,  name  = ?3
#END
getOptionValue=SELECT * FROM  oc_option_value  ov LEFT JOIN  oc_option_value_description   ovd  ON ( ovd . option_value_id  =  ov . option_value_id ) WHERE  ovd . name  = ?1 AND  ovd . option_id  = ?2LIMIT 1
#END
attributeExists2=INSERT INTO  oc_attribute  SET  sort_order  = ?1,  attribute_group_id  = ?2
#END
weightClassExists1=INSERT INTO  oc_weight_class SET value = '1'
#END
importItems9=INSERT INTO  oc_category_to_store  SET  category_id  = ?1, store_id = '0'
#END
importItems8=INSERT INTO  oc_category_description  SET  name  = ?1,  language_id  = ?2,  category_id  = ?3
#END
importItems7=INSERT INTO  oc_category  SET  parent_id  = ?1, status = '1', top = '1'
#END
weightClassExists2=INSERT INTO  oc_weight_class_description  SET  language_id  = ?1,  weight_class_id  = ?2,  title  = ?3,  unit  = ?4
#END
importItems6=SELECT * FROM  oc_category ,  oc_category_description  WHERE  oc_category . parent_id  = ?1 AND  oc_category_description . name  = ?2 LIMIT 1
#END
importItems5=INSERT INTO  oc_category_to_store  SET  category_id  = ?1, store_id = '0'
#END
importItems20=INSERT INTO  oc_product_to_store  SET  product_id  = ?1, store_id = '0'
#END
importItems4=INSERT INTO  oc_category_description  SET  name  = ?1,  language_id  = ?2,  category_id  = ?3
#END
importItems3=INSERT INTO  oc_category SET parent_id = '0', status = '1', top = '1'
#END
importItems=SHOW TABLES LIKE oc_ebay_image_import'
#END
getProductOption1=INSERT INTO oc_product_option SET product_id = ?1, option_id = ?2, required = '1'
#END
createOptionValue1=INSERT INTO  oc_option_value_description  SET  language_id  = ?1,  name  = ?2,  option_id  = ?3,  option_value_id  = ?4
#END
repairCategories2=SELECT * FROM  oc_category_path  WHERE category_id = ?1 ORDER BY level ASC
#END
repairCategories1=DELETE FROM  oc_category_path  WHERE category_id = ?1
#END
getProductOptionValue=SELECT * FROM   oc_product_option_value  WHERE  product_id  = ?1 AND  option_id  = ?2 AND  product_option_id  = ?3 AND  option_value_id  = ?4 LIMIT 1
#END
repairCategories4=REPLACE INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
repairCategories3=INSERT INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
importItems12=INSERT INTO  oc_category_description  SET  name  = ?1,  language_id  = ?2,  category_id  = ?3
#END
importItems13=INSERT INTO  oc_category_to_store  SET  category_id  = ?1, store_id = '0'
#END
createOptionValue=INSERT INTO  oc_option_value  SET  option_id  = ?1,  sort_order  = IFNULL((select  sort  FROM (SELECT (MAX( sort_order )+1) AS  sort  FROM  oc_option_value) AS i),0)
#END
importItems14=SELECT * FROM  oc_category ,  oc_category_description  WHERE  oc_category . parent_id  = ?1 AND  oc_category_description . name  = ?2 LIMIT 1
#END
importItems15=INSERT INTO  oc_category  SET  parent_id  = ?1, status = '1', top = '1'
#END
getProductOptionValue1=INSERT INTO oc_product_option_value SET product_option_id = ?1, product_id = ?2, option_id = ?3, option_value_id = ?4
#END
importItems10=SELECT * FROM  oc_category ,  oc_category_description  WHERE  oc_category . parent_id  = ?1 AND  oc_category_description . name  = ?2 LIMIT 1
#END
importItems11=INSERT INTO  oc_category  SET  parent_id  = ?1, status = '1', top = '1'
#END
createOption=INSERT INTO  oc_option  SET  type  = 'select',  sort_order  = IFNULL((select  sort  FROM (SELECT (MAX( sort_order )+1) AS  sort  FROM  oc_option) AS i),0)
#END
attributeAdd1=INSERT INTO  oc_product_attribute  SET  product_id  = ?1,  attribute_id  = ?2,  text  = ?3,  language_id  = ?4
#END
