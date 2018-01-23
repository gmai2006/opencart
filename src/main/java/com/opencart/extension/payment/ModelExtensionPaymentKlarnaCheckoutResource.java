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
package com.opencart.extension.payment;

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

public class ModelExtensionPaymentKlarnaCheckoutResource {
  private final static Logger logger = Logger.getLogger(ModelExtensionPaymentKlarnaCheckoutResource.class.getName());

  private final ModelExtensionPaymentKlarnaCheckoutService service;

  @Inject
  protected ModelExtensionPaymentKlarnaCheckoutResource(final ModelExtensionPaymentKlarnaCheckoutService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getCountryByIsoCode2")
  @GET
  public List<OcCountry> getCountryByIsoCode2(String iso_code_2) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryByIsoCode2(iso_code_2);
  }

  @Path("/getZoneByCode")
  @GET
  public List<OcZone> getZoneByCode(String code,Integer country_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getZoneByCode(code,country_id);
  }

  @Path("/getCountryByIsoCode3")
  @GET
  public List<OcCountry> getCountryByIsoCode3(String iso_code_3) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryByIsoCode3(iso_code_3);
  }
}