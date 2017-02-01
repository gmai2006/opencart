getCategoryFilters=SELECT filter_id FROM oc_category_filter WHERE category_id = ?1
#END
getTotalCategoriesByCategoryId=SELECT COUNT(*) AS total FROM oc_category c LEFT JOIN oc_category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = ?1 AND c2s.store_id = ?2 AND c.status = '1'
#END
getCategoryLayoutId=SELECT * FROM oc_category_to_layout WHERE category_id = ?1 AND store_id = ?2
#END
getCategories=SELECT * FROM oc_category c LEFT JOIN oc_category_description cd ON (c.category_id = cd.category_id) LEFT JOIN oc_category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = ?1 AND cd.language_id = ?2 AND c2s.store_id = ?3  AND c.status = '1' ORDER BY c.sort_order, LCASE(cd.name)
#END
getCategory=SELECT DISTINCT * FROM oc_category c LEFT JOIN oc_category_description cd ON (c.category_id = cd.category_id) LEFT JOIN oc_category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.category_id = ?1 AND cd.language_id = ?2 AND c2s.store_id = ?3 AND c.status = '1'
#END
getCategoryFilters2=SELECT DISTINCT f.filter_id, fd.name FROM oc_filter f LEFT JOIN oc_filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id IN (?1) AND f.filter_group_id = ?2 AND fd.language_id = ?3 ORDER BY f.sort_order, LCASE(fd.name)
#END
getCategoryFilters1=SELECT DISTINCT f.filter_group_id, fgd.name, fg.sort_order FROM oc_filter f LEFT JOIN oc_filter_group fg ON (f.filter_group_id = fg.filter_group_id) LEFT JOIN oc_filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE f.filter_id IN (?1) AND fgd.language_id = ?2 GROUP BY f.filter_group_id ORDER BY fg.sort_order, LCASE(fgd.name)
#END
