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

@Path("/ModelAccountReturn")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountReturnResource {
  Log logger = LogFactory.getLog(ModelAccountReturnResource.class);

  @Inject
  ModelAccountReturnDAOImpl service;

      @Path("/getReturn")
      @GET
      public Response getReturn(  @QueryParam("ReturnId")  Integer ReturnId) {
         return Response.ok(service.getReturn(ReturnId).toString()).build();  
      }
      @Path("/getReturnHistories")
      @GET
      public Response getReturnHistories(  @QueryParam("DateAdded")  java.sql.Timestamp DateAdded) {
         return Response.ok(service.getReturnHistories(DateAdded).toString()).build();  
      }
      @Path("/getTotalReturns")
      @GET
      public Response getTotalReturns() {
         return Response.ok(service.getTotalReturns().toString()).build();  
      }
      @Path("/addReturn")
      @GET
      public Response addReturn() {
         return Response.ok(service.addReturn().toString()).build();  
      }
      @Path("/getReturns")
      @GET
      public Response getReturns(  @QueryParam("ReturnId")  Integer ReturnId) {
         return Response.ok(service.getReturns(ReturnId).toString()).build();  
      }
}