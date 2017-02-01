uninstall=DROP TABLE IF EXISTS  oc_klarna_checkout_order;
#END
install=
			CREATE TABLE IF NOT EXISTS  oc_klarna_checkout_order (
			  klarna_checkout_order_id INT(11) NOT NULL AUTO_INCREMENT,
			  order_id INT(11) NOT NULL,
			  order_ref VARCHAR(255) NOT NULL,
			  data text NOT NULL,
			  PRIMARY KEY (klarna_checkout_order_id)
			) ENGINE=MyISAM DEFAULT COLLATE=utf8_general_ci;
#END
getOrder=SELECT * FROM  oc_klarna_checkout_order  WHERE  order_id  = ?1 LIMIT 1
#END
checkForPaymentTaxes=SELECT COUNT(*) AS  total  FROM oc_product p LEFT JOIN oc_tax_rule tr ON (tr.tax_class_id = p.tax_class_id) WHERE tr.based = 'payment'
#END
