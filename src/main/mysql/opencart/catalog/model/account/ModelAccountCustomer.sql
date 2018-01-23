ModelAccountCustomer.getCustomer.getCustomer=SELECT * FROM oc_customer WHERE customer_id = 'param0'
#END
ModelAccountCustomer.getCustomerByEmail.getCustomerByEmail=SELECT * FROM oc_customer WHERE LOWER(email) = 'param0'
#END
ModelAccountCustomer.getCustomerByCode.getCustomerByCode=SELECT customer_id, firstname, lastname, email FROM "oc_customer" WHERE code = 'param0' AND code != ''
#END
ModelAccountCustomer.getCustomerByToken.getCustomerByToken=SELECT * FROM oc_customer WHERE token = 'param0' AND token != ''
#END
ModelAccountCustomer.getTotalCustomersByEmail.getTotalCustomersByEmail=SELECT COUNT(*) AS total FROM oc_customer WHERE LOWER(email) = 'param0'
#END
ModelAccountCustomer.getRewardTotal.getRewardTotal=SELECT SUM(points) AS total FROM oc_customer_reward WHERE customer_id = 'param0'
#END
ModelAccountCustomer.getIps.getIps=SELECT * FROM "oc_customer_ip" WHERE customer_id = 'param0'
#END
ModelAccountCustomer.addLoginAttempt.addLoginAttempt=SELECT * FROM oc_customer_login WHERE email = 'param0' AND ip = 'param1'
#END
ModelAccountCustomer.getLoginAttempts.getLoginAttempts=SELECT * FROM "oc_customer_login" WHERE email = 'param0'
#END
