getBalance=SELECT SUM(amount) AS total FROM  oc_affiliate_transaction  WHERE affiliate_id = ?1 GROUP BY affiliate_id
#END
getTotalTransactions=SELECT COUNT(*) AS total FROM  oc_affiliate_transaction  WHERE affiliate_id = ?1
#END
