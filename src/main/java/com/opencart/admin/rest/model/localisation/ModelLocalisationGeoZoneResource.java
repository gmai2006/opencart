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

@Path("/ModelLocalisationGeoZone")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationGeoZoneResource {
  Log logger = LogFactory.getLog(ModelLocalisationGeoZoneResource.class);

  @Inject
  ModelLocalisationGeoZoneDAOImpl service;

      @Path("/addGeoZone")
      @GET
      public Response addGeoZone() {
         return Response.ok(service.addGeoZone().toString()).build();  
      }
      @Path("/getGeoZone")
      @GET
      public Response getGeoZone() {
         return Response.ok(service.getGeoZone().toString()).build();  
      }
      @Path("/editGeoZone3")
      @GET
      public Response editGeoZone3() {
         return Response.ok(service.editGeoZone3().toString()).build();  
      }
      @Path("/editGeoZone")
      @GET
      public Response editGeoZone() {
         return Response.ok(service.editGeoZone().toString()).build();  
      }
      @Path("/getTotalGeoZones")
      @GET
      public Response getTotalGeoZones() {
         return Response.ok(service.getTotalGeoZones().toString()).build();  
      }
      @Path("/getTotalZoneToGeoZoneByZoneId")
      @GET
      public Response getTotalZoneToGeoZoneByZoneId() {
         return Response.ok(service.getTotalZoneToGeoZoneByZoneId().toString()).build();  
      }
      @Path("/editGeoZone1")
      @GET
      public Response editGeoZone1() {
         return Response.ok(service.editGeoZone1().toString()).build();  
      }
      @Path("/getGeoZones")
      @GET
      public Response getGeoZones() {
         return Response.ok(service.getGeoZones().toString()).build();  
      }
      @Path("/editGeoZone2")
      @GET
      public Response editGeoZone2() {
         return Response.ok(service.editGeoZone2().toString()).build();  
      }
      @Path("/addGeoZone2")
      @GET
      public Response addGeoZone2() {
         return Response.ok(service.addGeoZone2().toString()).build();  
      }
      @Path("/getZoneToGeoZones")
      @GET
      public Response getZoneToGeoZones() {
         return Response.ok(service.getZoneToGeoZones().toString()).build();  
      }
      @Path("/getTotalZoneToGeoZoneByGeoZoneId")
      @GET
      public Response getTotalZoneToGeoZoneByGeoZoneId() {
         return Response.ok(service.getTotalZoneToGeoZoneByGeoZoneId().toString()).build();  
      }
      @Path("/addGeoZone1")
      @GET
      public Response addGeoZone1() {
         return Response.ok(service.addGeoZone1().toString()).build();  
      }
      @Path("/deleteGeoZone1")
      @GET
      public Response deleteGeoZone1() {
         return Response.ok(service.deleteGeoZone1().toString()).build();  
      }
      @Path("/getTotalZoneToGeoZoneByCountryId")
      @GET
      public Response getTotalZoneToGeoZoneByCountryId() {
         return Response.ok(service.getTotalZoneToGeoZoneByCountryId().toString()).build();  
      }
      @Path("/deleteGeoZone")
      @GET
      public Response deleteGeoZone() {
         return Response.ok(service.deleteGeoZone().toString()).build();  
      }
}