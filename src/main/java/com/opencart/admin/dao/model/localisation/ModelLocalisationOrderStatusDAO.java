package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationOrderStatusDAO {
  public Response getOrderStatuses(  Integer OrderStatusId);
  public Response addOrderStatus();
  public Response getTotalOrderStatuses();
  public Response editOrderStatus();
  public Response getOrderStatus();
  public Response deleteOrderStatus();
  public Response editOrderStatus1();
  public Response addOrderStatus1();
  public Response getOrderStatusDescriptions();
}