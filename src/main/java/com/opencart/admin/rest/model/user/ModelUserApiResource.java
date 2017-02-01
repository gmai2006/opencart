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

@Path("/ModelUserApi")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelUserApiResource {
  Log logger = LogFactory.getLog(ModelUserApiResource.class);

  @Inject
  ModelUserApiDAOImpl service;

      @Path("/deleteApiSession")
      @GET
      public Response deleteApiSession() {
         return Response.ok(service.deleteApiSession().toString()).build();  
      }
      @Path("/editApi")
      @GET
      public Response editApi() {
         return Response.ok(service.editApi().toString()).build();  
      }
      @Path("/addApiSession")
      @GET
      public Response addApiSession() {
         return Response.ok(service.addApiSession().toString()).build();  
      }
      @Path("/getApiSessions")
      @GET
      public Response getApiSessions() {
         return Response.ok(service.getApiSessions().toString()).build();  
      }
      @Path("/getApi")
      @GET
      public Response getApi() {
         return Response.ok(service.getApi().toString()).build();  
      }
      @Path("/addApi")
      @GET
      public Response addApi() {
         return Response.ok(service.addApi().toString()).build();  
      }
      @Path("/addApiIp")
      @GET
      public Response addApiIp() {
         return Response.ok(service.addApiIp().toString()).build();  
      }
      @Path("/getApiIps")
      @GET
      public Response getApiIps() {
         return Response.ok(service.getApiIps().toString()).build();  
      }
      @Path("/deleteApi")
      @GET
      public Response deleteApi() {
         return Response.ok(service.deleteApi().toString()).build();  
      }
      @Path("/editApi1")
      @GET
      public Response editApi1() {
         return Response.ok(service.editApi1().toString()).build();  
      }
      @Path("/editApi2")
      @GET
      public Response editApi2() {
         return Response.ok(service.editApi2().toString()).build();  
      }
      @Path("/addApi1")
      @GET
      public Response addApi1() {
         return Response.ok(service.addApi1().toString()).build();  
      }
      @Path("/getTotalApis")
      @GET
      public Response getTotalApis() {
         return Response.ok(service.getTotalApis().toString()).build();  
      }
}