updateCronRunTime=DELETE FROM  oc_setting WHERE key = 'laybuy_cron_time'
#END
deleteRevisedTransaction=DELETE FROM  oc_laybuy_revise_request  WHERE  laybuy_revise_request_id  = ?1
#END
getTransactionByLayBuyRefId=SELECT * FROM  oc_laybuy_transaction  WHERE  laybuy_ref_no  = ?1
#END
updateTransaction=UPDATE  oc_laybuy_transaction  SET  status  = ?1,  report  = ?2,  transaction  = ?3 WHERE  laybuy_transaction_id  = ?4
#END
deleteTransactionByOrderId=DELETE FROM  oc_laybuy_transaction  WHERE  order_id  = ?1
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE  geo_zone_id  = ?1 AND  country_id  = ?2 AND ( zone_id  = ?3 OR zone_id = '0')
#END
getPayPalProfileIds=SELECT  paypal_profile_id  FROM  oc_laybuy_transaction WHERE status = '1'
#END
updateCronRunTime1=INSERT INTO  oc_setting SET store_id = '0', code = 'laybuy', key = 'laybuy_cron_time', value = NOW(), serialized = '0'
#END
addTransaction=INSERT INTO  oc_laybuy_transaction  SET  order_id  = ?1,  firstname  = ?2,  lastname  = ?3,  address  = ?4,  suburb  = ?5,  state  = ?6,  country  = ?7,  postcode  = ?8,  email  = ?9,  amount  = ?10,  currency  = ?11,  downpayment  = ?12,  months  = ?13,  downpayment_amount  = ?14,  payment_amounts  = ?15,  first_payment_due  = ?16,  last_payment_due  = ?17,  store_id  = ?18,  status  = ?19,  report  = ?20,  paypal_profile_id  = ?21,  laybuy_ref_no  = ?22, date_added = NOW()
#END
getMethod1=SELECT GROUP_CONCAT( category_id ) as  categories  FROM  oc_product_to_category  WHERE  product_id  = ?1
#END
getRevisedTransaction=SELECT * FROM  oc_laybuy_revise_request  WHERE  laybuy_revise_request_id  = ?1
#END
deleteTransactionByOrderId1=DELETE FROM  oc_laybuy_revise_request  WHERE  order_id  = ?1
#END
getTransaction=SELECT * FROM  oc_laybuy_transaction  WHERE  laybuy_transaction_id  = ?1
#END
