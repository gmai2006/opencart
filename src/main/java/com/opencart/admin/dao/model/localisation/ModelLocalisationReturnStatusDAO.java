package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationReturnStatusDAO {
  public Response addReturnStatus1();
  public Response getReturnStatusDescriptions();
  public Response editReturnStatus();
  public Response getReturnStatus();
  public Response getReturnStatuses(  Integer ReturnStatusId);
  public Response addReturnStatus();
  public Response editReturnStatus1();
  public Response getTotalReturnStatuses();
  public Response deleteReturnStatus();
}