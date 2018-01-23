ModelExtensionPaymentAmazonLoginPay.addAddress.addAddress=SELECT * FROM "oc_address" WHERE "firstname" = 'param0' AND "lastname" = 'param1' AND "address_1" = 'param2' AND "address_2" = 'param3' AND "postcode" = 'param4' AND "city" = 'param5' AND "zone_id" = 'param6' AND "country_id" = 'param7'
#END
ModelExtensionPaymentAmazonLoginPay.getOrder.getOrder=SELECT * FROM "oc_amazon_login_pay_order" WHERE "order_id" = 'param0' LIMIT 1
#END
ModelExtensionPaymentAmazonLoginPay.getTransactions.getTransactions=SELECT * FROM "oc_amazon_login_pay_order_transaction" WHERE "amazon_login_pay_order_id" = 'param0'
#END
