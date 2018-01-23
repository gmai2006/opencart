ModelExtensionPaymentLaybuy.getMethod.getQuery=SELECT * FROM "oc_zone_to_geo_zone" WHERE "geo_zone_id" = 'param0' AND "country_id" = 'param1' AND ("zone_id" = 'param2' OR "zone_id" = '0')
#END
ModelExtensionPaymentLaybuy.getMethod.getProduct=SELECT GROUP_CONCAT("category_id") as "categories" FROM "oc_product_to_category" WHERE "product_id" = 'param0'
#END
ModelExtensionPaymentLaybuy.getPayPalProfileIds.getPayPalProfileIds=SELECT "paypal_profile_id" FROM "oc_laybuy_transaction" WHERE "status" = '1'
#END
ModelExtensionPaymentLaybuy.getRevisedTransaction.getRevisedTransaction=SELECT * FROM "oc_laybuy_revise_request" WHERE "laybuy_revise_request_id" = 'param0'
#END
ModelExtensionPaymentLaybuy.getTransaction.getTransaction=SELECT * FROM "oc_laybuy_transaction" WHERE "laybuy_transaction_id" = 'param0'
#END
ModelExtensionPaymentLaybuy.getTransactionByLayBuyRefId.getTransactionByLayBuyRefId=SELECT * FROM "oc_laybuy_transaction" WHERE "laybuy_ref_no" = 'param0'
#END
