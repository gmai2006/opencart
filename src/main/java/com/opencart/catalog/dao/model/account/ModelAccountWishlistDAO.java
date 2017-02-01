package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountWishlistDAO {
  public Response addWishlist1();
  public Response getTotalWishlist();
  public Response deleteWishlist();
  public Response getWishlist();
  public Response addWishlist();
}