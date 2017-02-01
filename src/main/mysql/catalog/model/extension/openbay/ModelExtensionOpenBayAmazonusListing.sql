listingSuccessful=UPDATE  oc_amazonus_product  SET  status  = 'ok' WHERE product_id = ?1 AND version = 3
#END
listingFailed=UPDATE  oc_amazonus_product  SET  status  = 'error',  messages  = ?1 WHERE product_id = ?2 AND version = 3
#END
