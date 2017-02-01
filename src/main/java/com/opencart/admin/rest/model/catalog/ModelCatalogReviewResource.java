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

@Path("/ModelCatalogReview")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogReviewResource {
  Log logger = LogFactory.getLog(ModelCatalogReviewResource.class);

  @Inject
  ModelCatalogReviewDAOImpl service;

      @Path("/getTotalReviewsAwaitingApproval")
      @GET
      public Response getTotalReviewsAwaitingApproval() {
         return Response.ok(service.getTotalReviewsAwaitingApproval().toString()).build();  
      }
      @Path("/editReview")
      @GET
      public Response editReview() {
         return Response.ok(service.editReview().toString()).build();  
      }
      @Path("/getReview")
      @GET
      public Response getReview() {
         return Response.ok(service.getReview().toString()).build();  
      }
      @Path("/addReview")
      @GET
      public Response addReview() {
         return Response.ok(service.addReview().toString()).build();  
      }
      @Path("/deleteReview")
      @GET
      public Response deleteReview() {
         return Response.ok(service.deleteReview().toString()).build();  
      }
}