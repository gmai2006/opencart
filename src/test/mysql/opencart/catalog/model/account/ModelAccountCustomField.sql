ModelAccountCustomField.getCustomField.getCustomField=SELECT  *   FROM "oc_custom_field" cf LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id )
#END
ModelAccountCustomField.getCustomFields.getCustomFieldQuery=SELECT  *   FROM "oc_custom_field_customer_group" cfcg LEFT JOIN "oc_custom_field" cf ON( cfcg.custom_field_id = cf.custom_field_id ) LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id )
#END
ModelAccountCustomField.getCustomFields.getCustomFieldValueQuery=SELECT  *   FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON( cfv.custom_field_value_id = cfvd.custom_field_value_id )
#END
