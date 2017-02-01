addReturnReason1=INSERT INTO oc_return_reason SET language_id = ?1, name = ?2
#END
addReturnReason=INSERT INTO oc_return_reason SET return_reason_id = ?1, language_id = ?2, name = ?3
#END
deleteReturnReason=DELETE FROM oc_return_reason WHERE return_reason_id = ?1
#END
editReturnReason=DELETE FROM oc_return_reason WHERE return_reason_id = ?1
#END
getReturnReasons=SELECT return_reason_id, name FROM oc_return_reason WHERE language_id = ?1 ORDER BY name
#END
getTotalReturnReasons=SELECT COUNT(*) AS total FROM oc_return_reason WHERE language_id = ?1
#END
getReturnReasonDescriptions=SELECT * FROM oc_return_reason WHERE return_reason_id = ?1
#END
editReturnReason1=INSERT INTO oc_return_reason SET return_reason_id = ?1, language_id = ?2, name = ?3
#END
getReturnReason=SELECT * FROM oc_return_reason WHERE return_reason_id = ?1 AND language_id = ?2
#END
