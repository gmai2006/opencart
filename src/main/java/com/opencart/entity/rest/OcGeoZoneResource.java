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

package com.opencart.entity.rest;

import static java.util.Objects.requireNonNull;

import java.util.List;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PUT;

import com.google.inject.Inject;

import com.opencart.entity.service.OcGeoZoneService;
import com.opencart.entity.service.OcGeoZoneServiceImpl;

import com.opencart.entity.OcGeoZone;

@Path("/OcGeoZone")
@Produces(MediaType.APPLICATION_JSON)
/**
 * Auto generated RESTful class
 */
public class OcGeoZoneResource {
  private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcGeoZoneService service;

  @Inject
  protected OcGeoZoneResource(final OcGeoZoneService service) {
      requireNonNull(service);
      this.service = service;
  }


  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/")
  @PUT
  public OcGeoZone insert(final OcGeoZone obj) {
    return service.create(obj);
  }

  //Should work out of the box as no business required for this method
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/")
  @POST
  public OcGeoZone update(final OcGeoZone obj) {
    return service.update(obj);
  }

    @Path("/")
    @DELETE
    public void delete(final OcGeoZone obj) {
        service.delete(obj);
    }
}