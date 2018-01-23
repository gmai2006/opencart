ModelExtensionPaymentCardConnect.getMethod.getMethod=SELECT * FROM "oc_zone_to_geo_zone" WHERE "geo_zone_id" = 'param0' AND "country_id" = 'param1' AND ("zone_id" = 'param2' OR "zone_id" = '0')
#END
ModelExtensionPaymentCardConnect.getCard.getCard=SELECT * FROM "oc_cardconnect_card" WHERE "token" = 'param0' AND "customer_id" = 'param1'
#END
ModelExtensionPaymentCardConnect.getCards.getCards=SELECT * FROM "oc_cardconnect_card" WHERE "customer_id" = 'param0'
#END
