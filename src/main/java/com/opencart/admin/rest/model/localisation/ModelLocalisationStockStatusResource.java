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

@Path("/ModelLocalisationStockStatus")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationStockStatusResource {
  Log logger = LogFactory.getLog(ModelLocalisationStockStatusResource.class);

  @Inject
  ModelLocalisationStockStatusDAOImpl service;

      @Path("/editStockStatus1")
      @GET
      public Response editStockStatus1() {
         return Response.ok(service.editStockStatus1().toString()).build();  
      }
      @Path("/addStockStatus")
      @GET
      public Response addStockStatus() {
         return Response.ok(service.addStockStatus().toString()).build();  
      }
      @Path("/deleteStockStatus")
      @GET
      public Response deleteStockStatus() {
         return Response.ok(service.deleteStockStatus().toString()).build();  
      }
      @Path("/editStockStatus")
      @GET
      public Response editStockStatus() {
         return Response.ok(service.editStockStatus().toString()).build();  
      }
      @Path("/getStockStatus")
      @GET
      public Response getStockStatus() {
         return Response.ok(service.getStockStatus().toString()).build();  
      }
      @Path("/addStockStatus1")
      @GET
      public Response addStockStatus1() {
         return Response.ok(service.addStockStatus1().toString()).build();  
      }
      @Path("/getStockStatuses")
      @GET
      public Response getStockStatuses(  @QueryParam("StockStatusId")  Integer StockStatusId) {
         return Response.ok(service.getStockStatuses(StockStatusId).toString()).build();  
      }
      @Path("/getTotalStockStatuses")
      @GET
      public Response getTotalStockStatuses() {
         return Response.ok(service.getTotalStockStatuses().toString()).build();  
      }
      @Path("/getStockStatusDescriptions")
      @GET
      public Response getStockStatusDescriptions() {
         return Response.ok(service.getStockStatusDescriptions().toString()).build();  
      }
}