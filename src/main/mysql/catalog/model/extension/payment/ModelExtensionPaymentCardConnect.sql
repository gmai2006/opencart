updateTransactionStatusByRetref=UPDATE  oc_cardconnect_order_transaction  SET  status  = ?1,  date_modified  = NOW() WHERE  retref  = ?2
#END
updateCronRunTime=DELETE FROM  oc_setting WHERE key = 'cardconnect_cron_time'
#END
updateCronRunTime1=INSERT INTO  oc_setting SET store_id = '0', code = 'cardconnect', key = 'cardconnect_cron_time', value = NOW(), serialized = '0'
#END
getCards=SELECT * FROM  oc_cardconnect_card  WHERE  customer_id  = ?1
#END
addCard=INSERT INTO  oc_cardconnect_card  SET  cardconnect_order_id  = ?1,  customer_id  = ?2,  profileid  = ?3,  token  = ?4,  type  = ?5,  account  = ?6,  expiry  = ?7, date_added = NOW()
#END
addOrder=INSERT INTO  oc_cardconnect_order  SET  order_id  = ?1,  customer_id  = ?2,  payment_method  = ?3,  retref  = ?4,  authcode  = ?5,  currency_code  = ?6,  total  = ?7, date_added = NOW()
#END
addTransaction=INSERT INTO  oc_cardconnect_order_transaction  SET  cardconnect_order_id  = ?1,  type  = ?2,  retref  = ?3,  amount  = ?4,  status  = ?5, date_modified = NOW(), date_added = NOW()
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE  geo_zone_id  = ?1 AND  country_id  = ?2 AND ( zone_id  = ?3 OR zone_id = '0')
#END
getCard=SELECT * FROM  oc_cardconnect_card  WHERE  token  = ?1 AND  customer_id  = ?2
#END
deleteCard=DELETE FROM  oc_cardconnect_card  WHERE  token  = ?1 AND  customer_id  = ?2
#END
