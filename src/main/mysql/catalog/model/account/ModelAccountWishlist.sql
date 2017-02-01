addWishlist1=INSERT INTO oc_customer_wishlist SET customer_id = ?1, product_id = ?2, date_added = NOW()
#END
getTotalWishlist=SELECT COUNT(*) AS total FROM oc_customer_wishlist WHERE customer_id = ?1
#END
deleteWishlist=DELETE FROM oc_customer_wishlist WHERE customer_id = ?1 AND product_id = ?2
#END
getWishlist=SELECT * FROM oc_customer_wishlist WHERE customer_id = ?1
#END
addWishlist=DELETE FROM oc_customer_wishlist WHERE customer_id = ?1 AND product_id = ?2
#END
