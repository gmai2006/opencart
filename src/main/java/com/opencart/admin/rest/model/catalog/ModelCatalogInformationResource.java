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

@Path("/ModelCatalogInformation")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogInformationResource {
  Log logger = LogFactory.getLog(ModelCatalogInformationResource.class);

  @Inject
  ModelCatalogInformationDAOImpl service;

      @Path("/getInformationLayouts")
      @GET
      public Response getInformationLayouts() {
         return Response.ok(service.getInformationLayouts().toString()).build();  
      }
      @Path("/getTotalInformationsByLayoutId")
      @GET
      public Response getTotalInformationsByLayoutId() {
         return Response.ok(service.getTotalInformationsByLayoutId().toString()).build();  
      }
      @Path("/getInformations")
      @GET
      public Response getInformations() {
         return Response.ok(service.getInformations().toString()).build();  
      }
      @Path("/getInformationDescriptions")
      @GET
      public Response getInformationDescriptions() {
         return Response.ok(service.getInformationDescriptions().toString()).build();  
      }
      @Path("/addInformation")
      @GET
      public Response addInformation() {
         return Response.ok(service.addInformation().toString()).build();  
      }
      @Path("/getTotalInformations")
      @GET
      public Response getTotalInformations() {
         return Response.ok(service.getTotalInformations().toString()).build();  
      }
      @Path("/deleteInformation3")
      @GET
      public Response deleteInformation3() {
         return Response.ok(service.deleteInformation3().toString()).build();  
      }
      @Path("/deleteInformation2")
      @GET
      public Response deleteInformation2() {
         return Response.ok(service.deleteInformation2().toString()).build();  
      }
      @Path("/deleteInformation1")
      @GET
      public Response deleteInformation1() {
         return Response.ok(service.deleteInformation1().toString()).build();  
      }
      @Path("/getInformationStores")
      @GET
      public Response getInformationStores() {
         return Response.ok(service.getInformationStores().toString()).build();  
      }
      @Path("/editInformation6")
      @GET
      public Response editInformation6() {
         return Response.ok(service.editInformation6().toString()).build();  
      }
      @Path("/deleteInformation")
      @GET
      public Response deleteInformation() {
         return Response.ok(service.deleteInformation().toString()).build();  
      }
      @Path("/editInformation2")
      @GET
      public Response editInformation2() {
         return Response.ok(service.editInformation2().toString()).build();  
      }
      @Path("/editInformation3")
      @GET
      public Response editInformation3() {
         return Response.ok(service.editInformation3().toString()).build();  
      }
      @Path("/editInformation4")
      @GET
      public Response editInformation4() {
         return Response.ok(service.editInformation4().toString()).build();  
      }
      @Path("/editInformation5")
      @GET
      public Response editInformation5() {
         return Response.ok(service.editInformation5().toString()).build();  
      }
      @Path("/addInformation3")
      @GET
      public Response addInformation3() {
         return Response.ok(service.addInformation3().toString()).build();  
      }
      @Path("/editInformation")
      @GET
      public Response editInformation() {
         return Response.ok(service.editInformation().toString()).build();  
      }
      @Path("/editInformation1")
      @GET
      public Response editInformation1() {
         return Response.ok(service.editInformation1().toString()).build();  
      }
      @Path("/addInformation1")
      @GET
      public Response addInformation1() {
         return Response.ok(service.addInformation1().toString()).build();  
      }
      @Path("/addInformation2")
      @GET
      public Response addInformation2() {
         return Response.ok(service.addInformation2().toString()).build();  
      }
}