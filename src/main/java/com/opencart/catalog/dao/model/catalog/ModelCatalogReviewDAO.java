package com.opencart.catalog.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogReviewDAO {
  public Response getTotalReviewsByProductId();
  public Response getReviewsByProductId(  Integer ReviewId);
  public Response addReview();
}