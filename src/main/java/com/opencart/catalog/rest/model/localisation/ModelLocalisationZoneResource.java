package com.opencart.catalog.rest.model.localisation;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opencart.catalog.dao.model.localisation.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelLocalisationZone")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationZoneResource {
  Log logger = LogFactory.getLog(ModelLocalisationZoneResource.class);

  @Inject
  ModelLocalisationZoneDAOImpl service;

      @Path("/getZonesByCountryId")
      @GET
      public Response getZonesByCountryId() {
         return Response.ok(service.getZonesByCountryId().toString()).build();  
      }
      @Path("/getZone")
      @GET
      public Response getZone() {
         return Response.ok(service.getZone().toString()).build();  
      }
}