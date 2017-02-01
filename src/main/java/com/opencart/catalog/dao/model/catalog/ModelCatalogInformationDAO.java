package com.opencart.catalog.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogInformationDAO {
  public Response getInformations();
  public Response getInformation();
  public Response getInformationLayoutId();
}