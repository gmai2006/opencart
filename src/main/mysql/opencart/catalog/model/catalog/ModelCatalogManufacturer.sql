ModelCatalogManufacturer.getManufacturer.getManufacturer=SELECT m.manufacturer_id, m.name, m.image, m.sort_order, m2s.manufacturer_id as manufacturer_id0, m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id ) WHERE m.manufacturer_id = 'param0' AND m2s.store_id = 'param1'  
#END
ModelCatalogManufacturer.getManufacturers.getManufacturers=SELECT m.manufacturer_id, m.name, m.image, m.sort_order, m2s.manufacturer_id as manufacturer_id0, m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id ) WHERE m2s.store_id = 'param0' ORDER BY name 
#END
