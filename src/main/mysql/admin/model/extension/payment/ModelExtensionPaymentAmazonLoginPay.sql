install1=
			CREATE TABLE  oc_amazon_login_pay_order_total_tax (
				order_total_id  INT,
				code VARCHAR(255),
				tax DECIMAL(10, 4) NOT NULL,
				PRIMARY KEY (order_total_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_amazon_login_pay_order_transaction (
			  amazon_login_pay_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  amazon_login_pay_order_id INT(11) NOT NULL,
			  amazon_authorization_id varchar(255),
			  amazon_capture_id varchar(255),
			  amazon_refund_id varchar(255),
			  date_added DATETIME NOT NULL,
			  type ENUM('authorization', 'capture', 'refund', 'cancel') DEFAULT NULL,
			  status ENUM('Open', 'Pending', 'Completed', 'Suspended', 'Declined', 'Closed', 'Canceled') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (amazon_login_pay_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
			
#END
uninstall1=DROP TABLE IF EXISTS  oc_amazon_login_pay_order_total_tax;
#END
getTotalRefunded=SELECT SUM( amount ) AS  total  FROM  oc_amazon_login_pay_order_transaction  WHERE  amazon_login_pay_order_id  = ?1 AND 'refund'
#END
getTransactions=SELECT * FROM  oc_amazon_login_pay_order_transaction  WHERE  amazon_login_pay_order_id  = ?1
#END
updateRefundStatus=UPDATE  oc_amazon_login_pay_order  SET  refund_status  = ?1 WHERE  amazon_login_pay_order_id  = ?2
#END
updateCaptureStatus=UPDATE  oc_amazon_login_pay_order  SET  capture_status  = ?1 WHERE  amazon_login_pay_order_id  = ?2
#END
getTotalCaptured=SELECT SUM( amount ) AS  total  FROM  oc_amazon_login_pay_order_transaction  WHERE  amazon_login_pay_order_id  = ?1 AND (type = 'capture' OR type = 'refund') AND (status = 'Completed' OR status = 'Closed')
#END
getUnCaptured=SELECT * FROM  oc_amazon_login_pay_order_transaction  WHERE ( type  = 'refund' OR  type  = 'capture') AND  amazon_login_pay_order_id  = ?1 ORDER BY date_added
#END
uninstall=DROP TABLE IF EXISTS  oc_amazon_login_pay_order;
#END
install=
			CREATE TABLE  oc_amazon_login_pay_order (
				amazon_login_pay_order_id INT(11) NOT NULL AUTO_INCREMENT,
				order_id int(11) NOT NULL,
				amazon_order_reference_id varchar(255) NOT NULL,
				amazon_authorization_id varchar(255) NOT NULL,
				free_shipping  tinyint NOT NULL DEFAULT 0,
				date_added DATETIME NOT NULL,
				modified DATETIME NOT NULL,
				capture_status INT(1) DEFAULT NULL,
				cancel_status INT(1) DEFAULT NULL,
				refund_status INT(1) DEFAULT NULL,
				currency_code CHAR(3) NOT NULL,
				total DECIMAL( 10, 2 ) NOT NULL,
				KEY amazon_order_reference_id (amazon_order_reference_id),
				PRIMARY KEY amazon_login_pay_order_id (amazon_login_pay_order_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		
#END
getOrder=SELECT * FROM  oc_amazon_login_pay_order  WHERE  order_id  = ?1 LIMIT 1
#END
updateCancelStatus=UPDATE  oc_amazon_login_pay_order  SET  cancel_status  = ?1 WHERE  amazon_login_pay_order_id  = ?2
#END
getCapturesRemaining=SELECT * FROM  oc_amazon_login_pay_order_transaction  WHERE  amazon_login_pay_order_id  = ?1 AND capture_remaining != '0' ORDER BY date_added
#END
addTransaction=INSERT INTO  oc_amazon_login_pay_order_transaction  SET  amazon_login_pay_order_id  = ?1, amazon_authorization_id  = ?2, amazon_capture_id  = ?3, amazon_refund_id  = ?4,   date_added  = now(),  type  = ?5,  amount  = ?6,  status  = ?7
#END
uninstall2=DROP TABLE IF EXISTS  oc_amazon_login_pay_order_transaction;
#END
