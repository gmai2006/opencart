ModelAccountAddress.getAddress.getAddressQuery=SELECT DISTINCT * FROM oc_address WHERE address_id = 'param0' AND customer_id = 'param1'
#END
ModelAccountAddress.getAddress.getCountryQuery=SELECT * FROM "oc_country" WHERE country_id = 'param0'
#END
ModelAccountAddress.getAddress.getZoneQuery=SELECT * FROM "oc_zone" WHERE zone_id = 'param0'
#END
ModelAccountAddress.getAddresses.getQuery=SELECT * FROM oc_address WHERE customer_id = 'param0'
#END
ModelAccountAddress.getAddresses.getCountryQuery=SELECT * FROM "oc_country" WHERE country_id = 'param0'
#END
ModelAccountAddress.getAddresses.getZoneQuery=SELECT * FROM "oc_zone" WHERE zone_id = 'param0'
#END
ModelAccountAddress.getTotalAddresses.getTotalAddresses=SELECT COUNT(*) AS total FROM oc_address WHERE customer_id = 'param0'
#END
