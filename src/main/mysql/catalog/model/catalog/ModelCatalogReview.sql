getTotalReviewsByProductId=SELECT COUNT(*) AS total FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = ?1 AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = ?2
#END
getReviewsByProductId=SELECT r.review_id, r.author, r.rating, r.text, p.product_id, pd.name, p.price, p.image, r.date_added FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = ?1 AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = ?2 ORDER BY r.date_added DESC LIMIT ?3,?4
#END
addReview=INSERT INTO oc_review SET author = ?1, customer_id = ?2, product_id = ?3, text = ?4, rating = ?5, date_added = NOW()
#END
