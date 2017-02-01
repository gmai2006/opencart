package com.opencart.catalog.rest.model.account;


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

import com.opencart.catalog.dao.model.account.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAccountCustomer")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountCustomerResource {
  Log logger = LogFactory.getLog(ModelAccountCustomerResource.class);

  @Inject
  ModelAccountCustomerDAOImpl service;

      @Path("/editCustomer")
      @GET
      public Response editCustomer() {
         return Response.ok(service.editCustomer().toString()).build();  
      }
      @Path("/editCode")
      @GET
      public Response editCode() {
         return Response.ok(service.editCode().toString()).build();  
      }
      @Path("/addLoginAttempt1")
      @GET
      public Response addLoginAttempt1() {
         return Response.ok(service.addLoginAttempt1().toString()).build();  
      }
      @Path("/addCustomer1")
      @GET
      public Response addCustomer1() {
         return Response.ok(service.addCustomer1().toString()).build();  
      }
      @Path("/addLoginAttempt2")
      @GET
      public Response addLoginAttempt2() {
         return Response.ok(service.addLoginAttempt2().toString()).build();  
      }
      @Path("/addCustomer2")
      @GET
      public Response addCustomer2() {
         return Response.ok(service.addCustomer2().toString()).build();  
      }
      @Path("/getTotalCustomersByEmail")
      @GET
      public Response getTotalCustomersByEmail() {
         return Response.ok(service.getTotalCustomersByEmail().toString()).build();  
      }
      @Path("/getCustomerByToken1")
      @GET
      public Response getCustomerByToken1() {
         return Response.ok(service.getCustomerByToken1().toString()).build();  
      }
      @Path("/getCustomerByEmail")
      @GET
      public Response getCustomerByEmail() {
         return Response.ok(service.getCustomerByEmail().toString()).build();  
      }
      @Path("/deleteLoginAttempts")
      @GET
      public Response deleteLoginAttempts() {
         return Response.ok(service.deleteLoginAttempts().toString()).build();  
      }
      @Path("/getCustomer")
      @GET
      public Response getCustomer() {
         return Response.ok(service.getCustomer().toString()).build();  
      }
      @Path("/addCustomer")
      @GET
      public Response addCustomer() {
         return Response.ok(service.addCustomer().toString()).build();  
      }
      @Path("/editPassword")
      @GET
      public Response editPassword() {
         return Response.ok(service.editPassword().toString()).build();  
      }
      @Path("/getLoginAttempts")
      @GET
      public Response getLoginAttempts() {
         return Response.ok(service.getLoginAttempts().toString()).build();  
      }
      @Path("/editNewsletter")
      @GET
      public Response editNewsletter() {
         return Response.ok(service.editNewsletter().toString()).build();  
      }
      @Path("/getCustomerByCode")
      @GET
      public Response getCustomerByCode(  @QueryParam("CustomerId")  Integer CustomerId) {
         return Response.ok(service.getCustomerByCode(CustomerId).toString()).build();  
      }
      @Path("/addLoginAttempt")
      @GET
      public Response addLoginAttempt() {
         return Response.ok(service.addLoginAttempt().toString()).build();  
      }
      @Path("/getRewardTotal")
      @GET
      public Response getRewardTotal(  @QueryParam("Points")  Integer Points) {
         return Response.ok(service.getRewardTotal(Points).toString()).build();  
      }
      @Path("/getIps")
      @GET
      public Response getIps() {
         return Response.ok(service.getIps().toString()).build();  
      }
      @Path("/getCustomerByToken")
      @GET
      public Response getCustomerByToken() {
         return Response.ok(service.getCustomerByToken().toString()).build();  
      }
}