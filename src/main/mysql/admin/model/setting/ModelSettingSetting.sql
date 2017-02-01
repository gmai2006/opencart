editSettingValue=UPDATE oc_setting SET  value  = ?1, serialized = '0'  WHERE  code  = ?2 AND  key  = ?3 AND store_id = ?4
#END
editSetting1=INSERT INTO oc_setting SET store_id = ?1,  code  = ?2,  key  = ?3,  value  = ?4
#END
editSettingValue1=UPDATE oc_setting SET  value  = ?1, serialized = '1' WHERE  code  = ?2 AND  key  = ?3 AND store_id = ?4
#END
getSetting=SELECT * FROM oc_setting WHERE store_id = ?1 AND  code  = ?2
#END
editSetting2=INSERT INTO oc_setting SET store_id = ?1,  code  = ?2,  key  = ?3,  value  = ?4, serialized = '1'
#END
editSetting=DELETE FROM  oc_setting  WHERE store_id = ?1 AND  code  = ?2
#END
getSettingValue=SELECT value FROM oc_setting WHERE store_id = ?1 AND  key  = ?2
#END
deleteSetting=DELETE FROM oc_setting WHERE store_id = ?1 AND  code  = ?2
#END
