addCustomField4=INSERT INTO oc_custom_field_value_description SET custom_field_value_id = ?1, language_id = ?2, custom_field_id = ?3, name = ?4
#END
editCustomField1=DELETE FROM oc_custom_field_description WHERE custom_field_id = ?1
#END
getCustomFieldValue=SELECT * FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON (cfv.custom_field_value_id = cfvd.custom_field_value_id) WHERE cfv.custom_field_value_id = ?1 AND cfvd.language_id = ?2
#END
editCustomField2=INSERT INTO oc_custom_field_description SET custom_field_id = ?1, language_id = ?2, name = ?3
#END
editCustomField3=DELETE FROM oc_custom_field_customer_group WHERE custom_field_id = ?1
#END
addCustomField=INSERT INTO  oc_custom_field  SET type = ?1, value = ?2, validation = ?3, location = ?4, status = ?5, sort_order = ?6
#END
addCustomField1=INSERT INTO oc_custom_field_description SET custom_field_id = ?1, language_id = ?2, name = ?3
#END
editCustomField4=INSERT INTO oc_custom_field_customer_group SET custom_field_id = ?1, customer_group_id = ?2, required = (int
#END
addCustomField2=INSERT INTO oc_custom_field_customer_group SET custom_field_id = ?1, customer_group_id = ?2, required = (int
#END
editCustomField5=DELETE FROM oc_custom_field_value WHERE custom_field_id = ?1
#END
addCustomField3=INSERT INTO oc_custom_field_value SET custom_field_id = ?1, sort_order = ?2
#END
editCustomField6=DELETE FROM oc_custom_field_value_description WHERE custom_field_id = ?1
#END
editCustomField7=INSERT INTO oc_custom_field_value SET custom_field_value_id = ?1, custom_field_id = ?2, sort_order = ?3
#END
editCustomField8=INSERT INTO oc_custom_field_value SET custom_field_id = ?1, sort_order = ?2
#END
getCustomFieldCustomerGroups=SELECT * FROM  oc_custom_field_customer_group  WHERE custom_field_id = ?1
#END
editCustomField9=INSERT INTO oc_custom_field_value_description SET custom_field_value_id = ?1, language_id = ?2, custom_field_id = ?3, name = ?4
#END
getCustomFieldDescriptions=SELECT * FROM oc_custom_field_description WHERE custom_field_id = ?1
#END
editCustomField=UPDATE  oc_custom_field  SET type = ?1, value = ?2, validation = ?3, location = ?4, status = ?5, sort_order = ?6 WHERE custom_field_id = ?7
#END
deleteCustomField=DELETE FROM  oc_custom_field  WHERE custom_field_id = ?1
#END
getCustomFieldValues=SELECT * FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON (cfv.custom_field_value_id = cfvd.custom_field_value_id) WHERE cfv.custom_field_id = ?1 AND cfvd.language_id = ?2 ORDER BY cfv.sort_order ASC
#END
getCustomFieldValueDescriptions1=SELECT * FROM oc_custom_field_value_description WHERE custom_field_value_id = ?1
#END
getCustomField=SELECT * FROM  oc_custom_field  cf LEFT JOIN oc_custom_field_description cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.custom_field_id = ?1 AND cfd.language_id = ?2
#END
deleteCustomField2=DELETE FROM  oc_custom_field_customer_group  WHERE custom_field_id = ?1
#END
deleteCustomField3=DELETE FROM  oc_custom_field_value  WHERE custom_field_id = ?1
#END
deleteCustomField4=DELETE FROM  oc_custom_field_value_description  WHERE custom_field_id = ?1
#END
deleteCustomField1=DELETE FROM  oc_custom_field_description  WHERE custom_field_id = ?1
#END
getTotalCustomFields=SELECT COUNT(*) AS total FROM  oc_custom_field
#END
getCustomFieldValueDescriptions=SELECT * FROM oc_custom_field_value WHERE custom_field_id = ?1
#END
