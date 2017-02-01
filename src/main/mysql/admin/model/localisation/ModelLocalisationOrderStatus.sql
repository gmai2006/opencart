addOrderStatus=INSERT INTO oc_order_status SET order_status_id = ?1, language_id = ?2, name = ?3
#END
getOrderStatuses=SELECT order_status_id, name FROM oc_order_status WHERE language_id = ?1 ORDER BY name
#END
getTotalOrderStatuses=SELECT COUNT(*) AS total FROM oc_order_status WHERE language_id = ?1
#END
editOrderStatus=DELETE FROM oc_order_status WHERE order_status_id = ?1
#END
deleteOrderStatus=DELETE FROM oc_order_status WHERE order_status_id = ?1
#END
getOrderStatus=SELECT * FROM oc_order_status WHERE order_status_id = ?1 AND language_id = ?2
#END
editOrderStatus1=INSERT INTO oc_order_status SET order_status_id = ?1, language_id = ?2, name = ?3
#END
addOrderStatus1=INSERT INTO oc_order_status SET language_id = ?1, name = ?2
#END
getOrderStatusDescriptions=SELECT * FROM oc_order_status WHERE order_status_id = ?1
#END
