hasAddress=SELECT * FROM  oc_order  WHERE  order_id  = ?1 AND payment_firstname != '' AND payment_address_1 != '' AND payment_country != ''
#END
getOrderLines=SELECT * FROM  oc_ebay_transaction  WHERE  order_id  = ?1
#END
delete3=DELETE FROM  oc_order_history  WHERE  order_id  = ?1
#END
delete4=DELETE FROM  oc_order_total  WHERE  order_id  = ?1
#END
update=UPDATE  oc_order  SET order_status_id = ?1, date_modified = NOW() WHERE order_id = ?2
#END
delete1=DELETE FROM  oc_order_product  WHERE  order_id  = ?1
#END
delete=DELETE FROM  oc_order  WHERE  order_id  = ?1 LIMIT 1
#END
delete2=DELETE FROM  oc_order_option  WHERE  order_id  = ?1
#END
updatePaymentDetails=UPDATE  oc_order  SET  payment_method  = ?1,  total  = ?2,  date_modified  = NOW() WHERE  order_id  = ?3
#END
update1=INSERT INTO oc_order_history SET order_id = ?1, order_status_id = ?2, notify = ?3, comment = ?4, date_added = NOW()
#END
update2=SELECT * FROM oc_order_status WHERE order_status_id = ?1 AND language_id = ?2
#END
getCountryAddressFormat=SELECT * FROM  oc_country  WHERE  iso_code_2  = ?1 LIMIT 1
#END
getHistory=SELECT  order_status_id  FROM  oc_order_history  WHERE  order_id  = ?1
#END
confirm3=SELECT * FROM  oc_order_total  WHERE  order_id  = ?1 ORDER BY sort_order ASC
#END
confirm2=SELECT * FROM  oc_order_product  WHERE  order_id  = ?1
#END
lockAdd=INSERT INTO oc_ebay_order_lock  SET  smp_id  = ?1
#END
confirm1=INSERT INTO oc_order_history SET order_id = ?1, order_status_id = ?2, notify = ?3, comment = ?4, date_added = NOW()
#END
confirm6=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
confirm5=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
confirm4=SELECT * FROM  oc_order_status  WHERE  order_status_id  = ?1 AND  language_id  = ?2
#END
addOrderLine3=UPDATE  oc_ebay_transaction  SET  containing_order_id  = ?1,  modified  = now() WHERE  txn_id  = ?2 AND  item_id  = ?3 LIMIT 1
#END
modifyStock1=UPDATE  oc_product  SET  quantity  = ( quantity  ?1 ?2) WHERE  product_id  = ?3 AND subtract = '1'
#END
addOrderLine1=UPDATE  oc_ebay_transaction  SET  order_id  = ?1,  modified  = now() WHERE  txn_id  = ?2 AND  item_id  = ?3 LIMIT 1
#END
lockExists=SELECT * FROM  oc_ebay_order_lock  WHERE  smp_id  = ?1 LIMIT 1
#END
addOrderLine2=UPDATE  oc_ebay_transaction  SET  smp_id  = ?1,  modified  = now() WHERE  txn_id  = ?2 AND  item_id  = ?3 LIMIT 1
#END
addOrderHistory=SELECT * FROM  oc_product  WHERE  product_id  = ?1 LIMIT 1
#END
addOrderLine=
					INSERT INTO  oc_ebay_transaction 
					SET
					 order_id                   = ?1,
					 txn_id                     = ?2,
					 item_id                    = ?3,
					 product_id                 = ?4,
					 containing_order_id        = ?5,
					 order_line_id              = ?6,
					 qty                        = ?7,
					 smp_id                     = ?8,
					 sku                        = ?9,
					created                   = now(),
					modified                  = now()
				
#END
orderLinkCreate=INSERT INTO  oc_ebay_order  SET  order_id  = ?1,  smp_id  = ?2, parent_ebay_order_id = 0
#END
confirm=UPDATE  oc_order  SET order_status_id = ?1, date_modified = NOW() WHERE order_id = ?2
#END
modifyStock=UPDATE  oc_product_option_variant  SET  stock  = ( stock  ?1 ?2) WHERE  sku  = ?3 AND  product_id  = ?4 AND subtract = '1'
#END
lockDelete=DELETE FROM  oc_ebay_order_lock  WHERE  smp_id  = ?1
#END
getOrderLine=SELECT * FROM  oc_ebay_transaction  WHERE  txn_id  = ?1 AND  item_id  = ?2 LIMIT 1
#END
removeOrderLine=DELETE FROM  oc_ebay_transaction  WHERE  txn_id  = ?1 AND  item_id  = ?2 LIMIT 1
#END
