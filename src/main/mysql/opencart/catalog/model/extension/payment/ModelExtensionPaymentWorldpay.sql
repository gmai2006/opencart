ModelExtensionPaymentWorldpay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentWorldpay.getCards.getCards=SELECT * FROM oc_worldpay_card WHERE customer_id = 'param0'
#END
ModelExtensionPaymentWorldpay.getOrder.getOrder=SELECT * FROM "oc_worldpay_order" WHERE "order_id" = 'param0' LIMIT 1
#END
ModelExtensionPaymentWorldpay.getTransactions.getTransactions=SELECT * FROM "oc_worldpay_order_transaction" WHERE "worldpay_order_id" = 'param0'
#END
ModelExtensionPaymentWorldpay.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_worldpay_order_recurring WHERE order_recurring_id = 'param0'
#END
ModelExtensionPaymentWorldpay.getProfile.getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = param0
#END
ModelExtensionPaymentWorldpay.getWorldpayOrder.getWorldpayOrder=SELECT * FROM oc_worldpay_order WHERE order_code = param0
#END
