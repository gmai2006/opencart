install1=
			CREATE TABLE IF NOT EXISTS  oc_worldpay_order_transaction (
			  worldpay_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  worldpay_order_id INT(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  type ENUM('payment', 'refund') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (worldpay_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_worldpay_order_recurring (
			  worldpay_order_recurring_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  order_recurring_id INT(11) NOT NULL,
			  order_code VARCHAR(50),
			  token VARCHAR(50),
			  date_added DATETIME NOT NULL,
			  date_modified DATETIME NOT NULL,
			  next_payment DATETIME NOT NULL,
			  trial_end datetime DEFAULT NULL,
			  subscription_end datetime DEFAULT NULL,
			  currency_code CHAR(3) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (worldpay_order_recurring_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_worldpay_order_transaction;
#END
getTotalRefunded=SELECT SUM( amount ) AS  total  FROM  oc_worldpay_order_transaction  WHERE  worldpay_order_id  = ?1 AND 'refund'
#END
getTransactions=SELECT * FROM  oc_worldpay_order_transaction  WHERE  worldpay_order_id  = ?1
#END
updateRefundStatus=UPDATE  oc_worldpay_order  SET  refund_status  = ?1 WHERE  worldpay_order_id  = ?2
#END
install3=
			CREATE TABLE IF NOT EXISTS  oc_worldpay_card (
			  card_id INT(11) NOT NULL AUTO_INCREMENT,
			  customer_id INT(11) NOT NULL,
			  order_id INT(11) NOT NULL,
			  token VARCHAR(50) NOT NULL,
			  digits VARCHAR(22) NOT NULL,
			  expiry VARCHAR(5) NOT NULL,
			  type VARCHAR(50) NOT NULL,
			  PRIMARY KEY (card_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall=DROP TABLE IF EXISTS  oc_worldpay_order;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_worldpay_order (
			  worldpay_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  order_code VARCHAR(50),
			  date_added DATETIME NOT NULL,
			  date_modified DATETIME NOT NULL,
			  refund_status INT(1) DEFAULT NULL,
			  currency_code CHAR(3) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (worldpay_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
getOrder=SELECT * FROM  oc_worldpay_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_worldpay_order_transaction  SET  worldpay_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getTotalReleased=SELECT SUM( amount ) AS  total  FROM  oc_worldpay_order_transaction  WHERE  worldpay_order_id  = ?1 AND (type = 'payment' OR type = 'refund')
#END
uninstall2=DROP TABLE IF EXISTS  oc_worldpay_order_recurring;
#END
uninstall3=DROP TABLE IF EXISTS  oc_worldpay_card;
#END
