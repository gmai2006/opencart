install1=
			CREATE TABLE IF NOT EXISTS  oc_firstdata_remote_order_transaction (
			  firstdata_remote_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  firstdata_remote_order_id INT(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  type ENUM('auth', 'payment', 'refund', 'void') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (firstdata_remote_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_firstdata_remote_card (
			  firstdata_remote_card_id INT(11) NOT NULL AUTO_INCREMENT,
			  customer_id INT(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  digits CHAR(4) NOT NULL,
			  expire_month INT(2) NOT NULL,
			  expire_year INT(2) NOT NULL,
			  card_type CHAR(15) NOT NULL,
			  token CHAR(64) NOT NULL,
			  PRIMARY KEY (firstdata_remote_card_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_firstdata_remote_order_transaction;
#END
getTotalRefunded=SELECT SUM( amount ) AS  total  FROM  oc_firstdata_remote_order_transaction  WHERE  firstdata_remote_order_id  = ?1 AND 'refund'
#END
getTransactions=SELECT * FROM  oc_firstdata_remote_order_transaction  WHERE  firstdata_remote_order_id  = ?1
#END
updateRefundStatus=UPDATE  oc_firstdata_remote_order  SET  refund_status  = ?1 WHERE  firstdata_remote_order_id  = ?2
#END
updateCaptureStatus=UPDATE  oc_firstdata_remote_order  SET  capture_status  = ?1 WHERE  firstdata_remote_order_id  = ?2
#END
updateVoidStatus=UPDATE  oc_firstdata_remote_order  SET  void_status  = ?1 WHERE  firstdata_remote_order_id  = ?2
#END
getTotalCaptured=SELECT SUM( amount ) AS  total  FROM  oc_firstdata_remote_order_transaction  WHERE  firstdata_remote_order_id  = ?1 AND (type = 'payment' OR type = 'refund')
#END
uninstall=DROP TABLE IF EXISTS  oc_firstdata_remote_order;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_firstdata_remote_order (
			  firstdata_remote_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  order_ref CHAR(50) NOT NULL,
			  date_added DATETIME NOT NULL,
			  date_modified DATETIME NOT NULL,
			  tdate VARCHAR(30) NOT NULL,
			  capture_status INT(1) DEFAULT NULL,
			  void_status INT(1) DEFAULT NULL,
			  refund_status INT(1) DEFAULT NULL,
			  currency_code CHAR(3) NOT NULL,
			  authcode VARCHAR(30) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (firstdata_remote_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
getOrder=SELECT * FROM  oc_firstdata_remote_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_firstdata_remote_order_transaction  SET  firstdata_remote_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
uninstall2=DROP TABLE IF EXISTS  oc_firstdata_remote_card;
#END
