install1=
				CREATE TABLE IF NOT EXISTS  oc_fba_order_fulfillment (
					fba_order_fulfillment_id INT(11) NOT NULL AUTO_INCREMENT,
					order_id INT(11) NOT NULL,
				    created DATETIME NOT NULL,
					request_body TEXT NOT NULL,
					response_body TEXT NOT NULL,
					response_header_code INT(3) NOT NULL,
					type INT(3) NOT NULL,
					PRIMARY KEY (fba_order_fulfillment_id),
  				    KEY order_id (order_id)
				) ENGINE=InnoDB  DEFAULT CHARSET=latin1;
#END
countFbaOrders=SELECT COUNT(*) AS  total  FROM  oc_fba_order
#END
uninstall=DELETE FROM  oc_setting WHERE code = 'openbay_fba'
#END
install=
				CREATE TABLE IF NOT EXISTS  oc_fba_order (
					order_id INT(11) NOT NULL,
					fba_order_fulfillment_id INT(11) NOT NULL,
					fba_order_fulfillment_ref CHAR(50) NOT NULL,
					status CHAR(10) NOT NULL,
				    created DATETIME NOT NULL,
  				    KEY fba_order_id (order_id)
				) ENGINE=InnoDB  DEFAULT CHARSET=latin1;
#END
