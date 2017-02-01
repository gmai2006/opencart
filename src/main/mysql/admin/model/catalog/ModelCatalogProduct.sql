getProductAttributes1=SELECT * FROM oc_product_attribute WHERE product_id = ?1 AND attribute_id = ?2
#END
deleteProduct19=DELETE FROM oc_coupon_product WHERE product_id = ?1
#END
deleteProduct17=DELETE FROM oc_review WHERE product_id = ?1
#END
deleteProduct18=DELETE FROM oc_url_alias WHERE query = 'product_id=?1
#END
deleteProduct15=DELETE FROM oc_product_to_store WHERE product_id = ?1
#END
deleteProduct16=DELETE FROM oc_product_recurring WHERE product_id = ?1
#END
deleteProduct13=DELETE FROM oc_product_to_download WHERE product_id = ?1
#END
deleteProduct14=DELETE FROM oc_product_to_layout WHERE product_id = ?1
#END
getTotalProductsByAttributeId=SELECT COUNT(*) AS total FROM oc_product_attribute WHERE attribute_id = ?1
#END
deleteProduct11=DELETE FROM oc_product_special WHERE product_id = ?1
#END
deleteProduct12=DELETE FROM oc_product_to_category WHERE product_id = ?1
#END
deleteProduct10=DELETE FROM oc_product_reward WHERE product_id = ?1
#END
getProductRewards=SELECT * FROM oc_product_reward WHERE product_id = ?1
#END
deleteProduct1=DELETE FROM oc_product_attribute WHERE product_id = ?1
#END
deleteProduct3=DELETE FROM oc_product_discount WHERE product_id = ?1
#END
deleteProduct2=DELETE FROM oc_product_description WHERE product_id = ?1
#END
getTotalProductsByTaxClassId=SELECT COUNT(*) AS total FROM oc_product WHERE tax_class_id = ?1
#END
getTotalProductsByLengthClassId=SELECT COUNT(*) AS total FROM oc_product WHERE length_class_id = ?1
#END
deleteProduct9=DELETE FROM oc_product_related WHERE related_id = ?1
#END
deleteProduct8=DELETE FROM oc_product_related WHERE product_id = ?1
#END
getProductCategories=SELECT * FROM oc_product_to_category WHERE product_id = ?1
#END
deleteProduct5=DELETE FROM oc_product_image WHERE product_id = ?1
#END
deleteProduct4=DELETE FROM oc_product_filter WHERE product_id = ?1
#END
deleteProduct7=DELETE FROM oc_product_option_value WHERE product_id = ?1
#END
deleteProduct6=DELETE FROM oc_product_option WHERE product_id = ?1
#END
editProduct39=INSERT INTO  oc_product_recurring  SET  product_id  = ?1, customer_group_id = ?2,  recurring_id  = ?3
#END
getProductDiscounts=SELECT * FROM oc_product_discount WHERE product_id = ?1 ORDER BY quantity, priority, price
#END
editProduct38=DELETE FROM  oc_product_recurring  WHERE product_id = ?1
#END
getTotalProductsByWeightClassId=SELECT COUNT(*) AS total FROM oc_product WHERE weight_class_id = ?1
#END
getTotalProductsByOptionId=SELECT COUNT(*) AS total FROM oc_product_option WHERE option_id = ?1
#END
editProduct37=INSERT INTO oc_url_alias SET query = 'product_id=?1, keyword = ?2
#END
editProduct36=DELETE FROM oc_url_alias WHERE query = 'product_id=?1
#END
addProduct=INSERT INTO oc_product SET model = ?1, sku = ?2, upc = ?3, ean = ?4, jan = ?5, isbn = ?6, mpn = ?7, location = ?8, quantity = ?9, minimum = ?10, subtract = ?11, stock_status_id = ?12, date_available = ?13, manufacturer_id = ?14, shipping = ?15, price = ?16, points = ?17, weight = ?18, weight_class_id = ?19, length = ?20, width = ?21, height = ?22, length_class_id = ?23, status = ?24, tax_class_id = ?25, sort_order = ?26, date_added = NOW()
#END
getProductStores=SELECT * FROM oc_product_to_store WHERE product_id = ?1
#END
getProductOptions1=SELECT * FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON(pov.option_value_id = ov.option_value_id) WHERE pov.product_option_id = ?1 ORDER BY ov.sort_order ASC
#END
editProduct31=INSERT INTO oc_product_related SET product_id = ?1, related_id = ?2
#END
editProduct30=DELETE FROM oc_product_related WHERE product_id = ?1 AND related_id = ?2
#END
editProduct35=INSERT INTO oc_product_to_layout SET product_id = ?1, store_id = ?2, layout_id = ?3
#END
editProduct34=DELETE FROM oc_product_to_layout WHERE product_id = ?1
#END
editProduct33=INSERT INTO oc_product_reward SET product_id = ?1, customer_group_id = ?2, points = ?3
#END
editProduct=UPDATE oc_product SET model = ?1, sku = ?2, upc = ?3, ean = ?4, jan = ?5, isbn = ?6, mpn = ?7, location = ?8, quantity = ?9, minimum = ?10, subtract = ?11, stock_status_id = ?12, date_available = ?13, manufacturer_id = ?14, shipping = ?15, price = ?16, points = ?17, weight = ?18, weight_class_id = ?19, length = ?20, width = ?21, height = ?22, length_class_id = ?23, status = ?24, tax_class_id = ?25, sort_order = ?26, date_modified = NOW() WHERE product_id = ?27
#END
editProduct32=DELETE FROM oc_product_reward WHERE product_id = ?1
#END
getProductDescriptions=SELECT * FROM oc_product_description WHERE product_id = ?1
#END
getProductOptionValue=SELECT pov.option_value_id, ovd.name, pov.quantity, pov.subtract, pov.price, pov.price_prefix, pov.points, pov.points_prefix, pov.weight, pov.weight_prefix FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON (pov.option_value_id = ov.option_value_id) LEFT JOIN oc_option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE pov.product_id = ?1 AND pov.product_option_value_id = ?2 AND ovd.language_id = ?3
#END
getTotalProductsByDownloadId=SELECT COUNT(*) AS total FROM oc_product_to_download WHERE download_id = ?1
#END
editProduct28=DELETE FROM oc_product_related WHERE product_id = ?1 AND related_id = ?2
#END
editProduct27=DELETE FROM oc_product_related WHERE related_id = ?1
#END
editProduct26=DELETE FROM oc_product_related WHERE product_id = ?1
#END
editProduct25=INSERT INTO oc_product_filter SET product_id = ?1, filter_id = ?2
#END
getProductDownloads=SELECT * FROM oc_product_to_download WHERE product_id = ?1
#END
editProduct29=INSERT INTO oc_product_related SET product_id = ?1, related_id = ?2
#END
editProduct20=DELETE FROM oc_product_to_download WHERE product_id = ?1
#END
editProduct24=DELETE FROM oc_product_filter WHERE product_id = ?1
#END
editProduct23=INSERT INTO oc_product_to_category SET product_id = ?1, category_id = ?2
#END
editProduct22=DELETE FROM oc_product_to_category WHERE product_id = ?1
#END
getRecurrings=SELECT * FROM  oc_product_recurring  WHERE product_id = ?1
#END
editProduct21=INSERT INTO oc_product_to_download SET product_id = ?1, download_id = ?2
#END
editProduct17=INSERT INTO oc_product_special SET product_id = ?1, customer_group_id = ?2, priority = ?3, price = ?4, date_start = ?5, date_end = ?6
#END
editProduct16=DELETE FROM oc_product_special WHERE product_id = ?1
#END
getProductOptions=SELECT * FROM  oc_product_option  po LEFT JOIN  oc_option  o ON (po.option_id = o.option_id) LEFT JOIN  oc_option_description  od ON (o.option_id = od.option_id) WHERE po.product_id = ?1 AND od.language_id = ?2
#END
editProduct15=INSERT INTO oc_product_discount SET product_id = ?1, customer_group_id = ?2, quantity = ?3, priority = ?4, price = ?5, date_start = ?6, date_end = ?7
#END
editProduct14=DELETE FROM oc_product_discount WHERE product_id = ?1
#END
getProductImages=SELECT * FROM oc_product_image WHERE product_id = ?1 ORDER BY sort_order ASC
#END
getProductAttributes=SELECT attribute_id FROM oc_product_attribute WHERE product_id = ?1 GROUP BY attribute_id
#END
editProduct19=INSERT INTO oc_product_image SET product_id = ?1, image = ?2, sort_order = ?3
#END
editProduct18=DELETE FROM oc_product_image WHERE product_id = ?1
#END
editProduct13=INSERT INTO oc_product_option SET product_option_id = ?1, product_id = ?2, option_id = ?3, value = ?4, required = ?5
#END
editProduct12=INSERT INTO oc_product_option_value SET product_option_value_id = ?1, product_option_id = ?2, product_id = ?3, option_id = ?4, option_value_id = ?5, quantity = ?6, subtract = ?7, price = ?8, price_prefix = ?9, points = ?10, points_prefix = ?11, weight = ?12, weight_prefix = ?13
#END
editProduct11=INSERT INTO oc_product_option SET product_option_id = ?1, product_id = ?2, option_id = ?3, required = ?4
#END
editProduct10=DELETE FROM oc_product_option_value WHERE product_id = ?1
#END
getProductsByCategoryId=SELECT * FROM oc_product p LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) LEFT JOIN oc_product_to_category p2c ON (p.product_id = p2c.product_id) WHERE pd.language_id = ?1 AND p2c.category_id = ?2 ORDER BY pd.name ASC
#END
getTotalProductsByLayoutId=SELECT COUNT(*) AS total FROM oc_product_to_layout WHERE layout_id = ?1
#END
deleteProduct=DELETE FROM oc_product WHERE product_id = ?1
#END
addProduct19=INSERT INTO oc_product_related SET product_id = ?1, related_id = ?2
#END
addProduct17=INSERT INTO oc_product_related SET product_id = ?1, related_id = ?2
#END
addProduct18=DELETE FROM oc_product_related WHERE product_id = ?1 AND related_id = ?2
#END
addProduct15=INSERT INTO oc_product_filter SET product_id = ?1, filter_id = ?2
#END
addProduct16=DELETE FROM oc_product_related WHERE product_id = ?1 AND related_id = ?2
#END
addProduct13=INSERT INTO oc_product_to_download SET product_id = ?1, download_id = ?2
#END
addProduct14=INSERT INTO oc_product_to_category SET product_id = ?1, category_id = ?2
#END
getProductFilters=SELECT * FROM oc_product_filter WHERE product_id = ?1
#END
getProductRelated=SELECT * FROM oc_product_related WHERE product_id = ?1
#END
getTotalProductsByManufacturerId=SELECT COUNT(*) AS total FROM oc_product WHERE manufacturer_id = ?1
#END
getProductLayouts=SELECT * FROM oc_product_to_layout WHERE product_id = ?1
#END
getProductSpecials=SELECT * FROM oc_product_special WHERE product_id = ?1 ORDER BY priority, price
#END
addProduct11=INSERT INTO oc_product_special SET product_id = ?1, customer_group_id = ?2, priority = ?3, price = ?4, date_start = ?5, date_end = ?6
#END
addProduct12=INSERT INTO oc_product_image SET product_id = ?1, image = ?2, sort_order = ?3
#END
addProduct10=INSERT INTO oc_product_discount SET product_id = ?1, customer_group_id = ?2, quantity = ?3, priority = ?4, price = ?5, date_start = ?6, date_end = ?7
#END
editProduct8=INSERT INTO oc_product_attribute SET product_id = ?1, attribute_id = ?2, language_id = ?3, text = ?4
#END
editProduct7=DELETE FROM oc_product_attribute WHERE product_id = ?1 AND attribute_id = ?2
#END
editProduct6=DELETE FROM oc_product_attribute WHERE product_id = ?1
#END
editProduct5=INSERT INTO oc_product_to_store SET product_id = ?1, store_id = ?2
#END
getTotalProductsByProfileId=SELECT COUNT(*) AS total FROM oc_product_recurring WHERE recurring_id = ?1
#END
editProduct9=DELETE FROM oc_product_option WHERE product_id = ?1
#END
copyProduct=SELECT DISTINCT * FROM oc_product p WHERE p.product_id = ?1
#END
addProduct22=INSERT INTO oc_url_alias SET query = 'product_id=?1, keyword = ?2
#END
addProduct23=INSERT INTO  oc_product_recurring  SET  product_id  = ?1, customer_group_id = ?2,  recurring_id  = ?3
#END
addProduct20=INSERT INTO oc_product_reward SET product_id = ?1, customer_group_id = ?2, points = ?3
#END
addProduct21=INSERT INTO oc_product_to_layout SET product_id = ?1, store_id = ?2, layout_id = ?3
#END
editProduct4=DELETE FROM oc_product_to_store WHERE product_id = ?1
#END
editProduct3=INSERT INTO oc_product_description SET product_id = ?1, language_id = ?2, name = ?3, description = ?4, tag = ?5, meta_title = ?6, meta_description = ?7, meta_keyword = ?8
#END
editProduct2=DELETE FROM oc_product_description WHERE product_id = ?1
#END
editProduct1=UPDATE oc_product SET image = ?1 WHERE product_id = ?2
#END
getTotalProductsByStockStatusId=SELECT COUNT(*) AS total FROM oc_product WHERE stock_status_id = ?1
#END
getProduct=SELECT DISTINCT *, (SELECT keyword FROM oc_url_alias WHERE query = 'product_id=?1) AS keyword FROM oc_product p LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = ?2 AND pd.language_id = ?3
#END
addProduct7=INSERT INTO oc_product_option SET product_id = ?1, option_id = ?2, required = ?3
#END
addProduct6=INSERT INTO oc_product_attribute SET product_id = ?1, attribute_id = ?2, language_id = ?3, text = ?4
#END
addProduct9=INSERT INTO oc_product_option SET product_id = ?1, option_id = ?2, value = ?3, required = ?4
#END
addProduct8=INSERT INTO oc_product_option_value SET product_option_id = ?1, product_id = ?2, option_id = ?3, option_value_id = ?4, quantity = ?5, subtract = ?6, price = ?7, price_prefix = ?8, points = ?9, points_prefix = ?10, weight = ?11, weight_prefix = ?12
#END
addProduct1=UPDATE oc_product SET image = ?1 WHERE product_id = ?2
#END
addProduct3=INSERT INTO oc_product_to_store SET product_id = ?1, store_id = ?2
#END
addProduct2=INSERT INTO oc_product_description SET product_id = ?1, language_id = ?2, name = ?3, description = ?4, tag = ?5, meta_title = ?6, meta_description = ?7, meta_keyword = ?8
#END
addProduct5=DELETE FROM oc_product_attribute WHERE product_id = ?1 AND attribute_id = ?2 AND language_id = ?3
#END
addProduct4=DELETE FROM oc_product_attribute WHERE product_id = ?1 AND attribute_id = ?2
#END
