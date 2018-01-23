ModelExtensionOpenBayAmazonusOrder.getProductId.getProductId=SELECT "product_id" FROM "oc_amazonus_product_link" WHERE "amazonus_sku" = 'param0'
#END
ModelExtensionOpenBayAmazonusOrder.getProductVar.getProductVar=SELECT "var" FROM "oc_amazonus_product_link" WHERE "amazonus_sku" = 'param0'
#END
ModelExtensionOpenBayAmazonusOrder.getCountryName.getCountryName=SELECT "name" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0'
#END
ModelExtensionOpenBayAmazonusOrder.getCountryId.getCountryId=SELECT "country_id" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0'
#END
ModelExtensionOpenBayAmazonusOrder.getZoneId.getZoneId=SELECT "zone_id" FROM "oc_zone" WHERE LOWER("name") = 'param0'
#END
ModelExtensionOpenBayAmazonusOrder.addAmazonusOrderProducts.addAmazonusOrderProducts=SELECT "order_product_id" FROM "oc_order_product" WHERE "model" = 'param0' AND "order_id" = param1LIMIT 1
#END
ModelExtensionOpenBayAmazonusOrder.getOrderId.getOrderId=SELECT "order_id" FROM "oc_amazonus_order" WHERE "amazonus_order_id" = 'param0' LIMIT 1
#END
ModelExtensionOpenBayAmazonusOrder.getOrderStatus.getOrderStatus=SELECT "order_status_id" FROM "oc_order" WHERE "order_id" = param0
#END
ModelExtensionOpenBayAmazonusOrder.getAmazonusOrderId.getAmazonusOrderId=SELECT "amazonus_order_id" FROM "oc_amazonus_order" WHERE "order_id" = param0 LIMIT 1
#END
ModelExtensionOpenBayAmazonusOrder.getProductOptionsByVar.getProductOptionsByVar=SELECT
				pov.product_option_id,
				pov.product_option_value_id,
				od.name,
				ovd.name as value,
				opt.type
			FROM "oc_product_option_value" as pov,
				 "oc_product_option" as po,
				 "oc_option" as opt,
				 "oc_option_value_description" as ovd,
				 "oc_option_description" as od
			WHERE pov.product_option_value_id = 'param0' AND
				po.product_option_id = pov.product_option_id AND
				opt.option_id = pov.option_id AND
				ovd.option_value_id = pov.option_value_id AND ovd.language_id = 'param1' AND
				od.option_id = pov.option_id AND od.language_id = 'param2'
			
#END
