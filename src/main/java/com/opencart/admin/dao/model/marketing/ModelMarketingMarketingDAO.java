package com.opencart.admin.dao.model.marketing;

import javax.ws.rs.core.Response;

public interface ModelMarketingMarketingDAO {
  public Response getMarketing();
  public Response editMarketing();
  public Response addMarketing();
  public Response getMarketingByCode();
  public Response deleteMarketing();
}