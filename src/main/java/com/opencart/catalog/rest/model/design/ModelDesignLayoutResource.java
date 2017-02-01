package com.opencart.catalog.rest.model.design;


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

import com.opencart.catalog.dao.model.design.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelDesignLayout")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignLayoutResource {
  Log logger = LogFactory.getLog(ModelDesignLayoutResource.class);

  @Inject
  ModelDesignLayoutDAOImpl service;

      @Path("/getLayoutModules")
      @GET
      public Response getLayoutModules() {
         return Response.ok(service.getLayoutModules().toString()).build();  
      }
      @Path("/getLayout")
      @GET
      public Response getLayout() {
         return Response.ok(service.getLayout().toString()).build();  
      }
}