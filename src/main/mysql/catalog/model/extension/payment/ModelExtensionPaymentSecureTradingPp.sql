editOrder=UPDATE  oc_order  SET shipping_firstname = ?1, shipping_lastname = ?2, shipping_address_1 = ?3, shipping_address_2 = ?4, shipping_city = ?5, shipping_zone = ?6, shipping_zone_id = ?7, shipping_country = ?8, shipping_country_id = ?9, shipping_postcode = ?10,  payment_firstname = ?11, payment_lastname = ?12, payment_address_1 = ?13, payment_address_2 = ?14, payment_city = ?15, payment_zone = ?16, payment_zone_id = ?17, payment_country = ?18, payment_country_id = ?19, payment_postcode = ?20 WHERE order_id = ?21
#END
confirmOrder=UPDATE  oc_order  SET order_status_id = 0 WHERE order_id = ?1
#END
getCountry=SELECT * FROM oc_country WHERE LOWER(iso_code_2) = ?1
#END
getOrder=SELECT * FROM  oc_securetrading_pp_order  WHERE  order_id  = ?1 LIMIT 1
#END
addReference=REPLACE INTO oc_securetrading_pp_order SET order_id = ?1, transaction_reference = ?2, created = now()
#END
confirmOrder2=INSERT INTO  oc_securetrading_pp_order_transaction  SET  securetrading_pp_order_id  = ?1,  amount  = ?2, type = ?3,  created = now()
#END
updateOrder=UPDATE  oc_order  SET order_status_id = ?1 WHERE order_id = ?2
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
confirmOrder1=UPDATE  oc_securetrading_pp_order  SET  settle_type  = ?1,  modified  = now(),  currency_code  = ?2,  total  = ?3 WHERE order_id = ?4
#END
