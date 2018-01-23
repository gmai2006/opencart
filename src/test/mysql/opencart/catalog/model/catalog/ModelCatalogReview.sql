ModelCatalogReview.getReviewsByProductId.getReviewsByProductId=SELECT  *   FROM oc_review r LEFT JOIN oc_product p ON( r.product_id = p.product_id ) LEFT JOIN oc_product_description pd ON( p.product_id = pd.product_id )
#END
ModelCatalogReview.getTotalReviewsByProductId.getTotalReviewsByProductId=SELECT  *   FROM oc_review r LEFT JOIN oc_product p ON( r.product_id = p.product_id ) LEFT JOIN oc_product_description pd ON( p.product_id = pd.product_id )
#END
