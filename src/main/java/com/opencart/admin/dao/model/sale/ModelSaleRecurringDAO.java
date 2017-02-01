package com.opencart.admin.dao.model.sale;

import javax.ws.rs.core.Response;

public interface ModelSaleRecurringDAO {
  public Response getRecurringTransactions(  Long Amount);
  public Response getRecurring();
}