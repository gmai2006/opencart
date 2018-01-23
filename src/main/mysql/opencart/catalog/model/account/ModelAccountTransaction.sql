ModelAccountTransaction.getTotalTransactions.getTotalTransactions=SELECT COUNT(*) AS total FROM "oc_customer_transaction" WHERE customer_id = 'param0'
#END
ModelAccountTransaction.getTotalAmount.getTotalAmount=SELECT SUM(amount) AS total FROM "oc_customer_transaction" WHERE customer_id = 'param0' GROUP BY customer_id
#END
