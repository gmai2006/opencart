getZonesByCountryId=SELECT * FROM oc_zone WHERE country_id = ?1 AND status = '1' ORDER BY name
#END
addZone=INSERT INTO oc_zone SET status = ?1, name = ?2, code = ?3, country_id = ?4
#END
getTotalZonesByCountryId=SELECT COUNT(*) AS total FROM oc_zone WHERE country_id = ?1
#END
getTotalZones=SELECT COUNT(*) AS total FROM oc_zone
#END
deleteZone=DELETE FROM oc_zone WHERE zone_id = ?1
#END
editZone=UPDATE oc_zone SET status = ?1, name = ?2, code = ?3, country_id = ?4 WHERE zone_id = ?5
#END
getZone=SELECT DISTINCT * FROM oc_zone WHERE zone_id = ?1
#END
