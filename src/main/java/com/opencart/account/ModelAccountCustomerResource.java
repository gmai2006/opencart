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

public class ModelAccountCustomerResource {
  private final static Logger logger = Logger.getLogger(ModelAccountCustomerResource.class.getName());

  private final ModelAccountCustomerService service;

  @Inject
  protected ModelAccountCustomerResource(final ModelAccountCustomerService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/addLoginAttempt")
  @GET
  public List<OcCustomerLogin> addLoginAttempt(String email,String ip) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.addLoginAttempt(email,ip);
  }

  @Path("/getCustomerByEmail")
  @GET
  public List<OcCustomer> getCustomerByEmail(String email) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomerByEmail(email);
  }

  @Path("/getIps")
  @GET
  public List<OcCustomerIp> getIps(Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getIps(customer_id);
  }

  @Path("/getLoginAttempts")
  @GET
  public List<OcCustomerLogin> getLoginAttempts(String email) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getLoginAttempts(email);
  }

  @Path("/getRewardTotal")
  @GET
  public java.math.BigDecimal getRewardTotal(Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getRewardTotal(customer_id);
  }

  @Path("/getCustomerByCode")
  @GET
  public List<ModelAccountCustomer0Dto> getCustomerByCode(String code) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomerByCode(code);
  }

  @Path("/getTotalCustomersByEmail")
  @GET
  public java.math.BigInteger getTotalCustomersByEmail(String email) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalCustomersByEmail(email);
  }

  @Path("/getCustomer")
  @GET
  public List<OcCustomer> getCustomer(Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomer(customer_id);
  }

  @Path("/getCustomerByToken")
  @GET
  public List<OcCustomer> getCustomerByToken(String token) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomerByToken(token);
  }
}