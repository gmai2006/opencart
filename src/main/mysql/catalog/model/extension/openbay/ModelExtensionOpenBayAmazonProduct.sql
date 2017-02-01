insertError1=UPDATE  oc_amazon_product SET  status  = 'error' WHERE  sku  = ?1 AND  insertion_id  = ?2
#END
getProduct=SELECT * FROM  oc_amazon_product  WHERE  insertion_id  = ?1
#END
linkProduct1=INSERT INTO  oc_amazon_product_link  SET  product_id  = ?1,  amazon_sku  = ?2,  var  = ?3
#END
setSubmitError=SELECT  sku  FROM  oc_amazon_product  WHERE  insertion_id  = ?1
#END
linkProduct=SELECT COUNT(*) as 'count' FROM  oc_amazon_product_link  WHERE  product_id  = ?1 AND  amazon_sku  = ?2 AND  var  = ?3 LIMIT 1
#END
deleteErrors=DELETE FROM  oc_amazon_product_error  WHERE  insertion_id  = ?1
#END
insertError=INSERT INTO  oc_amazon_product_error  SET  sku  = ?1,  error_code  = ?2,  message  = ?3,  insertion_id  = ?4
#END
updateSearch=
				UPDATE oc_amazon_product_search
				SET matches = ?1,
					 data  = ?2,
					 status  = 'finished'
				WHERE product_id = ?3 AND
					  marketplace = ?4
				LIMIT 1
			
#END
setStatus=UPDATE  oc_amazon_product  SET  status  = ?1 WHERE  insertion_id  = ?2
#END
getProductRows=SELECT * FROM  oc_amazon_product  WHERE  insertion_id  = ?1
#END
removeListingReportLock=UPDATE oc_setting SET  value  = ?1, serialized = 1 WHERE key = 'openbay_amazon_processing_listing_reports'
#END
linkItems=SELECT  var  FROM  oc_amazon_product  WHERE  sku  = ?1 AND  product_id  = ?2
#END
