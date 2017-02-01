confirm=INSERT INTO oc_customer_transaction SET customer_id = ?1, order_id = ?2, description = ?3, amount = ?4, date_added = NOW()
#END
unconfirm=DELETE FROM oc_customer_transaction WHERE order_id = ?1
#END
