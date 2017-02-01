editOrder=UPDATE  oc_order  SET  payment_firstname = ?1, payment_lastname = ?2, payment_address_1 = ?3, payment_address_2 = ?4, payment_city = ?5, payment_zone = ?6, payment_zone_id = ?7, payment_country = ?8, payment_country_id = ?9, payment_postcode = ?10 WHERE order_id = ?11
#END
getAdditionalCharges=SELECT  ot . title ,  ot . order_total_id ,  value  + IF( tax  IS NULL, 0,  tax ) AS 'price' FROM  oc_order_total   ot  LEFT JOIN  oc_amazon_login_pay_order_total_tax   ott  USING( order_total_id )  WHERE  ott . code  NOT IN ('shipping', 'total', 'sub_total', 'tax') AND  value  > 0 AND  order_id  = ?1
#END
getCountry=SELECT  country_id ,  name ,  iso_code_2 ,  iso_code_3 ,  address_format  FROM  oc_country  WHERE  iso_code_2  = ?1 AND status = 1 LIMIT 1
#END
setOrderShipping=INSERT INTO  oc_amazon_login_pay_order  SET  order_id  = ?1,  free_shipping  = ?2,date_added = now(), modified = now() 
#END
addAddress=SELECT * FROM  oc_address  WHERE  firstname  = ?1 AND  lastname  = ?2 AND  address_1  = ?3 AND  address_2  = ?4 AND  postcode  = ?5 AND  city  = ?6 AND  zone_id  = ?7 AND  country_id  = ?8
#END
getTransactions=SELECT * FROM  oc_amazon_login_pay_order_transaction  WHERE  amazon_login_pay_order_id  = ?1
#END
getZone=SELECT  zone_id ,  code  FROM  oc_zone  WHERE (LOWER( name ) LIKE ?1 OR  code  LIKE ?2) AND  country_id  = ?3 LIMIT 1
#END
getShippingPrice=SELECT  value  + IF( tax  IS NULL, 0,  tax ) AS 'price' FROM  oc_order_total   ot  LEFT JOIN  oc_amazon_login_pay_order_total_tax   ott  USING( order_total_id ) WHERE  ot . code  = 'shipping' AND  order_id  = ?1
#END
updateCaptureStatus=UPDATE  oc_amazon_login_pay_order  SET  capture_status  = ?1 WHERE  amazon_login_pay_order_id  = ?2
#END
addCustomer=INSERT INTO oc_customer SET customer_group_id = ?1, store_id = ?2, firstname = ?3, lastname = ?4, email = ?5, telephone = ?6, fax = ?7, custom_field = ?8, salt = ?9, password = ?10, newsletter = ?11, ip = ?12, status = '1', approved = ?13, date_added = NOW()
#END
hasFreeShipping=SELECT  free_shipping  FROM  oc_amazon_login_pay_order  WHERE  order_id  = ?1
#END
updateStatus=UPDATE  oc_amazon_login_pay_order_transaction  SET  status  = ?1 WHERE  amazon_?2_id  = ?3 AND  type  = ?4
#END
getOrder=SELECT * FROM  oc_amazon_login_pay_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_amazon_login_pay_order_transaction  SET  amazon_login_pay_order_id  = ?1,  amazon_authorization_id  = ?2,  amazon_capture_id  = ?3,  date_added  = now(),  type  = ?4,  status  = ?5,  amount  = ?6
#END
addAmazonOrderId=UPDATE  oc_amazon_login_pay_order  SET  amazon_order_reference_id  = ?1,  amazon_authorization_id  = ?2,  modified  = now(),  capture_status  = ?3,  currency_code  = ?4,  total  = ?5 WHERE  order_id  = ?6
#END
addTaxesForTotals=INSERT INTO  oc_amazon_login_pay_order_total_tax  ( order_total_id ,  code ,  tax ) SELECT  order_total_id ,  code , ?1 FROM  oc_order_total  WHERE  order_id  = ?2 AND  code  = ?3 AND  title  = ?4
#END
