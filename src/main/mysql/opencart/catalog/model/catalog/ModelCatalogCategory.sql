ModelCatalogCategory.getCategory.getCategory=SELECT c.category_id, c.image, c.parent_id, c.top, c.column, c.sort_order, c.status, c.date_added, c.date_modified, cd.category_id as category_id0, cd.language_id, cd.name, cd.description, cd.meta_title, cd.meta_description, cd.meta_keyword, c2s.category_id as category_id01, c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id ) WHERE c.category_id = 'param0' AND cd.language_id = 'param1' AND c2s.store_id = 'param2' AND c.status = '1'  
#END
ModelCatalogCategory.getCategories.getCategories=SELECT c.category_id, c.image, c.parent_id, c.top, c.column, c.sort_order, c.status, c.date_added, c.date_modified, cd.category_id as category_id0, cd.language_id, cd.name, cd.description, cd.meta_title, cd.meta_description, cd.meta_keyword, c2s.category_id as category_id01, c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id ) WHERE c.parent_id = 'param0' AND cd.language_id = 'param1' AND c2s.store_id = 'param2' AND c.status = '1' ORDER BY c.sort_order , LCASE( cd.name ) 
#END
ModelCatalogCategory.getCategoryFilters.getQuery=SELECT filter_id FROM oc_category_filter WHERE category_id = 'param0'
#END
ModelCatalogCategory.getCategoryFilters.getFilterGroupQuery=SELECT DISTINCT f.filter_group_id, fgd.name, fg.sort_order FROM oc_filter f LEFT JOIN oc_filter_group fg ON (f.filter_group_id = fg.filter_group_id) LEFT JOIN oc_filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE f.filter_id IN (param0) AND fgd.language_id = 'param1' GROUP BY f.filter_group_id ORDER BY fg.sort_order, LCASE(fgd.name)
#END
ModelCatalogCategory.getCategoryFilters.getFilterQuery=SELECT DISTINCT f.filter_id, fd.name FROM oc_filter f LEFT JOIN oc_filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id IN (param0) AND f.filter_group_id = 'param1' AND fd.language_id = 'param2' ORDER BY f.sort_order, LCASE(fd.name)
#END
ModelCatalogCategory.getCategoryLayoutId.getCategoryLayoutId=SELECT * FROM oc_category_to_layout WHERE category_id = 'param0' AND store_id = 'param1'
#END
ModelCatalogCategory.getTotalCategoriesByCategoryId.getTotalCategoriesByCategoryId=SELECT COUNT(*) AS total FROM oc_category c LEFT JOIN oc_category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = 'param0' AND c2s.store_id = 'param1' AND c.status = '1'
#END
