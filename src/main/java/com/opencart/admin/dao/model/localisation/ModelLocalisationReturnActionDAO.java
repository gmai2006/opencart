package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationReturnActionDAO {
  public Response editReturnAction();
  public Response editReturnAction1();
  public Response getTotalReturnActions();
  public Response getReturnAction();
  public Response deleteReturnAction();
  public Response getReturnActions(  Integer ReturnActionId);
  public Response getReturnActionDescriptions();
  public Response addReturnAction1();
  public Response addReturnAction();
}