install1=
			CREATE TABLE IF NOT EXISTS  oc_eway_transactions (
			  eway_order_transaction_id int(11) NOT NULL AUTO_INCREMENT,
			  eway_order_id int(11) NOT NULL,
			  transaction_id VARCHAR(24) NOT NULL,
			  created DATETIME NOT NULL,
			  type ENUM('auth', 'payment', 'refund', 'void') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (eway_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_eway_card (
			  card_id INT(11) NOT NULL AUTO_INCREMENT,
			  customer_id INT(11) NOT NULL,
			  order_id INT(11) NOT NULL,
			  token VARCHAR(50) NOT NULL,
			  digits VARCHAR(4) NOT NULL,
			  expiry VARCHAR(5) NOT NULL,
			  type VARCHAR(50) NOT NULL,
			  PRIMARY KEY (card_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_eway_transactions;
#END
updateTransactionId=UPDATE  oc_eway_order  SET  transaction_id  = ?1 WHERE  eway_order_id  = ?2
#END
getTotalRefunded=SELECT SUM( amount ) AS  total  FROM  oc_eway_transactions  WHERE  eway_order_id  = ?1 AND type = 'refund'
#END
getTransactions=SELECT * FROM  oc_eway_transactions  WHERE  eway_order_id  = ?1
#END
updateRefundStatus=UPDATE  oc_eway_order  SET  refund_status  = ?1 WHERE  eway_order_id  = ?2
#END
updateCaptureStatus=UPDATE  oc_eway_order  SET  capture_status  = ?1 WHERE  eway_order_id  = ?2
#END
updateVoidStatus=UPDATE  oc_eway_order  SET  void_status  = ?1 WHERE  eway_order_id  = ?2
#END
getTotalCaptured=SELECT SUM( amount ) AS  total  FROM  oc_eway_transactions  WHERE  eway_order_id  = ?1 AND type = 'payment' 
#END
addRefundRecord=UPDATE  oc_eway_order  SET  modified  = NOW(), refund_amount = ?1,  refund_transaction_id  = ?2 WHERE eway_order_id = ?3
#END
uninstall=DROP TABLE IF EXISTS  oc_eway_order;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_eway_order (
			  eway_order_id int(11) NOT NULL AUTO_INCREMENT,
			  order_id int(11) NOT NULL,
			  created DATETIME NOT NULL,
			  modified DATETIME NOT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  currency_code CHAR(3) NOT NULL,
			  transaction_id VARCHAR(24) NOT NULL,
			  debug_data TEXT,
			  capture_status INT(1) DEFAULT NULL,
			  void_status INT(1) DEFAULT NULL,
			  refund_status INT(1) DEFAULT NULL,
			  PRIMARY KEY (eway_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
getOrder=SELECT * FROM  oc_eway_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_eway_transactions  SET  eway_order_id  = ?1,  created  = NOW(),  transaction_id  = ?2,  type  = ?3,  amount  = ?4
#END
uninstall2=DROP TABLE IF EXISTS  oc_eway_card;
#END
