editWeightClass1=DELETE FROM oc_weight_class_description WHERE weight_class_id = ?1
#END
getTotalWeightClasses=SELECT COUNT(*) AS total FROM oc_weight_class
#END
deleteWeightClass=DELETE FROM oc_weight_class WHERE weight_class_id = ?1
#END
getWeightClassDescriptions=SELECT * FROM oc_weight_class_description WHERE weight_class_id = ?1
#END
deleteWeightClass1=DELETE FROM oc_weight_class_description WHERE weight_class_id = ?1
#END
getWeightClassDescriptionByUnit=SELECT * FROM oc_weight_class_description WHERE unit = ?1 AND language_id = ?2
#END
addWeightClass1=INSERT INTO oc_weight_class_description SET weight_class_id = ?1, language_id = ?2, title = ?3, unit = ?4
#END
editWeightClass2=INSERT INTO oc_weight_class_description SET weight_class_id = ?1, language_id = ?2, title = ?3, unit = ?4
#END
addWeightClass=INSERT INTO oc_weight_class SET value = ?1
#END
editWeightClass=UPDATE oc_weight_class SET value = ?1 WHERE weight_class_id = ?2
#END
getWeightClass=SELECT * FROM oc_weight_class wc LEFT JOIN oc_weight_class_description wcd ON (wc.weight_class_id = wcd.weight_class_id) WHERE wc.weight_class_id = ?1 AND wcd.language_id = ?2
#END
getWeightClasses=SELECT * FROM oc_weight_class wc LEFT JOIN oc_weight_class_description wcd ON (wc.weight_class_id = wcd.weight_class_id) WHERE wcd.language_id = ?1
#END
