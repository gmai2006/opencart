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

@Path("/ModelDesignMenu")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignMenuResource {
  Log logger = LogFactory.getLog(ModelDesignMenuResource.class);

  @Inject
  ModelDesignMenuDAOImpl service;

      @Path("/deleteMenu")
      @GET
      public Response deleteMenu() {
         return Response.ok(service.deleteMenu().toString()).build();  
      }
      @Path("/addMenu1")
      @GET
      public Response addMenu1() {
         return Response.ok(service.addMenu1().toString()).build();  
      }
      @Path("/addMenu")
      @GET
      public Response addMenu() {
         return Response.ok(service.addMenu().toString()).build();  
      }
      @Path("/editMenu3")
      @GET
      public Response editMenu3() {
         return Response.ok(service.editMenu3().toString()).build();  
      }
      @Path("/editMenu4")
      @GET
      public Response editMenu4() {
         return Response.ok(service.editMenu4().toString()).build();  
      }
      @Path("/editMenu1")
      @GET
      public Response editMenu1() {
         return Response.ok(service.editMenu1().toString()).build();  
      }
      @Path("/editMenu2")
      @GET
      public Response editMenu2() {
         return Response.ok(service.editMenu2().toString()).build();  
      }
      @Path("/getMenuModules")
      @GET
      public Response getMenuModules() {
         return Response.ok(service.getMenuModules().toString()).build();  
      }
      @Path("/editMenu")
      @GET
      public Response editMenu() {
         return Response.ok(service.editMenu().toString()).build();  
      }
      @Path("/deleteMenu2")
      @GET
      public Response deleteMenu2() {
         return Response.ok(service.deleteMenu2().toString()).build();  
      }
      @Path("/getMenuDescriptions")
      @GET
      public Response getMenuDescriptions() {
         return Response.ok(service.getMenuDescriptions().toString()).build();  
      }
      @Path("/getTotalMenus")
      @GET
      public Response getTotalMenus() {
         return Response.ok(service.getTotalMenus().toString()).build();  
      }
      @Path("/getMenu")
      @GET
      public Response getMenu() {
         return Response.ok(service.getMenu().toString()).build();  
      }
      @Path("/deleteMenu1")
      @GET
      public Response deleteMenu1() {
         return Response.ok(service.deleteMenu1().toString()).build();  
      }
}