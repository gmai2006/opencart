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

@Path("/ModelLocalisationLanguage")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationLanguageResource {
  Log logger = LogFactory.getLog(ModelLocalisationLanguageResource.class);

  @Inject
  ModelLocalisationLanguageDAOImpl service;

      @Path("/getLanguage")
      @GET
      public Response getLanguage() {
         return Response.ok(service.getLanguage().toString()).build();  
      }
      @Path("/getLanguages")
      @GET
      public Response getLanguages() {
         return Response.ok(service.getLanguages().toString()).build();  
      }
}