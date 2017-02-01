addAmazonOrderProducts=SELECT  order_product_id  FROM  oc_order_product  WHERE  model  = ?1 AND  order_id  = ?2 LIMIT 1
#END
getOrderId=SELECT  order_id  FROM  oc_amazon_order  WHERE  amazon_order_id  = ?1 LIMIT 1
#END
updateOrderStatus1=UPDATE  oc_order  SET  order_status_id  = ?1 WHERE  order_id  = ?2
#END
getZoneId=SELECT  zone_id  FROM  oc_zone  WHERE LOWER( name ) = ?1
#END
decreaseProductQuantity=UPDATE  oc_product  SET  quantity  = GREATEST( quantity  - ?1, 0) WHERE  product_id  = ?2 AND subtract = '1'
#END
getAmazonOrderId=SELECT  amazon_order_id  FROM  oc_amazon_order  WHERE  order_id  = ?1 LIMIT 1
#END
updateOrderStatus=INSERT INTO  oc_order_history  ( order_id ,  order_status_id ,  notify ,  comment ,  date_added ) VALUES (?1, ?2, 0, '', NOW())
#END
addAmazonOrder=INSERT INTO  oc_amazon_order  ( order_id ,  amazon_order_id ) VALUES (?1, ?2)
#END
addAmazonOrderProducts1=INSERT INTO  oc_amazon_order_product  ( order_product_id ,  amazon_order_item_id ) VALUES (?1, ?2)
#END
getProductId=SELECT  product_id  FROM  oc_amazon_product_link  WHERE  amazon_sku  = ?1
#END
decreaseProductQuantity1=UPDATE  oc_product_option_variant  SET  stock  = GREATEST( stock  - ?1, 0) WHERE  product_id  = ?2 AND  sku  = ?3 AND subtract = '1'
#END
getProductVar=SELECT  var  FROM  oc_amazon_product_link  WHERE  amazon_sku  = ?1
#END
getProductOptionsByVar=SELECT
				pov.product_option_id,
				pov.product_option_value_id,
				od.name,
				ovd.name as value,
				opt.type
			FROM  oc_product_option_value  as pov,
				  oc_product_option  as po,
				  oc_option  as opt,
				  oc_option_value_description  as ovd,
				  oc_option_description  as od
			WHERE pov.product_option_value_id = ?1 AND
				po.product_option_id = pov.product_option_id AND
				opt.option_id = pov.option_id AND
				ovd.option_value_id = pov.option_value_id AND ovd.language_id = ?2 AND
				od.option_id = pov.option_id AND od.language_id = ?3
			
#END
getOrderStatus=SELECT  order_status_id  FROM  oc_order  WHERE  order_id  = ?1
#END
getCountryId=SELECT  country_id  FROM  oc_country  WHERE LOWER( iso_code_2 ) = ?1
#END
getCountryName=SELECT  name  FROM  oc_country  WHERE LOWER( iso_code_2 ) = ?1
#END
