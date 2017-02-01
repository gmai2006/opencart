package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountAddressDAO {
  public Response getAddresses();
  public Response getAddress2();
  public Response editAddress1();
  public Response getAddress1();
  public Response addAddress();
  public Response addAddress1();
  public Response getAddresses2();
  public Response getAddresses1();
  public Response deleteAddress();
  public Response getAddress();
  public Response editAddress();
  public Response getTotalAddresses();
}