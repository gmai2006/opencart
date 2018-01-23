ModelAccountOrder.getOrder.getOrderQuery=SELECT * FROM "oc_order" WHERE order_id = 'param0' AND customer_id = 'param1' AND order_status_id > '0'
#END
ModelAccountOrder.getOrder.getCountryQuery=SELECT * FROM "oc_country" WHERE country_id = 'param0'
#END
ModelAccountOrder.getOrder.getZoneQuery=SELECT * FROM "oc_zone" WHERE zone_id = 'param0'
#END
ModelAccountOrder.getOrders.getOrders=SELECT o.order_id, o.firstname, o.lastname, os.name as status, o.date_added, o.total, o.currency_code, o.currency_value FROM "oc_order" o LEFT JOIN oc_order_status os ON (o.order_status_id = os.order_status_id) WHERE o.customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' AND os.language_id = 'param2' ORDER BY o.order_id DESC LIMIT param3,param4
#END
ModelAccountOrder.getOrderProduct.getOrderProduct=SELECT * FROM oc_order_product WHERE order_id = 'param0' AND order_product_id = 'param1'
#END
ModelAccountOrder.getOrderProducts.getOrderProducts=SELECT * FROM oc_order_product WHERE order_id = 'param0'
#END
ModelAccountOrder.getOrderOptions.getOrderOptions=SELECT * FROM oc_order_option WHERE order_id = 'param0' AND order_product_id = 'param1'
#END
ModelAccountOrder.getOrderVouchers.getOrderVouchers=SELECT * FROM "oc_order_voucher" WHERE order_id = 'param0'
#END
ModelAccountOrder.getOrderTotals.getOrderTotals=SELECT * FROM oc_order_total WHERE order_id = 'param0' ORDER BY sort_order
#END
ModelAccountOrder.getOrderHistories.getOrderHistories=SELECT date_added, os.name AS status, oh.comment, oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = 'param0' AND os.language_id = 'param1' ORDER BY oh.date_added
#END
ModelAccountOrder.getTotalOrders.getTotalOrders=SELECT COUNT(*) AS total FROM "oc_order" o WHERE customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1'
#END
ModelAccountOrder.getTotalOrderProductsByOrderId.getTotalOrderProductsByOrderId=SELECT COUNT(*) AS total FROM oc_order_product WHERE order_id = 'param0'
#END
ModelAccountOrder.getTotalOrderVouchersByOrderId.getTotalOrderVouchersByOrderId=SELECT COUNT(*) AS total FROM "oc_order_voucher" WHERE order_id = 'param0'
#END
