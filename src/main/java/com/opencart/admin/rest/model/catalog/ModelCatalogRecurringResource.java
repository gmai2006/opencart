package com.opencart.admin.rest.model.catalog;


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

import com.opencart.admin.dao.model.catalog.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCatalogRecurring")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogRecurringResource {
  Log logger = LogFactory.getLog(ModelCatalogRecurringResource.class);

  @Inject
  ModelCatalogRecurringDAOImpl service;

      @Path("/getTotalRecurrings")
      @GET
      public Response getTotalRecurrings() {
         return Response.ok(service.getTotalRecurrings().toString()).build();  
      }
      @Path("/deleteRecurring1")
      @GET
      public Response deleteRecurring1() {
         return Response.ok(service.deleteRecurring1().toString()).build();  
      }
      @Path("/addRecurring1")
      @GET
      public Response addRecurring1() {
         return Response.ok(service.addRecurring1().toString()).build();  
      }
      @Path("/deleteRecurring")
      @GET
      public Response deleteRecurring() {
         return Response.ok(service.deleteRecurring().toString()).build();  
      }
      @Path("/deleteRecurring3")
      @GET
      public Response deleteRecurring3() {
         return Response.ok(service.deleteRecurring3().toString()).build();  
      }
      @Path("/deleteRecurring2")
      @GET
      public Response deleteRecurring2() {
         return Response.ok(service.deleteRecurring2().toString()).build();  
      }
      @Path("/editRecurring")
      @GET
      public Response editRecurring() {
         return Response.ok(service.editRecurring().toString()).build();  
      }
      @Path("/getRecurringDescription")
      @GET
      public Response getRecurringDescription() {
         return Response.ok(service.getRecurringDescription().toString()).build();  
      }
      @Path("/editRecurring1")
      @GET
      public Response editRecurring1() {
         return Response.ok(service.editRecurring1().toString()).build();  
      }
      @Path("/getRecurring")
      @GET
      public Response getRecurring() {
         return Response.ok(service.getRecurring().toString()).build();  
      }
      @Path("/addRecurring")
      @GET
      public Response addRecurring() {
         return Response.ok(service.addRecurring().toString()).build();  
      }
      @Path("/editRecurring2")
      @GET
      public Response editRecurring2() {
         return Response.ok(service.editRecurring2().toString()).build();  
      }
}