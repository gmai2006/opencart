ModelExtensionPaymentBluePayRedirect.getMethod.getMethod=SELECT * FROM "oc_zone_to_geo_zone" WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentBluePayRedirect.getCards.getCards=SELECT * FROM "oc_bluepay_redirect_card" WHERE customer_id = 'param0'
#END
ModelExtensionPaymentBluePayRedirect.getOrder.getOrder=SELECT * FROM "oc_bluepay_redirect_order" WHERE "order_id" = 'param0' LIMIT 1
#END
ModelExtensionPaymentBluePayRedirect.getTransactions.getTransactions=SELECT * FROM "oc_bluepay_redirect_order_transaction" WHERE "bluepay_redirect_order_id" = 'param0'
#END
