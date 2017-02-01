package com.opencart.catalog.rest.model.localisation;


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

import com.opencart.catalog.dao.model.localisation.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelLocalisationLocation")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationLocationResource {
  Log logger = LogFactory.getLog(ModelLocalisationLocationResource.class);

  @Inject
  ModelLocalisationLocationDAOImpl service;

      @Path("/getLocation")
      @GET
      public Response getLocation(  @QueryParam("LocationId")  Integer LocationId) {
         return Response.ok(service.getLocation(LocationId).toString()).build();  
      }
}