getQuote1=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = ?1 AND country_id = ?2 AND (zone_id = ?3 OR zone_id = '0')
#END
getQuote=SELECT * FROM oc_geo_zone ORDER BY name
#END
