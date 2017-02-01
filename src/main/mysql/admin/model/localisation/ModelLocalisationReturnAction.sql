editReturnAction=DELETE FROM oc_return_action WHERE return_action_id = ?1
#END
editReturnAction1=INSERT INTO oc_return_action SET return_action_id = ?1, language_id = ?2, name = ?3
#END
getTotalReturnActions=SELECT COUNT(*) AS total FROM oc_return_action WHERE language_id = ?1
#END
deleteReturnAction=DELETE FROM oc_return_action WHERE return_action_id = ?1
#END
getReturnAction=SELECT * FROM oc_return_action WHERE return_action_id = ?1 AND language_id = ?2
#END
getReturnActions=SELECT return_action_id, name FROM oc_return_action WHERE language_id = ?1 ORDER BY name
#END
getReturnActionDescriptions=SELECT * FROM oc_return_action WHERE return_action_id = ?1
#END
addReturnAction1=INSERT INTO oc_return_action SET language_id = ?1, name = ?2
#END
addReturnAction=INSERT INTO oc_return_action SET return_action_id = ?1, language_id = ?2, name = ?3
#END
