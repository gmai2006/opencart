getTotalCategories=SELECT COUNT(*) AS total FROM  oc_google_base_category_to_category
#END
getCategories=SELECT google_base_category_id, (SELECT name FROM  oc_google_base_category  gbc WHERE gbc.google_base_category_id = gbc2c.google_base_category_id) AS google_base_category, category_id, (SELECT name FROM  oc_category_description  cd WHERE cd.category_id = gbc2c.category_id AND cd.language_id = ?1) AS category FROM  oc_google_base_category_to_category gbc2c ORDER BY google_base_category ASC
#END
