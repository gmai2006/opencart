editLayout4=INSERT INTO oc_layout_module SET layout_id = ?1, code = ?2, position = ?3, sort_order = ?4
#END
getLayoutRoutes=SELECT * FROM oc_layout_route WHERE layout_id = ?1
#END
addLayout2=INSERT INTO oc_layout_module SET layout_id = ?1, code = ?2, position = ?3, sort_order = ?4
#END
addLayout1=INSERT INTO oc_layout_route SET layout_id = ?1, store_id = ?2, route = ?3
#END
deleteLayout=DELETE FROM oc_layout WHERE layout_id = ?1
#END
deleteLayout5=DELETE FROM oc_information_to_layout WHERE layout_id = ?1
#END
deleteLayout4=DELETE FROM oc_product_to_layout WHERE layout_id = ?1
#END
getLayoutModules=SELECT * FROM oc_layout_module WHERE layout_id = ?1 ORDER BY position ASC, sort_order ASC
#END
deleteLayout3=DELETE FROM oc_category_to_layout WHERE layout_id = ?1
#END
deleteLayout2=DELETE FROM oc_layout_module WHERE layout_id = ?1
#END
getLayout=SELECT DISTINCT * FROM oc_layout WHERE layout_id = ?1
#END
deleteLayout1=DELETE FROM oc_layout_route WHERE layout_id = ?1
#END
editLayout=UPDATE oc_layout SET name = ?1 WHERE layout_id = ?2
#END
getTotalLayouts=SELECT COUNT(*) AS total FROM oc_layout
#END
addLayout=INSERT INTO oc_layout SET name = ?1
#END
editLayout1=DELETE FROM oc_layout_route WHERE layout_id = ?1
#END
editLayout3=DELETE FROM oc_layout_module WHERE layout_id = ?1
#END
editLayout2=INSERT INTO oc_layout_route SET layout_id = ?1, store_id = ?2, route = ?3
#END
