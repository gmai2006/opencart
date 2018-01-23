ModelExtensionPaymentPPExpress.getMethod.getMethod=SELECT * FROM "oc_zone_to_geo_zone" WHERE "geo_zone_id" = 'param0' AND "country_id" = 'param1' AND ("zone_id" = 'param2' OR "zone_id" = '0')
#END
ModelExtensionPaymentPPExpress.getTotalCaptured.getTotalCaptured=SELECT SUM("amount") AS "amount" FROM "oc_paypal_order_transaction" WHERE "paypal_order_id" = 'param0' AND "pending_reason" != 'authorization' AND "pending_reason" != 'paymentreview' AND ("payment_status" = 'Partially-Refunded' OR "payment_status" = 'Completed' OR "payment_status" = 'Pending') AND "transaction_entity" = 'payment'
#END
ModelExtensionPaymentPPExpress.getTotalRefunded.getTotalRefunded=SELECT SUM("amount") AS "amount" FROM "oc_paypal_order_transaction" WHERE "paypal_order_id" = 'param0' AND "payment_status" = 'Refunded'
#END
ModelExtensionPaymentPPExpress.getTransactionRow.getTransactionRow=SELECT * FROM "oc_paypal_order_transaction" "pt" LEFT JOIN "oc_paypal_order" "po" ON "pt"."paypal_order_id" = "po"."paypal_order_id"  WHERE "pt"."transaction_id" = 'param0' LIMIT 1
#END
