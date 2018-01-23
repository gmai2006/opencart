ModelExtensionModuleLaybuyLayout.getTransactionByOrderId.getTransactionByOrderId=SELECT * FROM "oc_laybuy_transaction" WHERE "order_id" = 'param0' ORDER BY "laybuy_ref_no" DESC LIMIT 1
#END
ModelExtensionModuleLaybuyLayout.isLayBuyOrder.isLayBuyOrder=SELECT * FROM "oc_laybuy_transaction" WHERE "order_id" = 'param0'
#END
