ModelCatalogManufacturer.getManufacturer.getManufacturer=SELECT  *   FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id )
#END
ModelCatalogManufacturer.getManufacturers.getManufacturers=SELECT  *   FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id )
#END
