getProductAttributes1=$this->db->query("SELECT * FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."' AND attribute_id = '".(int)$product_attribute['attribute_id']."'")
#END
deleteProduct19=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_product WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct17=$this->db->query("DELETE FROM ".DB_PREFIX."review WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct18=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'product_id=".(int)$product_id."'")
#END
deleteProduct15=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_store WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct16=$this->db->query("DELETE FROM ".DB_PREFIX."product_recurring WHERE product_id = ".(int)$product_id)
#END
deleteProduct13=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_download WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct14=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_layout WHERE product_id = '".(int)$product_id."'")
#END
getTotalProductsByAttributeId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product_attribute WHERE attribute_id = '".(int)$attribute_id."'")
#END
deleteProduct11=$this->db->query("DELETE FROM ".DB_PREFIX."product_special WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct12=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_category WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct10=$this->db->query("DELETE FROM ".DB_PREFIX."product_reward WHERE product_id = '".(int)$product_id."'")
#END
getProductRewards=$this->db->query("SELECT * FROM ".DB_PREFIX."product_reward WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct1=$this->db->query("DELETE FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct3=$this->db->query("DELETE FROM ".DB_PREFIX."product_discount WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct2=$this->db->query("DELETE FROM ".DB_PREFIX."product_description WHERE product_id = '".(int)$product_id."'")
#END
getTotalProductsByTaxClassId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product WHERE tax_class_id = '".(int)$tax_class_id."'")
#END
getTotalProductsByLengthClassId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product WHERE length_class_id = '".(int)$length_class_id."'")
#END
deleteProduct9=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE related_id = '".(int)$product_id."'")
#END
deleteProduct8=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$product_id."'")
#END
getProductCategories=$this->db->query("SELECT * FROM ".DB_PREFIX."product_to_category WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct5=$this->db->query("DELETE FROM ".DB_PREFIX."product_image WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct4=$this->db->query("DELETE FROM ".DB_PREFIX."product_filter WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct7=$this->db->query("DELETE FROM ".DB_PREFIX."product_option_value WHERE product_id = '".(int)$product_id."'")
#END
deleteProduct6=$this->db->query("DELETE FROM ".DB_PREFIX."product_option WHERE product_id = '".(int)$product_id."'")
#END
editProduct39=$this->db->query("INSERT INTO `".DB_PREFIX."product_recurring` SET `product_id` = ".(int)$product_id.", customer_group_id = ".(int)$product_recurring['customer_group_id'].", `recurring_id` = ".(int)$product_recurring['recurring_id'])
#END
getProductDiscounts=$this->db->query("SELECT * FROM ".DB_PREFIX."product_discount WHERE product_id = '".(int)$product_id."' ORDER BY quantity, priority, price")
#END
editProduct38=$this->db->query("DELETE FROM `".DB_PREFIX."product_recurring` WHERE product_id = ".(int)$product_id)
#END
getTotalProductsByWeightClassId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product WHERE weight_class_id = '".(int)$weight_class_id."'")
#END
getTotalProductsByOptionId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product_option WHERE option_id = '".(int)$option_id."'")
#END
editProduct37=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'product_id=".(int)$product_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
editProduct36=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'product_id=".(int)$product_id."'")
#END
addProduct=$this->db->query("INSERT INTO ".DB_PREFIX."product SET model = '".$this->db->escape($data['model'])."', sku = '".$this->db->escape($data['sku'])."', upc = '".$this->db->escape($data['upc'])."', ean = '".$this->db->escape($data['ean'])."', jan = '".$this->db->escape($data['jan'])."', isbn = '".$this->db->escape($data['isbn'])."', mpn = '".$this->db->escape($data['mpn'])."', location = '".$this->db->escape($data['location'])."', quantity = '".(int)$data['quantity']."', minimum = '".(int)$data['minimum']."', subtract = '".(int)$data['subtract']."', stock_status_id = '".(int)$data['stock_status_id']."', date_available = '".$this->db->escape($data['date_available'])."', manufacturer_id = '".(int)$data['manufacturer_id']."', shipping = '".(int)$data['shipping']."', price = '".(float)$data['price']."', points = '".(int)$data['points']."', weight = '".(float)$data['weight']."', weight_class_id = '".(int)$data['weight_class_id']."', length = '".(float)$data['length']."', width = '".(float)$data['width']."', height = '".(float)$data['height']."', length_class_id = '".(int)$data['length_class_id']."', status = '".(int)$data['status']."', tax_class_id = '".(int)$data['tax_class_id']."', sort_order = '".(int)$data['sort_order']."', date_added = NOW()")
#END
getProductStores=$this->db->query("SELECT * FROM ".DB_PREFIX."product_to_store WHERE product_id = '".(int)$product_id."'")
#END
getProductOptions1=$this->db->query("SELECT * FROM ".DB_PREFIX."product_option_value pov LEFT JOIN ".DB_PREFIX."option_value ov ON(pov.option_value_id = ov.option_value_id) WHERE pov.product_option_id = '".(int)$product_option['product_option_id']."' ORDER BY ov.sort_order ASC")
#END
editProduct31=$this->db->query("INSERT INTO ".DB_PREFIX."product_related SET product_id = '".(int)$related_id."', related_id = '".(int)$product_id."'")
#END
editProduct30=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$related_id."' AND related_id = '".(int)$product_id."'")
#END
editProduct35=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_layout SET product_id = '".(int)$product_id."', store_id = '".(int)$store_id."', layout_id = '".(int)$layout_id."'")
#END
editProduct34=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_layout WHERE product_id = '".(int)$product_id."'")
#END
editProduct33=$this->db->query("INSERT INTO ".DB_PREFIX."product_reward SET product_id = '".(int)$product_id."', customer_group_id = '".(int)$customer_group_id."', points = '".(int)$value['points']."'")
#END
editProduct=$this->db->query("UPDATE ".DB_PREFIX."product SET model = '".$this->db->escape($data['model'])."', sku = '".$this->db->escape($data['sku'])."', upc = '".$this->db->escape($data['upc'])."', ean = '".$this->db->escape($data['ean'])."', jan = '".$this->db->escape($data['jan'])."', isbn = '".$this->db->escape($data['isbn'])."', mpn = '".$this->db->escape($data['mpn'])."', location = '".$this->db->escape($data['location'])."', quantity = '".(int)$data['quantity']."', minimum = '".(int)$data['minimum']."', subtract = '".(int)$data['subtract']."', stock_status_id = '".(int)$data['stock_status_id']."', date_available = '".$this->db->escape($data['date_available'])."', manufacturer_id = '".(int)$data['manufacturer_id']."', shipping = '".(int)$data['shipping']."', price = '".(float)$data['price']."', points = '".(int)$data['points']."', weight = '".(float)$data['weight']."', weight_class_id = '".(int)$data['weight_class_id']."', length = '".(float)$data['length']."', width = '".(float)$data['width']."', height = '".(float)$data['height']."', length_class_id = '".(int)$data['length_class_id']."', status = '".(int)$data['status']."', tax_class_id = '".(int)$data['tax_class_id']."', sort_order = '".(int)$data['sort_order']."', date_modified = NOW() WHERE product_id = '".(int)$product_id."'")
#END
editProduct32=$this->db->query("DELETE FROM ".DB_PREFIX."product_reward WHERE product_id = '".(int)$product_id."'")
#END
getProductDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."product_description WHERE product_id = '".(int)$product_id."'")
#END
getProductOptionValue=$this->db->query("SELECT pov.option_value_id, ovd.name, pov.quantity, pov.subtract, pov.price, pov.price_prefix, pov.points, pov.points_prefix, pov.weight, pov.weight_prefix FROM ".DB_PREFIX."product_option_value pov LEFT JOIN ".DB_PREFIX."option_value ov ON (pov.option_value_id = ov.option_value_id) LEFT JOIN ".DB_PREFIX."option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE pov.product_id = '".(int)$product_id."' AND pov.product_option_value_id = '".(int)$product_option_value_id."' AND ovd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getTotalProductsByDownloadId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product_to_download WHERE download_id = '".(int)$download_id."'")
#END
editProduct28=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$product_id."' AND related_id = '".(int)$related_id."'")
#END
editProduct27=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE related_id = '".(int)$product_id."'")
#END
editProduct26=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$product_id."'")
#END
editProduct25=$this->db->query("INSERT INTO ".DB_PREFIX."product_filter SET product_id = '".(int)$product_id."', filter_id = '".(int)$filter_id."'")
#END
getProductDownloads=$this->db->query("SELECT * FROM ".DB_PREFIX."product_to_download WHERE product_id = '".(int)$product_id."'")
#END
editProduct29=$this->db->query("INSERT INTO ".DB_PREFIX."product_related SET product_id = '".(int)$product_id."', related_id = '".(int)$related_id."'")
#END
editProduct20=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_download WHERE product_id = '".(int)$product_id."'")
#END
editProduct24=$this->db->query("DELETE FROM ".DB_PREFIX."product_filter WHERE product_id = '".(int)$product_id."'")
#END
editProduct23=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_category SET product_id = '".(int)$product_id."', category_id = '".(int)$category_id."'")
#END
editProduct22=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_category WHERE product_id = '".(int)$product_id."'")
#END
getRecurrings=$this->db->query("SELECT * FROM `".DB_PREFIX."product_recurring` WHERE product_id = '".(int)$product_id."'")
#END
editProduct21=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_download SET product_id = '".(int)$product_id."', download_id = '".(int)$download_id."'")
#END
editProduct17=$this->db->query("INSERT INTO ".DB_PREFIX."product_special SET product_id = '".(int)$product_id."', customer_group_id = '".(int)$product_special['customer_group_id']."', priority = '".(int)$product_special['priority']."', price = '".(float)$product_special['price']."', date_start = '".$this->db->escape($product_special['date_start'])."', date_end = '".$this->db->escape($product_special['date_end'])."'")
#END
editProduct16=$this->db->query("DELETE FROM ".DB_PREFIX."product_special WHERE product_id = '".(int)$product_id."'")
#END
getProductOptions=$this->db->query("SELECT * FROM `".DB_PREFIX."product_option` po LEFT JOIN `".DB_PREFIX."option` o ON (po.option_id = o.option_id) LEFT JOIN `".DB_PREFIX."option_description` od ON (o.option_id = od.option_id) WHERE po.product_id = '".(int)$product_id."' AND od.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editProduct15=$this->db->query("INSERT INTO ".DB_PREFIX."product_discount SET product_id = '".(int)$product_id."', customer_group_id = '".(int)$product_discount['customer_group_id']."', quantity = '".(int)$product_discount['quantity']."', priority = '".(int)$product_discount['priority']."', price = '".(float)$product_discount['price']."', date_start = '".$this->db->escape($product_discount['date_start'])."', date_end = '".$this->db->escape($product_discount['date_end'])."'")
#END
editProduct14=$this->db->query("DELETE FROM ".DB_PREFIX."product_discount WHERE product_id = '".(int)$product_id."'")
#END
getProductImages=$this->db->query("SELECT * FROM ".DB_PREFIX."product_image WHERE product_id = '".(int)$product_id."' ORDER BY sort_order ASC")
#END
getProductAttributes=$this->db->query("SELECT attribute_id FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."' GROUP BY attribute_id")
#END
editProduct19=$this->db->query("INSERT INTO ".DB_PREFIX."product_image SET product_id = '".(int)$product_id."', image = '".$this->db->escape($product_image['image'])."', sort_order = '".(int)$product_image['sort_order']."'")
#END
editProduct18=$this->db->query("DELETE FROM ".DB_PREFIX."product_image WHERE product_id = '".(int)$product_id."'")
#END
editProduct13=$this->db->query("INSERT INTO ".DB_PREFIX."product_option SET product_option_id = '".(int)$product_option['product_option_id']."', product_id = '".(int)$product_id."', option_id = '".(int)$product_option['option_id']."', value = '".$this->db->escape($product_option['value'])."', required = '".(int)$product_option['required']."'")
#END
editProduct12=$this->db->query("INSERT INTO ".DB_PREFIX."product_option_value SET product_option_value_id = '".(int)$product_option_value['product_option_value_id']."', product_option_id = '".(int)$product_option_id."', product_id = '".(int)$product_id."', option_id = '".(int)$product_option['option_id']."', option_value_id = '".(int)$product_option_value['option_value_id']."', quantity = '".(int)$product_option_value['quantity']."', subtract = '".(int)$product_option_value['subtract']."', price = '".(float)$product_option_value['price']."', price_prefix = '".$this->db->escape($product_option_value['price_prefix'])."', points = '".(int)$product_option_value['points']."', points_prefix = '".$this->db->escape($product_option_value['points_prefix'])."', weight = '".(float)$product_option_value['weight']."', weight_prefix = '".$this->db->escape($product_option_value['weight_prefix'])."'")
#END
editProduct11=$this->db->query("INSERT INTO ".DB_PREFIX."product_option SET product_option_id = '".(int)$product_option['product_option_id']."', product_id = '".(int)$product_id."', option_id = '".(int)$product_option['option_id']."', required = '".(int)$product_option['required']."'")
#END
editProduct10=$this->db->query("DELETE FROM ".DB_PREFIX."product_option_value WHERE product_id = '".(int)$product_id."'")
#END
getProductsByCategoryId=$this->db->query("SELECT * FROM ".DB_PREFIX."product p LEFT JOIN ".DB_PREFIX."product_description pd ON (p.product_id = pd.product_id) LEFT JOIN ".DB_PREFIX."product_to_category p2c ON (p.product_id = p2c.product_id) WHERE pd.language_id = '".(int)$this->config->get('config_language_id')."' AND p2c.category_id = '".(int)$category_id."' ORDER BY pd.name ASC")
#END
getTotalProductsByLayoutId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product_to_layout WHERE layout_id = '".(int)$layout_id."'")
#END
deleteProduct=$this->db->query("DELETE FROM ".DB_PREFIX."product WHERE product_id = '".(int)$product_id."'")
#END
addProduct19=$this->db->query("INSERT INTO ".DB_PREFIX."product_related SET product_id = '".(int)$related_id."', related_id = '".(int)$product_id."'")
#END
addProduct17=$this->db->query("INSERT INTO ".DB_PREFIX."product_related SET product_id = '".(int)$product_id."', related_id = '".(int)$related_id."'")
#END
addProduct18=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$related_id."' AND related_id = '".(int)$product_id."'")
#END
addProduct15=$this->db->query("INSERT INTO ".DB_PREFIX."product_filter SET product_id = '".(int)$product_id."', filter_id = '".(int)$filter_id."'")
#END
addProduct16=$this->db->query("DELETE FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$product_id."' AND related_id = '".(int)$related_id."'")
#END
addProduct13=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_download SET product_id = '".(int)$product_id."', download_id = '".(int)$download_id."'")
#END
addProduct14=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_category SET product_id = '".(int)$product_id."', category_id = '".(int)$category_id."'")
#END
getProductFilters=$this->db->query("SELECT * FROM ".DB_PREFIX."product_filter WHERE product_id = '".(int)$product_id."'")
#END
getProductRelated=$this->db->query("SELECT * FROM ".DB_PREFIX."product_related WHERE product_id = '".(int)$product_id."'")
#END
getTotalProductsByManufacturerId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product WHERE manufacturer_id = '".(int)$manufacturer_id."'")
#END
getProductLayouts=$this->db->query("SELECT * FROM ".DB_PREFIX."product_to_layout WHERE product_id = '".(int)$product_id."'")
#END
getProductSpecials=$this->db->query("SELECT * FROM ".DB_PREFIX."product_special WHERE product_id = '".(int)$product_id."' ORDER BY priority, price")
#END
addProduct11=$this->db->query("INSERT INTO ".DB_PREFIX."product_special SET product_id = '".(int)$product_id."', customer_group_id = '".(int)$product_special['customer_group_id']."', priority = '".(int)$product_special['priority']."', price = '".(float)$product_special['price']."', date_start = '".$this->db->escape($product_special['date_start'])."', date_end = '".$this->db->escape($product_special['date_end'])."'")
#END
addProduct12=$this->db->query("INSERT INTO ".DB_PREFIX."product_image SET product_id = '".(int)$product_id."', image = '".$this->db->escape($product_image['image'])."', sort_order = '".(int)$product_image['sort_order']."'")
#END
addProduct10=$this->db->query("INSERT INTO ".DB_PREFIX."product_discount SET product_id = '".(int)$product_id."', customer_group_id = '".(int)$product_discount['customer_group_id']."', quantity = '".(int)$product_discount['quantity']."', priority = '".(int)$product_discount['priority']."', price = '".(float)$product_discount['price']."', date_start = '".$this->db->escape($product_discount['date_start'])."', date_end = '".$this->db->escape($product_discount['date_end'])."'")
#END
editProduct8=$this->db->query("INSERT INTO ".DB_PREFIX."product_attribute SET product_id = '".(int)$product_id."', attribute_id = '".(int)$product_attribute['attribute_id']."', language_id = '".(int)$language_id."', text = '".$this->db->escape($product_attribute_description['text'])."'")
#END
editProduct7=$this->db->query("DELETE FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."' AND attribute_id = '".(int)$product_attribute['attribute_id']."'")
#END
editProduct6=$this->db->query("DELETE FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."'")
#END
editProduct5=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_store SET product_id = '".(int)$product_id."', store_id = '".(int)$store_id."'")
#END
getTotalProductsByProfileId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product_recurring WHERE recurring_id = '".(int)$recurring_id."'")
#END
editProduct9=$this->db->query("DELETE FROM ".DB_PREFIX."product_option WHERE product_id = '".(int)$product_id."'")
#END
copyProduct=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."product p WHERE p.product_id = '".(int)$product_id."'")
#END
addProduct22=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'product_id=".(int)$product_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
addProduct23=$this->db->query("INSERT INTO `".DB_PREFIX."product_recurring` SET `product_id` = ".(int)$product_id.", customer_group_id = ".(int)$recurring['customer_group_id'].", `recurring_id` = ".(int)$recurring['recurring_id'])
#END
addProduct20=$this->db->query("INSERT INTO ".DB_PREFIX."product_reward SET product_id = '".(int)$product_id."', customer_group_id = '".(int)$customer_group_id."', points = '".(int)$product_reward['points']."'")
#END
addProduct21=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_layout SET product_id = '".(int)$product_id."', store_id = '".(int)$store_id."', layout_id = '".(int)$layout_id."'")
#END
editProduct4=$this->db->query("DELETE FROM ".DB_PREFIX."product_to_store WHERE product_id = '".(int)$product_id."'")
#END
editProduct3=$this->db->query("INSERT INTO ".DB_PREFIX."product_description SET product_id = '".(int)$product_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."', description = '".$this->db->escape($value['description'])."', tag = '".$this->db->escape($value['tag'])."', meta_title = '".$this->db->escape($value['meta_title'])."', meta_description = '".$this->db->escape($value['meta_description'])."', meta_keyword = '".$this->db->escape($value['meta_keyword'])."'")
#END
editProduct2=$this->db->query("DELETE FROM ".DB_PREFIX."product_description WHERE product_id = '".(int)$product_id."'")
#END
editProduct1=$this->db->query("UPDATE ".DB_PREFIX."product SET image = '".$this->db->escape($data['image'])."' WHERE product_id = '".(int)$product_id."'")
#END
getTotalProductsByStockStatusId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product WHERE stock_status_id = '".(int)$stock_status_id."'")
#END
getProduct=$this->db->query("SELECT DISTINCT *, (SELECT keyword FROM ".DB_PREFIX."url_alias WHERE query = 'product_id=".(int)$product_id."') AS keyword FROM ".DB_PREFIX."product p LEFT JOIN ".DB_PREFIX."product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = '".(int)$product_id."' AND pd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addProduct7=$this->db->query("INSERT INTO ".DB_PREFIX."product_option SET product_id = '".(int)$product_id."', option_id = '".(int)$product_option['option_id']."', required = '".(int)$product_option['required']."'")
#END
addProduct6=$this->db->query("INSERT INTO ".DB_PREFIX."product_attribute SET product_id = '".(int)$product_id."', attribute_id = '".(int)$product_attribute['attribute_id']."', language_id = '".(int)$language_id."', text = '".$this->db->escape($product_attribute_description['text'])."'")
#END
addProduct9=$this->db->query("INSERT INTO ".DB_PREFIX."product_option SET product_id = '".(int)$product_id."', option_id = '".(int)$product_option['option_id']."', value = '".$this->db->escape($product_option['value'])."', required = '".(int)$product_option['required']."'")
#END
addProduct8=$this->db->query("INSERT INTO ".DB_PREFIX."product_option_value SET product_option_id = '".(int)$product_option_id."', product_id = '".(int)$product_id."', option_id = '".(int)$product_option['option_id']."', option_value_id = '".(int)$product_option_value['option_value_id']."', quantity = '".(int)$product_option_value['quantity']."', subtract = '".(int)$product_option_value['subtract']."', price = '".(float)$product_option_value['price']."', price_prefix = '".$this->db->escape($product_option_value['price_prefix'])."', points = '".(int)$product_option_value['points']."', points_prefix = '".$this->db->escape($product_option_value['points_prefix'])."', weight = '".(float)$product_option_value['weight']."', weight_prefix = '".$this->db->escape($product_option_value['weight_prefix'])."'")
#END
addProduct1=$this->db->query("UPDATE ".DB_PREFIX."product SET image = '".$this->db->escape($data['image'])."' WHERE product_id = '".(int)$product_id."'")
#END
addProduct3=$this->db->query("INSERT INTO ".DB_PREFIX."product_to_store SET product_id = '".(int)$product_id."', store_id = '".(int)$store_id."'")
#END
addProduct2=$this->db->query("INSERT INTO ".DB_PREFIX."product_description SET product_id = '".(int)$product_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."', description = '".$this->db->escape($value['description'])."', tag = '".$this->db->escape($value['tag'])."', meta_title = '".$this->db->escape($value['meta_title'])."', meta_description = '".$this->db->escape($value['meta_description'])."', meta_keyword = '".$this->db->escape($value['meta_keyword'])."'")
#END
addProduct5=$this->db->query("DELETE FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."' AND attribute_id = '".(int)$product_attribute['attribute_id']."' AND language_id = '".(int)$language_id."'")
#END
addProduct4=$this->db->query("DELETE FROM ".DB_PREFIX."product_attribute WHERE product_id = '".(int)$product_id."' AND attribute_id = '".(int)$product_attribute['attribute_id']."'")
#END
