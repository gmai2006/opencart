addGeoZone=INSERT INTO oc_geo_zone SET name = ?1, description = ?2, date_added = NOW()
#END
editGeoZone3=INSERT INTO oc_zone_to_geo_zone SET country_id = ?1, zone_id = ?2, geo_zone_id = ?3, date_added = NOW()
#END
getGeoZone=SELECT DISTINCT * FROM oc_geo_zone WHERE geo_zone_id = ?1
#END
editGeoZone=UPDATE oc_geo_zone SET name = ?1, description = ?2, date_modified = NOW() WHERE geo_zone_id = ?3
#END
getTotalGeoZones=SELECT COUNT(*) AS total FROM oc_geo_zone
#END
editGeoZone1=DELETE FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1
#END
getGeoZones=SELECT * FROM oc_geo_zone ORDER BY name ASC
#END
getTotalZoneToGeoZoneByZoneId=SELECT COUNT(*) AS total FROM oc_zone_to_geo_zone WHERE zone_id = ?1
#END
editGeoZone2=DELETE FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND zone_id = ?3
#END
addGeoZone2=INSERT INTO oc_zone_to_geo_zone SET country_id = ?1, zone_id = ?2, geo_zone_id = ?3, date_added = NOW()
#END
getZoneToGeoZones=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1
#END
getTotalZoneToGeoZoneByGeoZoneId=SELECT COUNT(*) AS total FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1
#END
addGeoZone1=DELETE FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND zone_id = ?3
#END
deleteGeoZone1=DELETE FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1
#END
getTotalZoneToGeoZoneByCountryId=SELECT COUNT(*) AS total FROM oc_zone_to_geo_zone WHERE country_id = ?1
#END
deleteGeoZone=DELETE FROM oc_geo_zone WHERE geo_zone_id = ?1
#END
