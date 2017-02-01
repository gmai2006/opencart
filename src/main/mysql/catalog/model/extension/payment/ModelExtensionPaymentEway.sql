getCards=SELECT * FROM oc_eway_card WHERE customer_id = ?1
#END
addCard=INSERT into oc_eway_card SET customer_id = ?1, order_id = ?2, digits = ?3, expiry = ?4, type = ?5
#END
updateFullCard=UPDATE oc_eway_card SET token = ?1, digits = ?2, expiry = ?3, type = ?4 WHERE card_id = ?5
#END
addOrder=INSERT INTO  oc_eway_order  SET  order_id  = ?1,  created  = NOW(),  modified  = NOW(),  debug_data  = ?2,  amount  = ?3,  currency_code  = ?4,  transaction_id  = ?5$cap
#END
addTransaction=INSERT INTO  oc_eway_transactions  SET  eway_order_id  = ?1,  created  = NOW(),  transaction_id  = ?2,  type  = ?3,  amount  = ?4
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
checkToken=SELECT * FROM oc_eway_card WHERE token_id = ?1
#END
updateCard=UPDATE oc_eway_card SET token = ?1 WHERE order_id = ?2
#END
deleteCard=DELETE FROM oc_eway_card WHERE order_id = ?1
#END
