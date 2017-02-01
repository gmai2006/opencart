editOrder=UPDATE  oc_order  SET invoice_prefix = ?1, store_id = ?2, store_name = ?3, store_url = ?4, customer_id = ?5, customer_group_id = ?6, firstname = ?7, lastname = ?8, email = ?9, telephone = ?10, fax = ?11, custom_field = ?12, payment_firstname = ?13, payment_lastname = ?14, payment_company = ?15, payment_address_1 = ?16, payment_address_2 = ?17, payment_city = ?18, payment_postcode = ?19, payment_country = ?20, payment_country_id = ?21, payment_zone = ?22, payment_zone_id = ?23, payment_address_format = ?24, payment_custom_field = ?25, payment_method = ?26, payment_code = ?27, shipping_firstname = ?28, shipping_lastname = ?29, shipping_company = ?30, shipping_address_1 = ?31, shipping_address_2 = ?32, shipping_city = ?33, shipping_postcode = ?34, shipping_country = ?35, shipping_country_id = ?36, shipping_zone = ?37, shipping_zone_id = ?38, shipping_address_format = ?39, shipping_custom_field = ?40, shipping_method = ?41, shipping_code = ?42, comment = ?43, total = ?44, affiliate_id = ?45, commission = ?46, date_modified = NOW() WHERE order_id = ?47
#END
deleteOrder7=DELETE FROM  oc_affiliate_transaction  WHERE order_id = ?1
#END
deleteOrder3=DELETE FROM  oc_order_voucher  WHERE order_id = ?1
#END
deleteOrder4=DELETE FROM  oc_order_total  WHERE order_id = ?1
#END
deleteOrder5=DELETE FROM  oc_order_history  WHERE order_id = ?1
#END
deleteOrder6=DELETE  or , ort FROM  oc_order_recurring   or ,  oc_order_recurring_transaction   ort  WHERE order_id = ?1 AND ort.order_recurring_id = or.order_recurring_id
#END
deleteOrder1=DELETE FROM  oc_order_product  WHERE order_id = ?1
#END
deleteOrder2=DELETE FROM  oc_order_option  WHERE order_id = ?1
#END
addOrderHistory=SELECT * FROM  oc_order_total  WHERE order_id = ?1 ORDER BY sort_order ASC
#END
addOrder4=UPDATE oc_order_voucher SET voucher_id = ?1 WHERE order_voucher_id = ?2
#END
addOrder3=INSERT INTO oc_order_voucher SET order_id = ?1, description = ?2, code = ?3, from_name = ?4, from_email = ?5, to_name = ?6, to_email = ?7, voucher_theme_id = ?8, message = ?9, amount = ?10
#END
addOrder2=INSERT INTO oc_order_option SET order_id = ?1, order_product_id = ?2, product_option_id = ?3, product_option_value_id = ?4, name = ?5,  value  = ?6,  type  = ?7
#END
addOrder1=INSERT INTO oc_order_product SET order_id = ?1, product_id = ?2, name = ?3, model = ?4, quantity = ?5, price = ?6, total = ?7, tax = ?8, reward = ?9
#END
addOrder5=INSERT INTO oc_order_total SET order_id = ?1, code = ?2, title = ?3,  value  = ?4, sort_order = ?5
#END
addOrderHistory20=SELECT * FROM oc_order_status WHERE order_status_id = ?1 AND language_id = ?2
#END
addOrder=INSERT INTO  oc_order  SET invoice_prefix = ?1, store_id = ?2, store_name = ?3, store_url = ?4, customer_id = ?5, customer_group_id = ?6, firstname = ?7, lastname = ?8, email = ?9, telephone = ?10, fax = ?11, custom_field = ?12, payment_firstname = ?13, payment_lastname = ?14, payment_company = ?15, payment_address_1 = ?16, payment_address_2 = ?17, payment_city = ?18, payment_postcode = ?19, payment_country = ?20, payment_country_id = ?21, payment_zone = ?22, payment_zone_id = ?23, payment_address_format = ?24, payment_custom_field = ?25, payment_method = ?26, payment_code = ?27, shipping_firstname = ?28, shipping_lastname = ?29, shipping_company = ?30, shipping_address_1 = ?31, shipping_address_2 = ?32, shipping_city = ?33, shipping_postcode = ?34, shipping_country = ?35, shipping_country_id = ?36, shipping_zone = ?37, shipping_zone_id = ?38, shipping_address_format = ?39, shipping_custom_field = ?40, shipping_method = ?41, shipping_code = ?42, comment = ?43, total = ?44, affiliate_id = ?45, commission = ?46, marketing_id = ?47, tracking = ?48, language_id = ?49, currency_id = ?50, currency_code = ?51, currency_value = ?52, ip = ?53, forwarded_ip = ?54, user_agent = ?55, accept_language = ?56, date_added = NOW(), date_modified = NOW()
#END
deleteOrder=DELETE FROM  oc_order  WHERE order_id = ?1
#END
editOrder3=INSERT INTO oc_order_product SET order_id = ?1, product_id = ?2, name = ?3, model = ?4, quantity = ?5, price = ?6, total = ?7, tax = ?8, reward = ?9
#END
addOrderHistory6=INSERT INTO oc_order_history SET order_id = ?1, order_status_id = ?2, notify = ?3, comment = ?4, date_added = NOW()
#END
editOrder2=DELETE FROM oc_order_option WHERE order_id = ?1
#END
addOrderHistory5=UPDATE  oc_order  SET order_status_id = ?1, date_modified = NOW() WHERE order_id = ?2
#END
editOrder1=DELETE FROM oc_order_product WHERE order_id = ?1
#END
getOrder4=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
addOrderHistory4=UPDATE oc_product_option_value SET quantity = (quantity - ?1) WHERE product_option_value_id = ?2 AND subtract = '1'
#END
addOrderHistory3=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
getOrder2=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
addOrderHistory2=UPDATE oc_product SET quantity = (quantity - ?1) WHERE product_id = ?2 AND subtract = '1'
#END
getOrder3=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
addOrderHistory1=SELECT * FROM oc_order_product WHERE order_id = ?1
#END
getOrder1=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
addOrderHistory10=UPDATE oc_product_option_value SET quantity = (quantity + ?1) WHERE product_option_value_id = ?2 AND subtract = '1'
#END
addOrderHistory11=SELECT * FROM  oc_order_total  WHERE order_id = ?1 ORDER BY sort_order ASC
#END
editOrder9=INSERT INTO oc_order_total SET order_id = ?1, code = ?2, title = ?3,  value  = ?4, sort_order = ?5
#END
editOrder8=DELETE FROM oc_order_total WHERE order_id = ?1
#END
editOrder7=UPDATE oc_order_voucher SET voucher_id = ?1 WHERE order_voucher_id = ?2
#END
editOrder6=INSERT INTO oc_order_voucher SET order_id = ?1, description = ?2, code = ?3, from_name = ?4, from_email = ?5, to_name = ?6, to_email = ?7, voucher_theme_id = ?8, message = ?9, amount = ?10
#END
addOrderHistory9=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
editOrder5=DELETE FROM oc_order_voucher WHERE order_id = ?1
#END
addOrderHistory8=UPDATE  oc_product  SET quantity = (quantity + ?1) WHERE product_id = ?2 AND subtract = '1'
#END
editOrder4=INSERT INTO oc_order_option SET order_id = ?1, order_product_id = ?2, product_option_id = ?3, product_option_value_id = ?4, name = ?5,  value  = ?6,  type  = ?7
#END
getOrder=SELECT *, (SELECT os.name FROM  oc_order_status  os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status FROM  oc_order  o WHERE o.order_id = ?1
#END
addOrderHistory7=SELECT * FROM oc_order_product WHERE order_id = ?1
#END
addOrderHistory18=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
addOrderHistory19=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
addOrderHistory16=SELECT * FROM oc_order_voucher WHERE order_id = ?1
#END
addOrderHistory17=SELECT * FROM  oc_order_total  WHERE order_id = ?1 ORDER BY sort_order ASC
#END
addOrderHistory14=SELECT * FROM oc_order_status WHERE order_status_id = ?1 AND language_id = ?2
#END
addOrderHistory15=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
addOrderHistory12=SELECT * FROM oc_order_product WHERE order_id = ?1
#END
addOrderHistory13=SELECT COUNT(*) AS total FROM  oc_product_to_download  WHERE product_id = ?1
#END
