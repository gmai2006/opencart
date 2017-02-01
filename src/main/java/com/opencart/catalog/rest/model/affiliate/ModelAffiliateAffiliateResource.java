package com.opencart.catalog.rest.model.affiliate;


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

import com.opencart.catalog.dao.model.affiliate.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAffiliateAffiliate")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAffiliateAffiliateResource {
  Log logger = LogFactory.getLog(ModelAffiliateAffiliateResource.class);

  @Inject
  ModelAffiliateAffiliateDAOImpl service;

      @Path("/addLoginAttempt1")
      @GET
      public Response addLoginAttempt1() {
         return Response.ok(service.addLoginAttempt1().toString()).build();  
      }
      @Path("/editPayment")
      @GET
      public Response editPayment() {
         return Response.ok(service.editPayment().toString()).build();  
      }
      @Path("/addLoginAttempt2")
      @GET
      public Response addLoginAttempt2() {
         return Response.ok(service.addLoginAttempt2().toString()).build();  
      }
      @Path("/getAffiliateByEmail")
      @GET
      public Response getAffiliateByEmail() {
         return Response.ok(service.getAffiliateByEmail().toString()).build();  
      }
      @Path("/getAffiliate")
      @GET
      public Response getAffiliate() {
         return Response.ok(service.getAffiliate().toString()).build();  
      }
      @Path("/getTotalAffiliatesByEmail")
      @GET
      public Response getTotalAffiliatesByEmail() {
         return Response.ok(service.getTotalAffiliatesByEmail().toString()).build();  
      }
      @Path("/deleteTransaction")
      @GET
      public Response deleteTransaction() {
         return Response.ok(service.deleteTransaction().toString()).build();  
      }
      @Path("/editAffiliate")
      @GET
      public Response editAffiliate() {
         return Response.ok(service.editAffiliate().toString()).build();  
      }
      @Path("/deleteLoginAttempts")
      @GET
      public Response deleteLoginAttempts() {
         return Response.ok(service.deleteLoginAttempts().toString()).build();  
      }
      @Path("/getTransactionTotal")
      @GET
      public Response getTransactionTotal(  @QueryParam("Amount")  Long Amount) {
         return Response.ok(service.getTransactionTotal(Amount).toString()).build();  
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
      @Path("/addAffiliate")
      @GET
      public Response addAffiliate() {
         return Response.ok(service.addAffiliate().toString()).build();  
      }
      @Path("/addLoginAttempt")
      @GET
      public Response addLoginAttempt() {
         return Response.ok(service.addLoginAttempt().toString()).build();  
      }
      @Path("/addTransaction")
      @GET
      public Response addTransaction() {
         return Response.ok(service.addTransaction().toString()).build();  
      }
      @Path("/getAffiliateByCode")
      @GET
      public Response getAffiliateByCode() {
         return Response.ok(service.getAffiliateByCode().toString()).build();  
      }
}