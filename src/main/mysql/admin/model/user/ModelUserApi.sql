deleteApiSession=DELETE FROM  oc_api_session  WHERE api_session_id = ?1
#END
editApi=UPDATE  oc_api  SET name = ?1,  key  = ?2, status = ?3, date_modified = NOW() WHERE api_id = ?4
#END
addApiSession=INSERT INTO  oc_api_session  SET api_id = ?1, token = ?2, date_added = NOW(), date_modified = NOW()
#END
getApiSessions=SELECT * FROM  oc_api_session  WHERE api_id = ?1
#END
addApi=INSERT INTO  oc_api  SET name = ?1,  key  = ?2, status = ?3, date_added = NOW(), date_modified = NOW()
#END
getApi=SELECT * FROM  oc_api  WHERE api_id = ?1
#END
addApiIp=INSERT INTO  oc_api_ip  SET api_id = ?1, ip = ?2
#END
getApiIps=SELECT * FROM  oc_api_ip  WHERE api_id = ?1
#END
deleteApi=DELETE FROM  oc_api  WHERE api_id = ?1
#END
editApi1=DELETE FROM oc_api_ip WHERE api_id = ?1
#END
editApi2=INSERT INTO  oc_api_ip  SET api_id = ?1, ip = ?2
#END
addApi1=INSERT INTO  oc_api_ip  SET api_id = ?1, ip = ?2
#END
getTotalApis=SELECT COUNT(*) AS total FROM  oc_api
#END
