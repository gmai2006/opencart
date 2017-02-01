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

@Path("/ModelLocalisationLengthClass")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationLengthClassResource {
  Log logger = LogFactory.getLog(ModelLocalisationLengthClassResource.class);

  @Inject
  ModelLocalisationLengthClassDAOImpl service;

      @Path("/getLengthClass")
      @GET
      public Response getLengthClass() {
         return Response.ok(service.getLengthClass().toString()).build();  
      }
      @Path("/editLengthClass1")
      @GET
      public Response editLengthClass1() {
         return Response.ok(service.editLengthClass1().toString()).build();  
      }
      @Path("/editLengthClass")
      @GET
      public Response editLengthClass() {
         return Response.ok(service.editLengthClass().toString()).build();  
      }
      @Path("/editLengthClass2")
      @GET
      public Response editLengthClass2() {
         return Response.ok(service.editLengthClass2().toString()).build();  
      }
      @Path("/getLengthClassDescriptions")
      @GET
      public Response getLengthClassDescriptions() {
         return Response.ok(service.getLengthClassDescriptions().toString()).build();  
      }
      @Path("/getLengthClassDescriptionByUnit")
      @GET
      public Response getLengthClassDescriptionByUnit() {
         return Response.ok(service.getLengthClassDescriptionByUnit().toString()).build();  
      }
      @Path("/addLengthClass")
      @GET
      public Response addLengthClass() {
         return Response.ok(service.addLengthClass().toString()).build();  
      }
      @Path("/addLengthClass1")
      @GET
      public Response addLengthClass1() {
         return Response.ok(service.addLengthClass1().toString()).build();  
      }
      @Path("/deleteLengthClass1")
      @GET
      public Response deleteLengthClass1() {
         return Response.ok(service.deleteLengthClass1().toString()).build();  
      }
      @Path("/getTotalLengthClasses")
      @GET
      public Response getTotalLengthClasses() {
         return Response.ok(service.getTotalLengthClasses().toString()).build();  
      }
      @Path("/deleteLengthClass")
      @GET
      public Response deleteLengthClass() {
         return Response.ok(service.deleteLengthClass().toString()).build();  
      }
      @Path("/getLengthClasses")
      @GET
      public Response getLengthClasses() {
         return Response.ok(service.getLengthClasses().toString()).build();  
      }
}