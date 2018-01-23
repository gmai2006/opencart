ModelAffiliateTransaction.getTotalTransactions.getTotalTransactions=SELECT COUNT(*) AS total FROM "oc_affiliate_transaction" WHERE affiliate_id = 'param0'
#END
ModelAffiliateTransaction.getBalance.getBalance=SELECT SUM(amount) AS total FROM "oc_affiliate_transaction" WHERE affiliate_id = 'param0' GROUP BY affiliate_id
#END
