getManufacturer=SELECT * FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON (m.manufacturer_id = m2s.manufacturer_id) WHERE m.manufacturer_id = ?1 AND m2s.store_id = ?2
#END
getManufacturers=SELECT * FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON (m.manufacturer_id = m2s.manufacturer_id) WHERE m2s.store_id = ?1 ORDER BY name
#END
