ControllerExtensionPaymentPPExpress.expressReturn.getCountryInfo=SELECT * FROM "oc_country" WHERE "iso_code_2" = 'param0' AND "status" = '1' LIMIT 1
#END
ControllerExtensionPaymentPPExpress.expressReturn.getZoneInfo=SELECT * FROM "oc_zone" WHERE ("name" = 'param0' OR "code" = 'param1') AND "status" = '1' AND "country_id" = 'param2'
#END
