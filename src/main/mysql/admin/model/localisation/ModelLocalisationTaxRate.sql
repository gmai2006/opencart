addTaxRate=INSERT INTO oc_tax_rate SET name = ?1, rate = ?2,  type  = ?3, geo_zone_id = ?4, date_added = NOW(), date_modified = NOW()
#END
editTaxRate2=INSERT INTO oc_tax_rate_to_customer_group SET tax_rate_id = ?1, customer_group_id = ?2
#END
getTaxRate=SELECT tr.tax_rate_id, tr.name AS name, tr.rate, tr.type, tr.geo_zone_id, gz.name AS geo_zone, tr.date_added, tr.date_modified FROM oc_tax_rate tr LEFT JOIN oc_geo_zone gz ON (tr.geo_zone_id = gz.geo_zone_id) WHERE tr.tax_rate_id = ?1
#END
editTaxRate1=DELETE FROM oc_tax_rate_to_customer_group WHERE tax_rate_id = ?1
#END
getTaxRateCustomerGroups=SELECT * FROM oc_tax_rate_to_customer_group WHERE tax_rate_id = ?1
#END
editTaxRate=UPDATE oc_tax_rate SET name = ?1, rate = ?2,  type  = ?3, geo_zone_id = ?4, date_modified = NOW() WHERE tax_rate_id = ?5
#END
deleteTaxRate=DELETE FROM oc_tax_rate WHERE tax_rate_id = ?1
#END
getTotalTaxRates=SELECT COUNT(*) AS total FROM oc_tax_rate
#END
deleteTaxRate1=DELETE FROM oc_tax_rate_to_customer_group WHERE tax_rate_id = ?1
#END
addTaxRate1=INSERT INTO oc_tax_rate_to_customer_group SET tax_rate_id = ?1, customer_group_id = ?2
#END
getTotalTaxRatesByGeoZoneId=SELECT COUNT(*) AS total FROM oc_tax_rate WHERE geo_zone_id = ?1
#END
