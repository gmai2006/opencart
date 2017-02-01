package com.opencart.catalog.dao.model.design;

import javax.ws.rs.core.Response;

public interface ModelDesignLayoutDAO {
  public Response getLayoutModules();
  public Response getLayout();
}