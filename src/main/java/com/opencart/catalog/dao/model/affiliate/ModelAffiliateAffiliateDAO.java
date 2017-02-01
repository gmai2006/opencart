package com.opencart.catalog.dao.model.affiliate;

import javax.ws.rs.core.Response;

public interface ModelAffiliateAffiliateDAO {
  public Response addLoginAttempt1();
  public Response editPayment();
  public Response addLoginAttempt2();
  public Response getAffiliateByEmail();
  public Response getAffiliate();
  public Response getTotalAffiliatesByEmail();
  public Response deleteTransaction();
  public Response editAffiliate();
  public Response deleteLoginAttempts();
  public Response getTransactionTotal(  Long Amount);
  public Response editPassword();
  public Response getLoginAttempts();
  public Response addAffiliate();
  public Response addLoginAttempt();
  public Response addTransaction();
  public Response getAffiliateByCode();
}