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
package com.opencart.account;

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

public class ModelAccountOrderResource {
  private final static Logger logger = Logger.getLogger(ModelAccountOrderResource.class.getName());

  private final ModelAccountOrderService service;

  @Inject
  protected ModelAccountOrderResource(final ModelAccountOrderService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getOrderVouchers")
  @GET
  public List<OcOrderVoucher> getOrderVouchers(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderVouchers(order_id);
  }

  @Path("/getZoneQuery")
  @GET
  public List<OcZone> getZoneQuery(Integer zone_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getZoneQuery(zone_id);
  }

  @Path("/getOrderProduct")
  @GET
  public List<OcOrderProduct> getOrderProduct(Integer order_id,Integer order_product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderProduct(order_id,order_product_id);
  }

  @Path("/getOrderOptions")
  @GET
  public List<OcOrderOption> getOrderOptions(Integer order_id,Integer order_product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderOptions(order_id,order_product_id);
  }

  @Path("/getTotalOrderProductsByOrderId")
  @GET
  public java.math.BigInteger getTotalOrderProductsByOrderId(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalOrderProductsByOrderId(order_id);
  }

  @Path("/getOrderProducts")
  @GET
  public List<OcOrderProduct> getOrderProducts(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderProducts(order_id);
  }

  @Path("/getCountryQuery")
  @GET
  public List<OcCountry> getCountryQuery(Integer country_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryQuery(country_id);
  }

  @Path("/getTotalOrderVouchersByOrderId")
  @GET
  public java.math.BigInteger getTotalOrderVouchersByOrderId(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalOrderVouchersByOrderId(order_id);
  }

  @Path("/getOrderHistories")
  @GET
  public List<ModelAccountOrder0Dto> getOrderHistories(Integer order_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderHistories(order_id,language_id);
  }

  @Path("/getOrderTotals")
  @GET
  public List<OcOrderTotal> getOrderTotals(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderTotals(order_id);
  }

  @Path("/getOrders")
  @GET
  public List<ModelAccountOrder1Dto> getOrders(Integer customer_id,Integer store_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrders(customer_id,store_id,language_id);
  }

  @Path("/getOrderQuery")
  @GET
  public List<OcOrder> getOrderQuery(Integer order_id,Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderQuery(order_id,customer_id);
  }

  @Path("/getTotalOrders")
  @GET
  public java.math.BigInteger getTotalOrders(Integer customer_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalOrders(customer_id,store_id);
  }
}