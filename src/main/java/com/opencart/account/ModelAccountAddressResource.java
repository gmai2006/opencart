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

public class ModelAccountAddressResource {
  private final static Logger logger = Logger.getLogger(ModelAccountAddressResource.class.getName());

  private final ModelAccountAddressService service;

  @Inject
  protected ModelAccountAddressResource(final ModelAccountAddressService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getAddressQuery")
  @GET
  public List<OcAddress> getAddressQuery(Integer address_id,Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getAddressQuery(address_id,customer_id);
  }

  @Path("/getTotalAddresses")
  @GET
  public java.math.BigInteger getTotalAddresses(Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalAddresses(customer_id);
  }

  @Path("/getZoneQuery")
  @GET
  public List<OcZone> getZoneQuery(Integer zone_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getZoneQuery(zone_id);
  }

  @Path("/getZoneQuery0")
  @GET
  public List<OcZone> getZoneQuery0(Integer zone_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getZoneQuery0(zone_id);
  }

  @Path("/getQuery")
  @GET
  public List<OcAddress> getQuery(Integer customer_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQuery(customer_id);
  }

  @Path("/getCountryQuery")
  @GET
  public List<OcCountry> getCountryQuery(Integer country_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryQuery(country_id);
  }

  @Path("/getCountryQuery1")
  @GET
  public List<OcCountry> getCountryQuery1(Integer country_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCountryQuery1(country_id);
  }
}