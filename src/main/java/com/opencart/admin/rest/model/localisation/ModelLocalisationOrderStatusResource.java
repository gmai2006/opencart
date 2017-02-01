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

@Path("/ModelLocalisationOrderStatus")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationOrderStatusResource {
  Log logger = LogFactory.getLog(ModelLocalisationOrderStatusResource.class);

  @Inject
  ModelLocalisationOrderStatusDAOImpl service;

      @Path("/getOrderStatuses")
      @GET
      public Response getOrderStatuses(  @QueryParam("OrderStatusId")  Integer OrderStatusId) {
         return Response.ok(service.getOrderStatuses(OrderStatusId).toString()).build();  
      }
      @Path("/addOrderStatus")
      @GET
      public Response addOrderStatus() {
         return Response.ok(service.addOrderStatus().toString()).build();  
      }
      @Path("/getTotalOrderStatuses")
      @GET
      public Response getTotalOrderStatuses() {
         return Response.ok(service.getTotalOrderStatuses().toString()).build();  
      }
      @Path("/editOrderStatus")
      @GET
      public Response editOrderStatus() {
         return Response.ok(service.editOrderStatus().toString()).build();  
      }
      @Path("/getOrderStatus")
      @GET
      public Response getOrderStatus() {
         return Response.ok(service.getOrderStatus().toString()).build();  
      }
      @Path("/deleteOrderStatus")
      @GET
      public Response deleteOrderStatus() {
         return Response.ok(service.deleteOrderStatus().toString()).build();  
      }
      @Path("/editOrderStatus1")
      @GET
      public Response editOrderStatus1() {
         return Response.ok(service.editOrderStatus1().toString()).build();  
      }
      @Path("/addOrderStatus1")
      @GET
      public Response addOrderStatus1() {
         return Response.ok(service.addOrderStatus1().toString()).build();  
      }
      @Path("/getOrderStatusDescriptions")
      @GET
      public Response getOrderStatusDescriptions() {
         return Response.ok(service.getOrderStatusDescriptions().toString()).build();  
      }
}