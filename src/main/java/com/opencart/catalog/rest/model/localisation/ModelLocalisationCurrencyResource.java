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

@Path("/ModelLocalisationCurrency")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationCurrencyResource {
  Log logger = LogFactory.getLog(ModelLocalisationCurrencyResource.class);

  @Inject
  ModelLocalisationCurrencyDAOImpl service;

      @Path("/getCurrencies")
      @GET
      public Response getCurrencies() {
         return Response.ok(service.getCurrencies().toString()).build();  
      }
      @Path("/getCurrencyByCode")
      @GET
      public Response getCurrencyByCode() {
         return Response.ok(service.getCurrencyByCode().toString()).build();  
      }
}