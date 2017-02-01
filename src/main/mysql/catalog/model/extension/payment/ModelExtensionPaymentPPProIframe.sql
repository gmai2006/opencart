addOrder=INSERT INTO  oc_paypal_iframe_order  SET  order_id  = ?1,  date_added  = NOW(),  date_modified  = NOW(),  capture_status  = ?2,  currency_code  = ?3,  total  = ?4,  authorization_id  = ?5
#END
addTransaction=INSERT INTO  oc_paypal_iframe_order_transaction  SET  paypal_iframe_order_id  = ?1,  transaction_id  = ?2,  parent_id  = ?3,  date_added  = NOW(),  note  = ?4,  msgsubid  = ?5,  receipt_id  = ?6,  payment_type  = ?7,  payment_status  = ?8,  pending_reason  = ?9,  transaction_entity  = ?10,  amount  = ?11,  debug_data  = ?12
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
