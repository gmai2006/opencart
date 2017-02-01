package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountTransactionDAO {
  public Response getTotalAmount(  Long Amount);
  public Response getTotalTransactions();
}