getProductAttributes1=$this->db->query("SELECT a.attribute_id, ad.name, pa.text FROM ".DB_PREFIX."product_attribute pa LEFT JOIN ".DB_PREFIX."attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN ".DB_PREFIX."attribute_description ad ON (a.attribute_id = ad.attribute_id) WHERE pa.product_id = '".(int)$product_id."' AND a.attribute_group_id = '".(int)$product_attribute_group['attribute_group_id']."' AND ad.language_id = '".(int)$this->config->get('config_language_id')."' AND pa.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY a.sort_order, ad.name")
#END
getProductDiscounts=$this->db->query("SELECT * FROM ".DB_PREFIX."product_discount WHERE product_id = '".(int)$product_id."' AND customer_group_id = '".(int)$this->config->get('config_customer_group_id')."' AND quantity > 1 AND ((date_start = '0000-00-00' OR date_start < NOW()) AND (date_end = '0000-00-00' OR date_end > NOW())) ORDER BY quantity ASC, priority ASC, price ASC")
#END
getProductOptions=$this->db->query("SELECT * FROM ".DB_PREFIX."product_option po LEFT JOIN `".DB_PREFIX."option` o ON (po.option_id = o.option_id) LEFT JOIN ".DB_PREFIX."option_description od ON (o.option_id = od.option_id) WHERE po.product_id = '".(int)$product_id."' AND od.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY o.sort_order")
#END
getProduct=$this->db->query("SELECT DISTINCT *, pd.name AS name, p.image, m.name AS manufacturer, (SELECT price FROM ".DB_PREFIX."product_discount pd2 WHERE pd2.product_id = p.product_id AND pd2.customer_group_id = '".(int)$this->config->get('config_customer_group_id')."' AND pd2.quantity = '1' AND ((pd2.date_start = '0000-00-00' OR pd2.date_start < NOW()) AND (pd2.date_end = '0000-00-00' OR pd2.date_end > NOW())) ORDER BY pd2.priority ASC, pd2.price ASC LIMIT 1) AS discount, (SELECT price FROM ".DB_PREFIX."product_special ps WHERE ps.product_id = p.product_id AND ps.customer_group_id = '".(int)$this->config->get('config_customer_group_id')."' AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW())) ORDER BY ps.priority ASC, ps.price ASC LIMIT 1) AS special, (SELECT points FROM ".DB_PREFIX."product_reward pr WHERE pr.product_id = p.product_id AND pr.customer_group_id = '".(int)$this->config->get('config_customer_group_id')."') AS reward, (SELECT ss.name FROM ".DB_PREFIX."stock_status ss WHERE ss.stock_status_id = p.stock_status_id AND ss.language_id = '".(int)$this->config->get('config_language_id')."') AS stock_status, (SELECT wcd.unit FROM ".DB_PREFIX."weight_class_description wcd WHERE p.weight_class_id = wcd.weight_class_id AND wcd.language_id = '".(int)$this->config->get('config_language_id')."') AS weight_class, (SELECT lcd.unit FROM ".DB_PREFIX."length_class_description lcd WHERE p.length_class_id = lcd.length_class_id AND lcd.language_id = '".(int)$this->config->get('config_language_id')."') AS length_class, (SELECT AVG(rating) AS total FROM ".DB_PREFIX."review r1 WHERE r1.product_id = p.product_id AND r1.status = '1' GROUP BY r1.product_id) AS rating, (SELECT COUNT(*) AS total FROM ".DB_PREFIX."review r2 WHERE r2.product_id = p.product_id AND r2.status = '1' GROUP BY r2.product_id) AS reviews, p.sort_order FROM ".DB_PREFIX."product p LEFT JOIN ".DB_PREFIX."product_description pd ON (p.product_id = pd.product_id) LEFT JOIN ".DB_PREFIX."product_to_store p2s ON (p.product_id = p2s.product_id) LEFT JOIN ".DB_PREFIX."manufacturer m ON (p.manufacturer_id = m.manufacturer_id) WHERE p.product_id = '".(int)$product_id."' AND pd.language_id = '".(int)$this->config->get('config_language_id')."' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = '".(int)$this->config->get('config_store_id')."'")
#END
getProductImages=$this->db->query("SELECT * FROM ".DB_PREFIX."product_image WHERE product_id = '".(int)$product_id."' ORDER BY sort_order ASC")
#END
getProductAttributes=$this->db->query("SELECT ag.attribute_group_id, agd.name FROM ".DB_PREFIX."product_attribute pa LEFT JOIN ".DB_PREFIX."attribute a ON (pa.attribute_id = a.attribute_id) LEFT JOIN ".DB_PREFIX."attribute_group ag ON (a.attribute_group_id = ag.attribute_group_id) LEFT JOIN ".DB_PREFIX."attribute_group_description agd ON (ag.attribute_group_id = agd.attribute_group_id) WHERE pa.product_id = '".(int)$product_id."' AND agd.language_id = '".(int)$this->config->get('config_language_id')."' GROUP BY ag.attribute_group_id ORDER BY ag.sort_order, agd.name")
#END
getProductOptions1=$this->db->query("SELECT * FROM ".DB_PREFIX."product_option_value pov LEFT JOIN ".DB_PREFIX."option_value ov ON (pov.option_value_id = ov.option_value_id) LEFT JOIN ".DB_PREFIX."option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE pov.product_id = '".(int)$product_id."' AND pov.product_option_id = '".(int)$product_option['product_option_id']."' AND ovd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY ov.sort_order")
#END
getProfile=$this->db->query("SELECT * FROM ".DB_PREFIX."recurring r JOIN ".DB_PREFIX."product_recurring pr ON (pr.recurring_id = r.recurring_id AND pr.product_id = '".(int)$product_id."') WHERE pr.recurring_id = '".(int)$recurring_id."' AND status = '1' AND pr.customer_group_id = '".(int)$this->config->get('config_customer_group_id')."'")
#END
getTotalProductSpecials=$this->db->query("SELECT COUNT(DISTINCT ps.product_id) AS total FROM ".DB_PREFIX."product_special ps LEFT JOIN ".DB_PREFIX."product p ON (ps.product_id = p.product_id) LEFT JOIN ".DB_PREFIX."product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = '".(int)$this->config->get('config_store_id')."' AND ps.customer_group_id = '".(int)$this->config->get('config_customer_group_id')."' AND ((ps.date_start = '0000-00-00' OR ps.date_start < NOW()) AND (ps.date_end = '0000-00-00' OR ps.date_end > NOW()))")
#END
getLatestProducts=$this->db->query("SELECT p.product_id FROM ".DB_PREFIX."product p LEFT JOIN ".DB_PREFIX."product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = '".(int)$this->config->get('config_store_id')."' ORDER BY p.date_added DESC LIMIT ".(int)$limit)
#END
getProductRelated=$this->db->query("SELECT * FROM ".DB_PREFIX."product_related pr LEFT JOIN ".DB_PREFIX."product p ON (pr.related_id = p.product_id) LEFT JOIN ".DB_PREFIX."product_to_store p2s ON (p.product_id = p2s.product_id) WHERE pr.product_id = '".(int)$product_id."' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = '".(int)$this->config->get('config_store_id')."'")
#END
getBestSellerProducts=$this->db->query("SELECT op.product_id, SUM(op.quantity) AS total FROM ".DB_PREFIX."order_product op LEFT JOIN `".DB_PREFIX."order` o ON (op.order_id = o.order_id) LEFT JOIN `".DB_PREFIX."product` p ON (op.product_id = p.product_id) LEFT JOIN ".DB_PREFIX."product_to_store p2s ON (p.product_id = p2s.product_id) WHERE o.order_status_id > '0' AND p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = '".(int)$this->config->get('config_store_id')."' GROUP BY op.product_id ORDER BY total DESC LIMIT ".(int)$limit)
#END
getProductLayoutId=$this->db->query("SELECT * FROM ".DB_PREFIX."product_to_layout WHERE product_id = '".(int)$product_id."' AND store_id = '".(int)$this->config->get('config_store_id')."'")
#END
getCategories=$this->db->query("SELECT * FROM ".DB_PREFIX."product_to_category WHERE product_id = '".(int)$product_id."'")
#END
getPopularProducts=$this->db->query("SELECT p.product_id FROM ".DB_PREFIX."product p LEFT JOIN ".DB_PREFIX."product_to_store p2s ON (p.product_id = p2s.product_id) WHERE p.status = '1' AND p.date_available <= NOW() AND p2s.store_id = '".(int)$this->config->get('config_store_id')."' ORDER BY p.viewed DESC, p.date_added DESC LIMIT ".(int)$limit)
#END
getProfiles=$this->db->query("SELECT rd.* FROM ".DB_PREFIX."product_recurring pr JOIN ".DB_PREFIX."recurring_description rd ON (rd.language_id = ".(int)$this->config->get('config_language_id')." AND rd.recurring_id = pr.recurring_id) JOIN ".DB_PREFIX."recurring r ON r.recurring_id = rd.recurring_id WHERE pr.product_id = ".(int)$product_id." AND status = '1' AND pr.customer_group_id = '".(int)$this->config->get('config_customer_group_id')."' ORDER BY sort_order ASC")
#END
updateViewed=$this->db->query("UPDATE ".DB_PREFIX."product SET viewed = (viewed + 1) WHERE product_id = '".(int)$product_id."'")
#END