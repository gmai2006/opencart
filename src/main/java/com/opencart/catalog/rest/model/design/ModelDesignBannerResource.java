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

@Path("/ModelDesignBanner")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignBannerResource {
  Log logger = LogFactory.getLog(ModelDesignBannerResource.class);

  @Inject
  ModelDesignBannerDAOImpl service;

      @Path("/getBanner")
      @GET
      public Response getBanner() {
         return Response.ok(service.getBanner().toString()).build();  
      }
}