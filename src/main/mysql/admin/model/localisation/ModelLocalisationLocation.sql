deleteLocation=DELETE FROM oc_location WHERE location_id = ?1
#END
getLocation=SELECT DISTINCT * FROM oc_location WHERE location_id = ?1
#END
editLocation=UPDATE oc_location SET name = ?1, address = ?2, geocode = ?3, telephone = ?4, fax = ?5, image = ?6, open = ?7, comment = ?8 WHERE location_id = ?9
#END
addLocation=INSERT INTO oc_location SET name = ?1, address = ?2, geocode = ?3, telephone = ?4, fax = ?5, image = ?6, open = ?7, comment = ?8
#END
getTotalLocations=SELECT COUNT(*) AS total FROM oc_location
#END
