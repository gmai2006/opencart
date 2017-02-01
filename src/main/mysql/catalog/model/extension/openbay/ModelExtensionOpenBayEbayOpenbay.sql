updateOrderWithConfirmedData=SELECT * FROM  oc_country  WHERE  iso_code_2  = ?1
#END
create2=
								INSERT INTO  oc_order_option 
								SET
								 order_id                   = ?1,
								 order_product_id           = ?2,
								 product_option_id          = ?3,
								 product_option_value_id    = ?4,
								 name                       = ?5,
								 value                      = ?6,
								 type                       = ?7
							
#END
create=INSERT INTO  oc_order  SET
		    store_id                  = ?1,
		    store_name                = ?2,
		    store_url                 = ?3,
		    invoice_prefix            = ?4,
		    comment                   = ?5,
		    total                     = ?6,
		    affiliate_id              = '0',
		    commission                = '0',
		    language_id               = ?7,
		    currency_id               = ?8,
		    currency_code             = ?9,
		    currency_value            = ?10,
		    ip                        = '',
		    date_added                = ?11,
		   date_modified            = NOW(),
		   customer_id              = 0
		
#END
create1=INSERT INTO  oc_order_product  SET
					 order_id             = ?1,
					 product_id           = ?2,
					 name                 = ?3,
					 model                = ?4,
					 quantity             = ?5,
					 price                = ?6,
					 total                = ?7,
					 tax                  = ?8
				
#END
updateOrderWithConfirmedData1=
			UPDATE  oc_order 
			SET
			    customer_id               = ?1,
			    firstname                 = ?2,
			    lastname                  = ?3,
			    email                     = ?4,
			    telephone                 = ?5,
			    shipping_firstname        = ?6,
			    shipping_lastname         = ?7,
			    shipping_address_1        = ?8,
			    shipping_address_2        = ?9,
			    shipping_city             = ?10,
			    shipping_postcode         = ?11,
			    shipping_country          = ?12,
			    shipping_country_id       = ?13,
			    shipping_zone             = ?14,
			    shipping_zone_id          = ?15,
			    shipping_method           = ?16,
			    shipping_address_format   = ?17,
			    payment_firstname         = ?18,
			    payment_lastname          = ?19,
			    payment_address_1         = ?20,
			    payment_address_2         = ?21,
			    payment_city              = ?22,
			    payment_postcode          = ?23,
			    payment_country           = ?24,
			    payment_country_id        = ?25,
			    payment_zone              = ?26,
			    payment_zone_id           = ?27,
			    comment                   = ?28,
			    payment_method            = ?29,
			    payment_address_format    = ?30,
			    total                     = ?31,
			    date_modified             = NOW()
		   WHERE  order_id  = ?32
		   
#END
updateOrderWithConfirmedData2=INSERT INTO  oc_order_total  SET  order_id  = ?1,  code  = ?2,  title  = ?3,  value  = ?4,  sort_order  = ?5
#END
