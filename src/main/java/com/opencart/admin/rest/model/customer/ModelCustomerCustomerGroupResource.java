package com.opencart.admin.rest.model.customer;


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

import com.opencart.admin.dao.model.customer.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCustomerCustomerGroup")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCustomerCustomerGroupResource {
  Log logger = LogFactory.getLog(ModelCustomerCustomerGroupResource.class);

  @Inject
  ModelCustomerCustomerGroupDAOImpl service;

      @Path("/addCustomerGroup")
      @GET
      public Response addCustomerGroup() {
         return Response.ok(service.addCustomerGroup().toString()).build();  
      }
      @Path("/getTotalCustomerGroups")
      @GET
      public Response getTotalCustomerGroups() {
         return Response.ok(service.getTotalCustomerGroups().toString()).build();  
      }
      @Path("/getCustomerGroup")
      @GET
      public Response getCustomerGroup() {
         return Response.ok(service.getCustomerGroup().toString()).build();  
      }
      @Path("/deleteCustomerGroup")
      @GET
      public Response deleteCustomerGroup() {
         return Response.ok(service.deleteCustomerGroup().toString()).build();  
      }
      @Path("/editCustomerGroup")
      @GET
      public Response editCustomerGroup() {
         return Response.ok(service.editCustomerGroup().toString()).build();  
      }
      @Path("/addCustomerGroup1")
      @GET
      public Response addCustomerGroup1() {
         return Response.ok(service.addCustomerGroup1().toString()).build();  
      }
      @Path("/editCustomerGroup1")
      @GET
      public Response editCustomerGroup1() {
         return Response.ok(service.editCustomerGroup1().toString()).build();  
      }
      @Path("/deleteCustomerGroup1")
      @GET
      public Response deleteCustomerGroup1() {
         return Response.ok(service.deleteCustomerGroup1().toString()).build();  
      }
      @Path("/editCustomerGroup2")
      @GET
      public Response editCustomerGroup2() {
         return Response.ok(service.editCustomerGroup2().toString()).build();  
      }
      @Path("/getCustomerGroupDescriptions")
      @GET
      public Response getCustomerGroupDescriptions() {
         return Response.ok(service.getCustomerGroupDescriptions().toString()).build();  
      }
      @Path("/deleteCustomerGroup2")
      @GET
      public Response deleteCustomerGroup2() {
         return Response.ok(service.deleteCustomerGroup2().toString()).build();  
      }
      @Path("/deleteCustomerGroup3")
      @GET
      public Response deleteCustomerGroup3() {
         return Response.ok(service.deleteCustomerGroup3().toString()).build();  
      }
      @Path("/deleteCustomerGroup4")
      @GET
      public Response deleteCustomerGroup4() {
         return Response.ok(service.deleteCustomerGroup4().toString()).build();  
      }
      @Path("/deleteCustomerGroup5")
      @GET
      public Response deleteCustomerGroup5() {
         return Response.ok(service.deleteCustomerGroup5().toString()).build();  
      }
}