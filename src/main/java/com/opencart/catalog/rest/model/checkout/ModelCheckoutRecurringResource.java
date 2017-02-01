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

@Path("/ModelCheckoutRecurring")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCheckoutRecurringResource {
  Log logger = LogFactory.getLog(ModelCheckoutRecurringResource.class);

  @Inject
  ModelCheckoutRecurringDAOImpl service;

      @Path("/addReference")
      @GET
      public Response addReference() {
         return Response.ok(service.addReference().toString()).build();  
      }
      @Path("/create")
      @GET
      public Response create() {
         return Response.ok(service.create().toString()).build();  
      }
}