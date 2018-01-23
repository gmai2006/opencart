ModelAccountRecurring.getOrderRecurring.getOrderRecurring=SELECT  *   FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id"
#END
ModelAccountRecurring.getOrderRecurrings.getOrderRecurrings=SELECT  *   FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id"
#END
ModelAccountRecurring.getOrderRecurringByReference.getOrderRecurringByReference=SELECT  *   FROM "oc_order_recurring"
#END
ModelAccountRecurring.getOrderRecurringTransactions.getOrderRecurringTransactions=SELECT  *   FROM "oc_order_recurring_transaction"
#END
ModelAccountRecurring.getTotalOrderRecurrings.getTotalOrderRecurrings=SELECT  *   FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id"
#END
