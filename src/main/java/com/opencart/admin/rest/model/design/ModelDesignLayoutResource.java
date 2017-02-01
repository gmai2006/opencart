package com.opencart.admin.rest.model.design;


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

import com.opencart.admin.dao.model.design.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelDesignLayout")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignLayoutResource {
  Log logger = LogFactory.getLog(ModelDesignLayoutResource.class);

  @Inject
  ModelDesignLayoutDAOImpl service;

      @Path("/getLayoutRoutes")
      @GET
      public Response getLayoutRoutes() {
         return Response.ok(service.getLayoutRoutes().toString()).build();  
      }
      @Path("/addLayout1")
      @GET
      public Response addLayout1() {
         return Response.ok(service.addLayout1().toString()).build();  
      }
      @Path("/deleteLayout")
      @GET
      public Response deleteLayout() {
         return Response.ok(service.deleteLayout().toString()).build();  
      }
      @Path("/deleteLayout5")
      @GET
      public Response deleteLayout5() {
         return Response.ok(service.deleteLayout5().toString()).build();  
      }
      @Path("/deleteLayout4")
      @GET
      public Response deleteLayout4() {
         return Response.ok(service.deleteLayout4().toString()).build();  
      }
      @Path("/getLayoutModules")
      @GET
      public Response getLayoutModules() {
         return Response.ok(service.getLayoutModules().toString()).build();  
      }
      @Path("/deleteLayout3")
      @GET
      public Response deleteLayout3() {
         return Response.ok(service.deleteLayout3().toString()).build();  
      }
      @Path("/deleteLayout2")
      @GET
      public Response deleteLayout2() {
         return Response.ok(service.deleteLayout2().toString()).build();  
      }
      @Path("/getLayout")
      @GET
      public Response getLayout() {
         return Response.ok(service.getLayout().toString()).build();  
      }
      @Path("/deleteLayout1")
      @GET
      public Response deleteLayout1() {
         return Response.ok(service.deleteLayout1().toString()).build();  
      }
      @Path("/editLayout")
      @GET
      public Response editLayout() {
         return Response.ok(service.editLayout().toString()).build();  
      }
      @Path("/getTotalLayouts")
      @GET
      public Response getTotalLayouts() {
         return Response.ok(service.getTotalLayouts().toString()).build();  
      }
      @Path("/addLayout")
      @GET
      public Response addLayout() {
         return Response.ok(service.addLayout().toString()).build();  
      }
      @Path("/editLayout1")
      @GET
      public Response editLayout1() {
         return Response.ok(service.editLayout1().toString()).build();  
      }
      @Path("/editLayout3")
      @GET
      public Response editLayout3() {
         return Response.ok(service.editLayout3().toString()).build();  
      }
      @Path("/editLayout2")
      @GET
      public Response editLayout2() {
         return Response.ok(service.editLayout2().toString()).build();  
      }
}