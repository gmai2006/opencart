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

@Path("/ModelCatalogOption")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogOptionResource {
  Log logger = LogFactory.getLog(ModelCatalogOptionResource.class);

  @Inject
  ModelCatalogOptionDAOImpl service;

      @Path("/deleteOption1")
      @GET
      public Response deleteOption1() {
         return Response.ok(service.deleteOption1().toString()).build();  
      }
      @Path("/getOptionDescriptions")
      @GET
      public Response getOptionDescriptions() {
         return Response.ok(service.getOptionDescriptions().toString()).build();  
      }
      @Path("/deleteOption3")
      @GET
      public Response deleteOption3() {
         return Response.ok(service.deleteOption3().toString()).build();  
      }
      @Path("/deleteOption2")
      @GET
      public Response deleteOption2() {
         return Response.ok(service.deleteOption2().toString()).build();  
      }
      @Path("/getOptionValueDescriptions")
      @GET
      public Response getOptionValueDescriptions() {
         return Response.ok(service.getOptionValueDescriptions().toString()).build();  
      }
      @Path("/deleteOption")
      @GET
      public Response deleteOption() {
         return Response.ok(service.deleteOption().toString()).build();  
      }
      @Path("/getOption")
      @GET
      public Response getOption() {
         return Response.ok(service.getOption().toString()).build();  
      }
      @Path("/getOptionValueDescriptions1")
      @GET
      public Response getOptionValueDescriptions1() {
         return Response.ok(service.getOptionValueDescriptions1().toString()).build();  
      }
      @Path("/editOption")
      @GET
      public Response editOption() {
         return Response.ok(service.editOption().toString()).build();  
      }
      @Path("/editOption2")
      @GET
      public Response editOption2() {
         return Response.ok(service.editOption2().toString()).build();  
      }
      @Path("/editOption1")
      @GET
      public Response editOption1() {
         return Response.ok(service.editOption1().toString()).build();  
      }
      @Path("/addOption")
      @GET
      public Response addOption() {
         return Response.ok(service.addOption().toString()).build();  
      }
      @Path("/editOption6")
      @GET
      public Response editOption6() {
         return Response.ok(service.editOption6().toString()).build();  
      }
      @Path("/editOption5")
      @GET
      public Response editOption5() {
         return Response.ok(service.editOption5().toString()).build();  
      }
      @Path("/editOption4")
      @GET
      public Response editOption4() {
         return Response.ok(service.editOption4().toString()).build();  
      }
      @Path("/getOptionValue")
      @GET
      public Response getOptionValue() {
         return Response.ok(service.getOptionValue().toString()).build();  
      }
      @Path("/getOptionValues")
      @GET
      public Response getOptionValues() {
         return Response.ok(service.getOptionValues().toString()).build();  
      }
      @Path("/editOption3")
      @GET
      public Response editOption3() {
         return Response.ok(service.editOption3().toString()).build();  
      }
      @Path("/addOption1")
      @GET
      public Response addOption1() {
         return Response.ok(service.addOption1().toString()).build();  
      }
      @Path("/editOption7")
      @GET
      public Response editOption7() {
         return Response.ok(service.editOption7().toString()).build();  
      }
      @Path("/addOption3")
      @GET
      public Response addOption3() {
         return Response.ok(service.addOption3().toString()).build();  
      }
      @Path("/getTotalOptions")
      @GET
      public Response getTotalOptions() {
         return Response.ok(service.getTotalOptions().toString()).build();  
      }
      @Path("/addOption2")
      @GET
      public Response addOption2() {
         return Response.ok(service.addOption2().toString()).build();  
      }
}