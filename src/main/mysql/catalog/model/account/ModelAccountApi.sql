getApiIps=SELECT * FROM  oc_api_ip  WHERE api_id = ?1
#END
addApiSession=INSERT INTO  oc_api_session  SET api_id = ?1, token = ?2, session_id = ?3, ip = ?4, date_added = NOW(), date_modified = NOW()
#END
getApiByKey=SELECT * FROM  oc_api  WHERE  key  = ?1 AND status = '1'
#END
