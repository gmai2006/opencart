getTransactions=SELECT * FROM  oc_sagepay_server_order_transaction  WHERE  sagepay_server_order_id  = ?1
#END
getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = ?1
#END
getRecurringOrder=SELECT * FROM oc_sagepay_server_order_recurring WHERE order_recurring_id = ?1
#END
updateOrder=UPDATE  oc_sagepay_server_order  SET  VPSTxId  = ?1,  TxAuthNo  = ?2 WHERE  order_id  = ?3
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
deleteOrder1=DELETE FROM  oc_order_recurring  WHERE order_id = ?1
#END
getCards=SELECT * FROM  oc_sagepay_server_card  WHERE customer_id = ?1
#END
addCard=INSERT into  oc_sagepay_server_card  SET customer_id = ?1, token = ?2, digits = ?3, expiry = ?4, type = ?5
#END
getRecurringOrders=SELECT * FROM  oc_order_recurring  WHERE order_id = ?1
#END
addRecurringTransaction=INSERT INTO  oc_order_recurring_transaction  SET  order_recurring_id  = ?1,  date_added  = NOW(),  amount  = ?2,  type  = ?3,  reference  = ?4
#END
updateCronJobRunTime1=INSERT INTO  oc_setting (store_id, code, key, value, serialized) VALUES (0, 'sagepay_server', 'sagepay_server_last_cron_job_run', NOW(), 0)
#END
getOrder=SELECT * FROM  oc_sagepay_server_order  WHERE  order_id  = ?1 OR  VPSTxId  = ?2 LIMIT 1
#END
addRecurringOrder=INSERT INTO  oc_sagepay_server_order_recurring  SET  order_id  = ?1,  order_recurring_id  = ?2,  VPSTxId  = ?3,  VendorTxCode  = ?4,  SecurityKey  = ?5,  TxAuthNo  = ?6,  date_added  = now(),  date_modified  = now(),  next_payment  = now(),  trial_end  = ?7,  subscription_end  = ?8,  currency_code  = ?9,  total  = ?10
#END
updateCronJobRunTime=DELETE FROM  oc_setting WHERE code = 'sagepay_server' AND key = 'sagepay_server_last_cron_job_run'
#END
addOrder=INSERT INTO  oc_sagepay_server_order  SET  order_id  = ?1,  customer_id  = ?2,  VPSTxId  = ?3,   VendorTxCode  = ?4,  SecurityKey  = ?5,  date_added  = now(),  date_modified  = now(),  currency_code  = ?6,  total  = ?7
#END
addTransaction=INSERT INTO  oc_sagepay_server_order_transaction  SET  sagepay_server_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getCard=SELECT * FROM oc_sagepay_server_card WHERE (card_id = ?1 OR token = ?2) AND customer_id = ?3
#END
updateRecurringOrder=UPDATE  oc_sagepay_server_order_recurring  SET  next_payment  = ?1,  date_modified  = now() WHERE  order_recurring_id  = ?2
#END
deleteOrder=DELETE FROM  oc_sagepay_server_order  WHERE order_id = ?1
#END
deleteCard=DELETE FROM oc_sagepay_server_card WHERE card_id = ?1
#END
