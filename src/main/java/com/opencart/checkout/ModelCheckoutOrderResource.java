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
package com.opencart.checkout;

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

public class ModelCheckoutOrderResource {
  private final static Logger logger = Logger.getLogger(ModelCheckoutOrderResource.class.getName());

  private final ModelCheckoutOrderService service;

  @Inject
  protected ModelCheckoutOrderResource(final ModelCheckoutOrderService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getOrderVoucherQuery")
  @GET
  public List<OcOrderVoucher> getOrderVoucherQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderVoucherQuery(order_id);
  }

  @Path("/getOptionQuery")
  @GET
  public List<OcOrderOption> getOptionQuery(Integer order_id,Integer order_product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOptionQuery(order_id,order_product_id);
  }

  @Path("/getProductQuery")
  @GET
  public List<OcOrderProduct> getProductQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductQuery(order_id);
  }

  @Path("/getOrderProductQuery")
  @GET
  public List<OcOrderProduct> getOrderProductQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderProductQuery(order_id);
  }

  @Path("/getOrderQuery")
  @GET
  public List<ModelCheckoutOrder0Dto> getOrderQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderQuery(order_id);
  }

  @Path("/getOrderTotalQuery")
  @GET
  public List<OcOrderTotal> getOrderTotalQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderTotalQuery(order_id);
  }

  @Path("/getProductDownloadQuery")
  @GET
  public java.math.BigInteger getProductDownloadQuery(Integer product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductDownloadQuery(product_id);
  }

  @Path("/getCountryQuery")
  @GET
  public List<OcCountry> getCountryQuery(Integer country_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryQuery(country_id);
  }

  @Path("/getZoneQuery")
  @GET
  public List<OcZone> getZoneQuery(Integer zone_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getZoneQuery(zone_id);
  }

  @Path("/getOrderOptionQuery")
  @GET
  public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderOptionQuery(order_id,order_product_id);
  }

  @Path("/getOrderStatusQuery")
  @GET
  public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderStatusQuery(order_status_id,language_id);
  }
}