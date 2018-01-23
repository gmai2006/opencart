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
package com.opencart.affiliate;

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

public class ModelAffiliateAffiliateResource {
  private final static Logger logger = Logger.getLogger(ModelAffiliateAffiliateResource.class.getName());

  private final ModelAffiliateAffiliateService service;

  @Inject
  protected ModelAffiliateAffiliateResource(final ModelAffiliateAffiliateService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getTransactionTotal")
  @GET
  public java.math.BigDecimal getTransactionTotal(Integer affiliate_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTransactionTotal(affiliate_id);
  }

  @Path("/getAffiliate")
  @GET
  public List<OcAffiliate> getAffiliate(Integer affiliate_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getAffiliate(affiliate_id);
  }

  @Path("/getAffiliateByEmail")
  @GET
  public List<OcAffiliate> getAffiliateByEmail(String email) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getAffiliateByEmail(email);
  }

  @Path("/getTotalAffiliatesByEmail")
  @GET
  public java.math.BigInteger getTotalAffiliatesByEmail(String email) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalAffiliatesByEmail(email);
  }

  @Path("/getAffiliateByCode")
  @GET
  public List<OcAffiliate> getAffiliateByCode(String code) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getAffiliateByCode(code);
  }

  @Path("/addLoginAttempt")
  @GET
  public List<OcAffiliateLogin> addLoginAttempt(String email,String ip) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.addLoginAttempt(email,ip);
  }

  @Path("/getLoginAttempts")
  @GET
  public List<OcAffiliateLogin> getLoginAttempts(String email) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getLoginAttempts(email);
  }
}