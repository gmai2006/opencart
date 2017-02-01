package com.opencart.admin.rest.model.user;


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

import com.opencart.admin.dao.model.user.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelUserUserGroup")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelUserUserGroupResource {
  Log logger = LogFactory.getLog(ModelUserUserGroupResource.class);

  @Inject
  ModelUserUserGroupDAOImpl service;

      @Path("/deleteUserGroup")
      @GET
      public Response deleteUserGroup() {
         return Response.ok(service.deleteUserGroup().toString()).build();  
      }
      @Path("/removePermission1")
      @GET
      public Response removePermission1() {
         return Response.ok(service.removePermission1().toString()).build();  
      }
      @Path("/addUserGroup")
      @GET
      public Response addUserGroup() {
         return Response.ok(service.addUserGroup().toString()).build();  
      }
      @Path("/addPermission")
      @GET
      public Response addPermission() {
         return Response.ok(service.addPermission().toString()).build();  
      }
      @Path("/addPermission1")
      @GET
      public Response addPermission1() {
         return Response.ok(service.addPermission1().toString()).build();  
      }
      @Path("/getUserGroup")
      @GET
      public Response getUserGroup() {
         return Response.ok(service.getUserGroup().toString()).build();  
      }
      @Path("/removePermission")
      @GET
      public Response removePermission() {
         return Response.ok(service.removePermission().toString()).build();  
      }
      @Path("/editUserGroup")
      @GET
      public Response editUserGroup() {
         return Response.ok(service.editUserGroup().toString()).build();  
      }
      @Path("/getTotalUserGroups")
      @GET
      public Response getTotalUserGroups() {
         return Response.ok(service.getTotalUserGroups().toString()).build();  
      }
}