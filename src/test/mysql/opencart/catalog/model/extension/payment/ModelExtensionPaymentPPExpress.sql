ModelExtensionPaymentPPExpress.getMethod.getMethod=SELECT  *   FROM "oc_zone_to_geo_zone"
#END
ModelExtensionPaymentPPExpress.getTotalCaptured.getTotalCaptured=SELECT  *   FROM "oc_paypal_order_transaction"
#END
ModelExtensionPaymentPPExpress.getTotalRefunded.getTotalRefunded=SELECT  *   FROM "oc_paypal_order_transaction"
#END
ModelExtensionPaymentPPExpress.getTransactionRow.getTransactionRow=SELECT  *   FROM "oc_paypal_order_transaction" "pt" LEFT JOIN "oc_paypal_order" "po" ON "pt"."paypal_order_id" = "po"."paypal_order_id"
#END
