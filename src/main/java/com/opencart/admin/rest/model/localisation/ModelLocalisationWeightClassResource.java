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

@Path("/ModelLocalisationWeightClass")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationWeightClassResource {
  Log logger = LogFactory.getLog(ModelLocalisationWeightClassResource.class);

  @Inject
  ModelLocalisationWeightClassDAOImpl service;

      @Path("/editWeightClass1")
      @GET
      public Response editWeightClass1() {
         return Response.ok(service.editWeightClass1().toString()).build();  
      }
      @Path("/getTotalWeightClasses")
      @GET
      public Response getTotalWeightClasses() {
         return Response.ok(service.getTotalWeightClasses().toString()).build();  
      }
      @Path("/deleteWeightClass")
      @GET
      public Response deleteWeightClass() {
         return Response.ok(service.deleteWeightClass().toString()).build();  
      }
      @Path("/getWeightClassDescriptions")
      @GET
      public Response getWeightClassDescriptions() {
         return Response.ok(service.getWeightClassDescriptions().toString()).build();  
      }
      @Path("/deleteWeightClass1")
      @GET
      public Response deleteWeightClass1() {
         return Response.ok(service.deleteWeightClass1().toString()).build();  
      }
      @Path("/getWeightClassDescriptionByUnit")
      @GET
      public Response getWeightClassDescriptionByUnit() {
         return Response.ok(service.getWeightClassDescriptionByUnit().toString()).build();  
      }
      @Path("/addWeightClass1")
      @GET
      public Response addWeightClass1() {
         return Response.ok(service.addWeightClass1().toString()).build();  
      }
      @Path("/editWeightClass2")
      @GET
      public Response editWeightClass2() {
         return Response.ok(service.editWeightClass2().toString()).build();  
      }
      @Path("/addWeightClass")
      @GET
      public Response addWeightClass() {
         return Response.ok(service.addWeightClass().toString()).build();  
      }
      @Path("/editWeightClass")
      @GET
      public Response editWeightClass() {
         return Response.ok(service.editWeightClass().toString()).build();  
      }
      @Path("/getWeightClass")
      @GET
      public Response getWeightClass() {
         return Response.ok(service.getWeightClass().toString()).build();  
      }
      @Path("/getWeightClasses")
      @GET
      public Response getWeightClasses() {
         return Response.ok(service.getWeightClasses().toString()).build();  
      }
}