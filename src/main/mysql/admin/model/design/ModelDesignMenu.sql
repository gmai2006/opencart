deleteMenu=DELETE FROM oc_menu WHERE menu_id = ?1
#END
addMenu1=INSERT INTO oc_menu_description SET menu_id = ?1, language_id = ?2, name = ?3
#END
addMenu=INSERT INTO oc_menu SET store_id = ?1, type = ?2, link = ?3, sort_order = ?4, status = ?5
#END
editMenu3=DELETE FROM oc_menu_module WHERE menu_id = ?1
#END
editMenu4=INSERT INTO oc_menu_description SET menu_id = ?1, language_id = ?2, name = ?3
#END
editMenu1=DELETE FROM oc_menu_description WHERE menu_id = ?1
#END
editMenu2=INSERT INTO oc_menu_description SET menu_id = ?1, language_id = ?2, name = ?3
#END
editMenu=UPDATE oc_menu SET store_id = ?1, type = ?2, link = ?3, sort_order = ?4, status = ?5 WHERE menu_id = ?6
#END
getMenuModules=SELECT * FROM oc_menu_module WHERE menu_id = ?1
#END
deleteMenu2=DELETE FROM oc_menu_module WHERE menu_id = ?1
#END
getMenuDescriptions=SELECT * FROM oc_menu_description WHERE menu_id = ?1
#END
getTotalMenus=SELECT COUNT(*) AS total FROM oc_menu
#END
getMenu=SELECT DISTINCT * FROM oc_menu WHERE menu_id = ?1
#END
deleteMenu1=DELETE FROM oc_menu_description WHERE menu_id = ?1
#END
