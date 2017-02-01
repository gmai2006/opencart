deleteSearchResults=$this->db->query("
			DELETE FROM ".DB_PREFIX."amazonus_product_search
			WHERE product_id IN ($imploded_ids)
		")
#END
simpleListing=$this->db->query("
			REPLACE INTO `".DB_PREFIX."amazonus_product`
			SET `product_id` = ".(int)$data['product_id'].",
				`status` = 'uploaded',
				`version` = 3,
				`var` = ''
		")
#END
doBulkSearch=$this->db->query("
					REPLACE INTO ".DB_PREFIX."amazonus_product_search (product_id, `status`)
					VALUES (".(int)$product['product_id'].", 'searching')")
#END
doBulkListing=$this->db->query("
						REPLACE INTO `".DB_PREFIX."amazonus_product`
						SET `product_id` = ".(int)$product['product_id'].",
							`status` = 'uploaded',
							`var` = '',
							`version` = 3
					")
#END
