ModelExtensionPaymentSagePayServer.getMethod.getMethod=SELECT * FROM "oc_zone_to_geo_zone" WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentSagePayServer.getCards.getCards=SELECT * FROM "oc_sagepay_server_card" WHERE customer_id = 'param0'
#END
ModelExtensionPaymentSagePayServer.getCard.getCard=SELECT * FROM oc_sagepay_server_card WHERE (card_id = 'param0' OR token = 'param1') AND customer_id = 'param2'
#END
ModelExtensionPaymentSagePayServer.getOrder.getOrder=SELECT * FROM "oc_sagepay_server_order" WHERE "order_id" = 'param0' OR "VPSTxId" = 'param1' LIMIT 1
#END
ModelExtensionPaymentSagePayServer.getTransactions.getTransactions=SELECT * FROM "oc_sagepay_server_order_transaction" WHERE "sagepay_server_order_id" = 'param0'
#END
ModelExtensionPaymentSagePayServer.getRecurringOrders.getRecurringOrders=SELECT * FROM "oc_order_recurring" WHERE order_id = 'param0'
#END
ModelExtensionPaymentSagePayServer.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_sagepay_server_order_recurring WHERE order_recurring_id = 'param0'
#END
ModelExtensionPaymentSagePayServer.getProfile.getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = param0
#END
