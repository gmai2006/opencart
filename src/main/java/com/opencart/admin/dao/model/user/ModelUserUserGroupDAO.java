package com.opencart.admin.dao.model.user;

import javax.ws.rs.core.Response;

public interface ModelUserUserGroupDAO {
  public Response deleteUserGroup();
  public Response removePermission1();
  public Response addUserGroup();
  public Response addPermission();
  public Response addPermission1();
  public Response getUserGroup();
  public Response removePermission();
  public Response editUserGroup();
  public Response getTotalUserGroups();
}