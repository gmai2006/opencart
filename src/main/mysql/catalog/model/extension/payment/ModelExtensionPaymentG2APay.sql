getG2aOrder=SELECT * FROM  oc_g2apay_order  WHERE  order_id  = ?1 LIMIT 1
#END
updateOrder=UPDATE  oc_g2apay_order  SET  g2apay_transaction_id  = ?1,  modified  = now() WHERE  order_id  = ?2
#END
addTransaction=INSERT INTO  oc_g2apay_order_transaction  SET  g2apay_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
addG2aOrder=INSERT INTO  oc_g2apay_order  SET  order_id  = ?1,  date_added  = now(),  modified  = now(),  currency_code  = ?2,  total  = ?3
#END
