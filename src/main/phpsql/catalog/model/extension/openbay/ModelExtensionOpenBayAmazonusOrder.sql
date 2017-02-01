getOrderId=$this->db->query("SELECT `order_id` FROM `".DB_PREFIX."amazonus_order` WHERE `amazonus_order_id` = '".$this->db->escape($amazonus_order_id)."' LIMIT 1")->row
#END
updateOrderStatus1=$this->db->query("UPDATE `".DB_PREFIX."order` SET `order_status_id` = ".(int)$status_id." WHERE `order_id` = ".(int)$order_id)
#END
getZoneId=$this->db->query("SELECT `zone_id` FROM `".DB_PREFIX."zone` WHERE LOWER(`name`) = '".$this->db->escape(strtolower($zone_name))."'")->row
#END
decreaseProductQuantity=$this->db->query("UPDATE `".DB_PREFIX."product` SET `quantity` = GREATEST(`quantity` - '".(int)$delta."', 0) WHERE `product_id` = '".(int)$product_id."' AND `subtract` = '1'")
#END
updateOrderStatus=$this->db->query("INSERT INTO `".DB_PREFIX."order_history` (`order_id`, `order_status_id`, `notify`, `comment`, `date_added`) VALUES (".(int)$order_id.", ".(int)$status_id.", 0, '', NOW())")
#END
getProductId=$this->db->query("SELECT `product_id` FROM `".DB_PREFIX."amazonus_product_link` WHERE `amazonus_sku` = '".$this->db->escape($sku)."'")->row
#END
decreaseProductQuantity1=$this->db->query("UPDATE `".DB_PREFIX."product_option_variant` SET `stock` = GREATEST(`stock` - '".(int)$delta."', 0) WHERE `product_id` = '".(int)$product_id."' AND `sku` = '".$this->db->escape($var)."' AND `subtract` = '1'")
#END
addAmazonusOrderProducts=$this->db->query("SELECT `order_product_id` FROM `".DB_PREFIX."order_product` WHERE `model` = '".$this->db->escape($sku)."' AND `order_id` = ".(int)$order_id."LIMIT 1")->row
#END
getProductVar=$this->db->query("SELECT `var` FROM `".DB_PREFIX."amazonus_product_link` WHERE `amazonus_sku` = '".$this->db->escape($sku)."'")->row
#END
addAmazonusOrder=$this->db->query("INSERT INTO `".DB_PREFIX."amazonus_order` (`order_id`, `amazonus_order_id`) VALUES (".(int)$order_id.", '".$this->db->escape($amazonus_order_id)."')")
#END
getProductOptionsByVar=$this->db->query("SELECT
				pov.product_option_id,
				pov.product_option_value_id,
				od.name,
				ovd.name as value,
				opt.type
			FROM `".DB_PREFIX."product_option_value` as pov,
				 `".DB_PREFIX."product_option` as po,
				 `".DB_PREFIX."option` as opt,
				 `".DB_PREFIX."option_value_description` as ovd,
				 `".DB_PREFIX."option_description` as od
			WHERE pov.product_option_value_id = '".(int)$option_value_id."' AND
				po.product_option_id = pov.product_option_id AND
				opt.option_id = pov.option_id AND
				ovd.option_value_id = pov.option_value_id AND ovd.language_id = '".(int)$this->config->get('config_language_id')."' AND
				od.option_id = pov.option_id AND od.language_id = '".(int)$this->config->get('config_language_id')."'
			")->row
#END
getOrderStatus=$this->db->query("SELECT `order_status_id` FROM `".DB_PREFIX."order` WHERE `order_id` = ".(int)$order_id)->row
#END
getCountryId=$this->db->query("SELECT `country_id` FROM `".DB_PREFIX."country` WHERE LOWER(`iso_code_2`) = '".$this->db->escape(strtolower($country_code))."'")->row
#END
addAmazonusOrderProducts1=$this->db->query("INSERT INTO `".DB_PREFIX."amazonus_order_product` (`order_product_id`, `amazonus_order_item_id`) VALUES (".(int)$order_product_id.", '".$this->db->escape($order_item_id)."')")
#END
getCountryName=$this->db->query("SELECT `name` FROM `".DB_PREFIX."country` WHERE LOWER(`iso_code_2`) = '".$this->db->escape(strtolower($country_code))."'")->row
#END
getAmazonusOrderId=$this->db->query("SELECT `amazonus_order_id` FROM `".DB_PREFIX."amazonus_order` WHERE `order_id` = ".(int)$order_id." LIMIT 1")->row
#END
