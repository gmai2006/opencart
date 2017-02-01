install1=CREATE TABLE IF NOT EXISTS  oc_laybuy_revise_request (
			laybuy_revise_request_id int(11) NOT NULL AUTO_INCREMENT,
			laybuy_transaction_id int(11) DEFAULT '0',
			type varchar(250) NOT NULL DEFAULT '',
			order_id int(11) NOT NULL DEFAULT '0',
			firstname varchar(32) NOT NULL DEFAULT '',
			lastname varchar(32) NOT NULL DEFAULT '',
			address text,
			suburb varchar(128) NOT NULL DEFAULT '',
			state varchar(128) NOT NULL DEFAULT '',
			country varchar(32) NOT NULL DEFAULT '',
			postcode varchar(10) NOT NULL DEFAULT '',
			email varchar(96) NOT NULL DEFAULT '',
			amount double NOT NULL,
			currency varchar(5) NOT NULL,
			downpayment double NOT NULL,
			months int(11) NOT NULL,
			downpayment_amount double NOT NULL,
			payment_amounts double NOT NULL,
			first_payment_due datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			last_payment_due datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			store_id int(11) NOT NULL DEFAULT '0',
			status int(11) NOT NULL DEFAULT '1',
			report text,
			transaction int(11) NOT NULL DEFAULT '2',
			paypal_profile_id varchar(250) NOT NULL DEFAULT '',
			laybuy_ref_no int(11) NOT NULL DEFAULT '0',
			payment_type tinyint(1) NOT NULL DEFAULT '1',
			date_added datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			PRIMARY KEY (laybuy_revise_request_id)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci
#END
uninstall1=DROP TABLE IF EXISTS  oc_laybuy_revise_request
#END
addRevisedTransaction=INSERT INTO  oc_laybuy_revise_request  SET  laybuy_transaction_id  = ?1,  type  = ?2,  order_id  = ?3,  firstname  = ?4,  lastname  = ?5,  address  = ?6,  suburb  = ?7,  state  = ?8,  country  = ?9,  postcode  = ?10,  email  = ?11,  amount  = ?12,  currency  = ?13,  downpayment  = ?14,  months  = ?15,  downpayment_amount  = ?16,  payment_amounts  = ?17,  first_payment_due  = ?18,  last_payment_due  = ?19,  store_id  = ?20,  status  = ?21,  report  = ?22,  transaction  = ?23,  paypal_profile_id  = ?24,  laybuy_ref_no  = ?25,  payment_type  = ?26, date_added = NOW()
#END
getCustomerIdByOrderId=SELECT  customer_id  FROM  oc_order  WHERE  order_id  = ?1
#END
getTransactionByLayBuyRefId=SELECT * FROM  oc_laybuy_transaction  WHERE  laybuy_ref_no  = ?1
#END
updateTransaction=UPDATE  oc_laybuy_transaction  SET  status  = ?1,  report  = ?2,  transaction  = ?3 WHERE  laybuy_transaction_id  = ?4
#END
getRevisedTransactions=SELECT * FROM  oc_laybuy_revise_request  WHERE  laybuy_revise_request_id  = ?1
#END
updateOrderStatus1=INSERT INTO  oc_order_history  SET  order_id  = ?1,  order_status_id  = ?2,  notify  = '0',  comment  = ?3, date_added = NOW()
#END
updateOrderStatus=UPDATE  oc_order  SET  order_status_id  = ?1,  date_modified  = NOW() WHERE  order_id  = ?2
#END
getPayPalProfileIds=SELECT  paypal_profile_id  FROM  oc_laybuy_transaction WHERE status = '1'
#END
uninstall=DROP TABLE IF EXISTS  oc_laybuy_transaction
#END
getTransactionByOrderId=SELECT * FROM  oc_laybuy_transaction  WHERE  order_id  = ?1 ORDER BY laybuy_ref_no DESC LIMIT 1
#END
install=CREATE TABLE IF NOT EXISTS  oc_laybuy_transaction (
			laybuy_transaction_id int(11) NOT NULL AUTO_INCREMENT,
			order_id int(11) NOT NULL DEFAULT '0',
			firstname varchar(32) NOT NULL DEFAULT '',
			lastname varchar(32) NOT NULL DEFAULT '',
			address text,
			suburb varchar(128) NOT NULL DEFAULT '',
			state varchar(128) NOT NULL DEFAULT '',
			country varchar(32) NOT NULL DEFAULT '',
			postcode varchar(10) NOT NULL DEFAULT '',
			email varchar(96) NOT NULL DEFAULT '',
			amount double NOT NULL,
			currency varchar(5) NOT NULL,
			downpayment double NOT NULL,
			months int(11) NOT NULL,
			downpayment_amount double NOT NULL,
			payment_amounts double NOT NULL,
			first_payment_due datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			last_payment_due datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			store_id int(11) NOT NULL DEFAULT '0',
			status int(11) NOT NULL DEFAULT '1',
			report text,
			transaction int(11) NOT NULL DEFAULT '2',
			paypal_profile_id varchar(250) NOT NULL DEFAULT '',
			laybuy_ref_no int(11) NOT NULL DEFAULT '0',
			date_added datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
			PRIMARY KEY (laybuy_transaction_id)
		) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci
#END
getRevisedTransaction=SELECT * FROM  oc_laybuy_revise_request  WHERE  laybuy_revise_request_id  = ?1
#END
updateTransactionStatus=UPDATE  oc_laybuy_transaction  SET  status  = ?1 WHERE  laybuy_transaction_id  = ?2
#END
updateRevisedTransaction=UPDATE  oc_laybuy_revise_request  SET  laybuy_transaction_id  = ?1,  type  = ?2,  order_id  = ?3,  firstname  = ?4,  lastname  = ?5,  address  = ?6,  suburb  = ?7,  state  = ?8,  country  = ?9,  postcode  = ?10,  email  = ?11,  amount  = ?12,  currency  = ?13,  downpayment  = ?14,  months  = ?15,  downpayment_amount  = ?16,  payment_amounts  = ?17,  first_payment_due  = ?18,  last_payment_due  = ?19,  store_id  = ?20,  status  = ?21,  report  = ?22,  transaction  = ?23,  paypal_profile_id  = ?24,  laybuy_ref_no  = ?25,  payment_type  = ?26,  date_added  = NOW() WHERE  laybuy_revise_request_id  = ?27
#END
getTransaction=SELECT * FROM  oc_laybuy_transaction  WHERE  laybuy_transaction_id  = ?1
#END
