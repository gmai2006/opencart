package com.opencart.admin.dao.model.marketing;

import javax.ws.rs.core.Response;

public interface ModelMarketingCouponDAO {
  public Response getCouponCategories();
  public Response deleteCoupon3();
  public Response deleteCoupon2();
  public Response deleteCoupon1();
  public Response getCoupon();
  public Response getCouponByCode();
  public Response getTotalCouponHistories();
  public Response getCouponProducts();
  public Response deleteCoupon();
  public Response editCoupon4();
  public Response editCoupon1();
  public Response getCouponHistories(  Integer OrderId);
  public Response editCoupon3();
  public Response editCoupon2();
  public Response editCoupon();
  public Response addCoupon();
  public Response addCoupon2();
  public Response addCoupon1();
  public Response getTotalCoupons();
}