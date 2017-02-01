getTotalStoresByLanguage=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_language' AND  value  = ?1 AND store_id != '0'
#END
getTotalStoresByCountryId=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_country_id' AND  value  = ?1 AND store_id != '0'
#END
getStore=SELECT DISTINCT * FROM oc_store WHERE store_id = ?1
#END
getStores=SELECT * FROM oc_store ORDER BY url
#END
getTotalStoresByCustomerGroupId=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_customer_group_id' AND  value  = ?1 AND store_id != '0'
#END
getTotalStoresByInformationId1=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_checkout_id' AND  value  = ?1 AND store_id != '0'
#END
editStore=UPDATE oc_store SET name = ?1,  url  = ?2,  ssl  = ?3 WHERE store_id = ?4
#END
deleteStore1=DELETE FROM oc_layout_route WHERE store_id = ?1
#END
getTotalStoresByZoneId=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_zone_id' AND  value  = ?1 AND store_id != '0'
#END
addStore=INSERT INTO oc_store SET name = ?1,  url  = ?2,  ssl  = ?3
#END
getTotalStoresByCurrency=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_currency' AND  value  = ?1 AND store_id != '0'
#END
deleteStore=DELETE FROM oc_store WHERE store_id = ?1
#END
getTotalStoresByInformationId=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_account_id' AND  value  = ?1 AND store_id != '0'
#END
addStore2=INSERT INTO oc_layout_route SET layout_id = ?1, route = ?2, store_id = ?3
#END
addStore1=SELECT * FROM oc_layout_route WHERE store_id = '0'
#END
getTotalStoresByOrderStatusId=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_order_status_id' AND  value  = ?1 AND store_id != '0'
#END
getTotalStores=SELECT COUNT(*) AS total FROM oc_store
#END
getTotalStoresByLayoutId=SELECT COUNT(*) AS total FROM oc_setting WHERE  key  = 'config_layout_id' AND  value  = ?1 AND store_id != '0'
#END
