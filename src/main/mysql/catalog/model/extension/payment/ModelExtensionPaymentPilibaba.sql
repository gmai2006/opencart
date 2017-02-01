getOrderTaxAmount=SELECT SUM( value ) AS  value  FROM  oc_order_total  WHERE  order_id  = ?1 AND code = 'tax'
#END
addPilibabaOrder=INSERT INTO  oc_pilibaba_order  SET  order_id  = ?1,  amount  = ?2,  fee  = ?3, tracking = '', date_added = NOW()
#END
updateOrderInfo=UPDATE  oc_order  SET  firstname  = ?1,  lastname  = ?2,  email  = ?3,  telephone  = ?4,  payment_firstname  = ?5,  payment_lastname  = ?6,  payment_address_1  = ?7,  payment_city  = ?8,  payment_postcode  = ?9,  payment_country  = ?10,  payment_zone  = ?11,  shipping_firstname  = ?12,  shipping_lastname  = ?13,  shipping_address_1  = ?14,  shipping_city  = ?15,  shipping_postcode  = ?16,  shipping_country  = ?17,  shipping_zone  = ?18,  date_modified  = NOW() WHERE  order_id  = ?19
#END
