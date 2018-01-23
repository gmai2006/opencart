ModelCheckoutOrder.getOrder.getOrderQuery=SELECT *, (SELECT os.name FROM "oc_order_status" os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status FROM "oc_order" o WHERE o.order_id = 'param0'
#END
ModelCheckoutOrder.getOrder.getCountryQuery=SELECT * FROM "oc_country" WHERE country_id = 'param0'
#END
ModelCheckoutOrder.getOrder.getZoneQuery=SELECT * FROM "oc_zone" WHERE zone_id = 'param0'
#END
ModelCheckoutOrder.addOrderHistory.getOrderTotalQuery=SELECT * FROM "oc_order_total" WHERE order_id = 'param0' ORDER BY sort_order ASC
#END
ModelCheckoutOrder.addOrderHistory.getOrderProductQuery=SELECT * FROM oc_order_product WHERE order_id = 'param0'
#END
ModelCheckoutOrder.addOrderHistory.getOrderOptionQuery=SELECT * FROM oc_order_option WHERE order_id = 'param0' AND order_product_id = 'param1'
#END
ModelCheckoutOrder.addOrderHistory.getProductQuery=SELECT * FROM oc_order_product WHERE order_id = 'param0'
#END
ModelCheckoutOrder.addOrderHistory.getOptionQuery=SELECT * FROM oc_order_option WHERE order_id = 'param0' AND order_product_id = 'param1'
#END
ModelCheckoutOrder.addOrderHistory.getProductDownloadQuery=SELECT COUNT(*) AS total FROM "oc_product_to_download" WHERE product_id = 'param0'
#END
ModelCheckoutOrder.addOrderHistory.getOrderStatusQuery=SELECT * FROM oc_order_status WHERE order_status_id = 'param0' AND language_id = 'param1'
#END
ModelCheckoutOrder.addOrderHistory.getOrderVoucherQuery=SELECT * FROM oc_order_voucher WHERE order_id = 'param0'
#END
