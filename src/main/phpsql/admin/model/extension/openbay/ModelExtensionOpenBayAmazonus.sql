getProductStatus5=$this->db->query("SELECT * FROM `".DB_PREFIX."amazonus_product` WHERE `product_id` = ".(int)$product_id." AND `version` = 3")->row
#END
uninstall1=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_order_product`")
#END
getUnlinkedProducts1=$this->db->query("
				SELECT `p`.`product_id`, `p`.`model`, `p`.`sku`, `pd`.`name` as `product_name`, '' as `var`, '' as `combination`
				FROM `".DB_PREFIX."product` as `p`
				LEFT JOIN `".DB_PREFIX."product_description` as `pd`
				ON `p`.`product_id` = `pd`.`product_id`
				LEFT JOIN `".DB_PREFIX."amazonus_product_link` as `apl`
				ON `apl`.`product_id` = `p`.`product_id`
				WHERE `apl`.`amazonus_sku` IS NULL
				AND `pd`.`language_id` = '".(int)$this->config->get('config_language_id')."'")->rows
#END
getProductStatus3=$this->db->query("
			SELECT COUNT(*) count
			FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND status = 'saved'")->row
#END
getProductStatus=$this->db->query("
			SELECT COUNT(*) count
			FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND status = 'uploaded'")->row
#END
getProductStatus4=$this->db->query("
			SELECT COUNT(*) as count
			FROM `".DB_PREFIX."amazonus_product_link`
			WHERE `product_id` = '".(int)$product_id."'")->row
#END
saveProduct=$this->db->query("
			REPLACE INTO `".DB_PREFIX."amazonus_product`
			SET `product_id` = '".(int)$product_id."',
				`sku` = '".$this->db->escape($sku)."',
				`category` = '".$this->db->escape($category)."',
				`data` = '".$this->db->escape($data_encoded)."',
				`status` = 'saved',
				`insertion_id` = '',
				`price` = '".$price."',
				`var` = '".$this->db->escape($var)."',
				`marketplaces` = '".$this->db->escape($marketplaces)."'")
#END
getProductStatus1=$this->db->query("
			SELECT COUNT(*) count
			FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND status = 'ok'")->row
#END
getProductStatus2=$this->db->query("
			SELECT COUNT(*) count
			FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND status = 'error'")->row
#END
updateAmazonusOrderTracking=$this->db->query("UPDATE `".DB_PREFIX."amazonus_order` SET `courier_id` = '".$this->db->escape($courier_id)."', `courier_other` = ".(int)!$courier_from_list.", `tracking_no` = '".$this->db->escape($tracking_no)."' WHERE `order_id` = ".(int)$order_id."")
#END
getUnlinkedItemsFromReport=$this->db->query("
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, oc_sku.pov_id
				FROM ".DB_PREFIX."amazonus_listing_report alr
				LEFT JOIN (
				  SELECT p.product_id, if (por.product_id IS NULL, p.sku, por.sku) AS 'sku', if (por.product_id IS NULL, NULL, por.sku) AS 'var', if (por.product_id IS NULL, p.quantity, por.stock) AS 'quantity', por.product_option_variant_id AS pov_id
				  FROM ".DB_PREFIX."product p
				  LEFT JOIN ".DB_PREFIX."product_option_variant por USING(product_id)
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN ".DB_PREFIX."amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN ".DB_PREFIX."product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ".(int)$this->config->get('config_language_id')."
				WHERE apl.product_id IS NULL
				ORDER BY alr.sku
				LIMIT ".(int)$start.",".(int)$limit)->rows
#END
getProductErrors=$this->db->query("
			SELECT `messages` FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND `version` = 3")->row
#END
getProductsWithErrors=$this->db->query("
			SELECT `product_id`, `sku` FROM `".DB_PREFIX."amazonus_product`
			WHERE `status` = 'error' AND `version` = 2")->rows
#END
updateAmazonSkusQuantities1=$this->db->query("
				SELECT apl.amazonus_sku, p.quantity
				FROM ".DB_PREFIX."amazonus_product_link apl
				JOIN ".DB_PREFIX."product p ON apl.product_id = p.product_id
				WHERE apl.amazonus_sku IN (".implode(',',$sku_array).")
			")->rows
#END
uninstall8=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_product_search`")
#END
uninstall9=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_listing_report`")
#END
uninstall6=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_product_error`")
#END
uninstall7=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_process`")
#END
uninstall4=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_product_link`")
#END
uninstall5=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_product_unshipped`")
#END
setProductUploaded=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product`
			SET `status` = 'uploaded', `insertion_id` = '".$this->db->escape($insertion_id)."'
			WHERE `product_id` = '".(int)$product_id."' AND `var` = '".$this->db->escape($var)."' AND `version` = 2")
