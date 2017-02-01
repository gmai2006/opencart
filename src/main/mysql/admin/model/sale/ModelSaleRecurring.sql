getRecurringTransactions=SELECT amount, type, date_added FROM oc_order_recurring_transaction WHERE order_recurring_id = ?1 ORDER BY date_added DESC
#END
getRecurring=SELECT * FROM oc_order_recurring WHERE order_recurring_id = ?1
#END
