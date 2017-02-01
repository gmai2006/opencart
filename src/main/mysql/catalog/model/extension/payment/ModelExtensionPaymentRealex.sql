addOrder=INSERT INTO  oc_realex_order  SET  order_id  = ?1,  settle_type  = ?2,  order_ref  = ?3,  order_ref_previous  = ?4,  date_added  = now(),  date_modified  = now(),  capture_status  = ?5,  currency_code  = ?6,  pasref  = ?7,  pasref_previous  = ?8,  authcode  = ?9,  account  = ?10,  total  = ?11
#END
addTransaction=INSERT INTO  oc_realex_order_transaction  SET  realex_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
addHistory=INSERT INTO oc_order_history SET order_id = ?1, order_status_id = ?2, notify = '0', comment = ?3, date_added = NOW()
#END
