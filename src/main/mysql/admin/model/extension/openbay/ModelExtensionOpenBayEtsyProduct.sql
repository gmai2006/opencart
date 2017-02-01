getStatus=SELECT * FROM  oc_etsy_listing  WHERE  product_id  = ?1 AND status = 1 LIMIT 1
#END
addLink=INSERT INTO  oc_etsy_listing  SET  product_id  = ?1,  etsy_item_id  = ?2,  status  = ?3, created  = now()
#END
