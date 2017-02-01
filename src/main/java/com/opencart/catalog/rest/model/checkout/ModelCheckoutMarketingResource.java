package com.opencart.catalog.rest.model.checkout;


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

import com.opencart.catalog.dao.model.checkout.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCheckoutMarketing")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCheckoutMarketingResource {
  Log logger = LogFactory.getLog(ModelCheckoutMarketingResource.class);

  @Inject
  ModelCheckoutMarketingDAOImpl service;

      @Path("/getMarketingByCode")
      @GET
      public Response getMarketingByCode() {
         return Response.ok(service.getMarketingByCode().toString()).build();  
      }
}