getCountriesByGeoZone=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 GROUP BY country_id ORDER BY country_id ASC
#END
getCountryByIsoCode2=SELECT * FROM oc_country WHERE  iso_code_2  = ?1 AND status = '1'
#END
updateOcOrder=UPDATE  oc_order  SET  firstname  = ?1,  lastname  = ?2,  telephone  = ?3,  payment_firstname  = ?4,  payment_lastname  = ?5,  payment_address_1  = ?6,  payment_address_2  = ?7,  payment_city  = ?8,  payment_postcode  = ?9,  payment_zone  = ?10,  payment_zone_id  = ?11,  payment_country  = ?12,  payment_country_id  = ?13,  payment_address_format  = ?14,  shipping_firstname  = ?15,  shipping_lastname  = ?16,  shipping_address_1  = ?17,  shipping_address_2  = ?18,  shipping_city  = ?19,  shipping_postcode  = ?20,  shipping_zone  = ?21,  shipping_zone_id  = ?22,  shipping_country  = ?23,  shipping_country_id  = ?24,  shipping_address_format  = ?25 WHERE  order_id  = ?26
#END
subscribeNewsletter=UPDATE oc_customer SET newsletter = '1' WHERE customer_id = ?1
#END
getOrder=SELECT * FROM  oc_klarna_checkout_order  WHERE  order_ref  = ?1 LIMIT 1
#END
addOrder=INSERT INTO  oc_klarna_checkout_order  SET  order_id  = ?1,  order_ref  = ?2,  data  = ?3
#END
updateOrder=UPDATE  oc_klarna_checkout_order  SET  order_id  = ?1,  data  = ?2 WHERE  order_ref  = ?3
#END
getZoneByCode=SELECT * FROM oc_zone WHERE ( code  = ?1 OR  name  = ?2) AND  country_id  = ?3 AND status = '1'
#END
getCountryByIsoCode3=SELECT * FROM oc_country WHERE  iso_code_3  = ?1 AND status = '1'
#END
checkForPaymentTaxes=SELECT COUNT(*) AS  total  FROM oc_tax_rule WHERE  based  = 'payment' AND  tax_class_id  = ?1
#END
getOrderByOrderId=SELECT * FROM  oc_klarna_checkout_order  WHERE  order_id  = ?1 LIMIT 1
#END
updateOcOrderEmail=UPDATE  oc_order  SET  email  = ?1 WHERE  order_id  = ?2
#END
