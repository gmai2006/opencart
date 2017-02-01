getCountries=SELECT * FROM oc_country WHERE status = '1' ORDER BY name ASC
#END
getCountry=SELECT * FROM oc_country WHERE country_id = ?1 AND status = '1'
#END
