addOrder=INSERT INTO  oc_bluepay_hosted_order  SET  order_id  = ?1,  transaction_id  = ?2,  date_added  = now(),  date_modified  = now(),  release_status  = ?3,  currency_code  = ?4,  total  = ?5
#END
addTransaction=INSERT INTO  oc_bluepay_hosted_order_transaction  SET  bluepay_hosted_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
