package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountRecurringDAO {
  public Response addOrderRecurringTransaction();
  public Response getOrderRecurringTransactions();
  public Response getOrderRecurrings();
  public Response getOrderRecurringByReference();
  public Response getOrderRecurring();
  public Response getTotalOrderRecurrings();
  public Response editOrderRecurringStatus();
}