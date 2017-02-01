package com.opencart.admin.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogReviewDAO {
  public Response getTotalReviewsAwaitingApproval();
  public Response editReview();
  public Response getReview();
  public Response addReview();
  public Response deleteReview();
}