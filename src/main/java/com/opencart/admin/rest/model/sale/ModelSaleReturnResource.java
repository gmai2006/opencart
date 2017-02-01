package com.opencart.admin.rest.model.sale;


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

import com.opencart.admin.dao.model.sale.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelSaleReturn")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSaleReturnResource {
  Log logger = LogFactory.getLog(ModelSaleReturnResource.class);

  @Inject
  ModelSaleReturnDAOImpl service;

      @Path("/getReturn")
      @GET
      public Response getReturn() {
         return Response.ok(service.getReturn().toString()).build();  
      }
      @Path("/getTotalReturnHistoriesByReturnStatusId")
      @GET
      public Response getTotalReturnHistoriesByReturnStatusId() {
         return Response.ok(service.getTotalReturnHistoriesByReturnStatusId().toString()).build();  
      }
      @Path("/getTotalReturnsByReturnActionId")
      @GET
      public Response getTotalReturnsByReturnActionId() {
         return Response.ok(service.getTotalReturnsByReturnActionId().toString()).build();  
      }
      @Path("/editReturn")
      @GET
      public Response editReturn() {
         return Response.ok(service.editReturn().toString()).build();  
      }
      @Path("/addReturnHistory2")
      @GET
      public Response addReturnHistory2() {
         return Response.ok(service.addReturnHistory2().toString()).build();  
      }
      @Path("/addReturnHistory1")
      @GET
      public Response addReturnHistory1() {
         return Response.ok(service.addReturnHistory1().toString()).build();  
      }
      @Path("/deleteReturn")
      @GET
      public Response deleteReturn() {
         return Response.ok(service.deleteReturn().toString()).build();  
      }
      @Path("/deleteReturn1")
      @GET
      public Response deleteReturn1() {
         return Response.ok(service.deleteReturn1().toString()).build();  
      }
      @Path("/addReturnHistory")
      @GET
      public Response addReturnHistory() {
         return Response.ok(service.addReturnHistory().toString()).build();  
      }
      @Path("/addReturn")
      @GET
      public Response addReturn() {
         return Response.ok(service.addReturn().toString()).build();  
      }
      @Path("/getReturnHistories")
      @GET
      public Response getReturnHistories(  @QueryParam("DateAdded")  java.sql.Timestamp DateAdded) {
         return Response.ok(service.getReturnHistories(DateAdded).toString()).build();  
      }
      @Path("/getTotalReturnsByReturnReasonId")
      @GET
      public Response getTotalReturnsByReturnReasonId() {
         return Response.ok(service.getTotalReturnsByReturnReasonId().toString()).build();  
      }
      @Path("/getTotalReturnsByReturnStatusId")
      @GET
      public Response getTotalReturnsByReturnStatusId() {
         return Response.ok(service.getTotalReturnsByReturnStatusId().toString()).build();  
      }
      @Path("/getTotalReturnHistories")
      @GET
      public Response getTotalReturnHistories() {
         return Response.ok(service.getTotalReturnHistories().toString()).build();  
      }
}