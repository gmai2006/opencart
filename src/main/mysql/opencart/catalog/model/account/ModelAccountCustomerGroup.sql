ModelAccountCustomerGroup.getCustomerGroup.getCustomerGroup=SELECT cg.customer_group_id, cg.approval, cg.sort_order, cgd.customer_group_id as customer_group_id0, cgd.language_id, cgd.name, cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id = cgd.customer_group_id ) WHERE cg.customer_group_id = 'param0' AND cgd.language_id = 'param1'  
#END
ModelAccountCustomerGroup.getCustomerGroups.getCustomerGroups=SELECT cg.customer_group_id, cg.approval, cg.sort_order, cgd.customer_group_id as customer_group_id0, cgd.language_id, cgd.name, cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id = cgd.customer_group_id ) WHERE cgd.language_id = 'param0' ORDER BY cg.sort_order ASC , cgd.name ASC 
#END