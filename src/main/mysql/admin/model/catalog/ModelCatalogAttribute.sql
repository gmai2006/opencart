editAttribute1=DELETE FROM oc_attribute_description WHERE attribute_id = ?1
#END
getAttribute=SELECT * FROM oc_attribute a LEFT JOIN oc_attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE a.attribute_id = ?1 AND ad.language_id = ?2
#END
addAttribute=INSERT INTO oc_attribute SET attribute_group_id = ?1, sort_order = ?2
#END
getTotalAttributes=SELECT COUNT(*) AS total FROM oc_attribute
#END
editAttribute=UPDATE oc_attribute SET attribute_group_id = ?1, sort_order = ?2 WHERE attribute_id = ?3
#END
deleteAttribute=DELETE FROM oc_attribute WHERE attribute_id = ?1
#END
deleteAttribute1=DELETE FROM oc_attribute_description WHERE attribute_id = ?1
#END
getTotalAttributesByAttributeGroupId=SELECT COUNT(*) AS total FROM oc_attribute WHERE attribute_group_id = ?1
#END
addAttribute1=INSERT INTO oc_attribute_description SET attribute_id = ?1, language_id = ?2, name = ?3
#END
editAttribute2=INSERT INTO oc_attribute_description SET attribute_id = ?1, language_id = ?2, name = ?3
#END
getAttributeDescriptions=SELECT * FROM oc_attribute_description WHERE attribute_id = ?1
#END
