ModelExtensionPaymentSecureTradingWs.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentSecureTradingWs.getOrder.getOrder=SELECT * FROM "oc_securetrading_ws_order" WHERE "order_id" = 'param0' LIMIT 1
#END
ModelExtensionPaymentSecureTradingWs.getOrderId.getOrderId=SELECT order_id FROM oc_securetrading_ws_order WHERE md = 'param0' LIMIT 1
#END
