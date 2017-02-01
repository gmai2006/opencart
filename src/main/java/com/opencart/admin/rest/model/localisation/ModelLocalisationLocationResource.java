package com.opencart.admin.rest.model.localisation;


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

import com.opencart.admin.dao.model.localisation.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelLocalisationLocation")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationLocationResource {
  Log logger = LogFactory.getLog(ModelLocalisationLocationResource.class);

  @Inject
  ModelLocalisationLocationDAOImpl service;

      @Path("/deleteLocation")
      @GET
      public Response deleteLocation() {
         return Response.ok(service.deleteLocation().toString()).build();  
      }
      @Path("/getLocation")
      @GET
      public Response getLocation() {
         return Response.ok(service.getLocation().toString()).build();  
      }
      @Path("/editLocation")
      @GET
      public Response editLocation() {
         return Response.ok(service.editLocation().toString()).build();  
      }
      @Path("/addLocation")
      @GET
      public Response addLocation() {
         return Response.ok(service.addLocation().toString()).build();  
      }
      @Path("/getTotalLocations")
      @GET
      public Response getTotalLocations() {
         return Response.ok(service.getTotalLocations().toString()).build();  
      }
}