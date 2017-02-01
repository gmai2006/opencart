package com.opencart.admin.dao.model.user;

import javax.ws.rs.core.Response;

public interface ModelUserUserDAO {
  public Response editCode();
  public Response getUserByUsername();
  public Response editUser1();
  public Response addUser();
  public Response getUser();
  public Response editUser();
  public Response getTotalUsersByGroupId();
  public Response getUserByEmail();
  public Response getUserByCode();
  public Response editPassword();
  public Response deleteUser();
  public Response getTotalUsersByEmail();
  public Response getTotalUsers();
}