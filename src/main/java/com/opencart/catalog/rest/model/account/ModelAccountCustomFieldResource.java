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

@Path("/ModelAccountCustomField")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountCustomFieldResource {
  Log logger = LogFactory.getLog(ModelAccountCustomFieldResource.class);

  @Inject
  ModelAccountCustomFieldDAOImpl service;

      @Path("/getCustomFields2")
      @GET
      public Response getCustomFields2() {
         return Response.ok(service.getCustomFields2().toString()).build();  
      }
      @Path("/getCustomField")
      @GET
      public Response getCustomField() {
         return Response.ok(service.getCustomField().toString()).build();  
      }
      @Path("/getCustomFields1")
      @GET
      public Response getCustomFields1() {
         return Response.ok(service.getCustomFields1().toString()).build();  
      }
      @Path("/getCustomFields")
      @GET
      public Response getCustomFields() {
         return Response.ok(service.getCustomFields().toString()).build();  
      }
}