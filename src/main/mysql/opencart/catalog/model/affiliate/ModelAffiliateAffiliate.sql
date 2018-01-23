ModelAffiliateAffiliate.getAffiliate.getAffiliate=SELECT * FROM oc_affiliate WHERE affiliate_id = 'param0'
#END
ModelAffiliateAffiliate.getAffiliateByEmail.getAffiliateByEmail=SELECT * FROM oc_affiliate WHERE LOWER(email) = 'param0'
#END
ModelAffiliateAffiliate.getAffiliateByCode.getAffiliateByCode=SELECT * FROM oc_affiliate WHERE code = 'param0'
#END
ModelAffiliateAffiliate.getTotalAffiliatesByEmail.getTotalAffiliatesByEmail=SELECT COUNT(*) AS total FROM oc_affiliate WHERE LOWER(email) = 'param0'
#END
ModelAffiliateAffiliate.getTransactionTotal.getTransactionTotal=SELECT SUM(amount) AS total FROM oc_affiliate_transaction WHERE affiliate_id = 'param0'
#END
ModelAffiliateAffiliate.addLoginAttempt.addLoginAttempt=SELECT * FROM oc_affiliate_login WHERE email = 'param0' AND ip = 'param1'
#END
ModelAffiliateAffiliate.getLoginAttempts.getLoginAttempts=SELECT * FROM "oc_affiliate_login" WHERE email = 'param0'
#END
