package com.opencart.admin.rest.model.marketing;


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

import com.opencart.admin.dao.model.marketing.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelMarketingAffiliate")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelMarketingAffiliateResource {
  Log logger = LogFactory.getLog(ModelMarketingAffiliateResource.class);

  @Inject
  ModelMarketingAffiliateDAOImpl service;

      @Path("/getTransactions")
      @GET
      public Response getTransactions() {
         return Response.ok(service.getTransactions().toString()).build();  
      }
      @Path("/deleteAffiliate2")
      @GET
      public Response deleteAffiliate2() {
         return Response.ok(service.deleteAffiliate2().toString()).build();  
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
      @Path("/getTotalAffiliatesByCountryId")
      @GET
      public Response getTotalAffiliatesByCountryId() {
         return Response.ok(service.getTotalAffiliatesByCountryId().toString()).build();  
      }
      @Path("/getTotalTransactions")
      @GET
      public Response getTotalTransactions() {
         return Response.ok(service.getTotalTransactions().toString()).build();  
      }
      @Path("/getTransactionTotal")
      @GET
      public Response getTransactionTotal(  @QueryParam("Amount")  Long Amount) {
         return Response.ok(service.getTransactionTotal(Amount).toString()).build();  
      }
      @Path("/deleteLoginAttempts")
      @GET
      public Response deleteLoginAttempts() {
         return Response.ok(service.deleteLoginAttempts().toString()).build();  
      }
      @Path("/getAffiliatesByNewsletter")
      @GET
      public Response getAffiliatesByNewsletter() {
         return Response.ok(service.getAffiliatesByNewsletter().toString()).build();  
      }
      @Path("/deleteAffiliate")
      @GET
      public Response deleteAffiliate() {
         return Response.ok(service.deleteAffiliate().toString()).build();  
      }
      @Path("/editAffiliate1")
      @GET
      public Response editAffiliate1() {
         return Response.ok(service.editAffiliate1().toString()).build();  
      }
      @Path("/addAffiliate")
      @GET
      public Response addAffiliate() {
         return Response.ok(service.addAffiliate().toString()).build();  
      }
      @Path("/approve")
      @GET
      public Response approve() {
         return Response.ok(service.approve().toString()).build();  
      }
      @Path("/getTotalLoginAttempts")
      @GET
      public Response getTotalLoginAttempts() {
         return Response.ok(service.getTotalLoginAttempts().toString()).build();  
      }
      @Path("/deleteAffiliate1")
      @GET
      public Response deleteAffiliate1() {
         return Response.ok(service.deleteAffiliate1().toString()).build();  
      }
      @Path("/addTransaction")
      @GET
      public Response addTransaction() {
         return Response.ok(service.addTransaction().toString()).build();  
      }
      @Path("/getTotalAffiliatesByZoneId")
      @GET
      public Response getTotalAffiliatesByZoneId() {
         return Response.ok(service.getTotalAffiliatesByZoneId().toString()).build();  
      }
      @Path("/getTotalAffiliatesAwaitingApproval")
      @GET
      public Response getTotalAffiliatesAwaitingApproval() {
         return Response.ok(service.getTotalAffiliatesAwaitingApproval().toString()).build();  
      }
      @Path("/getTotalTransactionsByOrderId")
      @GET
      public Response getTotalTransactionsByOrderId() {
         return Response.ok(service.getTotalTransactionsByOrderId().toString()).build();  
      }
      @Path("/getAffiliateByCode")
      @GET
      public Response getAffiliateByCode() {
         return Response.ok(service.getAffiliateByCode().toString()).build();  
      }
}