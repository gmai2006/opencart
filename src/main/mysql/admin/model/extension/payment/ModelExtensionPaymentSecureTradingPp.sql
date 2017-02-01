install1=
			CREATE TABLE IF NOT EXISTS  oc_securetrading_pp_order_transaction (
			  securetrading_pp_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  securetrading_pp_order_id INT(11) NOT NULL,
			  created DATETIME NOT NULL,
			  type ENUM('auth', 'payment', 'rebate', 'reversed') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (securetrading_pp_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
uninstall1=DROP TABLE IF EXISTS  oc_securetrading_pp_order_transaction;
#END
getTransactions=SELECT * FROM  oc_securetrading_pp_order_transaction  WHERE  securetrading_pp_order_id  = ?1
#END
getTotalRebated=SELECT SUM( amount ) AS  total  FROM  oc_securetrading_pp_order_transaction  WHERE  securetrading_pp_order_id  = ?1 AND 'rebate'
#END
updateReleaseStatus=UPDATE  oc_securetrading_pp_order  SET  release_status  = ?1 WHERE  securetrading_pp_order_id  = ?2
#END
updateVoidStatus=UPDATE  oc_securetrading_pp_order  SET  void_status  = ?1 WHERE  securetrading_pp_order_id  = ?2
#END
updateForRebate=UPDATE  oc_securetrading_pp_order  SET  order_ref_previous  = '_multisettle_?1 WHERE  securetrading_pp_order_id  = ?2 LIMIT 1
#END
uninstall=DROP TABLE IF EXISTS oc_securetrading_pp_order
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_securetrading_pp_order (
			  securetrading_pp_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  transaction_reference varchar(127) DEFAULT NULL,
			  created DATETIME NOT NULL,
			  modified DATETIME NOT NULL,
			  release_status INT(1) DEFAULT NULL,
			  void_status INT(1) DEFAULT NULL,
			  settle_type INT(1) DEFAULT NULL,
			  rebate_status INT(1) DEFAULT NULL,
			  currency_code CHAR(3) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (securetrading_pp_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
increaseRefundedAmount=UPDATE oc_securetrading_pp_order SET refunded = refunded + ?1 WHERE order_id = ?2
#END
getOrder=SELECT * FROM  oc_securetrading_pp_order  WHERE  order_id  = ?1 LIMIT 1
#END
addTransaction=INSERT INTO  oc_securetrading_pp_order_transaction  SET  securetrading_pp_order_id  = ?1,  created  = now(),  type  = ?2,  amount  = ?3
#END
getTotalReleased=SELECT SUM( amount ) AS  total  FROM  oc_securetrading_pp_order_transaction  WHERE  securetrading_pp_order_id  = ?1 AND (type = 'payment' OR type = 'rebate')
#END
