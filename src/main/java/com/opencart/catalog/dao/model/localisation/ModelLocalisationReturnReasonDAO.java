package com.opencart.catalog.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationReturnReasonDAO {
  public Response getReturnReasons(  Integer ReturnReasonId);
}