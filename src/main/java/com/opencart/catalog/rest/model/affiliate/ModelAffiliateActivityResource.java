package com.opencart.catalog.rest.model.affiliate;


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

import com.opencart.catalog.dao.model.affiliate.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAffiliateActivity")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAffiliateActivityResource {
  Log logger = LogFactory.getLog(ModelAffiliateActivityResource.class);

  @Inject
  ModelAffiliateActivityDAOImpl service;

      @Path("/addActivity")
      @GET
      public Response addActivity() {
         return Response.ok(service.addActivity().toString()).build();  
      }
}