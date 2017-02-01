editCustomer3=INSERT INTO oc_address SET address_id = ?1, customer_id = ?2, firstname = ?3, lastname = ?4, company = ?5, address_1 = ?6, address_2 = ?7, city = ?8, postcode = ?9, country_id = ?10, zone_id = ?11, custom_field = ?12
#END
editCustomer=UPDATE oc_customer SET customer_group_id = ?1, firstname = ?2, lastname = ?3, email = ?4, telephone = ?5, fax = ?6, custom_field = ?7, newsletter = ?8, status = ?9, approved = ?10, safe = ?11 WHERE customer_id = ?12
#END
editCustomer2=DELETE FROM oc_address WHERE customer_id = ?1
#END
editCustomer1=UPDATE oc_customer SET salt = ?1, password = ?2 WHERE customer_id = ?3
#END
deleteCustomer5=DELETE FROM oc_address WHERE customer_id = ?1
#END
getAddress2=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
deleteCustomer3=DELETE FROM oc_customer_transaction WHERE customer_id = ?1
#END
deleteCustomer4=DELETE FROM oc_customer_ip WHERE customer_id = ?1
#END
getAddress1=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
deleteCustomer1=DELETE FROM oc_customer_activity WHERE customer_id = ?1
#END
getTotalAddressesByZoneId=SELECT COUNT(*) AS total FROM oc_address WHERE zone_id = ?1
#END
editCustomer4=UPDATE oc_customer SET address_id = ?1 WHERE customer_id = ?2
#END
deleteCustomer2=DELETE FROM oc_customer_reward WHERE customer_id = ?1
#END
getRewards=SELECT * FROM oc_customer_reward WHERE customer_id = ?1 ORDER BY date_added DESC LIMIT ?2,?3
#END
deleteTransaction=DELETE FROM oc_customer_transaction WHERE order_id = ?1
#END
addHistory=INSERT INTO oc_customer_history SET customer_id = ?1, comment = ?2, date_added = NOW()
#END
deleteLoginAttempts=DELETE FROM  oc_customer_login  WHERE  email  = ?1
#END
getTotalIps=SELECT COUNT(*) AS total FROM oc_customer_ip WHERE customer_id = ?1
#END
addCustomer=INSERT INTO oc_customer SET customer_group_id = ?1, firstname = ?2, lastname = ?3, email = ?4, telephone = ?5, fax = ?6, custom_field = ?7, newsletter = ?8, salt = ?9, password = ?10, status = ?11, approved = ?12, safe = ?13, date_added = NOW()
#END
getTotalHistories=SELECT COUNT(*) AS total FROM oc_customer_history WHERE customer_id = ?1
#END
getTotalRewards=SELECT COUNT(*) AS total FROM oc_customer_reward WHERE customer_id = ?1
#END
getTotalCustomersAwaitingApproval=SELECT COUNT(*) AS total FROM oc_customer WHERE status = '0' OR approved = '0'
#END
deleteReward=DELETE FROM oc_customer_reward WHERE order_id = ?1 AND points > 0
#END
getRewardTotal=SELECT SUM(points) AS total FROM oc_customer_reward WHERE customer_id = ?1
#END
getTotalCustomersByCustomerGroupId=SELECT COUNT(*) AS total FROM oc_customer WHERE customer_group_id = ?1
#END
getAddress=SELECT * FROM oc_address WHERE address_id = ?1
#END
addTransaction=INSERT INTO oc_customer_transaction SET customer_id = ?1, order_id = ?2, description = ?3, amount = ?4, date_added = NOW()
#END
getAddresses=SELECT address_id FROM oc_address WHERE customer_id = ?1
#END
getTotalAddressesByCustomerId=SELECT COUNT(*) AS total FROM oc_address WHERE customer_id = ?1
#END
getTotalAddressesByCountryId=SELECT COUNT(*) AS total FROM oc_address WHERE country_id = ?1
#END
addCustomer1=INSERT INTO oc_address SET customer_id = ?1, firstname = ?2, lastname = ?3, company = ?4, address_1 = ?5, address_2 = ?6, city = ?7, postcode = ?8, country_id = ?9, zone_id = ?10, custom_field = ?11
#END
addCustomer2=UPDATE oc_customer SET address_id = ?1 WHERE customer_id = ?2
#END
editToken=UPDATE oc_customer SET token = ?1 WHERE customer_id = ?2
#END
getTotalCustomerRewardsByOrderId=SELECT COUNT(*) AS total FROM oc_customer_reward WHERE order_id = ?1 AND points > 0
#END
getTransactions=SELECT * FROM oc_customer_transaction WHERE customer_id = ?1 ORDER BY date_added DESC LIMIT ?2,?3
#END
deleteCustomer=DELETE FROM oc_customer WHERE customer_id = ?1
#END
getCustomerByEmail=SELECT DISTINCT * FROM oc_customer WHERE LCASE(email) = ?1
#END
getTotalCustomersByIp=SELECT COUNT(*) AS total FROM oc_customer_ip WHERE ip = ?1
#END
getTotalTransactions=SELECT COUNT(*) AS total  FROM oc_customer_transaction WHERE customer_id = ?1
#END
getTransactionTotal=SELECT SUM(amount) AS total FROM oc_customer_transaction WHERE customer_id = ?1
#END
getCustomer=SELECT DISTINCT * FROM oc_customer WHERE customer_id = ?1
#END
approve=UPDATE oc_customer SET approved = '1' WHERE customer_id = ?1
#END
addReward=INSERT INTO oc_customer_reward SET customer_id = ?1, order_id = ?2, points = ?3, description = ?4, date_added = NOW()
#END
getTotalLoginAttempts=SELECT * FROM  oc_customer_login  WHERE  email  = ?1
#END
getHistories=SELECT comment, date_added FROM oc_customer_history WHERE customer_id = ?1 ORDER BY date_added DESC LIMIT ?2,?3
#END
getIps=SELECT * FROM oc_customer_ip WHERE customer_id = ?1 ORDER BY date_added DESC LIMIT ?2,?3
#END
getTotalTransactionsByOrderId=SELECT COUNT(*) AS total FROM oc_customer_transaction WHERE order_id = ?1
#END
