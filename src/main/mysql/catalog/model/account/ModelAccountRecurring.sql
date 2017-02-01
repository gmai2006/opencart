addOrderRecurringTransaction=INSERT INTO  oc_order_recurring_transaction  SET  order_recurring_id  = ?1,  date_added  = NOW(),  type  = ?2
#END
getOrderRecurringTransactions=SELECT * FROM  oc_order_recurring_transaction  WHERE  order_recurring_id  = ?1
#END
getOrderRecurrings=SELECT  or .*, o . payment_method , o . currency_id , o . currency_value  FROM  oc_order_recurring   or  LEFT JOIN  oc_order   o  ON  or . order_id  =  o . order_id  WHERE  o . customer_id  = ?1 ORDER BY  o . order_id  DESC LIMIT ?2,?3
#END
getOrderRecurring=SELECT  or .*, o . payment_method , o . payment_code , o . currency_code  FROM  oc_order_recurring   or  LEFT JOIN  oc_order   o  ON  or . order_id  =  o . order_id  WHERE  or . order_recurring_id  = ?1 AND  o . customer_id  = ?2
#END
getOrderRecurringByReference=SELECT * FROM  oc_order_recurring  WHERE  reference  = ?1
#END
getTotalOrderRecurrings=SELECT COUNT(*) AS total FROM  oc_order_recurring   or  LEFT JOIN  oc_order   o  ON  or . order_id  =  o . order_id  WHERE  o . customer_id  = ?1
#END
editOrderRecurringStatus=UPDATE  oc_order_recurring  SET  status  = ?1 WHERE  order_recurring_id  = ?2
#END
