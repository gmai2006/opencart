storeCard=INSERT INTO  oc_firstdata_remote_card  SET  customer_id  = ?1,  date_added  = now(),  token  = ?2,  card_type  = ?3,  expire_month  = ?4,  expire_year  = ?5,  digits  = ?6
#END
addOrder=INSERT INTO  oc_firstdata_remote_order  SET  order_id  = ?1,  order_ref  = ?2,  authcode  = ?3,  tdate  = ?4,  date_added  = now(),  date_modified  = now(),  capture_status  = ?5,  currency_code  = ?6,  total  = ?7
#END
getStoredCards=SELECT * FROM oc_firstdata_remote_card WHERE customer_id = ?1
#END
addTransaction=INSERT INTO  oc_firstdata_remote_order_transaction  SET  firstdata_remote_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE  geo_zone_id  = ?1 AND  country_id  = ?2 AND ( zone_id  = ?3 OR zone_id = '0')
#END
addHistory=INSERT INTO  oc_order_history  SET  order_id  = ?1,  order_status_id  = ?2,  notify  = '0',  comment  = ?3, date_added = NOW()
#END
