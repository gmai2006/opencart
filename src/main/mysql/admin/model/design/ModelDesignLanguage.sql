editTranslation1=INSERT INTO oc_translation SET store_id = ?1, language_id = ?2, route = ?3,  key  = ?4, value = ?5
#END
editTranslation=DELETE FROM oc_translation  WHERE route = ?1
#END
getTotalTranslations=SELECT COUNT(*) AS total FROM oc_translation WHERE store_id = ?1 AND language_id = ?2 AND route = ?3
#END
getTranslations=SELECT * FROM oc_translation WHERE store_id = ?1 AND language_id = ?2 AND route = ?3
#END
