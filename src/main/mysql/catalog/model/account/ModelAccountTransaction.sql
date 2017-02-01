getTotalAmount=SELECT SUM(amount) AS total FROM  oc_customer_transaction  WHERE customer_id = ?1 GROUP BY customer_id
#END
getTotalTransactions=SELECT COUNT(*) AS total FROM  oc_customer_transaction  WHERE customer_id = ?1
#END
