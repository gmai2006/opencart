package com.opencart.admin.rest.model.localisation;


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

import com.opencart.admin.dao.model.localisation.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelLocalisationReturnReason")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationReturnReasonResource {
  Log logger = LogFactory.getLog(ModelLocalisationReturnReasonResource.class);

  @Inject
  ModelLocalisationReturnReasonDAOImpl service;

      @Path("/addReturnReason1")
      @GET
      public Response addReturnReason1() {
         return Response.ok(service.addReturnReason1().toString()).build();  
      }
      @Path("/addReturnReason")
      @GET
      public Response addReturnReason() {
         return Response.ok(service.addReturnReason().toString()).build();  
      }
      @Path("/deleteReturnReason")
      @GET
      public Response deleteReturnReason() {
         return Response.ok(service.deleteReturnReason().toString()).build();  
      }
      @Path("/editReturnReason")
      @GET
      public Response editReturnReason() {
         return Response.ok(service.editReturnReason().toString()).build();  
      }
      @Path("/getReturnReasons")
      @GET
      public Response getReturnReasons(  @QueryParam("ReturnReasonId")  Integer ReturnReasonId) {
         return Response.ok(service.getReturnReasons(ReturnReasonId).toString()).build();  
      }
      @Path("/getTotalReturnReasons")
      @GET
      public Response getTotalReturnReasons() {
         return Response.ok(service.getTotalReturnReasons().toString()).build();  
      }
      @Path("/getReturnReasonDescriptions")
      @GET
      public Response getReturnReasonDescriptions() {
         return Response.ok(service.getReturnReasonDescriptions().toString()).build();  
      }
      @Path("/getReturnReason")
      @GET
      public Response getReturnReason() {
         return Response.ok(service.getReturnReason().toString()).build();  
      }
      @Path("/editReturnReason1")
      @GET
      public Response editReturnReason1() {
         return Response.ok(service.editReturnReason1().toString()).build();  
      }
}