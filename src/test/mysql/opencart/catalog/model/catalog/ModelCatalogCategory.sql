ModelCatalogCategory.getCategory.getCategory=SELECT  *   FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id )
#END
ModelCatalogCategory.getCategories.getCategories=SELECT  *   FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id )
#END
ModelCatalogCategory.getCategoryFilters.getQuery=SELECT  *   FROM oc_category_filter
#END
ModelCatalogCategory.getCategoryFilters.getFilterGroupQuery=SELECT DISTINCT  *   FROM oc_filter f LEFT JOIN oc_filter_group fg ON( f.filter_group_id = fg.filter_group_id ) LEFT JOIN oc_filter_group_description fgd ON( fg.filter_group_id = fgd.filter_group_id )
#END
ModelCatalogCategory.getCategoryFilters.getFilterQuery=SELECT DISTINCT  *   FROM oc_filter f LEFT JOIN oc_filter_description fd ON( f.filter_id = fd.filter_id )
#END
ModelCatalogCategory.getCategoryLayoutId.getCategoryLayoutId=SELECT  *   FROM oc_category_to_layout
#END
ModelCatalogCategory.getTotalCategoriesByCategoryId.getTotalCategoriesByCategoryId=SELECT  *   FROM oc_category c LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id )
#END
