getMarketing=SELECT DISTINCT * FROM oc_marketing WHERE marketing_id = ?1
#END
editMarketing=UPDATE oc_marketing SET name = ?1, description = ?2, code = ?3 WHERE marketing_id = ?4
#END
addMarketing=INSERT INTO oc_marketing SET name = ?1, description = ?2, code = ?3, date_added = NOW()
#END
getMarketingByCode=SELECT DISTINCT * FROM oc_marketing WHERE code = ?1
#END
deleteMarketing=DELETE FROM oc_marketing WHERE marketing_id = ?1
#END
