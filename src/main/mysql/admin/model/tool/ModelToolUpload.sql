getUploadByCode=SELECT * FROM oc_upload WHERE code = ?1
#END
addUpload=INSERT INTO  oc_upload  SET  name  = ?1,  filename  = ?2,  code  = ?3, date_added = NOW()
#END
getUpload=SELECT * FROM  oc_upload  WHERE upload_id = ?1
#END
deleteUpload=DELETE FROM oc_upload WHERE upload_id = ?1
#END
