ModelAccountOrder.getOrder.getOrderQuery=SELECT  *   FROM "oc_order"
#END
ModelAccountOrder.getOrder.getCountryQuery=SELECT  *   FROM "oc_country"
#END
ModelAccountOrder.getOrder.getZoneQuery=SELECT  *   FROM "oc_zone"
#END
ModelAccountOrder.getOrders.getOrders=SELECT  *   FROM "oc_order" o LEFT JOIN oc_order_status os ON( o.order_status_id = os.order_status_id )
#END
ModelAccountOrder.getOrderProduct.getOrderProduct=SELECT  *   FROM oc_order_product
#END
ModelAccountOrder.getOrderProducts.getOrderProducts=SELECT  *   FROM oc_order_product
#END
ModelAccountOrder.getOrderOptions.getOrderOptions=SELECT  *   FROM oc_order_option
#END
ModelAccountOrder.getOrderVouchers.getOrderVouchers=SELECT  *   FROM "oc_order_voucher"
#END
ModelAccountOrder.getOrderTotals.getOrderTotals=SELECT  *   FROM oc_order_total
#END
ModelAccountOrder.getOrderHistories.getOrderHistories=SELECT  *   FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id
#END
ModelAccountOrder.getTotalOrders.getTotalOrders=SELECT  *   FROM "oc_order" o
#END
ModelAccountOrder.getTotalOrderProductsByOrderId.getTotalOrderProductsByOrderId=SELECT  *   FROM oc_order_product
#END
ModelAccountOrder.getTotalOrderVouchersByOrderId.getTotalOrderVouchersByOrderId=SELECT  *   FROM "oc_order_voucher"
#END
