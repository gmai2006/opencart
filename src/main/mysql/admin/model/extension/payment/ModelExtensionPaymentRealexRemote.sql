install1=
			CREATE TABLE IF NOT EXISTS  oc_realex_remote_order_transaction (
			  realex_remote_order_transaction_id INT(11) NOT NULL AUTO_INCREMENT,
			  realex_remote_order_id INT(11) NOT NULL,
			  date_added DATETIME NOT NULL,
			  type ENUM('auth', 'payment', 'rebate', 'void') DEFAULT NULL,
			  amount DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (realex_remote_order_transaction_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
updateVoidStatus=UPDATE  oc_realex_remote_order  SET  void_status  = ?1 WHERE  realex_remote_order_id  = ?2
#END
getTotalCaptured=SELECT SUM( amount ) AS  total  FROM  oc_realex_remote_order_transaction  WHERE  realex_remote_order_id  = ?1 AND (type = 'payment' OR type = 'rebate')
#END
updateForRebate=UPDATE  oc_realex_remote_order  SET  order_ref_previous  = '_multisettle_?1,  pasref_previous  = ?2 WHERE  realex_remote_order_id  = ?3 LIMIT 1
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_realex_remote_order (
			  realex_remote_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  order_ref CHAR(50) NOT NULL,
			  order_ref_previous CHAR(50) NOT NULL,
			  pasref VARCHAR(50) NOT NULL,
			  pasref_previous VARCHAR(50) NOT NULL,
			  date_added DATETIME NOT NULL,
			  date_modified DATETIME NOT NULL,
			  capture_status INT(1) DEFAULT NULL,
			  void_status INT(1) DEFAULT NULL,
			  settle_type INT(1) DEFAULT NULL,
			  rebate_status INT(1) DEFAULT NULL,
			  currency_code CHAR(3) NOT NULL,
			  authcode VARCHAR(30) NOT NULL,
			  account VARCHAR(30) NOT NULL,
			  total DECIMAL( 10, 2 ) NOT NULL,
			  PRIMARY KEY (realex_remote_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
updateRebateStatus=UPDATE  oc_realex_remote_order  SET  rebate_status  = ?1 WHERE  realex_remote_order_id  = ?2
#END
getOrder=SELECT * FROM  oc_realex_remote_order  WHERE  order_id  = ?1 LIMIT 1
#END
getTransactions=SELECT * FROM  oc_realex_remote_order_transaction  WHERE  realex_remote_order_id  = ?1
#END
getTotalRebated=SELECT SUM( amount ) AS  total  FROM  oc_realex_remote_order_transaction  WHERE  realex_remote_order_id  = ?1 AND 'rebate'
#END
addTransaction=INSERT INTO  oc_realex_remote_order_transaction  SET  realex_remote_order_id  = ?1,  date_added  = now(),  type  = ?2,  amount  = ?3
#END
updateCaptureStatus=UPDATE  oc_realex_remote_order  SET  capture_status  = ?1 WHERE  realex_remote_order_id  = ?2
#END
