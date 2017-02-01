getTotalReviewsAwaitingApproval=SELECT COUNT(*) AS total FROM oc_review WHERE status = '0'
#END
editReview=UPDATE oc_review SET author = ?1, product_id = ?2, text = ?3, rating = ?4, status = ?5, date_added = ?6, date_modified = NOW() WHERE review_id = ?7
#END
getReview=SELECT DISTINCT *, (SELECT pd.name FROM oc_product_description pd WHERE pd.product_id = r.product_id AND pd.language_id = ?1) AS product FROM oc_review r WHERE r.review_id = ?2
#END
addReview=INSERT INTO oc_review SET author = ?1, product_id = ?2, text = ?3, rating = ?4, status = ?5, date_added = ?6
#END
deleteReview=DELETE FROM oc_review WHERE review_id = ?1
#END
