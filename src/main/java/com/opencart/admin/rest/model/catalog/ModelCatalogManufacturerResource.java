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

@Path("/ModelCatalogManufacturer")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogManufacturerResource {
  Log logger = LogFactory.getLog(ModelCatalogManufacturerResource.class);

  @Inject
  ModelCatalogManufacturerDAOImpl service;

      @Path("/addManufacturer2")
      @GET
      public Response addManufacturer2() {
         return Response.ok(service.addManufacturer2().toString()).build();  
      }
      @Path("/getTotalManufacturers")
      @GET
      public Response getTotalManufacturers() {
         return Response.ok(service.getTotalManufacturers().toString()).build();  
      }
      @Path("/deleteManufacturer")
      @GET
      public Response deleteManufacturer() {
         return Response.ok(service.deleteManufacturer().toString()).build();  
      }
      @Path("/addManufacturer")
      @GET
      public Response addManufacturer() {
         return Response.ok(service.addManufacturer().toString()).build();  
      }
      @Path("/deleteManufacturer1")
      @GET
      public Response deleteManufacturer1() {
         return Response.ok(service.deleteManufacturer1().toString()).build();  
      }
      @Path("/editManufacturer1")
      @GET
      public Response editManufacturer1() {
         return Response.ok(service.editManufacturer1().toString()).build();  
      }
      @Path("/editManufacturer2")
      @GET
      public Response editManufacturer2() {
         return Response.ok(service.editManufacturer2().toString()).build();  
      }
      @Path("/editManufacturer")
      @GET
      public Response editManufacturer() {
         return Response.ok(service.editManufacturer().toString()).build();  
      }
      @Path("/editManufacturer3")
      @GET
      public Response editManufacturer3() {
         return Response.ok(service.editManufacturer3().toString()).build();  
      }
      @Path("/getManufacturerStores")
      @GET
      public Response getManufacturerStores() {
         return Response.ok(service.getManufacturerStores().toString()).build();  
      }
      @Path("/addManufacturer1")
      @GET
      public Response addManufacturer1() {
         return Response.ok(service.addManufacturer1().toString()).build();  
      }
}