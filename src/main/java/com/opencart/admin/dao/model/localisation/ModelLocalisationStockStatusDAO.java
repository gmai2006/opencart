package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationStockStatusDAO {
  public Response editStockStatus1();
  public Response addStockStatus();
  public Response deleteStockStatus();
  public Response editStockStatus();
  public Response getStockStatus();
  public Response addStockStatus1();
  public Response getStockStatuses(  Integer StockStatusId);
  public Response getTotalStockStatuses();
  public Response getStockStatusDescriptions();
}