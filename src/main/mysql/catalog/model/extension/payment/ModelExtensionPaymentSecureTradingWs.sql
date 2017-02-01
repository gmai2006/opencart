confirmOrder=UPDATE  oc_order  SET order_status_id = 0 WHERE order_id = ?1
#END
removeMd=DELETE FROM oc_securetrading_ws_order WHERE md = ?1
#END
updateReference1=INSERT INTO oc_securetrading_ws_order SET order_id = ?1, transaction_reference = ?2, created = now(), modified = now()
#END
getOrder=SELECT * FROM  oc_securetrading_ws_order  WHERE  order_id  = ?1 LIMIT 1
#END
updateReference=UPDATE oc_securetrading_ws_order SET transaction_reference = ?1 WHERE order_id = ?2
#END
getOrderId=SELECT order_id FROM oc_securetrading_ws_order WHERE md = ?1 LIMIT 1
#END
confirmOrder2=INSERT INTO  oc_securetrading_ws_order_transaction  SET  securetrading_ws_order_id  = ?1,  amount  = ?2, type = ?3,  created = now()
#END
updateOrder=UPDATE  oc_order  SET order_status_id = ?1 WHERE order_id = ?2
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
addMd=INSERT INTO oc_securetrading_ws_order SET order_id = ?1, md = ?2, created = now(), modified = now()
#END
confirmOrder1=UPDATE  oc_securetrading_ws_order  SET  settle_type  = ?1,  modified  = now(),  currency_code  = ?2,  total  = ?3 WHERE order_id = ?4
#END
