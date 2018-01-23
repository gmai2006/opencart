ModelExtensionPaymentG2APay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentG2APay.getG2aOrder.getG2aOrder=SELECT * FROM "oc_g2apay_order" WHERE "order_id" = 'param0' LIMIT 1
#END
