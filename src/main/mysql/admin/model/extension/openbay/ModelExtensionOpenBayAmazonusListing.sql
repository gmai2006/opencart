deleteSearchResults=
			DELETE FROM oc_amazonus_product_search
			WHERE product_id IN ($imploded_ids)
		
#END
simpleListing=
			REPLACE INTO  oc_amazonus_product 
			SET  product_id  = ?1,
				status = 'uploaded',
				version = 3,
				var = ''
		
#END
doBulkSearch=
					REPLACE INTO oc_amazonus_product_search (product_id,  status )
					VALUES (?1, 'searching')
#END
doBulkListing=
						REPLACE INTO  oc_amazonus_product 
						SET  product_id  = ?1,
							status = 'uploaded',
							var = '',
							version = 3
					
#END
