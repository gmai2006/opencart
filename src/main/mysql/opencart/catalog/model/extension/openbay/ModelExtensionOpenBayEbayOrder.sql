ModelExtensionOpenBayEbayOrder.getOrderLine.getOrderLine=SELECT * FROM "oc_ebay_transaction" WHERE "txn_id" = 'param0' AND "item_id" = 'param1' LIMIT 1
#END
ModelExtensionOpenBayEbayOrder.getOrderLines.getOrderLines=SELECT * FROM "oc_ebay_transaction" WHERE "order_id" = 'param0'
#END
ModelExtensionOpenBayEbayOrder.getHistory.getHistory=SELECT "order_status_id" FROM "oc_order_history" WHERE "order_id" = 'param0'
#END
ModelExtensionOpenBayEbayOrder.hasAddress.hasAddress=SELECT * FROM "oc_order" WHERE "order_id" = 'param0' AND "payment_firstname" != '' AND "payment_address_1" != '' AND "payment_country" != ''
#END
ModelExtensionOpenBayEbayOrder.update.update=SELECT * FROM oc_order_status WHERE order_status_id = 'param0' AND language_id = 'param1'
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderProductQuery=SELECT * FROM "oc_order_product" WHERE "order_id" = 'param0'
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderTotalQuery=SELECT * FROM "oc_order_total" WHERE "order_id" = 'param0' ORDER BY "sort_order" ASC
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderStatusQuery=SELECT * FROM "oc_order_status" WHERE "order_status_id" = 'param0' AND "language_id" = 'param1'
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderOptionQuery=SELECT * FROM oc_order_option WHERE order_id = 'param0' AND order_product_id = 'param1'
#END
ModelExtensionOpenBayEbayOrder.getCountryAddressFormat.getCountryAddressFormat=SELECT * FROM "oc_country" WHERE "iso_code_2" = 'param0' LIMIT 1
#END
ModelExtensionOpenBayEbayOrder.lockExists.lockExists=SELECT * FROM "oc_ebay_order_lock" WHERE "smp_id" = 'param0' LIMIT 1
#END
ModelExtensionOpenBayEbayOrder.addOrderHistory.addOrderHistory=SELECT * FROM "oc_product" WHERE "product_id" = 'param0' LIMIT 1
#END
