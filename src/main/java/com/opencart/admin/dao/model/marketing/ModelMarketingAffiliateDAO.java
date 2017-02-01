package com.opencart.admin.dao.model.marketing;

import javax.ws.rs.core.Response;

public interface ModelMarketingAffiliateDAO {
  public Response getTransactions();
  public Response deleteAffiliate2();
  public Response getAffiliateByEmail();
  public Response getAffiliate();
  public Response deleteTransaction();
  public Response editAffiliate();
  public Response getTotalAffiliatesByCountryId();
  public Response getTotalTransactions();
  public Response getTransactionTotal(  Long Amount);
  public Response deleteLoginAttempts();
  public Response getAffiliatesByNewsletter();
  public Response deleteAffiliate();
  public Response editAffiliate1();
  public Response addAffiliate();
  public Response approve();
  public Response getTotalLoginAttempts();
  public Response deleteAffiliate1();
  public Response addTransaction();
  public Response getTotalAffiliatesByZoneId();
  public Response getTotalAffiliatesAwaitingApproval();
  public Response getTotalTransactionsByOrderId();
  public Response getAffiliateByCode();
}