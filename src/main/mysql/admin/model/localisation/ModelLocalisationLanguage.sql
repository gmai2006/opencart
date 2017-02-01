addLanguage9=SELECT * FROM oc_customer_group_description WHERE language_id = ?1
#END
getLanguages=SELECT * FROM oc_language ORDER BY sort_order, name
#END
addLanguage29=SELECT * FROM oc_order_status WHERE language_id = ?1
#END
addLanguage36=INSERT INTO oc_return_action SET return_action_id = ?1, language_id = ?2, name = ?3
#END
addLanguage37=SELECT * FROM oc_return_reason WHERE language_id = ?1
#END
addLanguage38=INSERT INTO oc_return_reason SET return_reason_id = ?1, language_id = ?2, name = ?3
#END
addLanguage39=SELECT * FROM oc_return_status WHERE language_id = ?1
#END
addLanguage32=INSERT INTO oc_product_description SET product_id = ?1, language_id = ?2, name = ?3, description = ?4, tag = ?5, meta_title = ?6, meta_description = ?7, meta_keyword = ?8
#END
addLanguage33=SELECT * FROM oc_product_attribute WHERE language_id = ?1
#END
addLanguage34=INSERT INTO oc_product_attribute SET product_id = ?1, attribute_id = ?2, language_id = ?3, text = ?4
#END
addLanguage35=SELECT * FROM oc_return_action WHERE language_id = ?1
#END
addLanguage30=INSERT INTO oc_order_status SET order_status_id = ?1, language_id = ?2, name = ?3
#END
addLanguage31=SELECT * FROM oc_product_description WHERE language_id = ?1
#END
addLanguage18=INSERT INTO oc_filter_description SET filter_id = ?1, language_id = ?2, filter_group_id = ?3, name = ?4
#END
addLanguage19=SELECT * FROM oc_filter_group_description WHERE language_id = ?1
#END
getLanguageByCode=SELECT * FROM  oc_language  WHERE code = ?1
#END
addLanguage25=SELECT * FROM oc_option_description WHERE language_id = ?1
#END
addLanguage26=INSERT INTO oc_option_description SET option_id = ?1, language_id = ?2, name = ?3
#END
addLanguage27=SELECT * FROM oc_option_value_description WHERE language_id = ?1
#END
addLanguage28=INSERT INTO oc_option_value_description SET option_value_id = ?1, language_id = ?2, option_id = ?3, name = ?4
#END
addLanguage21=SELECT * FROM oc_information_description WHERE language_id = ?1
#END
addLanguage22=INSERT INTO oc_information_description SET information_id = ?1, language_id = ?2, title = ?3, description = ?4, meta_title = ?5, meta_description = ?6, meta_keyword = ?7
#END
addLanguage23=SELECT * FROM oc_length_class_description WHERE language_id = ?1
#END
addLanguage24=INSERT INTO oc_length_class_description SET length_class_id = ?1, language_id = ?2, title = ?3, unit = ?4
#END
editLanguage=SELECT  code  FROM oc_language WHERE language_id = ?1
#END
addLanguage20=INSERT INTO oc_filter_group_description SET filter_group_id = ?1, language_id = ?2, name = ?3
#END
addLanguage14=INSERT INTO oc_custom_field_value_description SET custom_field_value_id = ?1, language_id = ?2, custom_field_id = ?3, name = ?4
#END
deleteLanguage12=DELETE FROM oc_order_status WHERE language_id = ?1
#END
addLanguage15=SELECT * FROM oc_download_description WHERE language_id = ?1
#END
deleteLanguage13=DELETE FROM oc_product_attribute WHERE language_id = ?1
#END
addLanguage16=INSERT INTO oc_download_description SET download_id = ?1, language_id = ?2, name = ?3
#END
deleteLanguage14=DELETE FROM oc_product_description WHERE language_id = ?1
#END
addLanguage17=SELECT * FROM oc_filter_description WHERE language_id = ?1
#END
deleteLanguage15=DELETE FROM oc_return_action WHERE language_id = ?1
#END
addLanguage10=INSERT INTO oc_customer_group_description SET customer_group_id = ?1, language_id = ?2, name = ?3, description = ?4
#END
addLanguage11=SELECT * FROM oc_custom_field_description WHERE language_id = ?1
#END
addLanguage12=INSERT INTO oc_custom_field_description SET custom_field_id = ?1, language_id = ?2, name = ?3
#END
deleteLanguage10=DELETE FROM oc_option_description WHERE language_id = ?1
#END
getTotalLanguages=SELECT COUNT(*) AS total FROM oc_language
#END
addLanguage13=SELECT * FROM oc_custom_field_value_description WHERE language_id = ?1
#END
deleteLanguage=DELETE FROM oc_language WHERE language_id = ?1
#END
deleteLanguage11=DELETE FROM oc_option_value_description WHERE language_id = ?1
#END
addLanguage50=INSERT INTO oc_banner_image SET banner_id = ?1, language_id = ?2, title = ?3, link = ?4, image = ?5, sort_order = ?6
#END
addLanguage=INSERT INTO oc_language SET name = ?1, code = ?2, locale = ?3, sort_order = ?4, status = ?5
#END
deleteLanguage16=DELETE FROM oc_return_reason WHERE language_id = ?1
#END
deleteLanguage17=DELETE FROM oc_return_status WHERE language_id = ?1
#END
deleteLanguage18=DELETE FROM oc_stock_status WHERE language_id = ?1
#END
deleteLanguage19=DELETE FROM oc_voucher_theme_description WHERE language_id = ?1
#END
getLanguage=SELECT DISTINCT * FROM oc_language WHERE language_id = ?1
#END
deleteLanguage9=DELETE FROM oc_length_class_description WHERE language_id = ?1
#END
deleteLanguage8=DELETE FROM oc_information_description WHERE language_id = ?1
#END
deleteLanguage7=DELETE FROM oc_filter_group_description WHERE language_id = ?1
#END
editLanguage2=UPDATE oc_setting SET value = ?1 WHERE  key  = 'config_language' AND value = ?2
#END
deleteLanguage6=DELETE FROM oc_filter_description WHERE language_id = ?1
#END
editLanguage3=UPDATE oc_setting SET value = ?1 WHERE  key  = 'config_admin_language' AND value = ?2
#END
deleteLanguage5=DELETE FROM oc_download_description WHERE language_id = ?1
#END
deleteLanguage4=DELETE FROM oc_customer_group_description WHERE language_id = ?1
#END
deleteLanguage3=DELETE FROM oc_category_description WHERE language_id = ?1
#END
addLanguage47=SELECT * FROM oc_recurring_description WHERE language_id = ?1
#END
deleteLanguage2=DELETE FROM oc_attribute_group_description WHERE language_id = ?1
#END
addLanguage48=INSERT INTO oc_recurring_description SET recurring_id = ?1, language_id = ?2, name = ?3
#END
deleteLanguage1=DELETE FROM oc_attribute_description WHERE language_id = ?1
#END
addLanguage49=SELECT * FROM oc_banner_image WHERE language_id = ?1
#END
editLanguage1=UPDATE oc_language SET name = ?1, code = ?2, locale = ?3, sort_order = ?4, status = ?5 WHERE language_id = ?6
#END
addLanguage43=SELECT * FROM oc_voucher_theme_description WHERE language_id = ?1
#END
addLanguage44=INSERT INTO oc_voucher_theme_description SET voucher_theme_id = ?1, language_id = ?2, name = ?3
#END
deleteLanguage20=DELETE FROM oc_weight_class_description WHERE language_id = ?1
#END
addLanguage45=SELECT * FROM oc_weight_class_description WHERE language_id = ?1
#END
deleteLanguage21=DELETE FROM oc_recurring_description WHERE language_id = ?1
#END
addLanguage46=INSERT INTO oc_weight_class_description SET weight_class_id = ?1, language_id = ?2, title = ?3, unit = ?4
#END
deleteLanguage22=DELETE FROM oc_banner_image WHERE language_id = ?1
#END
addLanguage8=INSERT INTO oc_category_description SET category_id = ?1, language_id = ?2, name = ?3, description = ?4, meta_title = ?5, meta_description = ?6, meta_keyword = ?7
#END
addLanguage7=SELECT * FROM oc_category_description WHERE language_id = ?1
#END
addLanguage40=INSERT INTO oc_return_status SET return_status_id = ?1, language_id = ?2, name = ?3
#END
addLanguage6=INSERT INTO oc_banner_image SET banner_id = ?1, language_id = ?2, title = ?3, link = ?4, image = ?5, sort_order = ?6
#END
addLanguage41=SELECT * FROM oc_stock_status WHERE language_id = ?1
#END
addLanguage5=SELECT * FROM oc_banner_image WHERE language_id = ?1
#END
addLanguage42=INSERT INTO oc_stock_status SET stock_status_id = ?1, language_id = ?2, name = ?3
#END
addLanguage4=INSERT INTO oc_attribute_group_description SET attribute_group_id = ?1, language_id = ?2, name = ?3
#END
addLanguage3=SELECT * FROM oc_attribute_group_description WHERE language_id = ?1
#END
addLanguage2=INSERT INTO oc_attribute_description SET attribute_id = ?1, language_id = ?2, name = ?3
#END
addLanguage1=SELECT * FROM oc_attribute_description WHERE language_id = ?1
#END
