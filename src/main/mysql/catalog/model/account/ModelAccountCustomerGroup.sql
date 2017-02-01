getCustomerGroups=SELECT * FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON (cg.customer_group_id = cgd.customer_group_id) WHERE cgd.language_id = ?1 ORDER BY cg.sort_order ASC, cgd.name ASC
#END
getCustomerGroup=SELECT DISTINCT * FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON (cg.customer_group_id = cgd.customer_group_id) WHERE cg.customer_group_id = ?1 AND cgd.language_id = ?2
#END
