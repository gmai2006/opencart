package com.opencart.admin.rest.model.design;


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

import com.opencart.admin.dao.model.design.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelDesignLanguage")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignLanguageResource {
  Log logger = LogFactory.getLog(ModelDesignLanguageResource.class);

  @Inject
  ModelDesignLanguageDAOImpl service;

      @Path("/editTranslation1")
      @GET
      public Response editTranslation1() {
         return Response.ok(service.editTranslation1().toString()).build();  
      }
      @Path("/editTranslation")
      @GET
      public Response editTranslation() {
         return Response.ok(service.editTranslation().toString()).build();  
      }
      @Path("/getTotalTranslations")
      @GET
      public Response getTotalTranslations() {
         return Response.ok(service.getTotalTranslations().toString()).build();  
      }
      @Path("/getTranslations")
      @GET
      public Response getTranslations() {
         return Response.ok(service.getTranslations().toString()).build();  
      }
}