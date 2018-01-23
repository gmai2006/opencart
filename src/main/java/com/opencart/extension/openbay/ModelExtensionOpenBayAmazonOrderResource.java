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

public class ModelExtensionOpenBayAmazonOrderResource {
  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayAmazonOrderResource.class.getName());

  private final ModelExtensionOpenBayAmazonOrderService service;

  @Inject
  protected ModelExtensionOpenBayAmazonOrderResource(final ModelExtensionOpenBayAmazonOrderService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getProductOptionsByVar")
  @GET
  public List<ModelExtensionOpenBayAmazonOrder0Dto> getProductOptionsByVar(Integer product_option_value_id,String language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductOptionsByVar(product_option_value_id,language_id);
  }

  @Path("/getZoneId")
  @GET
  public List<Integer> getZoneId(String name) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getZoneId(name);
  }

  @Path("/addAmazonOrderProducts")
  @GET
  public List<Integer> addAmazonOrderProducts(String model,Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.addAmazonOrderProducts(model,order_id);
  }

  @Path("/getCountryId")
  @GET
  public List<Integer> getCountryId(String iso_code_2) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryId(iso_code_2);
  }

  @Path("/getOrderStatus")
  @GET
  public List<Integer> getOrderStatus(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderStatus(order_id);
  }

  @Path("/getCountryName")
  @GET
  public List<String> getCountryName(String iso_code_2) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryName(iso_code_2);
  }
}