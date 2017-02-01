package com.opencart.catalog.rest.model.account;


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

import com.opencart.catalog.dao.model.account.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAccountOrder")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountOrderResource {
  Log logger = LogFactory.getLog(ModelAccountOrderResource.class);

  @Inject
  ModelAccountOrderDAOImpl service;

      @Path("/getOrderHistories")
      @GET
      public Response getOrderHistories(  @QueryParam("DateAdded")  java.sql.Timestamp DateAdded) {
         return Response.ok(service.getOrderHistories(DateAdded).toString()).build();  
      }
      @Path("/getOrderOptions")
      @GET
      public Response getOrderOptions() {
         return Response.ok(service.getOrderOptions().toString()).build();  
      }
      @Path("/getOrderProducts")
      @GET
      public Response getOrderProducts() {
         return Response.ok(service.getOrderProducts().toString()).build();  
      }
      @Path("/getOrderVouchers")
      @GET
      public Response getOrderVouchers() {
         return Response.ok(service.getOrderVouchers().toString()).build();  
      }
      @Path("/getOrder4")
      @GET
      public Response getOrder4() {
         return Response.ok(service.getOrder4().toString()).build();  
      }
      @Path("/getOrder2")
      @GET
      public Response getOrder2() {
         return Response.ok(service.getOrder2().toString()).build();  
      }
      @Path("/getOrder3")
      @GET
      public Response getOrder3() {
         return Response.ok(service.getOrder3().toString()).build();  
      }
      @Path("/getOrders")
      @GET
      public Response getOrders(  @QueryParam("OrderId")  Integer OrderId) {
         return Response.ok(service.getOrders(OrderId).toString()).build();  
      }
      @Path("/getOrder1")
      @GET
      public Response getOrder1() {
         return Response.ok(service.getOrder1().toString()).build();  
      }
      @Path("/getOrderTotals")
      @GET
      public Response getOrderTotals() {
         return Response.ok(service.getOrderTotals().toString()).build();  
      }
      @Path("/getOrder")
      @GET
      public Response getOrder() {
         return Response.ok(service.getOrder().toString()).build();  
      }
      @Path("/getTotalOrderVouchersByOrderId")
      @GET
      public Response getTotalOrderVouchersByOrderId() {
         return Response.ok(service.getTotalOrderVouchersByOrderId().toString()).build();  
      }
      @Path("/getOrderProduct")
      @GET
      public Response getOrderProduct() {
         return Response.ok(service.getOrderProduct().toString()).build();  
      }
      @Path("/getTotalOrders")
      @GET
      public Response getTotalOrders() {
         return Response.ok(service.getTotalOrders().toString()).build();  
      }
      @Path("/getTotalOrderProductsByOrderId")
      @GET
      public Response getTotalOrderProductsByOrderId() {
         return Response.ok(service.getTotalOrderProductsByOrderId().toString()).build();  
      }
}