package com.opencart.admin.rest.model.marketing;


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

import com.opencart.admin.dao.model.marketing.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelMarketingMarketing")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelMarketingMarketingResource {
  Log logger = LogFactory.getLog(ModelMarketingMarketingResource.class);

  @Inject
  ModelMarketingMarketingDAOImpl service;

      @Path("/getMarketing")
      @GET
      public Response getMarketing() {
         return Response.ok(service.getMarketing().toString()).build();  
      }
      @Path("/editMarketing")
      @GET
      public Response editMarketing() {
         return Response.ok(service.editMarketing().toString()).build();  
      }
      @Path("/addMarketing")
      @GET
      public Response addMarketing() {
         return Response.ok(service.addMarketing().toString()).build();  
      }
      @Path("/getMarketingByCode")
      @GET
      public Response getMarketingByCode() {
         return Response.ok(service.getMarketingByCode().toString()).build();  
      }
      @Path("/deleteMarketing")
      @GET
      public Response deleteMarketing() {
         return Response.ok(service.deleteMarketing().toString()).build();  
      }
}