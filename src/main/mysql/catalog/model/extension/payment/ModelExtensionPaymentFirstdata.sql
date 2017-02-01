storeCard=SELECT * FROM  oc_firstdata_card  WHERE  token  = ?1 AND  customer_id  = ?2 LIMIT 1
#END
storeCard1=UPDATE  oc_firstdata_card  SET  expire_month  = ?1,  expire_year  = ?2,  digits  = ?3
#END
updateVoidStatus=UPDATE  oc_firstdata_order  SET  void_status  = ?1 WHERE  order_id  = ?2
#END
storeCard2=INSERT INTO  oc_firstdata_card  SET  customer_id  = ?1,  date_added  = now(),  token  = ?2,  expire_month  = ?3,  expire_year  = ?4,  digits  = ?5
#END
getOrder=SELECT * FROM  oc_firstdata_order  WHERE  order_id  = ?1 LIMIT 1
#END
addOrder=INSERT INTO  oc_firstdata_order  SET  order_id  = ?1,  order_ref  = ?2,  tdate  = ?3,  date_added  = now(),  date_modified  = now(),  capture_status  = ?4,  currency_code  = ?5,  total  = ?6
#END
getStoredCards=SELECT * FROM  oc_firstdata_card  WHERE  customer_id  = ?1
#END
addTransaction=INSERT INTO  oc_firstdata_order_transaction  SET  firstdata_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
updateCaptureStatus=UPDATE  oc_firstdata_order  SET  capture_status  = ?1 WHERE  order_id  = ?2
#END
addHistory=INSERT INTO oc_order_history SET order_id = ?1, order_status_id = ?2, notify = '0', comment = ?3, date_added = NOW()
#END
