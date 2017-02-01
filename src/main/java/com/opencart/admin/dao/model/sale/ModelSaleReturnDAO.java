package com.opencart.admin.dao.model.sale;

import javax.ws.rs.core.Response;

public interface ModelSaleReturnDAO {
  public Response getReturn();
  public Response getTotalReturnHistoriesByReturnStatusId();
  public Response getTotalReturnsByReturnActionId();
  public Response editReturn();
  public Response addReturnHistory2();
  public Response addReturnHistory1();
  public Response deleteReturn();
  public Response deleteReturn1();
  public Response addReturnHistory();
  public Response addReturn();
  public Response getReturnHistories(  java.sql.Timestamp DateAdded);
  public Response getTotalReturnsByReturnReasonId();
  public Response getTotalReturnsByReturnStatusId();
  public Response getTotalReturnHistories();
}