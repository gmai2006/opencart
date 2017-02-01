createVariants1=$this->db->query("INSERT INTO `".DB_PREFIX."product_option_variant` SET `product_id` = '".(int)$product_id."', `sku` = '', `stock` = '0', `active` = '0', `subtract` = '1', `price` = '0.00', `image` = '', `weight` = '0.00'")
#END
lengthClassExists1=$this->db->query("INSERT INTO `".DB_PREFIX."length_class` SET `value` = '1'")
#END
weightClassExists=$this->db->query("SELECT `weight_class_id` FROM `".DB_PREFIX."weight_class_description` WHERE LCASE(`title`) = '".$this->db->escape(strtolower($name))."' LIMIT 1")
#END
lengthClassExists2=$this->db->query("INSERT INTO `".DB_PREFIX."length_class_description` SET `language_id` = '".(int)$this->config->get('config_language_id')."', `length_class_id` = '".(int)$id."', `title` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."', `unit` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."'")
#END
lengthClassExists=$this->db->query("SELECT `length_class_id` FROM `".DB_PREFIX."length_class_description` WHERE LCASE(`title`) = '".$this->db->escape(strtolower($name))."' LIMIT 1")
#END
repairCategories=$this->db->query("SELECT * FROM ".DB_PREFIX."category WHERE parent_id = '".(int)$parent_id."'")
#END
getOption=$this->db->query("SELECT * FROM `".DB_PREFIX."option` `o` LEFT JOIN `".DB_PREFIX."option_description` `od` ON (`od`.`option_id` = `o`.`option_id`) WHERE `od`.`name` = '".$this->db->escape($name)."'LIMIT 1")
#END
getProductOption=$this->db->query("SELECT * FROM  ".DB_PREFIX."product_option WHERE product_id = '".(int)$product_id."' AND option_id = '".(int)$option_id."' LIMIT 1")
#END
attributeAdd=$this->db->query("SELECT * FROM `".DB_PREFIX."product_attribute` WHERE `product_id` = '".(int)$product_id."' AND `attribute_id` = '".(int)$attribute_id."' AND `language_id` = '".(int)$this->config->get('config_language_id')."'")
#END
createVariants2=$this->db->query("INSERT INTO `".DB_PREFIX."product_option_variant_value` SET `product_option_variant_id` = '".(int)$variant_id."', `product_option_value_id` = '".(int)$new_variant_value."', `product_id` = '".(int)$product_id."', `sort_order` = '".(int)$i++."'")
#END
createVariants3=$this->db->query("UPDATE `".DB_PREFIX."product_option_variant` SET `product_id` = '".(int)$product_id."', `sku` = '".$this->db->escape($variant['sku'])."', `stock` = '".(int)$variant['qty']."', `active` = 1, `price` = '".(float)$variant['price']."' WHERE `product_option_variant_id` = '".(int)$variant_row['product_option_variant_id']."'")
#END
attributeGroupExists1=$this->db->query("SELECT `sort_order` FROM  `".DB_PREFIX."attribute_group` ORDER BY `sort_order` DESC LIMIT 1")
#END
attributeGroupExists2=$this->db->query("INSERT INTO `".DB_PREFIX."attribute_group` SET `sort_order` = '".(int)$sort."'")
#END
attributeGroupExists3=$this->db->query("INSERT INTO `".DB_PREFIX."attribute_group_description` SET `attribute_group_id` = '".(int)$id."', `language_id` = '".(int)$this->config->get('config_language_id')."', `name` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."'")
#END
attributeGroupExists=$this->db->query("SELECT * FROM  `".DB_PREFIX."attribute_group_description` WHERE `name` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."' AND `language_id` = '".(int)$this->config->get('config_language_id')."' LIMIT 1")
#END
importItems16=$this->db->query("INSERT INTO `".DB_PREFIX."category_description` SET `name` = '".$this->db->escape($key5)."', `language_id` = '".(int)$this->config->get('config_language_id')."', `category_id` = '".$this->db->escape($id4)."'")
#END
importItems17=$this->db->query("INSERT INTO `".DB_PREFIX."category_to_store` SET `category_id` = '".$this->db->escape($id4)."', `store_id` = '0'")
#END
importItems18=$this->db->query("
					INSERT INTO `".DB_PREFIX."product` SET
						`quantity`              = '".(int)$item['Quantity']."',
						`manufacturer_id`       = '".(int)$manufacturer_id."',
						`stock_status_id`       = '6',
						`price`                 = '".(double)$net_price."',
						`tax_class_id`          = '9',
						`location`              = '".$this->db->escape(isset($item['note'])?$item['note']:'')."',
						`mpn`              		= '".$this->db->escape(isset($item['advanced']['brand']['mpn'])?$item['advanced']['brand']['mpn']:'')."',
						`sku`              		= '".$this->db->escape(isset($item['SKU'])?$item['SKU']:'')."',
						`model`              	= '".$this->db->escape(isset($item['SKU'])?$item['SKU']:'')."',
						`isbn`              	= '".$this->db->escape(isset($item['advanced']['isbn'])?$item['advanced']['isbn']:'')."',
						`ean`              		= '".$this->db->escape(isset($item['advanced']['ean'])?$item['advanced']['ean']:'')."',
						`upc`              		= '".$this->db->escape(isset($item['advanced']['upc'])?$item['advanced']['upc']:'')."',
						`weight`       			= '".(double)$weight."',
						`weight_class_id`       = '".(int)$weight_class_id."',
						`length`       			= '".(double)$length."',
						`width`       			= '".(double)$width."',
						`height`       			= '".(double)$height."',
						`length_class_id`       = '".(int)$length_class_id."',
						`subtract`              = '1',
						`minimum`               = '1',
						`status`                = '1',
						".$openstock_sql."
						`date_available`        = now(),
						`date_added`            = now(),
						`date_modified`         = now()
				")
#END
importItems19=$this->db->query("INSERT INTO `".DB_PREFIX."product_description` SET `product_id` = '".(int)$product_id."', `language_id` = '".(int)$this->config->get('config_language_id')."', `name` = '".$this->db->escape(htmlspecialchars(base64_decode($item['Title']),ENT_COMPAT,'UTF-8'))."', `description` = '".$this->db->escape(htmlspecialchars(utf8_encode($item['Description']),ENT_COMPAT,'UTF-8'))."'")
#END
addImage=$this->db->query("INSERT INTO `".DB_PREFIX."ebay_image_import` SET `image_original` = '".$this->db->escape($orig)."', `image_new` = '".$this->db->escape($new)."', `name` = '".$this->db->escape($name)."', `product_id` = '".(int)$product_id."', `imgcount` = '".(int)$img_count."'")
#END
createVariants=$this->db->query("UPDATE `".DB_PREFIX."product_option_value` SET subtract = '0', price = '0.000', quantity = '0' WHERE product_id = '".(int)$product_id."'")
#END
createCategoryLink=$this->db->query("INSERT INTO `".DB_PREFIX."product_to_category` SET `product_id` = '".(int)$product_id."', `category_id` = '".(int)$category_id."'")
#END
createOption2=$this->db->query("INSERT INTO `".DB_PREFIX."option_description` SET `language_id` = '".(int)$this->config->get('config_language_id')."', `name` = '".$this->db->escape($name)."', `option_id` = '".(int)$option_id."'")
#END
createOption1=$this->db->query("SELECT * FROM `".DB_PREFIX."option` WHERE `option_id` = '".(int)$option_id."' LIMIT 1")
#END
manufacturerExists3=$this->db->query("INSERT INTO `".DB_PREFIX."manufacturer_to_store` SET `manufacturer_id` = '".(int)$id."', `store_id` = '0'")
#END
manufacturerExists2=$this->db->query("INSERT INTO `".DB_PREFIX."manufacturer` SET `sort_order` = '".(int)$sort."', `name` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."'")
#END
attributeExists=$this->db->query("SELECT * FROM `".DB_PREFIX."attribute_description` `ad`, `".DB_PREFIX."attribute` `a` WHERE `ad`.`name` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."' AND `ad`.`language_id` = '".(int)$this->config->get('config_language_id')."' AND `a`.`attribute_id` = `ad`.`attribute_id` AND `a`.`attribute_group_id` = '".(int)$group_id."' LIMIT 1")
#END
manufacturerExists1=$this->db->query("SELECT `sort_order` FROM  `".DB_PREFIX."manufacturer` ORDER BY `sort_order` DESC LIMIT 1")
#END
importItems2=$this->db->query("SELECT * FROM `".DB_PREFIX."category`, `".DB_PREFIX."category_description` WHERE `".DB_PREFIX."category`.`parent_id` = '0' AND `".DB_PREFIX."category_description`.`name` = '".$this->db->escape($key2)."' LIMIT 1")
#END
importItems1=$this->db->query("CREATE TABLE IF NOT EXISTS `".DB_PREFIX."ebay_image_import` (`id` int(11) NOT NULL AUTO_INCREMENT, `image_original` text NOT NULL, `image_new` text NOT NULL, `name` text NOT NULL, `product_id` int(11) NOT NULL, `imgcount` int(11) NOT NULL, PRIMARY KEY (`id`)) ENGINE=MyISAM  DEFAULT CHARSET=utf8;")
#END
attributeExists1=$this->db->query("SELECT `sort_order` FROM  `".DB_PREFIX."attribute` ORDER BY `sort_order` DESC LIMIT 1")
#END
manufacturerExists=$this->db->query("SELECT * FROM  `".DB_PREFIX."manufacturer` WHERE LCASE(`name`) = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."' LIMIT 1")
#END
attributeExists3=$this->db->query("INSERT INTO `".DB_PREFIX."attribute_description` SET `attribute_id` = '".(int)$id."', `language_id` = '".(int)$this->config->get('config_language_id')."', `name` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."'")
#END
getOptionValue=$this->db->query("SELECT * FROM `".DB_PREFIX."option_value` ov LEFT JOIN `".DB_PREFIX."option_value_description` `ovd` ON (`ovd`.`option_value_id` = `ov`.`option_value_id`) WHERE `ovd`.`name` = '".$this->db->escape($name)."' AND `ovd`.`option_id` = '".(int)$option_id."'LIMIT 1")
#END
attributeExists2=$this->db->query("INSERT INTO `".DB_PREFIX."attribute` SET `sort_order` = '".(int)$sort."', `attribute_group_id` = '".(int)$group_id."'")
#END
weightClassExists1=$this->db->query("INSERT INTO `".DB_PREFIX."weight_class` SET `value` = '1'")
#END
importItems9=$this->db->query("INSERT INTO `".DB_PREFIX."category_to_store` SET `category_id` = '".$this->db->escape($id2)."', `store_id` = '0'")
#END
importItems8=$this->db->query("INSERT INTO `".DB_PREFIX."category_description` SET `name` = '".$this->db->escape($key3)."', `language_id` = '".(int)$this->config->get('config_language_id')."', `category_id` = '".$this->db->escape($id2)."'")
#END
importItems7=$this->db->query("INSERT INTO `".DB_PREFIX."category` SET `parent_id` = '".$this->db->escape($id1)."', `status` = '1', `top` = '1'")
#END
weightClassExists2=$this->db->query("INSERT INTO `".DB_PREFIX."weight_class_description` SET `language_id` = '".(int)$this->config->get('config_language_id')."', `weight_class_id` = '".(int)$id."', `title` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."', `unit` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."'")
#END
importItems6=$this->db->query("SELECT * FROM `".DB_PREFIX."category`, `".DB_PREFIX."category_description` WHERE `".DB_PREFIX."category`.`parent_id` = '".$this->db->escape($id1)."' AND `".DB_PREFIX."category_description`.`name` = '".$this->db->escape($key3)."' LIMIT 1")
#END
importItems5=$this->db->query("INSERT INTO `".DB_PREFIX."category_to_store` SET `category_id` = '".$this->db->escape($id1)."', `store_id` = '0'")
#END
importItems20=$this->db->query("INSERT INTO `".DB_PREFIX."product_to_store` SET `product_id` = '".(int)$product_id."', `store_id` = '0'")
#END
importItems4=$this->db->query("INSERT INTO `".DB_PREFIX."category_description` SET `name` = '".$this->db->escape($key2)."', `language_id` = '".(int)$this->config->get('config_language_id')."', `category_id` = '".$this->db->escape($id1)."'")
#END
importItems3=$this->db->query("INSERT INTO `".DB_PREFIX."category` SET `parent_id` = '0', `status` = '1', `top` = '1'")
#END
importItems=$this->db->query("SHOW TABLES LIKE '".DB_PREFIX."ebay_image_import'")
#END
getProductOption1=$this->db->query("INSERT INTO ".DB_PREFIX."product_option SET product_id = '".(int)$product_id."', option_id = '".(int)$option_id."', required = '1'")
#END
createOptionValue1=$this->db->query("INSERT INTO `".DB_PREFIX."option_value_description` SET `language_id` = '".(int)$this->config->get('config_language_id')."', `name` = '".$this->db->escape($name)."', `option_id` = '".(int)$option_id."', `option_value_id` = '".(int)$id."'")
#END
repairCategories2=$this->db->query("SELECT * FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$parent_id."' ORDER BY level ASC")
#END
repairCategories1=$this->db->query("DELETE FROM `".DB_PREFIX."category_path` WHERE category_id = '".(int)$category['category_id']."'")
#END
getProductOptionValue=$this->db->query("SELECT * FROM  `".DB_PREFIX."product_option_value` WHERE `product_id` = '".(int)$product_id."' AND `option_id` = '".(int)$option_id."' AND `product_option_id` = '".(int)$product_option_id."' AND `option_value_id` = '".(int)$option_value_id."' LIMIT 1")
#END
repairCategories4=$this->db->query("REPLACE INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category['category_id']."', `path_id` = '".(int)$category['category_id']."', level = '".(int)$level."'")
#END
repairCategories3=$this->db->query("INSERT INTO `".DB_PREFIX."category_path` SET category_id = '".(int)$category['category_id']."', `path_id` = '".(int)$result['path_id']."', level = '".(int)$level."'")
#END
importItems12=$this->db->query("INSERT INTO `".DB_PREFIX."category_description` SET `name` = '".$this->db->escape($key4)."', `language_id` = '".(int)$this->config->get('config_language_id')."', `category_id` = '".$id3."'")
#END
importItems13=$this->db->query("INSERT INTO `".DB_PREFIX."category_to_store` SET `category_id` = '".$this->db->escape($id3)."', `store_id` = '0'")
#END
createOptionValue=$this->db->query("INSERT INTO `".DB_PREFIX."option_value` SET `option_id` = '".(int)$option_id."', `sort_order` = IFNULL((select `sort` FROM (SELECT (MAX(`sort_order`)+1) AS `sort` FROM `".DB_PREFIX."option_value`) AS `i`),0)")
#END
importItems14=$this->db->query("SELECT * FROM `".DB_PREFIX."category`, `".DB_PREFIX."category_description` WHERE `".DB_PREFIX."category`.`parent_id` = '".$this->db->escape($id3)."' AND `".DB_PREFIX."category_description`.`name` = '".$this->db->escape($key5)."' LIMIT 1")
#END
importItems15=$this->db->query("INSERT INTO `".DB_PREFIX."category` SET `parent_id` = '".$this->db->escape($id3)."', `status` = '1', `top` = '1'")
#END
getProductOptionValue1=$this->db->query("INSERT INTO ".DB_PREFIX."product_option_value SET product_option_id = '".(int)$product_option_id."', product_id = '".(int)$product_id."', option_id = '".(int)$option_id."', option_value_id = '".(int)$option_value_id."'")
#END
importItems10=$this->db->query("SELECT * FROM `".DB_PREFIX."category`, `".DB_PREFIX."category_description` WHERE `".DB_PREFIX."category`.`parent_id` = '".$this->db->escape($id2)."' AND `".DB_PREFIX."category_description`.`name` = '".$this->db->escape($key4)."' LIMIT 1")
#END
importItems11=$this->db->query("INSERT INTO `".DB_PREFIX."category` SET `parent_id` = '".$this->db->escape($id2)."', `status` = '1', `top` = '1'")
#END
createOption=$this->db->query("INSERT INTO `".DB_PREFIX."option` SET `type` = 'select', `sort_order` = IFNULL((select `sort` FROM (SELECT (MAX(`sort_order`)+1) AS `sort` FROM `".DB_PREFIX."option`) AS `i`),0)")
#END
attributeAdd1=$this->db->query("INSERT INTO `".DB_PREFIX."product_attribute` SET `product_id` = '".(int)$product_id."', `attribute_id` = '".(int)$attribute_id."', `text` = '".$this->db->escape(htmlspecialchars($name,ENT_COMPAT))."', `language_id` = '".(int)$this->config->get('config_language_id')."'")
#END
