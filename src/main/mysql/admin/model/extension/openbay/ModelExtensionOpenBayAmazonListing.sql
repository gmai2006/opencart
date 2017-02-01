deleteSearchResults=
			DELETE FROM oc_amazon_product_search
			WHERE marketplace = ?1 AND product_id IN ($imploded_ids)
		
#END
simpleListing=
				REPLACE INTO  oc_amazon_product 
				SET  product_id  = ?1,
					 status  = 'uploaded',
					 marketplaces  = ?2,
					version = 3,
					var = ''
				
#END
doBulkSearch=
					REPLACE INTO oc_amazon_product_search (product_id,  status , marketplace)
					VALUES (?1, 'searching', ?2)
#END
doBulkListing=
						REPLACE INTO  oc_amazon_product 
						SET  product_id  = ?1,
							 status  = 'uploaded',
							 marketplaces  = ?2,
							version = 3,
							var = ''
					
#END
