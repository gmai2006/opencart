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

@Path("/ModelAccountCustomerGroup")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountCustomerGroupResource {
  Log logger = LogFactory.getLog(ModelAccountCustomerGroupResource.class);

  @Inject
  ModelAccountCustomerGroupDAOImpl service;

      @Path("/getCustomerGroups")
      @GET
      public Response getCustomerGroups() {
         return Response.ok(service.getCustomerGroups().toString()).build();  
      }
      @Path("/getCustomerGroup")
      @GET
      public Response getCustomerGroup() {
         return Response.ok(service.getCustomerGroup().toString()).build();  
      }
}