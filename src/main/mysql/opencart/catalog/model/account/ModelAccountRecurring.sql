ModelAccountRecurring.getOrderRecurring.getOrderRecurring=SELECT "or".*,"o"."payment_method","o"."payment_code","o"."currency_code" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "or"."order_recurring_id" = 'param0' AND "o"."customer_id" = 'param1'
#END
ModelAccountRecurring.getOrderRecurrings.getOrderRecurrings=SELECT "or".*,"o"."payment_method","o"."currency_id","o"."currency_value" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' ORDER BY "o"."order_id" DESC LIMIT param1,param2
#END
ModelAccountRecurring.getOrderRecurringByReference.getOrderRecurringByReference=SELECT * FROM "oc_order_recurring" WHERE "reference" = 'param0'
#END
ModelAccountRecurring.getOrderRecurringTransactions.getOrderRecurringTransactions=SELECT * FROM "oc_order_recurring_transaction" WHERE "order_recurring_id" = 'param0'
#END
ModelAccountRecurring.getTotalOrderRecurrings.getTotalOrderRecurrings=SELECT COUNT(*) AS total FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0'
#END
