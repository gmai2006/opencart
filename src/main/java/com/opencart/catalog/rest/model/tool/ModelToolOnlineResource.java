package com.opencart.catalog.rest.model.tool;


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

import com.opencart.catalog.dao.model.tool.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelToolOnline")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelToolOnlineResource {
  Log logger = LogFactory.getLog(ModelToolOnlineResource.class);

  @Inject
  ModelToolOnlineDAOImpl service;

      @Path("/addOnline")
      @GET
      public Response addOnline() {
         return Response.ok(service.addOnline().toString()).build();  
      }
}