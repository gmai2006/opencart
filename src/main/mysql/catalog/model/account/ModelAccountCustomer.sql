editCustomer=UPDATE oc_customer SET firstname = ?1, lastname = ?2, email = ?3, telephone = ?4, fax = ?5, custom_field = ?6 WHERE customer_id = ?7
#END
editCode=UPDATE  oc_customer  SET code = ?1 WHERE LCASE(email) = ?2
#END
addCustomer1=INSERT INTO oc_address SET customer_id = ?1, firstname = ?2, lastname = ?3, company = ?4, address_1 = ?5, address_2 = ?6, city = ?7, postcode = ?8, country_id = ?9, zone_id = ?10, custom_field = ?11
#END
addLoginAttempt1=INSERT INTO oc_customer_login SET email = ?1, ip = ?2, total = 1, date_added = ?3, date_modified = ?4
#END
addCustomer2=UPDATE oc_customer SET address_id = ?1 WHERE customer_id = ?2
#END
addLoginAttempt2=UPDATE oc_customer_login SET total = (total + 1), date_modified = ?1 WHERE customer_login_id = ?2
#END
getTotalCustomersByEmail=SELECT COUNT(*) AS total FROM oc_customer WHERE LOWER(email) = ?1
#END
getCustomerByToken1=UPDATE oc_customer SET token = ''
#END
getCustomerByEmail=SELECT * FROM oc_customer WHERE LOWER(email) = ?1
#END
deleteLoginAttempts=DELETE FROM  oc_customer_login  WHERE email = ?1
#END
getCustomer=SELECT * FROM oc_customer WHERE customer_id = ?1
#END
addCustomer=INSERT INTO oc_customer SET customer_group_id = ?1, store_id = ?2, language_id = ?3, firstname = ?4, lastname = ?5, email = ?6, telephone = ?7, fax = ?8, custom_field = ?9, salt = ?10, password = ?11, newsletter = ?12, ip = ?13, status = '1', approved = ?14, date_added = NOW()
#END
editPassword=UPDATE oc_customer SET salt = ?1, password = ?2, code = '' WHERE LOWER(email) = ?3
#END
editNewsletter=UPDATE oc_customer SET newsletter = ?1 WHERE customer_id = ?2
#END
getLoginAttempts=SELECT * FROM  oc_customer_login  WHERE email = ?1
#END
getCustomerByCode=SELECT customer_id, firstname, lastname, email FROM  oc_customer  WHERE code = ?1 AND code != ''
#END
addLoginAttempt=SELECT * FROM oc_customer_login WHERE email = ?1 AND ip = ?2
#END
getRewardTotal=SELECT SUM(points) AS total FROM oc_customer_reward WHERE customer_id = ?1
#END
getIps=SELECT * FROM  oc_customer_ip  WHERE customer_id = ?1
#END
getCustomerByToken=SELECT * FROM oc_customer WHERE token = ?1 AND token != ''
#END
