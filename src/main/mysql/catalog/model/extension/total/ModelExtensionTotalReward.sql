confirm=INSERT INTO oc_customer_reward SET customer_id = ?1, order_id = ?2, description = ?3, points = ?4, date_added = NOW()
#END
unconfirm=DELETE FROM oc_customer_reward WHERE order_id = ?1 AND points < 0
#END
