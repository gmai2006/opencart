ModelExtensionOpenBayAmazonProduct.linkItems.linkItems=SELECT "var" FROM "oc_amazon_product" WHERE "sku" = 'param0' AND "product_id" = 'param1'
#END
ModelExtensionOpenBayAmazonProduct.setSubmitError.setSubmitError=SELECT "sku" FROM "oc_amazon_product" WHERE "insertion_id" = 'param0'
#END
ModelExtensionOpenBayAmazonProduct.linkProduct.linkProduct=SELECT COUNT(*) as 'count' FROM "oc_amazon_product_link" WHERE "product_id" = 'param0' AND "amazon_sku" = 'param1' AND "var" = 'param2' LIMIT 1
#END
