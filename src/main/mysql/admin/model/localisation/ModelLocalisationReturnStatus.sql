addReturnStatus1=INSERT INTO oc_return_status SET language_id = ?1, name = ?2
#END
editReturnStatus=DELETE FROM oc_return_status WHERE return_status_id = ?1
#END
getReturnStatusDescriptions=SELECT * FROM oc_return_status WHERE return_status_id = ?1
#END
getReturnStatus=SELECT * FROM oc_return_status WHERE return_status_id = ?1 AND language_id = ?2
#END
getReturnStatuses=SELECT return_status_id, name FROM oc_return_status WHERE language_id = ?1 ORDER BY name
#END
addReturnStatus=INSERT INTO oc_return_status SET return_status_id = ?1, language_id = ?2, name = ?3
#END
editReturnStatus1=INSERT INTO oc_return_status SET return_status_id = ?1, language_id = ?2, name = ?3
#END
getTotalReturnStatuses=SELECT COUNT(*) AS total FROM oc_return_status WHERE language_id = ?1
#END
deleteReturnStatus=DELETE FROM oc_return_status WHERE return_status_id = ?1
#END
