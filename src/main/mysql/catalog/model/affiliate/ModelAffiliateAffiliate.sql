addLoginAttempt1=INSERT INTO oc_affiliate_login SET email = ?1, ip = ?2, total = 1, date_added = ?3, date_modified = ?4
#END
editPayment=UPDATE oc_affiliate SET tax = ?1, payment = ?2, cheque = ?3, paypal = ?4, bank_name = ?5, bank_branch_number = ?6, bank_swift_code = ?7, bank_account_name = ?8, bank_account_number = ?9 WHERE affiliate_id = ?10
#END
addLoginAttempt2=UPDATE oc_affiliate_login SET total = (total + 1), date_modified = ?1 WHERE affiliate_login_id = ?2
#END
getAffiliateByEmail=SELECT * FROM oc_affiliate WHERE LOWER(email) = ?1
#END
getAffiliate=SELECT * FROM oc_affiliate WHERE affiliate_id = ?1
#END
getTotalAffiliatesByEmail=SELECT COUNT(*) AS total FROM oc_affiliate WHERE LOWER(email) = ?1
#END
deleteTransaction=DELETE FROM oc_affiliate_transaction WHERE order_id = ?1
#END
editAffiliate=UPDATE oc_affiliate SET firstname = ?1, lastname = ?2, email = ?3, telephone = ?4, fax = ?5, company = ?6, website = ?7, address_1 = ?8, address_2 = ?9, city = ?10, postcode = ?11, country_id = ?12, zone_id = ?13 WHERE affiliate_id = ?14
#END
getTransactionTotal=SELECT SUM(amount) AS total FROM oc_affiliate_transaction WHERE affiliate_id = ?1
#END
deleteLoginAttempts=DELETE FROM  oc_affiliate_login  WHERE email = ?1
#END
editPassword=UPDATE oc_affiliate SET salt = ?1, password = ?2 WHERE LOWER(email) = ?3
#END
addAffiliate=INSERT INTO oc_affiliate SET firstname = ?1, lastname = ?2, email = ?3, telephone = ?4, fax = ?5, salt = ?6, password = ?7, company = ?8, website = ?9, address_1 = ?10, address_2 = ?11, city = ?12, postcode = ?13, country_id = ?14, zone_id = ?15, code = ?16, commission = ?17, tax = ?18, payment = ?19, cheque = ?20, paypal = ?21, bank_name = ?22, bank_branch_number = ?23, bank_swift_code = ?24, bank_account_name = ?25, bank_account_number = ?26, status = '1', approved = ?27, date_added = NOW()
#END
getLoginAttempts=SELECT * FROM  oc_affiliate_login  WHERE email = ?1
#END
addLoginAttempt=SELECT * FROM oc_affiliate_login WHERE email = ?1 AND ip = ?2
#END
addTransaction=INSERT INTO oc_affiliate_transaction SET affiliate_id = ?1, order_id = ?2, description = ?3, amount = ?4, date_added = NOW()
#END
getAffiliateByCode=SELECT * FROM oc_affiliate WHERE code = ?1
#END
