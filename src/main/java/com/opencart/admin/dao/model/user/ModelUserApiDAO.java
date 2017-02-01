package com.opencart.admin.dao.model.user;

import javax.ws.rs.core.Response;

public interface ModelUserApiDAO {
  public Response deleteApiSession();
  public Response editApi();
  public Response addApiSession();
  public Response getApiSessions();
  public Response getApi();
  public Response addApi();
  public Response addApiIp();
  public Response getApiIps();
  public Response deleteApi();
  public Response editApi1();
  public Response editApi2();
  public Response addApi1();
  public Response getTotalApis();
}