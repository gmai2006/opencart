package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountCustomerGroupDAO {
  public Response getCustomerGroups();
  public Response getCustomerGroup();
}