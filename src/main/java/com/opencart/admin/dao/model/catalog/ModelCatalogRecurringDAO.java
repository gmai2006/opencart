package com.opencart.admin.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogRecurringDAO {
  public Response getTotalRecurrings();
  public Response deleteRecurring1();
  public Response addRecurring1();
  public Response deleteRecurring();
  public Response deleteRecurring3();
  public Response deleteRecurring2();
  public Response editRecurring();
  public Response getRecurringDescription();
  public Response editRecurring1();
  public Response getRecurring();
  public Response addRecurring();
  public Response editRecurring2();
}