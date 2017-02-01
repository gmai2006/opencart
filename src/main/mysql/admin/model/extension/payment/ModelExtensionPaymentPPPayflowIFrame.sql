install1=
			CREATE TABLE  oc_paypal_payflow_iframe_order_transaction (
				order_id int(11) NOT NULL,
				transaction_reference varchar(255) NOT NULL,
				transaction_type char(1) NOT NULL,
				time datetime NOT NULL,
				amount decimal(10,4) DEFAULT NULL,
				PRIMARY KEY (transaction_reference),
				KEY order_id (order_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8;
#END
uninstall1=DROP TABLE IF EXISTS  oc_paypal_payflow_iframe_order_transaction;
#END
uninstall=DROP TABLE IF EXISTS  oc_paypal_payflow_iframe_order;
#END
install=
			CREATE TABLE  oc_paypal_payflow_iframe_order (
				order_id int(11) DEFAULT NULL,
				secure_token_id varchar(255) NOT NULL,
				transaction_reference varchar(255) DEFAULT NULL,
				transaction_type varchar(1) DEFAULT NULL,
				complete tinyint(4) NOT NULL DEFAULT '0',
				PRIMARY KEY(order_id),
				KEY secure_token_id (secure_token_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci
#END
getOrder=SELECT * FROM oc_paypal_payflow_iframe_order WHERE order_id = ?1
#END
getTransactions=
			SELECT *
			FROM oc_paypal_payflow_iframe_order_transaction
			WHERE order_id = ?1
			ORDER BY time ASC
#END
addTransaction=
			INSERT INTO oc_paypal_payflow_iframe_order_transaction
			SET order_id = ?1,
				transaction_reference = ?2,
				transaction_type = ?3,
				 time  = NOW(),
				 amount  = ?4
		
#END
updateOrderStatus=
			UPDATE oc_paypal_payflow_iframe_order
			SET  complete  = ?1
			WHERE order_id = ?2
		
#END
getTransaction=
			SELECT *
			FROM oc_paypal_payflow_iframe_order_transaction
			WHERE transaction_reference = ?1
#END
