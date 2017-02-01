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

@Path("/ModelSaleVoucherTheme")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSaleVoucherThemeResource {
  Log logger = LogFactory.getLog(ModelSaleVoucherThemeResource.class);

  @Inject
  ModelSaleVoucherThemeDAOImpl service;

      @Path("/getVoucherThemes")
      @GET
      public Response getVoucherThemes() {
         return Response.ok(service.getVoucherThemes().toString()).build();  
      }
      @Path("/editVoucherTheme1")
      @GET
      public Response editVoucherTheme1() {
         return Response.ok(service.editVoucherTheme1().toString()).build();  
      }
      @Path("/editVoucherTheme2")
      @GET
      public Response editVoucherTheme2() {
         return Response.ok(service.editVoucherTheme2().toString()).build();  
      }
      @Path("/deleteVoucherTheme")
      @GET
      public Response deleteVoucherTheme() {
         return Response.ok(service.deleteVoucherTheme().toString()).build();  
      }
      @Path("/getTotalVoucherThemes")
      @GET
      public Response getTotalVoucherThemes() {
         return Response.ok(service.getTotalVoucherThemes().toString()).build();  
      }
      @Path("/addVoucherTheme")
      @GET
      public Response addVoucherTheme() {
         return Response.ok(service.addVoucherTheme().toString()).build();  
      }
      @Path("/getVoucherThemeDescriptions")
      @GET
      public Response getVoucherThemeDescriptions() {
         return Response.ok(service.getVoucherThemeDescriptions().toString()).build();  
      }
      @Path("/addVoucherTheme1")
      @GET
      public Response addVoucherTheme1() {
         return Response.ok(service.addVoucherTheme1().toString()).build();  
      }
      @Path("/editVoucherTheme")
      @GET
      public Response editVoucherTheme() {
         return Response.ok(service.editVoucherTheme().toString()).build();  
      }
      @Path("/deleteVoucherTheme1")
      @GET
      public Response deleteVoucherTheme1() {
         return Response.ok(service.deleteVoucherTheme1().toString()).build();  
      }
      @Path("/getVoucherTheme")
      @GET
      public Response getVoucherTheme() {
         return Response.ok(service.getVoucherTheme().toString()).build();  
      }
}