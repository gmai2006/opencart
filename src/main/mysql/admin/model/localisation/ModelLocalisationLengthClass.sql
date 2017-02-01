editLengthClass=UPDATE oc_length_class SET value = ?1 WHERE length_class_id = ?2
#END
editLengthClass1=DELETE FROM oc_length_class_description WHERE length_class_id = ?1
#END
getLengthClass=SELECT * FROM oc_length_class lc LEFT JOIN oc_length_class_description lcd ON (lc.length_class_id = lcd.length_class_id) WHERE lc.length_class_id = ?1 AND lcd.language_id = ?2
#END
editLengthClass2=INSERT INTO oc_length_class_description SET length_class_id = ?1, language_id = ?2, title = ?3, unit = ?4
#END
getLengthClassDescriptionByUnit=SELECT * FROM oc_length_class_description WHERE unit = ?1 AND language_id = ?2
#END
getLengthClassDescriptions=SELECT * FROM oc_length_class_description WHERE length_class_id = ?1
#END
addLengthClass=INSERT INTO oc_length_class SET value = ?1
#END
addLengthClass1=INSERT INTO oc_length_class_description SET length_class_id = ?1, language_id = ?2, title = ?3, unit = ?4
#END
deleteLengthClass1=DELETE FROM oc_length_class_description WHERE length_class_id = ?1
#END
getTotalLengthClasses=SELECT COUNT(*) AS total FROM oc_length_class
#END
deleteLengthClass=DELETE FROM oc_length_class WHERE length_class_id = ?1
#END
getLengthClasses=SELECT * FROM oc_length_class lc LEFT JOIN oc_length_class_description lcd ON (lc.length_class_id = lcd.length_class_id) WHERE lcd.language_id = ?1
#END
