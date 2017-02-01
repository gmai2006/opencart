package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountReturnDAO {
  public Response getReturn(  Integer ReturnId);
  public Response getReturnHistories(  java.sql.Timestamp DateAdded);
  public Response getTotalReturns();
  public Response addReturn();
  public Response getReturns(  Integer ReturnId);
}