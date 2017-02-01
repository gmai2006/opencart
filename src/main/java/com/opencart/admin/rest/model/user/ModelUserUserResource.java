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

@Path("/ModelUserUser")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelUserUserResource {
  Log logger = LogFactory.getLog(ModelUserUserResource.class);

  @Inject
  ModelUserUserDAOImpl service;

      @Path("/editCode")
      @GET
      public Response editCode() {
         return Response.ok(service.editCode().toString()).build();  
      }
      @Path("/getUserByUsername")
      @GET
      public Response getUserByUsername() {
         return Response.ok(service.getUserByUsername().toString()).build();  
      }
      @Path("/editUser1")
      @GET
      public Response editUser1() {
         return Response.ok(service.editUser1().toString()).build();  
      }
      @Path("/addUser")
      @GET
      public Response addUser() {
         return Response.ok(service.addUser().toString()).build();  
      }
      @Path("/getUser")
      @GET
      public Response getUser() {
         return Response.ok(service.getUser().toString()).build();  
      }
      @Path("/editUser")
      @GET
      public Response editUser() {
         return Response.ok(service.editUser().toString()).build();  
      }
      @Path("/getTotalUsersByGroupId")
      @GET
      public Response getTotalUsersByGroupId() {
         return Response.ok(service.getTotalUsersByGroupId().toString()).build();  
      }
      @Path("/getUserByEmail")
      @GET
      public Response getUserByEmail() {
         return Response.ok(service.getUserByEmail().toString()).build();  
      }
      @Path("/getUserByCode")
      @GET
      public Response getUserByCode() {
         return Response.ok(service.getUserByCode().toString()).build();  
      }
      @Path("/editPassword")
      @GET
      public Response editPassword() {
         return Response.ok(service.editPassword().toString()).build();  
      }
      @Path("/deleteUser")
      @GET
      public Response deleteUser() {
         return Response.ok(service.deleteUser().toString()).build();  
      }
      @Path("/getTotalUsersByEmail")
      @GET
      public Response getTotalUsersByEmail() {
         return Response.ok(service.getTotalUsersByEmail().toString()).build();  
      }
      @Path("/getTotalUsers")
      @GET
      public Response getTotalUsers() {
         return Response.ok(service.getTotalUsers().toString()).build();  
      }
}