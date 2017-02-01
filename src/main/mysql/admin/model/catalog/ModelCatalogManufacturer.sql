addManufacturer2=INSERT INTO oc_manufacturer_to_store SET manufacturer_id = ?1, store_id = ?2
#END
addManufacturer3=INSERT INTO oc_url_alias SET query = 'manufacturer_id=?1, keyword = ?2
#END
getTotalManufacturers=SELECT COUNT(*) AS total FROM oc_manufacturer
#END
deleteManufacturer=DELETE FROM oc_manufacturer WHERE manufacturer_id = ?1
#END
addManufacturer=INSERT INTO oc_manufacturer SET name = ?1, sort_order = ?2
#END
deleteManufacturer1=DELETE FROM oc_manufacturer_to_store WHERE manufacturer_id = ?1
#END
deleteManufacturer2=DELETE FROM oc_url_alias WHERE query = 'manufacturer_id=?1
#END
editManufacturer1=UPDATE oc_manufacturer SET image = ?1 WHERE manufacturer_id = ?2
#END
editManufacturer2=DELETE FROM oc_manufacturer_to_store WHERE manufacturer_id = ?1
#END
getManufacturer=SELECT DISTINCT *, (SELECT keyword FROM oc_url_alias WHERE query = 'manufacturer_id=?1) AS keyword FROM oc_manufacturer WHERE manufacturer_id = ?2
#END
editManufacturer5=INSERT INTO oc_url_alias SET query = 'manufacturer_id=?1, keyword = ?2
#END
editManufacturer=UPDATE oc_manufacturer SET name = ?1, sort_order = ?2 WHERE manufacturer_id = ?3
#END
editManufacturer3=INSERT INTO oc_manufacturer_to_store SET manufacturer_id = ?1, store_id = ?2
#END
getManufacturerStores=SELECT * FROM oc_manufacturer_to_store WHERE manufacturer_id = ?1
#END
editManufacturer4=DELETE FROM oc_url_alias WHERE query = 'manufacturer_id=?1
#END
addManufacturer1=UPDATE oc_manufacturer SET image = ?1 WHERE manufacturer_id = ?2
#END
