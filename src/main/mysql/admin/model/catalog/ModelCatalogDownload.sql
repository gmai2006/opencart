editDownload=UPDATE oc_download SET filename = ?1, mask = ?2 WHERE download_id = ?3
#END
deleteDownload1=DELETE FROM oc_download_description WHERE download_id = ?1
#END
addDownload=INSERT INTO oc_download SET filename = ?1, mask = ?2, date_added = NOW()
#END
editDownload1=DELETE FROM oc_download_description WHERE download_id = ?1
#END
getTotalDownloads=SELECT COUNT(*) AS total FROM oc_download
#END
getDownloadDescriptions=SELECT * FROM oc_download_description WHERE download_id = ?1
#END
editDownload2=INSERT INTO oc_download_description SET download_id = ?1, language_id = ?2, name = ?3
#END
getDownload=SELECT DISTINCT * FROM oc_download d LEFT JOIN oc_download_description dd ON (d.download_id = dd.download_id) WHERE d.download_id = ?1 AND dd.language_id = ?2
#END
addDownload1=INSERT INTO oc_download_description SET download_id = ?1, language_id = ?2, name = ?3
#END
deleteDownload=DELETE FROM oc_download WHERE download_id = ?1
#END
