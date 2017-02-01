package com.opencart.admin.dao.model.sale;

import javax.ws.rs.core.Response;

public interface ModelSaleOrderDAO {
  public Response getTotalOrdersByProcessingStatus();
  public Response getTotalOrdersByLanguageId();
  public Response getOrderHistories(  java.sql.Timestamp DateAdded);
  public Response getTotalOrdersByCompleteStatus();
  public Response getOrderProducts();
  public Response getOrderVoucherByVoucherId();
  public Response deleteOrder7();
  public Response deleteOrder8();
  public Response deleteOrder9();
  public Response getTotalOrderHistoriesByOrderStatusId();
  public Response deleteOrder3();
  public Response createInvoiceNo(  Integer InvoiceNo);
  public Response deleteOrder4();
  public Response deleteOrder5();
  public Response getTotalOrdersByOrderStatusId();
  public Response deleteOrder6();
  public Response getOrderTotals();
  public Response deleteOrder1();
  public Response deleteOrder2();
  public Response getTotalEmailsByProductsOrdered(  String Email);
  public Response deleteOrder();
  public Response getEmailsByProductsOrdered(  String Email);
  public Response getTotalOrdersByCurrencyId();
  public Response getOrderOptions();
  public Response getTotalOrdersByStoreId();
  public Response getOrderVouchers();
  public Response getOrder4();
  public Response getOrder5();
  public Response getOrder2();
  public Response getOrder3();
  public Response getTotalOrderHistories();
  public Response getOrder1();
  public Response getOrder();
  public Response createInvoiceNo1();
}