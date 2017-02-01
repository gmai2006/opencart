getOrderOptions=SELECT * FROM oc_order_option WHERE order_id = ?1 AND order_product_id = ?2
#END
getOrderHistories=SELECT date_added, os.name AS status, oh.comment, oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = ?1 AND os.language_id = ?2 ORDER BY oh.date_added
#END
getOrderProducts=SELECT * FROM oc_order_product WHERE order_id = ?1
#END
getOrder4=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
getOrderVouchers=SELECT * FROM  oc_order_voucher  WHERE order_id = ?1
#END
getOrder2=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
getOrder3=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
getOrders=SELECT o.order_id, o.firstname, o.lastname, os.name as status, o.date_added, o.total, o.currency_code, o.currency_value FROM  oc_order  o LEFT JOIN oc_order_status os ON (o.order_status_id = os.order_status_id) WHERE o.customer_id = ?1 AND o.order_status_id > '0' AND o.store_id = ?2 AND os.language_id = ?3 ORDER BY o.order_id DESC LIMIT ?4,?5
#END
getOrder1=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
getOrderTotals=SELECT * FROM oc_order_total WHERE order_id = ?1 ORDER BY sort_order
#END
getOrder=SELECT * FROM  oc_order  WHERE order_id = ?1 AND customer_id = ?2 AND order_status_id > '0'
#END
getTotalOrderVouchersByOrderId=SELECT COUNT(*) AS total FROM  oc_order_voucher  WHERE order_id = ?1
#END
getOrderProduct=SELECT * FROM oc_order_product WHERE order_id = ?1 AND order_product_id = ?2
#END
getTotalOrders=SELECT COUNT(*) AS total FROM  oc_order  o WHERE customer_id = ?1 AND o.order_status_id > '0' AND o.store_id = ?2
#END
getTotalOrderProductsByOrderId=SELECT COUNT(*) AS total FROM oc_order_product WHERE order_id = ?1
#END
