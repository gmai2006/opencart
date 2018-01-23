/*************************************************************************
 *
 * DATASCIENCE9 LLC CONFIDENTIAL
 * __________________
 *
 *  [2018] Datascience9 LLC
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Datascience9 LLC and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Datascience9 LLC
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Datascience9 LLC.
 * @author Paul Mai - Datascience9 LLC
 */
package com.opencart.extension.total;

import static java.util.Objects.requireNonNull;

import java.util.List;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.inject.Inject;
import javax.ws.rs.core.MediaType;
import com.opencart.entity.*;
import com.opencart.entity.service.*;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)

public class ModelExtensionTotalCouponResource {
  private final static Logger logger = Logger.getLogger(ModelExtensionTotalCouponResource.class.getName());

  private final ModelExtensionTotalCouponService service;

  @Inject
  protected ModelExtensionTotalCouponResource(final ModelExtensionTotalCouponService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getCouponHistoryQuery")
  @GET
  public java.math.BigInteger getCouponHistoryQuery(Integer coupon_id,Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCouponHistoryQuery(coupon_id,customer_id);
  }

  @Path("/getCouponQuery")
  @GET
  public List<OcCoupon> getCouponQuery(String code) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCouponQuery(code);
  }

  @Path("/getCouponCategoryQuery")
  @GET
  public java.math.BigInteger getCouponCategoryQuery(Integer product_id,Integer category_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCouponCategoryQuery(product_id,category_id);
  }

  @Path("/getCouponProductQuery")
  @GET
  public List<OcCouponProduct> getCouponProductQuery(Integer coupon_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCouponProductQuery(coupon_id);
  }
}