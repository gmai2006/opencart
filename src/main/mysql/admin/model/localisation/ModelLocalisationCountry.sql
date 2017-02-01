addCountry=INSERT INTO oc_country SET name = ?1, iso_code_2 = ?2, iso_code_3 = ?3, address_format = ?4, postcode_required = ?5, status = ?6
#END
getCountries=SELECT * FROM oc_country ORDER BY name ASC
#END
getCountry=SELECT DISTINCT * FROM oc_country WHERE country_id = ?1
#END
editCountry=UPDATE oc_country SET name = ?1, iso_code_2 = ?2, iso_code_3 = ?3, address_format = ?4, postcode_required = ?5, status = ?6 WHERE country_id = ?7
#END
deleteCountry=DELETE FROM oc_country WHERE country_id = ?1
#END
getTotalCountries=SELECT COUNT(*) AS total FROM oc_country
#END
