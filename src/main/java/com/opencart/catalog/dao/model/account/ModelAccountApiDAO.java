package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountApiDAO {
  public Response getApiIps();
  public Response addApiSession();
  public Response getApiByKey();
}