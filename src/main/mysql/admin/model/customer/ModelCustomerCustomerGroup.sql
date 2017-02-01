addCustomerGroup=INSERT INTO oc_customer_group SET approval = ?1, sort_order = ?2
#END
getTotalCustomerGroups=SELECT COUNT(*) AS total FROM oc_customer_group
#END
getCustomerGroup=SELECT DISTINCT * FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON (cg.customer_group_id = cgd.customer_group_id) WHERE cg.customer_group_id = ?1 AND cgd.language_id = ?2
#END
deleteCustomerGroup=DELETE FROM oc_customer_group WHERE customer_group_id = ?1
#END
editCustomerGroup=UPDATE oc_customer_group SET approval = ?1, sort_order = ?2 WHERE customer_group_id = ?3
#END
addCustomerGroup1=INSERT INTO oc_customer_group_description SET customer_group_id = ?1, language_id = ?2, name = ?3, description = ?4
#END
editCustomerGroup1=DELETE FROM oc_customer_group_description WHERE customer_group_id = ?1
#END
editCustomerGroup2=INSERT INTO oc_customer_group_description SET customer_group_id = ?1, language_id = ?2, name = ?3, description = ?4
#END
deleteCustomerGroup1=DELETE FROM oc_customer_group_description WHERE customer_group_id = ?1
#END
deleteCustomerGroup2=DELETE FROM oc_product_discount WHERE customer_group_id = ?1
#END
getCustomerGroupDescriptions=SELECT * FROM oc_customer_group_description WHERE customer_group_id = ?1
#END
deleteCustomerGroup3=DELETE FROM oc_product_special WHERE customer_group_id = ?1
#END
deleteCustomerGroup4=DELETE FROM oc_product_reward WHERE customer_group_id = ?1
#END
deleteCustomerGroup5=DELETE FROM oc_tax_rate_to_customer_group WHERE customer_group_id = ?1
#END
