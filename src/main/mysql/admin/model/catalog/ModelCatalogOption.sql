deleteOption1=DELETE FROM oc_option_description WHERE option_id = ?1
#END
getOptionDescriptions=SELECT * FROM oc_option_description WHERE option_id = ?1
#END
deleteOption3=DELETE FROM oc_option_value_description WHERE option_id = ?1
#END
deleteOption2=DELETE FROM oc_option_value WHERE option_id = ?1
#END
getOptionValueDescriptions=SELECT * FROM oc_option_value WHERE option_id = ?1 ORDER BY sort_order
#END
deleteOption=DELETE FROM  oc_option  WHERE option_id = ?1
#END
getOption=SELECT * FROM  oc_option  o LEFT JOIN oc_option_description od ON (o.option_id = od.option_id) WHERE o.option_id = ?1 AND od.language_id = ?2
#END
getOptionValueDescriptions1=SELECT * FROM oc_option_value_description WHERE option_value_id = ?1
#END
editOption=UPDATE  oc_option  SET type = ?1, sort_order = ?2 WHERE option_id = ?3
#END
editOption2=INSERT INTO oc_option_description SET option_id = ?1, language_id = ?2, name = ?3
#END
editOption1=DELETE FROM oc_option_description WHERE option_id = ?1
#END
addOption=INSERT INTO  oc_option  SET type = ?1, sort_order = ?2
#END
editOption6=INSERT INTO oc_option_value SET option_id = ?1, image = ?2, sort_order = ?3
#END
editOption5=INSERT INTO oc_option_value SET option_value_id = ?1, option_id = ?2, image = ?3, sort_order = ?4
#END
editOption4=DELETE FROM oc_option_value_description WHERE option_id = ?1
#END
editOption3=DELETE FROM oc_option_value WHERE option_id = ?1
#END
getOptionValue=SELECT * FROM oc_option_value ov LEFT JOIN oc_option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE ov.option_value_id = ?1 AND ovd.language_id = ?2
#END
getOptionValues=SELECT * FROM oc_option_value ov LEFT JOIN oc_option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE ov.option_id = ?1 AND ovd.language_id = ?2 ORDER BY ov.sort_order, ovd.name
#END
addOption1=INSERT INTO oc_option_description SET option_id = ?1, language_id = ?2, name = ?3
#END
editOption7=INSERT INTO oc_option_value_description SET option_value_id = ?1, language_id = ?2, option_id = ?3, name = ?4
#END
addOption3=INSERT INTO oc_option_value_description SET option_value_id = ?1, language_id = ?2, option_id = ?3, name = ?4
#END
getTotalOptions=SELECT COUNT(*) AS total FROM  oc_option
#END
addOption2=INSERT INTO oc_option_value SET option_id = ?1, image = ?2, sort_order = ?3
#END
