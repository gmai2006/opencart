getTotalOrdersByProcessingStatus=SELECT COUNT(*) AS total FROM  oc_order  WHERE ?1
#END
getTotalOrdersByLanguageId=SELECT COUNT(*) AS total FROM  oc_order  WHERE language_id = ?1 AND order_status_id > '0'
#END
getOrderHistories=SELECT oh.date_added, os.name AS status, oh.comment, oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = ?1 AND os.language_id = ?2 ORDER BY oh.date_added ASC LIMIT ?3,?4
#END
getTotalOrdersByCompleteStatus=SELECT COUNT(*) AS total FROM  oc_order  WHERE ?1
#END
getOrderProducts=SELECT * FROM oc_order_product WHERE order_id = ?1
#END
getOrderVoucherByVoucherId=SELECT * FROM  oc_order_voucher  WHERE voucher_id = ?1
#END
deleteOrder7=DELETE FROM  oc_affiliate_transaction  WHERE order_id = ?1
#END
deleteOrder8=DELETE FROM  oc_voucher  WHERE order_id = ?1
#END
deleteOrder9=DELETE FROM  oc_voucher_history  WHERE order_id = ?1
#END
getTotalOrderHistoriesByOrderStatusId=SELECT COUNT(*) AS total FROM oc_order_history WHERE order_status_id = ?1
#END
deleteOrder3=DELETE FROM  oc_order_voucher  WHERE order_id = ?1
#END
createInvoiceNo=SELECT MAX(invoice_no) AS invoice_no FROM  oc_order  WHERE invoice_prefix = ?1
#END
deleteOrder4=DELETE FROM  oc_order_total  WHERE order_id = ?1
#END
deleteOrder5=DELETE FROM  oc_order_history  WHERE order_id = ?1
#END
deleteOrder6=DELETE  or , ort FROM  oc_order_recurring   or ,  oc_order_recurring_transaction   ort  WHERE order_id = ?1 AND ort.order_recurring_id = or.order_recurring_id
#END
getTotalOrdersByOrderStatusId=SELECT COUNT(*) AS total FROM  oc_order  WHERE order_status_id = ?1 AND order_status_id > '0'
#END
getOrderTotals=SELECT * FROM oc_order_total WHERE order_id = ?1 ORDER BY sort_order
#END
deleteOrder1=DELETE FROM  oc_order_product  WHERE order_id = ?1
#END
deleteOrder2=DELETE FROM  oc_order_option  WHERE order_id = ?1
#END
getTotalEmailsByProductsOrdered=SELECT DISTINCT email FROM  oc_order  o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) WHERE (?1) AND o.order_status_id <> '0'
#END
deleteOrder=DELETE FROM  oc_order  WHERE order_id = ?1
#END
getEmailsByProductsOrdered=SELECT DISTINCT email FROM  oc_order  o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) WHERE (?1) AND o.order_status_id <> '0' LIMIT ?2,?3
#END
getTotalOrdersByCurrencyId=SELECT COUNT(*) AS total FROM  oc_order  WHERE currency_id = ?1 AND order_status_id > '0'
#END
getOrderOptions=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
getTotalOrdersByStoreId=SELECT COUNT(*) AS total FROM  oc_order  WHERE store_id = ?1
#END
getOrder4=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
getOrderVouchers=SELECT * FROM oc_order_voucher WHERE order_id = ?1
#END
getOrder5=SELECT * FROM oc_order_product WHERE order_id = ?1
#END
getOrder2=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
getOrder3=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
getTotalOrderHistories=SELECT COUNT(*) AS total FROM oc_order_history WHERE order_id = ?1
#END
getOrder1=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
getOrder=SELECT *, (SELECT CONCAT(c.firstname, ' ', c.lastname) FROM oc_customer c WHERE c.customer_id = o.customer_id) AS customer, (SELECT os.name FROM oc_order_status os WHERE os.order_status_id = o.order_status_id AND os.language_id = ?1) AS order_status FROM  oc_order  o WHERE o.order_id = ?2
#END
createInvoiceNo1=UPDATE  oc_order  SET invoice_no = ?1, invoice_prefix = ?2 WHERE order_id = ?3
#END
