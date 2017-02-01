getTransactions=SELECT * FROM oc_affiliate_transaction WHERE affiliate_id = ?1 ORDER BY date_added DESC LIMIT ?2,?3
#END
deleteAffiliate2=DELETE FROM oc_affiliate_transaction WHERE affiliate_id = ?1
#END
getAffiliateByEmail=SELECT DISTINCT * FROM oc_affiliate WHERE LCASE(email) = ?1
#END
getAffiliate=SELECT DISTINCT * FROM oc_affiliate WHERE affiliate_id = ?1
#END
deleteTransaction=DELETE FROM oc_affiliate_transaction WHERE order_id = ?1
#END
editAffiliate=UPDATE oc_affiliate SET firstname = ?1, lastname = ?2, email = ?3, telephone = ?4, fax = ?5, company = ?6, website = ?7, address_1 = ?8, address_2 = ?9, city = ?10, postcode = ?11, country_id = ?12, zone_id = ?13, code = ?14, commission = ?15, tax = ?16, payment = ?17, cheque = ?18, paypal = ?19, bank_name = ?20, bank_branch_number = ?21, bank_swift_code = ?22, bank_account_name = ?23, bank_account_number = ?24, status = ?25 WHERE affiliate_id = ?26
#END
getTotalAffiliatesByCountryId=SELECT COUNT(*) AS total FROM oc_affiliate WHERE country_id = ?1
#END
getTotalTransactions=SELECT COUNT(*) AS total  FROM oc_affiliate_transaction WHERE affiliate_id = ?1
#END
getTransactionTotal=SELECT SUM(amount) AS total FROM oc_affiliate_transaction WHERE affiliate_id = ?1
#END
deleteLoginAttempts=DELETE FROM  oc_affiliate_login  WHERE  email  = ?1
#END
getAffiliatesByNewsletter=SELECT * FROM oc_affiliate WHERE newsletter = '1' ORDER BY firstname, lastname, email
#END
editAffiliate1=UPDATE oc_affiliate SET salt = ?1, password = ?2 WHERE affiliate_id = ?3
#END
deleteAffiliate=DELETE FROM oc_affiliate WHERE affiliate_id = ?1
#END
addAffiliate=INSERT INTO oc_affiliate SET firstname = ?1, lastname = ?2, email = ?3, telephone = ?4, fax = ?5, salt = ?6, password = ?7, company = ?8, website = ?9, address_1 = ?10, address_2 = ?11, city = ?12, postcode = ?13, country_id = ?14, zone_id = ?15, code = ?16, commission = ?17, tax = ?18, payment = ?19, cheque = ?20, paypal = ?21, bank_name = ?22, bank_branch_number = ?23, bank_swift_code = ?24, bank_account_name = ?25, bank_account_number = ?26, status = ?27, date_added = NOW()
#END
approve=UPDATE oc_affiliate SET approved = '1' WHERE affiliate_id = ?1
#END
deleteAffiliate1=DELETE FROM oc_affiliate_activity WHERE affiliate_id = ?1
#END
getTotalLoginAttempts=SELECT * FROM  oc_affiliate_login  WHERE  email  = ?1
#END
getTotalAffiliatesByZoneId=SELECT COUNT(*) AS total FROM oc_affiliate WHERE zone_id = ?1
#END
addTransaction=INSERT INTO oc_affiliate_transaction SET affiliate_id = ?1, order_id = ?2, description = ?3, amount = ?4, date_added = NOW()
#END
getTotalAffiliatesAwaitingApproval=SELECT COUNT(*) AS total FROM oc_affiliate WHERE status = '0' OR approved = '0'
#END
getAffiliateByCode=SELECT DISTINCT * FROM oc_affiliate WHERE code = ?1
#END
getTotalTransactionsByOrderId=SELECT COUNT(*) AS total FROM oc_affiliate_transaction WHERE order_id = ?1
#END
