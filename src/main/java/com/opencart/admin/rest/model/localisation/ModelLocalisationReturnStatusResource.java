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

@Path("/ModelLocalisationReturnStatus")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationReturnStatusResource {
  Log logger = LogFactory.getLog(ModelLocalisationReturnStatusResource.class);

  @Inject
  ModelLocalisationReturnStatusDAOImpl service;

      @Path("/addReturnStatus1")
      @GET
      public Response addReturnStatus1() {
         return Response.ok(service.addReturnStatus1().toString()).build();  
      }
      @Path("/getReturnStatusDescriptions")
      @GET
      public Response getReturnStatusDescriptions() {
         return Response.ok(service.getReturnStatusDescriptions().toString()).build();  
      }
      @Path("/editReturnStatus")
      @GET
      public Response editReturnStatus() {
         return Response.ok(service.editReturnStatus().toString()).build();  
      }
      @Path("/getReturnStatus")
      @GET
      public Response getReturnStatus() {
         return Response.ok(service.getReturnStatus().toString()).build();  
      }
      @Path("/getReturnStatuses")
      @GET
      public Response getReturnStatuses(  @QueryParam("ReturnStatusId")  Integer ReturnStatusId) {
         return Response.ok(service.getReturnStatuses(ReturnStatusId).toString()).build();  
      }
      @Path("/addReturnStatus")
      @GET
      public Response addReturnStatus() {
         return Response.ok(service.addReturnStatus().toString()).build();  
      }
      @Path("/editReturnStatus1")
      @GET
      public Response editReturnStatus1() {
         return Response.ok(service.editReturnStatus1().toString()).build();  
      }
      @Path("/getTotalReturnStatuses")
      @GET
      public Response getTotalReturnStatuses() {
         return Response.ok(service.getTotalReturnStatuses().toString()).build();  
      }
      @Path("/deleteReturnStatus")
      @GET
      public Response deleteReturnStatus() {
         return Response.ok(service.deleteReturnStatus().toString()).build();  
      }
}