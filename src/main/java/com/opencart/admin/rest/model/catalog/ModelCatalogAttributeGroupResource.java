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

@Path("/ModelCatalogAttributeGroup")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogAttributeGroupResource {
  Log logger = LogFactory.getLog(ModelCatalogAttributeGroupResource.class);

  @Inject
  ModelCatalogAttributeGroupDAOImpl service;

      @Path("/addAttributeGroup1")
      @GET
      public Response addAttributeGroup1() {
         return Response.ok(service.addAttributeGroup1().toString()).build();  
      }
      @Path("/getAttributeGroupDescriptions")
      @GET
      public Response getAttributeGroupDescriptions() {
         return Response.ok(service.getAttributeGroupDescriptions().toString()).build();  
      }
      @Path("/getAttributeGroup")
      @GET
      public Response getAttributeGroup() {
         return Response.ok(service.getAttributeGroup().toString()).build();  
      }
      @Path("/getTotalAttributeGroups")
      @GET
      public Response getTotalAttributeGroups() {
         return Response.ok(service.getTotalAttributeGroups().toString()).build();  
      }
      @Path("/editAttributeGroup")
      @GET
      public Response editAttributeGroup() {
         return Response.ok(service.editAttributeGroup().toString()).build();  
      }
      @Path("/deleteAttributeGroup")
      @GET
      public Response deleteAttributeGroup() {
         return Response.ok(service.deleteAttributeGroup().toString()).build();  
      }
      @Path("/deleteAttributeGroup1")
      @GET
      public Response deleteAttributeGroup1() {
         return Response.ok(service.deleteAttributeGroup1().toString()).build();  
      }
      @Path("/addAttributeGroup")
      @GET
      public Response addAttributeGroup() {
         return Response.ok(service.addAttributeGroup().toString()).build();  
      }
      @Path("/editAttributeGroup2")
      @GET
      public Response editAttributeGroup2() {
         return Response.ok(service.editAttributeGroup2().toString()).build();  
      }
      @Path("/editAttributeGroup1")
      @GET
      public Response editAttributeGroup1() {
         return Response.ok(service.editAttributeGroup1().toString()).build();  
      }
}