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
package com.opencart.extension.openbay;

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

public class ModelExtensionOpenBayEbayOrderResource {
  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayEbayOrderResource.class.getName());

  private final ModelExtensionOpenBayEbayOrderService service;

  @Inject
  protected ModelExtensionOpenBayEbayOrderResource(final ModelExtensionOpenBayEbayOrderService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/hasAddress")
  @GET
  public List<OcOrder> hasAddress(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.hasAddress(order_id);
  }

  @Path("/getOrderStatusQuery")
  @GET
  public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderStatusQuery(order_status_id,language_id);
  }

  @Path("/getOrderTotalQuery")
  @GET
  public List<OcOrderTotal> getOrderTotalQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderTotalQuery(order_id);
  }

  @Path("/addOrderHistory")
  @GET
  public List<OcProduct> addOrderHistory(Integer product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.addOrderHistory(product_id);
  }

  @Path("/getHistory")
  @GET
  public List<Integer> getHistory(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getHistory(order_id);
  }

  @Path("/getCountryAddressFormat")
  @GET
  public List<OcCountry> getCountryAddressFormat(String iso_code_2) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryAddressFormat(iso_code_2);
  }

  @Path("/getOrderProductQuery")
  @GET
  public List<OcOrderProduct> getOrderProductQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderProductQuery(order_id);
  }

  @Path("/getOrderOptionQuery")
  @GET
  public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderOptionQuery(order_id,order_product_id);
  }

  @Path("/update")
  @GET
  public List<OcOrderStatus> update(Integer order_status_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.update(order_status_id,language_id);
  }
}