install1=
			CREATE TABLE IF NOT EXISTS  oc_g2apay_order_transaction (
			  g2apay_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  g2apay_order_id INT(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  type ENUM('payment', 'refund') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (g2apay_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
			
#END
uninstall1=DROP TABLE IF EXISTS  oc_g2apay_order_transaction;
#END
uninstall=DROP TABLE IF EXISTS  oc_g2apay_order;
#END
getTotalRefunded=SELECT SUM( amount ) AS  total  FROM  oc_g2apay_order_transaction  WHERE  g2apay_order_id  = ?1 AND 'refund'
#END
install=
			CREATE TABLE  oc_g2apay_order (
				g2apay_order_id INT(11) NOT NULL AUTO_INCREMENT,
				order_id int(11) NOT NULL,
				g2apay_transaction_id varchar(255) NOT NULL,
				date_added DATETIME NOT NULL,
				modified DATETIME NOT NULL,
				refund_status INT(1) DEFAULT NULL,
				currency_code CHAR(3) NOT NULL,
				total DECIMAL( 10, 2 ) NOT NULL,
				KEY g2apay_transaction_id (g2apay_transaction_id),
				PRIMARY KEY g2apay_order_id (g2apay_order_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
		
#END
getOrder=SELECT * FROM  oc_g2apay_order  WHERE  order_id  = ?1 LIMIT 1
#END
getTransactions=SELECT * FROM  oc_g2apay_order_transaction  WHERE  g2apay_order_id  = ?1
#END
updateRefundStatus=UPDATE  oc_g2apay_order  SET  refund_status  = ?1 WHERE  g2apay_order_id  = ?2
#END
addTransaction=INSERT INTO  oc_g2apay_order_transaction  SET  g2apay_order_id  = ?1, date_added  = now(),  type  = ?2,  amount  = ?3
#END
getTotalReleased=SELECT SUM( amount ) AS  total  FROM  oc_g2apay_order_transaction  WHERE  g2apay_order_id  = ?1 AND (type = 'payment' OR type = 'refund')
#END
