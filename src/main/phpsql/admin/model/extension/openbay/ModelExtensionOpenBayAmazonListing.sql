deleteSearchResults=$this->db->query("
			DELETE FROM ".DB_PREFIX."amazon_product_search
			WHERE marketplace = '".$this->db->escape($marketplace)."' AND product_id IN ($imploded_ids)
		")
#END
simpleListing=$this->db->query("
				REPLACE INTO `".DB_PREFIX."amazon_product`
				SET `product_id` = ".(int)$data['product_id'].",
					`status` = 'uploaded',
					`marketplaces` = '".$this->db->escape($data['marketplace'])."',
					`version` = 3,
					`var` = ''
				")
#END
doBulkSearch=$this->db->query("
					REPLACE INTO ".DB_PREFIX."amazon_product_search (product_id, `status`, marketplace)
					VALUES (".(int)$product['product_id'].", 'searching', '".$this->db->escape($product['marketplace'])."')")
#END
doBulkListing=$this->db->query("
						REPLACE INTO `".DB_PREFIX."amazon_product`
						SET `product_id` = ".(int)$product['product_id'].",
							`status` = 'uploaded',
							`marketplaces` = '".$this->db->escape($data['marketplace'])."',
							`version` = 3,
							`var` = ''
					")
#END
