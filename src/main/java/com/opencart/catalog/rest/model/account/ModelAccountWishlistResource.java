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

@Path("/ModelAccountWishlist")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountWishlistResource {
  Log logger = LogFactory.getLog(ModelAccountWishlistResource.class);

  @Inject
  ModelAccountWishlistDAOImpl service;

      @Path("/addWishlist1")
      @GET
      public Response addWishlist1() {
         return Response.ok(service.addWishlist1().toString()).build();  
      }
      @Path("/getTotalWishlist")
      @GET
      public Response getTotalWishlist() {
         return Response.ok(service.getTotalWishlist().toString()).build();  
      }
      @Path("/deleteWishlist")
      @GET
      public Response deleteWishlist() {
         return Response.ok(service.deleteWishlist().toString()).build();  
      }
      @Path("/getWishlist")
      @GET
      public Response getWishlist() {
         return Response.ok(service.getWishlist().toString()).build();  
      }
      @Path("/addWishlist")
      @GET
      public Response addWishlist() {
         return Response.ok(service.addWishlist().toString()).build();  
      }
}