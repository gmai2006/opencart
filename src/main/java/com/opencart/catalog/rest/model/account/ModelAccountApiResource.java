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

@Path("/ModelAccountApi")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountApiResource {
  Log logger = LogFactory.getLog(ModelAccountApiResource.class);

  @Inject
  ModelAccountApiDAOImpl service;

      @Path("/getApiIps")
      @GET
      public Response getApiIps() {
         return Response.ok(service.getApiIps().toString()).build();  
      }
      @Path("/addApiSession")
      @GET
      public Response addApiSession() {
         return Response.ok(service.addApiSession().toString()).build();  
      }
      @Path("/getApiByKey")
      @GET
      public Response getApiByKey() {
         return Response.ok(service.getApiByKey().toString()).build();  
      }
}