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

@Path("/ModelLocalisationReturnAction")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationReturnActionResource {
  Log logger = LogFactory.getLog(ModelLocalisationReturnActionResource.class);

  @Inject
  ModelLocalisationReturnActionDAOImpl service;

      @Path("/editReturnAction")
      @GET
      public Response editReturnAction() {
         return Response.ok(service.editReturnAction().toString()).build();  
      }
      @Path("/editReturnAction1")
      @GET
      public Response editReturnAction1() {
         return Response.ok(service.editReturnAction1().toString()).build();  
      }
      @Path("/getTotalReturnActions")
      @GET
      public Response getTotalReturnActions() {
         return Response.ok(service.getTotalReturnActions().toString()).build();  
      }
      @Path("/getReturnAction")
      @GET
      public Response getReturnAction() {
         return Response.ok(service.getReturnAction().toString()).build();  
      }
      @Path("/deleteReturnAction")
      @GET
      public Response deleteReturnAction() {
         return Response.ok(service.deleteReturnAction().toString()).build();  
      }
      @Path("/getReturnActions")
      @GET
      public Response getReturnActions(  @QueryParam("ReturnActionId")  Integer ReturnActionId) {
         return Response.ok(service.getReturnActions(ReturnActionId).toString()).build();  
      }
      @Path("/getReturnActionDescriptions")
      @GET
      public Response getReturnActionDescriptions() {
         return Response.ok(service.getReturnActionDescriptions().toString()).build();  
      }
      @Path("/addReturnAction1")
      @GET
      public Response addReturnAction1() {
         return Response.ok(service.addReturnAction1().toString()).build();  
      }
      @Path("/addReturnAction")
      @GET
      public Response addReturnAction() {
         return Response.ok(service.addReturnAction().toString()).build();  
      }
}