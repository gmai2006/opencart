ModelExtensionOpenBayAmazonusProduct.linkItems.linkItems=SELECT "var" FROM "oc_amazonus_product" WHERE "sku" = 'param0' AND "product_id" = 'param1'
#END
ModelExtensionOpenBayAmazonusProduct.setSubmitError.setSubmitError=SELECT "sku" FROM "oc_amazonus_product" WHERE "insertion_id" = 'param0'
#END
ModelExtensionOpenBayAmazonusProduct.linkProduct.linkProduct=SELECT COUNT(*) as 'count' FROM "oc_amazonus_product_link" WHERE "product_id" = 'param0' AND "amazonus_sku" = 'param1' AND "var" = 'param2' LIMIT 1
#END
