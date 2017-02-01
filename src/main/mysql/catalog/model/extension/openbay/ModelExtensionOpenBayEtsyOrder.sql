lockExists=SELECT * FROM  oc_etsy_order_lock  WHERE  order_id  = ?1 LIMIT 1
#END
updateOrderStatus1=UPDATE  oc_order  SET  order_status_id  = ?1 WHERE  order_id  = ?2
#END
updateOrderStatus=INSERT INTO  oc_order_history  ( order_id ,  order_status_id ,  notify ,  comment ,  date_added ) VALUES (?1, ?2, 0, '', NOW())
#END
updatePaid=UPDATE  oc_etsy_order  SET  paid  = ?1 WHERE  order_id  = ?2
#END
modifyStock=UPDATE  oc_product  SET  quantity  = ( quantity  ?1 ?2) WHERE  product_id  = ?3 AND subtract = '1'
#END
lockDelete=DELETE FROM  oc_etsy_order_lock  WHERE  order_id  = ?1
#END
create4=INSERT INTO  oc_order_total  SET  order_id  = ?1,  code  = ?2,  title  = ?3,  value  = ?4,  sort_order  = ?5
#END
create2=INSERT INTO  oc_order_product  SET
			    order_id 		= ?1,
			    product_id 		= ?2,
			    name 			= ?3,
			    model 			= ?4,
			    quantity 		= ?5,
			    price 			= ?6,
			    total 			= ?7
#END
lockAdd=INSERT INTO oc_etsy_order_lock  SET  order_id  = ?1
#END
create=SELECT * FROM  oc_country  WHERE  iso_code_2  = ?1
#END
create3=INSERT INTO  oc_etsy_order  SET  order_id  = ?1,  receipt_id  = ?2
#END
create1=INSERT INTO  oc_order  SET
		    invoice_prefix            = ?1,
		    store_id                  = ?2,
		    store_name                = ?3,
		    store_url                 = ?4,
		    customer_id               = 0,
		    customer_group_id         = ?5,
		    firstname 				  = ?6,
		    lastname 				  = ?7,
		    email 				  	  = ?8,
		    telephone 				  = '',
		    fax 				  	  = '',
		    payment_firstname 		  = ?9,
		    payment_lastname 		  = ?10,
		    payment_company 		  = '',
		    payment_address_1 		  = ?11,
		    payment_address_2 		  = ?12,
		    payment_city 			  = ?13,
		    payment_postcode 		  = ?14,
		    payment_country 		  = ?15,
		    payment_country_id 		  = ?16,
		    payment_zone 			  = ?17,
		    payment_zone_id 		  = ?18,
		    payment_address_format 	  = ?19,
		    payment_method 	  		  = ?20,
		    payment_code 	  		  = '',
		    shipping_firstname 		  = ?21,
		    shipping_lastname 		  = ?22,
		    shipping_address_1 		  = ?23,
		    shipping_address_2 		  = ?24,
		    shipping_city 			  = ?25,
		    shipping_postcode 		  = ?26,
		    shipping_country 		  = ?27,
		    shipping_country_id 	  = ?28,
		    shipping_zone 			  = ?29,
		    shipping_zone_id 		  = ?30,
		    shipping_address_format   = ?31,
		    shipping_method   		  = '',
		    shipping_code   		  = '',
		    comment                   = ?32,
		    total                     = ?33,
		    order_status_id           = '',
		    affiliate_id           	  = '',
		    commission           	  = '',
		    marketing_id           	  = '',
		    tracking           	  	  = '',
		    language_id               = ?34,
		    currency_id               = ?35,
		    currency_code             = ?36,
		   currency_value           = 1,
		   ip           			  = '',
		   forwarded_ip             = '',
		   user_agent               = '',
		   accept_language          = '',
		   date_added               = NOW(),
		   date_modified            = NOW()
		
#END
updateShipped=UPDATE  oc_etsy_order  SET  shipped  = ?1 WHERE  order_id  = ?2
#END
