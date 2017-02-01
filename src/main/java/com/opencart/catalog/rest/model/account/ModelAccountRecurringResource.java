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

@Path("/ModelAccountRecurring")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountRecurringResource {
  Log logger = LogFactory.getLog(ModelAccountRecurringResource.class);

  @Inject
  ModelAccountRecurringDAOImpl service;

      @Path("/addOrderRecurringTransaction")
      @GET
      public Response addOrderRecurringTransaction() {
         return Response.ok(service.addOrderRecurringTransaction().toString()).build();  
      }
      @Path("/getOrderRecurringTransactions")
      @GET
      public Response getOrderRecurringTransactions() {
         return Response.ok(service.getOrderRecurringTransactions().toString()).build();  
      }
      @Path("/getOrderRecurrings")
      @GET
      public Response getOrderRecurrings() {
         return Response.ok(service.getOrderRecurrings().toString()).build();  
      }
      @Path("/getOrderRecurringByReference")
      @GET
      public Response getOrderRecurringByReference() {
         return Response.ok(service.getOrderRecurringByReference().toString()).build();  
      }
      @Path("/getOrderRecurring")
      @GET
      public Response getOrderRecurring() {
         return Response.ok(service.getOrderRecurring().toString()).build();  
      }
      @Path("/getTotalOrderRecurrings")
      @GET
      public Response getTotalOrderRecurrings() {
         return Response.ok(service.getTotalOrderRecurrings().toString()).build();  
      }
      @Path("/editOrderRecurringStatus")
      @GET
      public Response editOrderRecurringStatus() {
         return Response.ok(service.editOrderRecurringStatus().toString()).build();  
      }
}