ModelExtensionPaymentFirstdata.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentFirstdata.getOrder.getOrder=SELECT * FROM "oc_firstdata_order" WHERE "order_id" = 'param0' LIMIT 1
#END
ModelExtensionPaymentFirstdata.getStoredCards.getStoredCards=SELECT * FROM "oc_firstdata_card" WHERE "customer_id" = 'param0'
#END
ModelExtensionPaymentFirstdata.storeCard.storeCard=SELECT * FROM "oc_firstdata_card" WHERE "token" = 'param0' AND "customer_id" = 'param1' LIMIT 1
#END