#END
deleteProduct=$this->db->query("DELETE FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."'")
#END
getTotalUnlinkedItemsFromReport1=$this->db->query("
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, '' AS combination
				FROM ".DB_PREFIX."amazonus_listing_report alr
				LEFT JOIN (
					SELECT p.product_id, p.sku, NULL AS 'var', p.quantity
					FROM ".DB_PREFIX."product p
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN ".DB_PREFIX."amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN ".DB_PREFIX."product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ".(int)$this->config->get('config_language_id')."
				WHERE apl.product_id IS NULL
				ORDER BY alr.sku
			")
#END
uninstall2=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_product2`")
#END
uninstall3=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_product`")
#END
getOrderStatusString=$this->db->query("
			SELECT `s`.`key`
			FROM `".DB_PREFIX."order` `o`
			JOIN `".DB_PREFIX."setting` `s` ON `o`.`order_id` = ".(int)$order_id." AND `s`.`value` = `o`.`order_status_id`
			WHERE `s`.`key` = 'openbay_amazonus_order_status_shipped' OR `s`.`key` = 'openbay_amazonus_order_status_canceled'
			LIMIT 1")->row
#END
removeProductLink=$this->db->query("DELETE FROM `".DB_PREFIX."amazonus_product_link`
			WHERE `amazonus_sku` = '".$this->db->escape($amazonus_sku)."'")
#END
getTotalUnlinkedItemsFromReport=$this->db->query("
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, oc_sku.pov_id
				FROM ".DB_PREFIX."amazonus_listing_report alr
				LEFT JOIN (
				  SELECT p.product_id, if (por.product_id IS NULL, p.sku, por.sku) AS 'sku', if (por.product_id IS NULL, NULL, por.sku) AS 'var', if (por.product_id IS NULL, p.quantity, por.stock) AS 'quantity', por.product_option_variant_id AS pov_id
				  FROM ".DB_PREFIX."product p
				  LEFT JOIN ".DB_PREFIX."product_option_variant por USING(product_id)
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN ".DB_PREFIX."amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN ".DB_PREFIX."product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ".(int)$this->config->get('config_language_id')."
				WHERE apl.product_id IS NULL
			")
#END
getUnlinkedProducts=$this->db->query("
				SELECT `p`.`product_id`, `p`.`model`, `p`.`sku`, `pd`.`name` as `product_name`, '' as `var`, '' as `combination`, `p`.`has_option`
				FROM `".DB_PREFIX."product` as `p`
				LEFT JOIN `".DB_PREFIX."product_description` as `pd`
				ON `p`.`product_id` = `pd`.`product_id`
				AND `pd`.`language_id` = '".(int)$this->config->get('config_language_id')."'")->rows
#END
install=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_order` (
			  `order_id` int(11) NOT NULL ,
			  `amazonus_order_id` char(19) NOT NULL ,
			  `courier_id` varchar(255) NOT NULL ,
			  `courier_other` tinyint(1) NOT NULL,
			  `tracking_no` varchar(255) NOT NULL ,
			  PRIMARY KEY (`order_id`, `amazonus_order_id`)
		) DEFAULT COLLATE=utf8_general_ci;")
#END
removeAdvancedErrors=$this->db->query("
			SELECT `insertion_id` FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND `version` = 2")->rows
#END
uninstall10=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `code` = 'openbay_amazonus'")
#END
linkProduct1=$this->db->query("INSERT INTO `".DB_PREFIX."amazonus_product_link` SET `product_id` = '".(int)$product_id."', `amazonus_sku` = '".$this->db->escape($amazonus_sku)."', `var` = '".$this->db->escape($var)."'")
#END
uninstall=$this->db->query("DROP TABLE IF EXISTS `".DB_PREFIX."amazonus_order`")
#END
getProductErrors2=$this->db->query("SELECT * FROM `".DB_PREFIX."amazonus_product_error` WHERE `sku` = '".$this->db->escape($insertion_row['sku'])."' AND `insertion_id` = '".$this->db->escape($insertion_row['insertion_id'])."'")->rows
#END
removeAdvancedErrors2=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product`
			SET `status` = 'saved', `insertion_id` = ''
			WHERE `product_id` = '".(int)$product_id."' AND `status` = 'error' AND `version` = 2")
#END
getProductLinks=$this->db->query($query)->rows
#END
getProductErrors1=$this->db->query("SELECT `sku`, `insertion_id` FROM `".DB_PREFIX."amazonus_product` WHERE `product_id` = '".(int)$product_id."' AND `version` = 2")->rows
#END
removeAdvancedErrors1=$this->db->query("DELETE FROM `".DB_PREFIX."amazonus_product_error`
				WHERE `insertion_id` = '".$this->db->escape($product['insertion_id'])."'")
#END
getUnlinkedItemsFromReport1=$this->db->query("
				SELECT alr.sku AS 'amazon_sku', alr.quantity AS 'amazon_quantity', alr.asin, alr.price AS 'amazon_price', oc_sku.product_id, pd.name, oc_sku.sku, oc_sku.var, oc_sku.quantity, '' AS combination
				FROM ".DB_PREFIX."amazonus_listing_report alr
				LEFT JOIN (
					SELECT p.product_id, p.sku, NULL AS 'var', p.quantity
					FROM ".DB_PREFIX."product p
				) AS oc_sku ON alr.sku = oc_sku.sku
				LEFT JOIN ".DB_PREFIX."amazonus_product_link apl ON (oc_sku.var IS NULL AND oc_sku.product_id = apl.product_id) OR (oc_sku.var IS NOT NULL AND oc_sku.product_id = apl.product_id AND oc_sku.var = apl.var)
				LEFT JOIN ".DB_PREFIX."product_description pd ON oc_sku.product_id = pd.product_id AND pd.language_id = ".(int)$this->config->get('config_language_id')."
				WHERE apl.product_id IS NULL
				ORDER BY alr.sku
				LIMIT ".(int)$start.",".(int)$limit)->rows
#END
install1=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_order_product` (
				`order_product_id` int(11) NOT NULL ,
				`amazonus_order_item_id` varchar(255) NOT NULL,
				PRIMARY KEY(`order_product_id`, `amazonus_order_item_id`)
		);")
#END
install2=$this->db->query("
			CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_product_unshipped` (
				`order_id` int(11) NOT NULL,
				`product_id` int(11) NOT NULL,
				`quantity` int(11) NOT NULL DEFAULT '0',
				PRIMARY KEY (`order_id`,`product_id`)
			) DEFAULT COLLATE=utf8_general_ci;")
#END
getProduct=$this->db->query("
			SELECT * FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND `var` = '".$this->db->escape($var)."' AND `version` = 2")->row
#END
productLinkExists=$this->db->query("SELECT * FROM `".DB_PREFIX."amazonus_product_link` WHERE `product_id` = ".(int)$product_id." AND var = '".$this->db->escape($var)."'")->row
#END
deleteListingReports=$this->db->query("
			DELETE FROM ".DB_PREFIX."amazonus_listing_report
		")
#END
getAmazonusOrderedProducts=$this->db->query("
			SELECT `aop`.`amazonus_order_item_id`, `op`.`quantity`
			FROM `".DB_PREFIX."amazonus_order_product` `aop`
			JOIN `".DB_PREFIX."order_product` `op` ON `op`.`order_product_id` = `aop`.`order_product_id`
				AND `op`.`order_id` = ".(int)$order_id)->rows
#END
getSavedProducts=$this->db->query("
			SELECT `ap`.`status`, `ap`.`product_id`, `ap`.`sku` as `amazonus_sku`, `pd`.`name` as `product_name`, `p`.`model` as `product_model`, `p`.`sku` as `product_sku`, `ap`.`var` as `var`
			FROM `".DB_PREFIX."amazonus_product` as `ap`
			LEFT JOIN `".DB_PREFIX."product_description` as `pd`
			ON `ap`.`product_id` = `pd`.`product_id`
			LEFT JOIN `".DB_PREFIX."product` as `p`
			ON `ap`.`product_id` = `p`.`product_id`
			WHERE `ap`.`status` = 'saved'
			AND `pd`.`language_id` = '".(int)$this->config->get('config_language_id')."'")->rows
#END
install7=$this->db->query("
			CREATE TABLE IF NOT EXISTS`".DB_PREFIX."amazonus_listing_report` (
				`sku` varchar(255) NOT NULL,
				`quantity` int(10) unsigned NOT NULL,
				`asin` varchar(255) NOT NULL,
				`price` decimal(10,4) NOT NULL,
				PRIMARY KEY (`sku`)
			) DEFAULT COLLATE=utf8_general_ci;
		")
#END
install5=$this->db->query("
		CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_product_link` (
		  `id` int(11) NOT NULL AUTO_INCREMENT,
		  `amazonus_sku` varchar(255) NOT NULL,
		  `var` char(100) NOT NULL DEFAULT '',
		  `product_id` int(11) NOT NULL,
		  PRIMARY KEY (`id`)
		) DEFAULT COLLATE=utf8_general_ci;")
#END
deleteSaved=$this->db->query("DELETE FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND `var` = '".$this->db->escape($var)."'")
#END
install6=$this->db->query("
		CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_product_search` (
			`product_id` int(11) NOT NULL,
			`status` enum('searching','finished') NOT NULL,
			`matches` int(11) DEFAULT NULL,
			`data` text,
			PRIMARY KEY (`product_id`)
		) DEFAULT COLLATE=utf8_general_ci;")
#END
install3=$this->db->query("
		CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_product` (
		  `version` int(11) NOT NULL DEFAULT 2,
		  `product_id`  int(11) NOT NULL ,
		  `category`  varchar(255) NOT NULL ,
		  `sku`  varchar(255) NOT NULL ,
		  `insertion_id` varchar(255) NOT NULL ,
		  `data`  text NOT NULL ,
		  `status` enum('saved','uploaded','ok','error') NOT NULL ,
		  `price`  decimal(15,4) NOT NULL COMMENT 'Price on Amazonus' ,
		  `var` char(100) NOT NULL DEFAULT '',
		  `marketplaces` text NOT NULL ,
		  `messages` text NOT NULL,
		  PRIMARY KEY (`product_id`, `var`)
		);")
#END
install4=$this->db->query("
		CREATE TABLE IF NOT EXISTS `".DB_PREFIX."amazonus_product_error` (
		  `error_id` int(11) NOT NULL AUTO_INCREMENT,
		  `sku` varchar(255) NOT NULL ,
		  `insertion_id` varchar(255) NOT NULL ,
		  `error_code` int(11) NOT NULL ,
		  `message` text NOT NULL ,
		  PRIMARY KEY (`error_id`)
		);")
#END
updateAmazonSkusQuantities=$this->db->query("
				SELECT apl.amazonus_sku, if (por.product_id IS NULL, p.quantity, por.stock) AS 'quantity'
				FROM ".DB_PREFIX."amazonus_product_link apl
				JOIN ".DB_PREFIX."product p ON apl.product_id = p.product_id
				LEFT JOIN ".DB_PREFIX."product_option_variant por ON apl.product_id = por.product_id AND apl.var = por.sku
				WHERE apl.amazonus_sku IN (".implode(',',$sku_array).")
			")->rows
#END
getProductCategory=$this->db->query("
			SELECT `category` FROM `".DB_PREFIX."amazonus_product`
			WHERE `product_id` = '".(int)$product_id."' AND `var` = '".$this->db->escape($var)."' AND `version` = 2")->row
#END
linkProduct=$this->db->query("SELECT COUNT(*) as `count` FROM `".DB_PREFIX."amazonus_product_link` WHERE `product_id` = '".(int)$product_id."' AND `amazonus_sku` = '".$this->db->escape($amazonus_sku)."' AND `var` = '".$this->db->escape($var)."' LIMIT 1")->row
#END
resetUploaded=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product`
			SET `status` = 'saved', `insertion_id` = ''
			WHERE `insertion_id` = '".$this->db->escape($insertion_id)."' AND `version` = 2")
#END
getAmazonusOrderId=$this->db->query("
			SELECT `amazonus_order_id`
			FROM `".DB_PREFIX."amazonus_order`
			WHERE `order_id` = ".(int)$order_id."
			LIMIT 1")->row
#END
getSavedProductsData=$this->db->query("
			SELECT * FROM `".DB_PREFIX."amazonus_product`
			WHERE `status` = 'saved' AND `version` = 2")->rows
#END
