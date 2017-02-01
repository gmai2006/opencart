install1=
			CREATE TABLE IF NOT EXISTS  oc_paypal_iframe_order_transaction (
			  paypal_iframe_order_transaction_id int(11) NOT NULL AUTO_INCREMENT,
			  paypal_iframe_order_id int(11) NOT NULL,
			  transaction_id CHAR(20) NOT NULL,
			  parent_id CHAR(20) NOT NULL,
			  date_added DATETIME NOT NULL,
			  note VARCHAR(255) NOT NULL,
			  msgsubid CHAR(38) NOT NULL,
			  receipt_id CHAR(20) NOT NULL,
			  payment_type ENUM('none','echeck','instant', 'refund', 'void') DEFAULT NULL,
			  payment_status CHAR(20) NOT NULL,
			  pending_reason CHAR(50) NOT NULL,
			  transaction_entity CHAR(50) NOT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  debug_data TEXT NOT NULL,
			  call_data TEXT NOT NULL,
			  PRIMARY KEY (paypal_iframe_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_paypal_iframe_order;
#END
updateRefundTransaction=UPDATE  oc_paypal_iframe_order_transaction  SET  payment_status  = ?1 WHERE  transaction_id  = ?2 LIMIT 1
#END
getLocalTransaction=
			SELECT *
			FROM oc_paypal_iframe_order_transaction
			WHERE transaction_id = ?1
		
#END
getTotalRefunded=SELECT SUM( amount ) AS  amount  FROM  oc_paypal_iframe_order_transaction  WHERE  paypal_iframe_order_id  = ?1 AND payment_status = 'Refunded'
#END
getTotalRefundedTransaction=SELECT SUM( amount ) AS  amount  FROM  oc_paypal_iframe_order_transaction  WHERE  parent_id  = ?1 AND payment_type = 'refund'
#END
getTransactions=SELECT  ot .*, ( SELECT count( ot2 . paypal_iframe_order_id ) FROM  oc_paypal_iframe_order_transaction   ot2  WHERE  ot2 . parent_id  =  ot . transaction_id  ) AS  children  FROM  oc_paypal_iframe_order_transaction   ot  WHERE  paypal_iframe_order_id  = ?1
#END
updateTransaction=
			UPDATE oc_paypal_iframe_order_transaction
			SET paypal_iframe_order_id = ?1,
				transaction_id = ?2,
				parent_id = ?3,
				date_added = ?4,
				note = ?5,
				msgsubid = ?6,
				receipt_id = ?7,
				payment_type = ?8,
				payment_status = ?9,
				pending_reason = ?10,
				transaction_entity = ?11,
				amount = ?12,
				debug_data = ?13,
				call_data = ?14
			WHERE paypal_iframe_order_transaction_id = ?15
		
#END
getOrderId=SELECT  o . order_id  FROM  oc_paypal_iframe_order_transaction   ot  LEFT JOIN  oc_paypal_iframe_order   o   ON  o . paypal_iframe_order_id  =  ot . paypal_iframe_order_id   WHERE  ot . transaction_id  = ?1 LIMIT 1
#END
updateOrder=UPDATE  oc_paypal_iframe_order  SET  date_modified  = now(),  capture_status  = ?1 WHERE  order_id  = ?2
#END
addTransaction1=
				UPDATE oc_paypal_iframe_order_transaction
				SET call_data = ?1
				WHERE paypal_iframe_order_transaction_id = ?2
				LIMIT 1
			
#END
getTotalCaptured=SELECT SUM( amount ) AS  amount  FROM  oc_paypal_iframe_order_transaction  WHERE  paypal_iframe_order_id  = ?1 AND pending_reason != 'authorization' AND (payment_status = 'Partially-Refunded' OR payment_status = 'Completed' OR payment_status = 'Pending') AND transaction_entity = 'payment'
#END
getFailedTransaction=
			SELECT *
			FROM oc_paypal_iframe_order_transaction
			WHERE paypal_iframe_order_transaction_id = ?1
		
#END
uninstall=DROP TABLE IF EXISTS  oc_paypal_iframe_order_transaction;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_paypal_iframe_order (
			  paypal_iframe_order_id int(11) NOT NULL AUTO_INCREMENT,
			  order_id int(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  date_modified DATETIME NOT NULL,
			  capture_status ENUM('Complete','NotComplete') DEFAULT NULL,
			  currency_code CHAR(3) NOT NULL,
			  authorization_id VARCHAR(30) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (paypal_iframe_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
getOrder=SELECT * FROM  oc_paypal_iframe_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_paypal_iframe_order_transaction  SET  paypal_iframe_order_id  = ?1,  transaction_id  = ?2,  parent_id  = ?3,  date_added  = NOW(),  note  = ?4,  msgsubid  = ?5,  receipt_id  = ?6,  payment_type  = ?7,  payment_status  = ?8,  pending_reason  = ?9,  transaction_entity  = ?10,  amount  = ?11,  debug_data  = ?12
#END
updateAuthorizationId=
			UPDATE  oc_paypal_iframe_order 
			SET  authorization_id  = ?1
			WHERE  paypal_iframe_order_id  = ?2
		
#END
