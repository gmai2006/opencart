getProductAttributes1=SELECT a.attribute_id, ad.name, pa.text FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE pa.product_id = ?1 AND a.attribute_group_id = ?2 AND ad.language_id = ?3 AND pa.language_id = ?4 ORDER BY a.sort_order, ad.name
#END
getProductDiscounts=SELECT * FROM oc_product_discount WHERE product_id = ?1 AND customer_group_id = ?2 AND quantity > 1 AND ((date_start = '0000-00-00' OR date_start < NOW()) AND (date_end = '0000-00-00' OR date_end > NOW())) ORDER BY quantity ASC, priority ASC, price ASC
#END
getProductOptions=SELECT * FROM oc_product_option po LEFT JOIN  oc_option  o ON (po.option_id = o.option_id) LEFT JOIN oc_option_description od ON (o.option_id = od.option_id) WHERE po.product_id = ?1 AND od.language_id = ?2 ORDER BY o.sort_order
#END
getProduct=SELECT DISTINCT *, pd.name AS name, p.image, m.name AS manufacturer, (SELECT price FROM oc_product_discount pd2 WHERE pd2.product_id = p.product_id AND pd2.customer_group_id = ?1 AND pd2.quantity = '1' AND ((pd2.date_start = '0000-00-00' OR pd2.date_start < NOW()) AND (pd2.date_end = '0000-00-00' OR pd2.date_end > NOW())) ORDER BY pd2.priority ASC, pd2.price ASC LIMIT 1) AS discount, (SELECT price FROM oc_product_special ps WHERE ps.product_id = p.product_id AND ps.customer_group_id = ?2 AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW())) ORDER BY ps.priority ASC, ps.price ASC LIMIT 1) AS special, (SELECT points FROM oc_product_reward pr WHERE pr.product_id = p.product_id AND pr.customer_group_id = ?3) AS reward, (SELECT ss.name FROM oc_stock_status ss WHERE ss.stock_status_id = p.stock_status_id AND ss.language_id = ?4) AS stock_status, (SELECT wcd.unit FROM oc_weight_class_description wcd WHERE p.weight_class_id = wcd.weight_class_id AND wcd.language_id = ?5) AS weight_class, (SELECT lcd.unit FROM oc_length_class_description lcd WHERE p.length_class_id = lcd.length_class_id AND lcd.language_id = ?6) AS length_class, (SELECT AVG(rating) AS total FROM oc_review r1 WHERE r1.product_id = p.product_id AND r1.status = '1' GROUP BY r1.product_id) AS rating, (SELECT COUNT(*) AS total FROM oc_review r2 WHERE r2.product_id = p.product_id AND r2.status = '1' GROUP BY r2.product_id) AS reviews, p.sort_order FROM oc_product p LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) LEFT JOIN oc_manufacturer m ON (p.manufacturer_id = m.manufacturer_id) WHERE p.product_id = ?7 AND pd.language_id = ?8 AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = ?9
#END
getProductImages=SELECT * FROM oc_product_image WHERE product_id = ?1 ORDER BY sort_order ASC
#END
getProductAttributes=SELECT ag.attribute_group_id, agd.name FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN oc_attribute_group ag ON (a.attribute_group_id = ag.attribute_group_id) LEFT JOIN oc_attribute_group_description agd ON (ag.attribute_group_id = agd.attribute_group_id) WHERE pa.product_id = ?1 AND agd.language_id = ?2 GROUP BY ag.attribute_group_id ORDER BY ag.sort_order, agd.name
#END
getProductOptions1=SELECT * FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON (pov.option_value_id = ov.option_value_id) LEFT JOIN oc_option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE pov.product_id = ?1 AND pov.product_option_id = ?2 AND ovd.language_id = ?3 ORDER BY ov.sort_order
#END
getProfile=SELECT * FROM oc_recurring r JOIN oc_product_recurring pr ON (pr.recurring_id = r.recurring_id AND pr.product_id = ?1) WHERE pr.recurring_id = ?2 AND status = '1' AND pr.customer_group_id = ?3
#END
getTotalProductSpecials=SELECT COUNT(DISTINCT ps.product_id) AS total FROM oc_product_special ps LEFT JOIN oc_product p ON (ps.product_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = ?1 AND ps.customer_group_id = ?2 AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW()))
#END
getLatestProducts=SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = ?1 ORDER BY p.date_added DESC LIMIT ?2
#END
getProductRelated=SELECT * FROM oc_product_related pr LEFT JOIN oc_product p ON (pr.related_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE pr.product_id = ?1 AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = ?2
#END
getBestSellerProducts=SELECT op.product_id, SUM(op.quantity) AS total FROM oc_order_product op LEFT JOIN  oc_order  o ON (op.order_id = o.order_id) LEFT JOIN  oc_product  p ON (op.product_id = p.product_id) LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE o.order_status_id > '0' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = ?1 GROUP BY op.product_id ORDER BY total DESC LIMIT ?2
#END
getProductLayoutId=SELECT * FROM oc_product_to_layout WHERE product_id = ?1 AND store_id = ?2
#END
getCategories=SELECT * FROM oc_product_to_category WHERE product_id = ?1
#END
getPopularProducts=SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = ?1 ORDER BY p.viewed DESC, p.date_added DESC LIMIT ?2
#END
getProfiles=SELECT rd.* FROM oc_product_recurring pr JOIN oc_recurring_description rd ON (rd.language_id = ?1 AND rd.recurring_id = pr.recurring_id) JOIN oc_recurring r ON r.recurring_id = rd.recurring_id WHERE pr.product_id = ?2 AND status = '1' AND pr.customer_group_id = ?3 ORDER BY sort_order ASC
#END
updateViewed=UPDATE oc_product SET viewed = (viewed + 1) WHERE product_id = ?1
#END
