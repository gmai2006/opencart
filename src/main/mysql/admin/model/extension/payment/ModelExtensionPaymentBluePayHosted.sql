install1=
			CREATE TABLE IF NOT EXISTS  oc_bluepay_hosted_order_transaction (
			  bluepay_hosted_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  bluepay_hosted_order_id INT(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  type ENUM('auth', 'payment', 'rebate', 'void') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (bluepay_hosted_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
install2=
			CREATE TABLE IF NOT EXISTS  oc_bluepay_hosted_card (
			  card_id INT(11) NOT NULL AUTO_INCREMENT,
			  customer_id INT(11) NOT NULL,
			  token VARCHAR(50) NOT NULL,
			  digits VARCHAR(4) NOT NULL,
			  expiry VARCHAR(5) NOT NULL,
			  type VARCHAR(50) NOT NULL,
			  PRIMARY KEY (card_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_bluepay_hosted_order_transaction;
#END
updateTransactionId=UPDATE  oc_bluepay_hosted_order  SET  transaction_id  = ?1 WHERE  bluepay_hosted_order_id  = ?2
#END
getTransactions=SELECT * FROM  oc_bluepay_hosted_order_transaction  WHERE  bluepay_hosted_order_id  = ?1
#END
getTotalRebated=SELECT SUM( amount ) AS  total  FROM  oc_bluepay_hosted_order_transaction  WHERE  bluepay_hosted_order_id  = ?1 AND 'rebate'
#END
updateReleaseStatus=UPDATE  oc_bluepay_hosted_order  SET  release_status  = ?1 WHERE  bluepay_hosted_order_id  = ?2
#END
updateVoidStatus=UPDATE  oc_bluepay_hosted_order  SET  void_status  = ?1 WHERE  bluepay_hosted_order_id  = ?2
#END
uninstall=DROP TABLE IF EXISTS  oc_bluepay_hosted_order;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_bluepay_hosted_order (
			  bluepay_hosted_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  transaction_id VARCHAR(50),
			  date_added DATETIME NOT NULL,
			  date_modified DATETIME NOT NULL,
			  release_status INT(1) DEFAULT 0,
			  void_status INT(1) DEFAULT 0,
			  rebate_status INT(1) DEFAULT 0,
			  currency_code CHAR(3) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (bluepay_hosted_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
updateRebateStatus=UPDATE  oc_bluepay_hosted_order  SET  rebate_status  = ?1 WHERE  bluepay_hosted_order_id  = ?2
#END
getOrder=SELECT * FROM  oc_bluepay_hosted_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_bluepay_hosted_order_transaction  SET  bluepay_hosted_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
getTotalReleased=SELECT SUM( amount ) AS  total  FROM  oc_bluepay_hosted_order_transaction  WHERE  bluepay_hosted_order_id  = ?1 AND (type = 'payment' OR type = 'rebate')
#END
uninstall2=DROP TABLE IF EXISTS  oc_bluepay_hosted_card;
#END
