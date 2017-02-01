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

@Path("/ModelDesignTheme")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignThemeResource {
  Log logger = LogFactory.getLog(ModelDesignThemeResource.class);

  @Inject
  ModelDesignThemeDAOImpl service;

      @Path("/editTheme1")
      @GET
      public Response editTheme1() {
         return Response.ok(service.editTheme1().toString()).build();  
      }
      @Path("/getTheme")
      @GET
      public Response getTheme() {
         return Response.ok(service.getTheme().toString()).build();  
      }
      @Path("/editTheme")
      @GET
      public Response editTheme() {
         return Response.ok(service.editTheme().toString()).build();  
      }
      @Path("/deleteTheme")
      @GET
      public Response deleteTheme() {
         return Response.ok(service.deleteTheme().toString()).build();  
      }
}