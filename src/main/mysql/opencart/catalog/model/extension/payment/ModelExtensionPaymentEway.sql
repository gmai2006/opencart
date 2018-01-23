ModelExtensionPaymentEway.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND (zone_id = 'param2' OR zone_id = '0')
#END
ModelExtensionPaymentEway.getCards.getCards=SELECT * FROM oc_eway_card WHERE customer_id = 'param0'
#END
ModelExtensionPaymentEway.checkToken.checkToken=SELECT * FROM oc_eway_card WHERE token_id = 'param0'
#END
