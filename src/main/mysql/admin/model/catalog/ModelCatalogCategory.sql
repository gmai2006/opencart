editCategory10=SELECT * FROM  oc_category_path  WHERE category_id = ?1 ORDER BY level ASC
#END
getCategoryStores=SELECT * FROM oc_category_to_store WHERE category_id = ?1
#END
editCategory17=DELETE FROM oc_category_to_layout WHERE category_id = ?1
#END
editCategory18=INSERT INTO oc_category_to_layout SET category_id = ?1, store_id = ?2, layout_id = ?3
#END
repairCategories=SELECT * FROM oc_category WHERE parent_id = ?1
#END
editCategory15=DELETE FROM oc_category_to_store WHERE category_id = ?1
#END
editCategory16=INSERT INTO oc_category_to_store SET category_id = ?1, store_id = ?2
#END
editCategory13=DELETE FROM oc_category_filter WHERE category_id = ?1
#END
editCategory14=INSERT INTO oc_category_filter SET category_id = ?1, filter_id = ?2
#END
editCategory11=INSERT INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
editCategory12=REPLACE INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
editCategory19=DELETE FROM oc_url_alias WHERE query = 'category_id=?1
#END
editCategory20=INSERT INTO oc_url_alias SET query = 'category_id=?1, keyword = ?2
#END
getCategoryFilters=SELECT * FROM oc_category_filter WHERE category_id = ?1
#END
getCategory=SELECT DISTINCT *, (SELECT GROUP_CONCAT(cd1.name ORDER BY level SEPARATOR '&nbsp;&nbsp;&gt;&nbsp;&nbsp;') FROM oc_category_path cp LEFT JOIN oc_category_description cd1 ON (cp.path_id = cd1.category_id AND cp.category_id != cp.path_id) WHERE cp.category_id = c.category_id AND cd1.language_id = ?1 GROUP BY cp.category_id) AS path, (SELECT DISTINCT keyword FROM oc_url_alias WHERE query = 'category_id=?2) AS keyword FROM oc_category c LEFT JOIN oc_category_description cd2 ON (c.category_id = cd2.category_id) WHERE c.category_id = ?3 AND cd2.language_id = ?4
#END
editCategory=UPDATE oc_category SET parent_id = ?1,  top  = ?2,  column  = ?3, sort_order = ?4, status = ?5, date_modified = NOW() WHERE category_id = ?6
#END
addCategory7=INSERT INTO oc_category_to_store SET category_id = ?1, store_id = ?2
#END
addCategory8=INSERT INTO oc_category_to_layout SET category_id = ?1, store_id = ?2, layout_id = ?3
#END
addCategory9=INSERT INTO oc_url_alias SET query = 'category_id=?1, keyword = ?2
#END
addCategory3=SELECT * FROM  oc_category_path  WHERE category_id = ?1 ORDER BY level ASC
#END
addCategory4=INSERT INTO  oc_category_path  SET  category_id  = ?1,  path_id  = ?2,  level  = ?3
#END
addCategory5=INSERT INTO  oc_category_path  SET  category_id  = ?1,  path_id  = ?2,  level  = ?3
#END
addCategory6=INSERT INTO oc_category_filter SET category_id = ?1, filter_id = ?2
#END
addCategory1=UPDATE oc_category SET image = ?1 WHERE category_id = ?2
#END
getCategoryLayouts=SELECT * FROM oc_category_to_layout WHERE category_id = ?1
#END
addCategory=INSERT INTO oc_category SET parent_id = ?1,  top  = ?2,  column  = ?3, sort_order = ?4, status = ?5, date_modified = NOW(), date_added = NOW()
#END
addCategory2=INSERT INTO oc_category_description SET category_id = ?1, language_id = ?2, name = ?3, description = ?4, meta_title = ?5, meta_description = ?6, meta_keyword = ?7
#END
getCategoryDescriptions=SELECT * FROM oc_category_description WHERE category_id = ?1
#END
repairCategories2=SELECT * FROM  oc_category_path  WHERE category_id = ?1 ORDER BY level ASC
#END
repairCategories1=DELETE FROM  oc_category_path  WHERE category_id = ?1
#END
repairCategories4=REPLACE INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
repairCategories3=INSERT INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
getTotalCategoriesByLayoutId=SELECT COUNT(*) AS total FROM oc_category_to_layout WHERE layout_id = ?1
#END
editCategory9=DELETE FROM  oc_category_path  WHERE category_id = ?1
#END
editCategory8=REPLACE INTO  oc_category_path  SET category_id = ?1,  path_id  = ?2, level = ?3
#END
getCategoryPath=SELECT category_id, path_id, level FROM oc_category_path WHERE category_id = ?1
#END
deleteCategory9=DELETE FROM oc_coupon_category WHERE category_id = ?1
#END
deleteCategory=DELETE FROM oc_category_path WHERE category_id = ?1
#END
getTotalCategories=SELECT COUNT(*) AS total FROM oc_category
#END
editCategory1=UPDATE oc_category SET image = ?1 WHERE category_id = ?2
#END
deleteCategory5=DELETE FROM oc_category_to_store WHERE category_id = ?1
#END
deleteCategory6=DELETE FROM oc_category_to_layout WHERE category_id = ?1
#END
editCategory3=INSERT INTO oc_category_description SET category_id = ?1, language_id = ?2, name = ?3, description = ?4, meta_title = ?5, meta_description = ?6, meta_keyword = ?7
#END
deleteCategory7=DELETE FROM oc_product_to_category WHERE category_id = ?1
#END
editCategory2=DELETE FROM oc_category_description WHERE category_id = ?1
#END
deleteCategory8=DELETE FROM oc_url_alias WHERE query = 'category_id=?1
#END
editCategory5=DELETE FROM  oc_category_path  WHERE category_id = ?1 AND level < ?2
#END
deleteCategory1=SELECT * FROM oc_category_path WHERE path_id = ?1
#END
editCategory4=SELECT * FROM  oc_category_path  WHERE path_id = ?1 ORDER BY level ASC
#END
deleteCategory2=DELETE FROM oc_category WHERE category_id = ?1
#END
editCategory7=SELECT * FROM  oc_category_path  WHERE category_id = ?1 ORDER BY level ASC
#END
deleteCategory3=DELETE FROM oc_category_description WHERE category_id = ?1
#END
editCategory6=SELECT * FROM  oc_category_path  WHERE category_id = ?1 ORDER BY level ASC
#END
deleteCategory4=DELETE FROM oc_category_filter WHERE category_id = ?1
#END
