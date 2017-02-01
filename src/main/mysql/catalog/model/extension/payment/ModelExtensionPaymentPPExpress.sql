getTotalCaptured=SELECT SUM( amount ) AS  amount  FROM  oc_paypal_order_transaction  WHERE  paypal_order_id  = ?1 AND pending_reason != 'authorization' AND pending_reason != 'paymentreview' AND (payment_status = 'Partially-Refunded' OR payment_status = 'Completed' OR payment_status = 'Pending') AND transaction_entity = 'payment'
#END
getTransactionRow=SELECT * FROM  oc_paypal_order_transaction   pt  LEFT JOIN  oc_paypal_order   po  ON  pt . paypal_order_id  =  po . paypal_order_id   WHERE  pt . transaction_id  = ?1 LIMIT 1
#END
getTotalRefunded=SELECT SUM( amount ) AS  amount  FROM  oc_paypal_order_transaction  WHERE  paypal_order_id  = ?1 AND payment_status = 'Refunded'
#END
addOrder=INSERT INTO  oc_paypal_order  SET
			 order_id  = ?1,
			 date_added  = NOW(),
			 date_modified  = NOW(),
			 capture_status  = ?2,
			 currency_code  = ?3,
			 total  = ?4,
			 authorization_id  = ?5
#END
addTransaction=INSERT INTO  oc_paypal_order_transaction  SET
			 paypal_order_id  = ?1,
			 transaction_id  = ?2,
			 parent_id  = ?3,
			 date_added  = NOW(),
			 note  = ?4,
			 msgsubid  = ?5,
			 receipt_id  = ?6,
			 payment_type  = ?7,
			 payment_status  = ?8,
			 pending_reason  = ?9,
			 transaction_entity  = ?10,
			 amount  = ?11,
			 debug_data  = ?12
#END
updateOrder=UPDATE  oc_paypal_order  SET  date_modified  = now(),  capture_status  = ?1 WHERE  order_id  = ?2
#END
getMethod=SELECT * FROM  oc_zone_to_geo_zone  WHERE  geo_zone_id  = ?1 AND  country_id  = ?2 AND ( zone_id  = ?3 OR zone_id = '0')
#END
