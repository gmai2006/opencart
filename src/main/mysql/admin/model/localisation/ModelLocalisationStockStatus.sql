addStockStatus=INSERT INTO oc_stock_status SET stock_status_id = ?1, language_id = ?2, name = ?3
#END
editStockStatus1=INSERT INTO oc_stock_status SET stock_status_id = ?1, language_id = ?2, name = ?3
#END
deleteStockStatus=DELETE FROM oc_stock_status WHERE stock_status_id = ?1
#END
addStockStatus1=INSERT INTO oc_stock_status SET language_id = ?1, name = ?2
#END
editStockStatus=DELETE FROM oc_stock_status WHERE stock_status_id = ?1
#END
getStockStatus=SELECT * FROM oc_stock_status WHERE stock_status_id = ?1 AND language_id = ?2
#END
getStockStatuses=SELECT stock_status_id, name FROM oc_stock_status WHERE language_id = ?1 ORDER BY name
#END
getTotalStockStatuses=SELECT COUNT(*) AS total FROM oc_stock_status WHERE language_id = ?1
#END
getStockStatusDescriptions=SELECT * FROM oc_stock_status WHERE stock_status_id = ?1
#END
