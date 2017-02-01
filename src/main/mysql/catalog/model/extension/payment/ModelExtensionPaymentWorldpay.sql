getWorldpayOrder=SELECT * FROM oc_worldpay_order WHERE order_code = ?1
#END
getTransactions=SELECT * FROM  oc_worldpay_order_transaction  WHERE  worldpay_order_id  = ?1
#END
getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = ?1
#END
getRecurringOrder=SELECT * FROM oc_worldpay_order_recurring WHERE order_recurring_id = ?1
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
getCards=SELECT * FROM oc_worldpay_card WHERE customer_id = ?1
#END
addCard=INSERT into oc_worldpay_card SET customer_id = ?1, order_id = ?2, digits = ?3, expiry = ?4, type = ?5, token = ?6
#END
updateCronJobRunTime1=INSERT INTO  oc_setting (store_id, code, key, value, serialized) VALUES (0, 'worldpay', 'worldpay_last_cron_job_run', NOW(), 0)
#END
getOrder=SELECT * FROM  oc_worldpay_order  WHERE  order_id  = ?1 LIMIT 1
#END
addProfileTransaction=INSERT INTO  oc_order_recurring_transaction  SET  order_recurring_id  = ?1,  date_added  = NOW(),  amount  = ?2,  type  = ?3,  reference  = ?4
#END
addRecurringOrder=INSERT INTO  oc_worldpay_order_recurring  SET  order_id  = ?1,  order_recurring_id  = ?2,  order_code  = ?3,  token  = ?4,  date_added  = now(),  date_modified  = now(),  next_payment  = now(),  trial_end  = ?5,  subscription_end  = ?6,  currency_code  = ?7,  total  = ?8
#END
updateCronJobRunTime=DELETE FROM  oc_setting WHERE code = 'worldpay' AND key = 'worldpay_last_cron_job_run'
#END
addOrder=INSERT INTO  oc_worldpay_order  SET  order_id  = ?1,  order_code  = ?2,  date_added  = now(),  date_modified  = now(),  currency_code  = ?3,  total  = ?4
#END
addTransaction=INSERT INTO  oc_worldpay_order_transaction  SET  worldpay_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
updateRecurringOrder=UPDATE  oc_worldpay_order_recurring  SET  next_payment  = ?1,  date_modified  = now() WHERE  order_recurring_id  = ?2
#END
deleteCard=DELETE FROM oc_worldpay_card WHERE customer_id = ?1 AND token = ?2
#END
