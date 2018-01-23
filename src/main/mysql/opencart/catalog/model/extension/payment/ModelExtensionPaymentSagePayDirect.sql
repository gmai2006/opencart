ModelExtensionPaymentSagePayDirect.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentSagePayDirect.getCards.getCards=SELECT * FROM oc_sagepay_direct_card WHERE customer_id = 'param0' ORDER BY card_id
#END
ModelExtensionPaymentSagePayDirect.getCard.getCard=SELECT * FROM oc_sagepay_direct_card WHERE (card_id = 'param0' OR token = 'param1') AND customer_id = 'param2'
#END
ModelExtensionPaymentSagePayDirect.getOrder.getOrder=SELECT * FROM "oc_sagepay_direct_order" WHERE "order_id" = 'param0' LIMIT 1
#END
ModelExtensionPaymentSagePayDirect.getTransactions.getTransactions=SELECT * FROM "oc_sagepay_direct_order_transaction" WHERE "sagepay_direct_order_id" = 'param0'
#END
ModelExtensionPaymentSagePayDirect.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_sagepay_direct_order_recurring WHERE order_recurring_id = 'param0'
#END
ModelExtensionPaymentSagePayDirect.getProfile.getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = param0
#END
