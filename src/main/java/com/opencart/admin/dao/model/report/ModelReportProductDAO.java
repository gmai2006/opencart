package com.opencart.admin.dao.model.report;

import javax.ws.rs.core.Response;

public interface ModelReportProductDAO {
  public Response getTotalProductViews(  Integer Viewed);
  public Response reset();
  public Response getTotalProductsViewed();
}