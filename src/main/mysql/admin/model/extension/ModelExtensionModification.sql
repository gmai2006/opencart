enableModification=UPDATE oc_modification SET status = '1' WHERE modification_id = ?1
#END
disableModification=UPDATE oc_modification SET status = '0' WHERE modification_id = ?1
#END
getModificationByCode=SELECT * FROM oc_modification WHERE code = ?1
#END
getModification=SELECT * FROM oc_modification WHERE modification_id = ?1
#END
getTotalModifications=SELECT COUNT(*) AS total FROM oc_modification
#END
addModification=INSERT INTO oc_modification SET code = ?1, name = ?2, author = ?3, version = ?4, link = ?5, xml = ?6, status = ?7, date_added = NOW()
#END
deleteModification=DELETE FROM oc_modification WHERE modification_id = ?1
#END
