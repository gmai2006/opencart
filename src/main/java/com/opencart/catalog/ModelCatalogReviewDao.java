package com.opencart.catalog;

import java.util.List;

import com.opencart.entity.*;

public interface ModelCatalogReviewDao {
   public java.math.BigInteger getTotalReviewsByProductId(Integer product_id,Integer language_id);

   public List<ModelCatalogReview0Dto> getReviewsByProductId(Integer product_id,Integer language_id);
}