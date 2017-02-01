getOrder=SELECT * FROM  oc_cardinity_order  WHERE  order_id  = ?1 LIMIT 1
#END
addOrder=INSERT INTO  oc_cardinity_order  SET  order_id  = ?1,  payment_id  = ?2
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
