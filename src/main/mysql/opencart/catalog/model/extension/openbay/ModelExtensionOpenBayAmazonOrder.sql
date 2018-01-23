ModelExtensionOpenBayAmazonOrder.getProductId.getProductId=SELECT "product_id" FROM "oc_amazon_product_link" WHERE "amazon_sku" = 'param0'
#END
ModelExtensionOpenBayAmazonOrder.getProductVar.getProductVar=SELECT "var" FROM "oc_amazon_product_link" WHERE "amazon_sku" = 'param0'
#END
ModelExtensionOpenBayAmazonOrder.getCountryName.getCountryName=SELECT "name" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0'
#END
ModelExtensionOpenBayAmazonOrder.getCountryId.getCountryId=SELECT "country_id" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0'
#END
ModelExtensionOpenBayAmazonOrder.getZoneId.getZoneId=SELECT "zone_id" FROM "oc_zone" WHERE LOWER("name") = 'param0'
#END
ModelExtensionOpenBayAmazonOrder.addAmazonOrderProducts.addAmazonOrderProducts=SELECT "order_product_id" FROM "oc_order_product" WHERE "model" = 'param0' AND "order_id" = param1 LIMIT 1
#END
ModelExtensionOpenBayAmazonOrder.getOrderId.getOrderId=SELECT "order_id" FROM "oc_amazon_order" WHERE "amazon_order_id" = 'param0' LIMIT 1
#END
ModelExtensionOpenBayAmazonOrder.getOrderStatus.getOrderStatus=SELECT "order_status_id" FROM "oc_order" WHERE "order_id" = param0
#END
ModelExtensionOpenBayAmazonOrder.getAmazonOrderId.getAmazonOrderId=SELECT "amazon_order_id" FROM "oc_amazon_order" WHERE "order_id" = param0 LIMIT 1
#END
ModelExtensionOpenBayAmazonOrder.getProductOptionsByVar.getProductOptionsByVar=SELECT
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
