getProductOptions=SELECT * FROM oc_product_option po LEFT JOIN  oc_option  o ON (po.option_id = o.option_id) LEFT JOIN oc_option_description od ON (o.option_id = od.option_id) WHERE po.product_id = ?1 AND od.language_id = ?2 ORDER BY o.sort_order
#END
repairLinks2=UPDATE  oc_ebay_listing  SET  status  = 0  WHERE  product_id  = ?1
#END
repairLinks=
			SELECT DISTINCT  product_id 
			FROM  oc_ebay_listing
			WHERE status = '1'
#END
repairLinks1=SELECT * FROM  oc_ebay_listing  WHERE  product_id  = ?1 AND status = 1 ORDER BY ebay_listing_id DESC
#END
getProductOptions1=SELECT * FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON (pov.option_value_id = ov.option_value_id) LEFT JOIN oc_option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE pov.product_option_id = ?1 AND ovd.language_id = ?2 ORDER BY ov.sort_order
#END
countImportImages=SELECT * FROM  oc_ebay_image_import
#END
