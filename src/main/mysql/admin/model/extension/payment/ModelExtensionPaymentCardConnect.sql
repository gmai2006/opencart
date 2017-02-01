install1=
			CREATE TABLE IF NOT EXISTS  oc_cardconnect_order (
			  cardconnect_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL DEFAULT '0',
			  customer_id INT(11) NOT NULL DEFAULT '0',
			  payment_method VARCHAR(255) NOT NULL DEFAULT '',
			  retref VARCHAR(12) NOT NULL DEFAULT '',
			  authcode VARCHAR(6) NOT NULL DEFAULT '',
			  currency_code VARCHAR(3) NOT NULL DEFAULT '',
			  total DECIMAL(10, 2) NOT NULL DEFAULT '0.00',
			  date_added DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  PRIMARY KEY (cardconnect_order_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci
#END
getTotalCaptured=SELECT SUM( amount ) AS  total  FROM  oc_cardconnect_order_transaction  WHERE  cardconnect_order_id  = ?1 AND (type = 'payment' OR type = 'refund')
#END
updateTransactionStatusByRetref=UPDATE  oc_cardconnect_order_transaction  SET  status  = ?1,  date_modified  = NOW() WHERE  retref  = ?2
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_cardconnect_order_transaction (
			  cardconnect_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  cardconnect_order_id INT(11) NOT NULL DEFAULT '0',
			  type VARCHAR(50) NOT NULL DEFAULT '',
			  retref VARCHAR(12) NOT NULL DEFAULT '',
			  amount DECIMAL(10, 2) NOT NULL DEFAULT '0.00',
			  status VARCHAR(255) NOT NULL DEFAULT '',
			  date_modified DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  date_added DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  PRIMARY KEY (cardconnect_order_transaction_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci
#END
uninstall1=DROP TABLE IF EXISTS  oc_cardconnect_order
#END
uninstall=DROP TABLE IF EXISTS  oc_cardconnect_card
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_cardconnect_card (
			  cardconnect_card_id INT(11) NOT NULL AUTO_INCREMENT,
			  cardconnect_order_id INT(11) NOT NULL DEFAULT '0',
			  customer_id INT(11) NOT NULL DEFAULT '0',
			  profileid VARCHAR(16) NOT NULL DEFAULT '',
			  token VARCHAR(19) NOT NULL DEFAULT '',
			  type VARCHAR(50) NOT NULL DEFAULT '',
			  account VARCHAR(4) NOT NULL DEFAULT '',
			  expiry VARCHAR(4) NOT NULL DEFAULT '',
			  date_added DATETIME NOT NULL DEFAULT '0000-00-00 00:00:00',
			  PRIMARY KEY (cardconnect_card_id)
			) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci
#END
getOrder=SELECT * FROM  oc_cardconnect_order  WHERE  order_id  = ?1 LIMIT 1
#END
getTransactions=SELECT * FROM  oc_cardconnect_order_transaction  WHERE  cardconnect_order_id  = ?1
#END
addTransaction=INSERT INTO  oc_cardconnect_order_transaction  SET  cardconnect_order_id  = ?1,  type  = ?2,  retref  = ?3,  amount  = ?4,  status  = ?5, date_modified = NOW(), date_added = NOW()
#END
uninstall2=DROP TABLE IF EXISTS  oc_cardconnect_order_transaction
#END
