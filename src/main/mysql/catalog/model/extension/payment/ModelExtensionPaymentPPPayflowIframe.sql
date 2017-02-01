getOrderId=SELECT  order_id  FROM  oc_paypal_payflow_iframe_order  WHERE  secure_token_id  = ?1
#END
addOrder=INSERT INTO  oc_paypal_payflow_iframe_order  SET  order_id  = ?1,  secure_token_id  = ?2
#END
updateOrder=
			UPDATE  oc_paypal_payflow_iframe_order 
			SET  transaction_reference  = ?1,
				 transaction_type  = ?2,
				 complete  = ?3
			WHERE  secure_token_id  = ?4
		
#END
addTransaction=
			INSERT INTO oc_paypal_payflow_iframe_order_transaction
			SET order_id = ?1,
				transaction_reference = ?2,
				transaction_type = ?3,
				 time  = NOW(),
				 amount  = ?4
		
#END
getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
