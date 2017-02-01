package com.opencart.catalog.rest.model.catalog;


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

import com.opencart.catalog.dao.model.catalog.*;

import com.opencart.catalog.model.*;

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

      @Path("/getTotalReviewsByProductId")
      @GET
      public Response getTotalReviewsByProductId() {
         return Response.ok(service.getTotalReviewsByProductId().toString()).build();  
      }
      @Path("/getReviewsByProductId")
      @GET
      public Response getReviewsByProductId(  @QueryParam("ReviewId")  Integer ReviewId) {
         return Response.ok(service.getReviewsByProductId(ReviewId).toString()).build();  
      }
      @Path("/addReview")
      @GET
      public Response addReview() {
         return Response.ok(service.addReview().toString()).build();  
      }
}