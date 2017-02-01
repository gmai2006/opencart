getTransactionByOrderId=SELECT * FROM  oc_laybuy_transaction  WHERE  order_id  = ?1 ORDER BY laybuy_ref_no DESC LIMIT 1
#END
isLayBuyOrder=SELECT * FROM  oc_laybuy_transaction  WHERE  order_id  = ?1
#END
