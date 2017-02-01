getZonesByCountryId=SELECT * FROM oc_zone WHERE country_id = ?1 AND status = '1' ORDER BY name
#END
getZone=SELECT * FROM oc_zone WHERE zone_id = ?1 AND status = '1'
#END
