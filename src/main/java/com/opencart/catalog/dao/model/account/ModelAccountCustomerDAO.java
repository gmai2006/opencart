package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountCustomerDAO {
  public Response editCustomer();
  public Response editCode();
  public Response addLoginAttempt1();
  public Response addCustomer1();
  public Response addLoginAttempt2();
  public Response addCustomer2();
  public Response getTotalCustomersByEmail();
  public Response getCustomerByToken1();
  public Response getCustomerByEmail();
  public Response deleteLoginAttempts();
  public Response getCustomer();
  public Response addCustomer();
  public Response editPassword();
  public Response getLoginAttempts();
  public Response editNewsletter();
  public Response getCustomerByCode(  Integer CustomerId);
  public Response addLoginAttempt();
  public Response getRewardTotal(  Integer Points);
  public Response getIps();
  public Response getCustomerByToken();
}