getCustomFields2=SELECT * FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON (cfv.custom_field_value_id = cfvd.custom_field_value_id) WHERE cfv.custom_field_id = ?1 AND cfvd.language_id = ?2 ORDER BY cfv.sort_order ASC
#END
getCustomField=SELECT * FROM  oc_custom_field  cf LEFT JOIN  oc_custom_field_description  cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.status = '1' AND cf.custom_field_id = ?1 AND cfd.language_id = ?2
#END
getCustomFields=SELECT * FROM  oc_custom_field  cf LEFT JOIN  oc_custom_field_description  cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.status = '1' AND cfd.language_id = ?1 AND cf.status = '1' ORDER BY cf.sort_order ASC
#END
getCustomFields1=SELECT * FROM  oc_custom_field_customer_group  cfcg LEFT JOIN  oc_custom_field  cf ON (cfcg.custom_field_id = cf.custom_field_id) LEFT JOIN  oc_custom_field_description  cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.status = '1' AND cfd.language_id = ?1 AND cfcg.customer_group_id = ?2 ORDER BY cf.sort_order ASC
#END
