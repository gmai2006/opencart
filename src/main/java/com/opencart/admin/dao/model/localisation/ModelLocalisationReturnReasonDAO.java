package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationReturnReasonDAO {
  public Response addReturnReason1();
  public Response addReturnReason();
  public Response deleteReturnReason();
  public Response editReturnReason();
  public Response getReturnReasons(  Integer ReturnReasonId);
  public Response getTotalReturnReasons();
  public Response getReturnReasonDescriptions();
  public Response getReturnReason();
  public Response editReturnReason1();
}