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

@Path("/ModelCatalogAttribute")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogAttributeResource {
  Log logger = LogFactory.getLog(ModelCatalogAttributeResource.class);

  @Inject
  ModelCatalogAttributeDAOImpl service;

      @Path("/editAttribute1")
      @GET
      public Response editAttribute1() {
         return Response.ok(service.editAttribute1().toString()).build();  
      }
      @Path("/getAttribute")
      @GET
      public Response getAttribute() {
         return Response.ok(service.getAttribute().toString()).build();  
      }
      @Path("/getTotalAttributes")
      @GET
      public Response getTotalAttributes() {
         return Response.ok(service.getTotalAttributes().toString()).build();  
      }
      @Path("/addAttribute")
      @GET
      public Response addAttribute() {
         return Response.ok(service.addAttribute().toString()).build();  
      }
      @Path("/deleteAttribute")
      @GET
      public Response deleteAttribute() {
         return Response.ok(service.deleteAttribute().toString()).build();  
      }
      @Path("/editAttribute")
      @GET
      public Response editAttribute() {
         return Response.ok(service.editAttribute().toString()).build();  
      }
      @Path("/deleteAttribute1")
      @GET
      public Response deleteAttribute1() {
         return Response.ok(service.deleteAttribute1().toString()).build();  
      }
      @Path("/getTotalAttributesByAttributeGroupId")
      @GET
      public Response getTotalAttributesByAttributeGroupId() {
         return Response.ok(service.getTotalAttributesByAttributeGroupId().toString()).build();  
      }
      @Path("/addAttribute1")
      @GET
      public Response addAttribute1() {
         return Response.ok(service.addAttribute1().toString()).build();  
      }
      @Path("/editAttribute2")
      @GET
      public Response editAttribute2() {
         return Response.ok(service.editAttribute2().toString()).build();  
      }
      @Path("/getAttributeDescriptions")
      @GET
      public Response getAttributeDescriptions() {
         return Response.ok(service.getAttributeDescriptions().toString()).build();  
      }
}