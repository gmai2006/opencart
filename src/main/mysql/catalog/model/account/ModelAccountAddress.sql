getAddresses=SELECT * FROM oc_address WHERE customer_id = ?1
#END
getAddress2=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
editAddress1=UPDATE oc_customer SET address_id = ?1 WHERE customer_id = ?2
#END
getAddress1=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
addAddress=INSERT INTO oc_address SET customer_id = ?1, firstname = ?2, lastname = ?3, company = ?4, address_1 = ?5, address_2 = ?6, postcode = ?7, city = ?8, zone_id = ?9, country_id = ?10, custom_field = ?11
#END
addAddress1=UPDATE oc_customer SET address_id = ?1 WHERE customer_id = ?2
#END
getAddresses2=SELECT * FROM  oc_zone  WHERE zone_id = ?1
#END
deleteAddress=DELETE FROM oc_address WHERE address_id = ?1 AND customer_id = ?2
#END
getAddress=SELECT DISTINCT * FROM oc_address WHERE address_id = ?1 AND customer_id = ?2
#END
getAddresses1=SELECT * FROM  oc_country  WHERE country_id = ?1
#END
editAddress=UPDATE oc_address SET firstname = ?1, lastname = ?2, company = ?3, address_1 = ?4, address_2 = ?5, postcode = ?6, city = ?7, zone_id = ?8, country_id = ?9, custom_field = ?10 WHERE address_id  = ?11 AND customer_id = ?12
#END
getTotalAddresses=SELECT COUNT(*) AS total FROM oc_address WHERE customer_id = ?1
#END
