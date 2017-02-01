package com.opencart.catalog.rest.model.account;


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

import com.opencart.catalog.dao.model.account.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAccountSearch")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountSearchResource {
  Log logger = LogFactory.getLog(ModelAccountSearchResource.class);

  @Inject
  ModelAccountSearchDAOImpl service;

      @Path("/addSearch")
      @GET
      public Response addSearch() {
         return Response.ok(service.addSearch().toString()).build();  
      }
}