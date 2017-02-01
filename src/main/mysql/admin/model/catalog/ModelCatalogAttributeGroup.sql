addAttributeGroup1=INSERT INTO oc_attribute_group_description SET attribute_group_id = ?1, language_id = ?2, name = ?3
#END
getAttributeGroupDescriptions=SELECT * FROM oc_attribute_group_description WHERE attribute_group_id = ?1
#END
getAttributeGroup=SELECT * FROM oc_attribute_group WHERE attribute_group_id = ?1
#END
getTotalAttributeGroups=SELECT COUNT(*) AS total FROM oc_attribute_group
#END
editAttributeGroup=UPDATE oc_attribute_group SET sort_order = ?1 WHERE attribute_group_id = ?2
#END
deleteAttributeGroup=DELETE FROM oc_attribute_group WHERE attribute_group_id = ?1
#END
addAttributeGroup=INSERT INTO oc_attribute_group SET sort_order = ?1
#END
deleteAttributeGroup1=DELETE FROM oc_attribute_group_description WHERE attribute_group_id = ?1
#END
editAttributeGroup2=INSERT INTO oc_attribute_group_description SET attribute_group_id = ?1, language_id = ?2, name = ?3
#END
editAttributeGroup1=DELETE FROM oc_attribute_group_description WHERE attribute_group_id = ?1
#END
