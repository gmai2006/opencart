getCards=SELECT * FROM  oc_bluepay_redirect_card  WHERE customer_id = ?1
#END
addCard=INSERT into  oc_bluepay_redirect_card  SET customer_id = ?1, token = ?2, digits = ?3, expiry = ?4, type = ?5
#END
getOrder=SELECT * FROM  oc_bluepay_redirect_order  WHERE  order_id  = ?1 LIMIT 1
#END
getTransactions=SELECT * FROM  oc_bluepay_redirect_order_transaction  WHERE  bluepay_redirect_order_id  = ?1
#END
addOrder=INSERT INTO  oc_bluepay_redirect_order  SET  order_id  = ?1,  transaction_id  = ?2,  date_added  = now(),  date_modified  = now(),  release_status  = ?3,   currency_code  = ?4,  total  = ?5
#END
addTransaction=INSERT INTO  oc_bluepay_redirect_order_transaction  SET  bluepay_redirect_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
