package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountOrderDAO {
  public Response getOrderHistories(  java.sql.Timestamp DateAdded);
  public Response getOrderOptions();
  public Response getOrderProducts();
  public Response getOrderVouchers();
  public Response getOrder4();
  public Response getOrder2();
  public Response getOrder3();
  public Response getOrders(  Integer OrderId);
  public Response getOrder1();
  public Response getOrderTotals();
  public Response getOrder();
  public Response getTotalOrderVouchersByOrderId();
  public Response getOrderProduct();
  public Response getTotalOrders();
  public Response getTotalOrderProductsByOrderId();
}