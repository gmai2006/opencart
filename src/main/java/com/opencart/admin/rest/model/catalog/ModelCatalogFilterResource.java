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

@Path("/ModelCatalogFilter")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogFilterResource {
  Log logger = LogFactory.getLog(ModelCatalogFilterResource.class);

  @Inject
  ModelCatalogFilterDAOImpl service;

      @Path("/editFilter1")
      @GET
      public Response editFilter1() {
         return Response.ok(service.editFilter1().toString()).build();  
      }
      @Path("/deleteFilter")
      @GET
      public Response deleteFilter() {
         return Response.ok(service.deleteFilter().toString()).build();  
      }
      @Path("/getFilterGroup")
      @GET
      public Response getFilterGroup() {
         return Response.ok(service.getFilterGroup().toString()).build();  
      }
      @Path("/deleteFilter3")
      @GET
      public Response deleteFilter3() {
         return Response.ok(service.deleteFilter3().toString()).build();  
      }
      @Path("/getFilterDescriptions1")
      @GET
      public Response getFilterDescriptions1() {
         return Response.ok(service.getFilterDescriptions1().toString()).build();  
      }
      @Path("/getFilter")
      @GET
      public Response getFilter() {
         return Response.ok(service.getFilter().toString()).build();  
      }
      @Path("/deleteFilter1")
      @GET
      public Response deleteFilter1() {
         return Response.ok(service.deleteFilter1().toString()).build();  
      }
      @Path("/editFilter")
      @GET
      public Response editFilter() {
         return Response.ok(service.editFilter().toString()).build();  
      }
      @Path("/deleteFilter2")
      @GET
      public Response deleteFilter2() {
         return Response.ok(service.deleteFilter2().toString()).build();  
      }
      @Path("/addFilter2")
      @GET
      public Response addFilter2() {
         return Response.ok(service.addFilter2().toString()).build();  
      }
      @Path("/addFilter1")
      @GET
      public Response addFilter1() {
         return Response.ok(service.addFilter1().toString()).build();  
      }
      @Path("/addFilter3")
      @GET
      public Response addFilter3() {
         return Response.ok(service.addFilter3().toString()).build();  
      }
      @Path("/editFilter7")
      @GET
      public Response editFilter7() {
         return Response.ok(service.editFilter7().toString()).build();  
      }
      @Path("/addFilter")
      @GET
      public Response addFilter() {
         return Response.ok(service.addFilter().toString()).build();  
      }
      @Path("/editFilter6")
      @GET
      public Response editFilter6() {
         return Response.ok(service.editFilter6().toString()).build();  
      }
      @Path("/getFilterGroupDescriptions")
      @GET
      public Response getFilterGroupDescriptions() {
         return Response.ok(service.getFilterGroupDescriptions().toString()).build();  
      }
      @Path("/getFilterDescriptions")
      @GET
      public Response getFilterDescriptions() {
         return Response.ok(service.getFilterDescriptions().toString()).build();  
      }
      @Path("/editFilter3")
      @GET
      public Response editFilter3() {
         return Response.ok(service.editFilter3().toString()).build();  
      }
      @Path("/editFilter2")
      @GET
      public Response editFilter2() {
         return Response.ok(service.editFilter2().toString()).build();  
      }
      @Path("/getTotalFilterGroups")
      @GET
      public Response getTotalFilterGroups() {
         return Response.ok(service.getTotalFilterGroups().toString()).build();  
      }
      @Path("/editFilter5")
      @GET
      public Response editFilter5() {
         return Response.ok(service.editFilter5().toString()).build();  
      }
      @Path("/editFilter4")
      @GET
      public Response editFilter4() {
         return Response.ok(service.editFilter4().toString()).build();  
      }
}