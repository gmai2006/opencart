package com.opencart.catalog.dao.model.affiliate;

import javax.ws.rs.core.Response;

public interface ModelAffiliateTransactionDAO {
  public Response getBalance(  Long Amount);
  public Response getTotalTransactions();
}