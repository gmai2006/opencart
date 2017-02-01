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
      @Path("/addZone")
      @GET
      public Response addZone() {
         return Response.ok(service.addZone().toString()).build();  
      }
      @Path("/getTotalZonesByCountryId")
      @GET
      public Response getTotalZonesByCountryId() {
         return Response.ok(service.getTotalZonesByCountryId().toString()).build();  
      }
      @Path("/getTotalZones")
      @GET
      public Response getTotalZones() {
         return Response.ok(service.getTotalZones().toString()).build();  
      }
      @Path("/deleteZone")
      @GET
      public Response deleteZone() {
         return Response.ok(service.deleteZone().toString()).build();  
      }
      @Path("/editZone")
      @GET
      public Response editZone() {
         return Response.ok(service.editZone().toString()).build();  
      }
      @Path("/getZone")
      @GET
      public Response getZone() {
         return Response.ok(service.getZone().toString()).build();  
      }
}