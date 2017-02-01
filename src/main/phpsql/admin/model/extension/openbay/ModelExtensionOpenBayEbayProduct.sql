getProductOptions=$this->db->query("SELECT * FROM ".DB_PREFIX."product_option po LEFT JOIN `".DB_PREFIX."option` o ON (po.option_id = o.option_id) LEFT JOIN ".DB_PREFIX."option_description od ON (o.option_id = od.option_id) WHERE po.product_id = '".(int)$product_id."' AND od.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY o.sort_order")
#END
repairLinks2=$this->db->query("UPDATE `".DB_PREFIX."ebay_listing` SET `status` = 0  WHERE `product_id` = '".(int)$row['product_id']."'")
#END
repairLinks=$this->db->query("
			SELECT DISTINCT `product_id`
			FROM `".DB_PREFIX."ebay_listing`
			WHERE `status` = '1'")
#END
repairLinks1=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_listing` WHERE `product_id` = '".(int)$row['product_id']."' AND `status` = 1 ORDER BY `ebay_listing_id` DESC")
#END
getProductOptions1=$this->db->query("SELECT * FROM ".DB_PREFIX."product_option_value pov LEFT JOIN ".DB_PREFIX."option_value ov ON (pov.option_value_id = ov.option_value_id) LEFT JOIN ".DB_PREFIX."option_value_description ovd ON (ov.option_value_id = ovd.option_value_id) WHERE pov.product_option_id = '".(int)$product_option['product_option_id']."' AND ovd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY ov.sort_order")
#END
countImportImages=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_image_import`")
#END
