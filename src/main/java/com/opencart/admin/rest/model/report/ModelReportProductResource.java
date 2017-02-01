package com.opencart.admin.rest.model.report;


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

import com.opencart.admin.dao.model.report.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelReportProduct")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelReportProductResource {
  Log logger = LogFactory.getLog(ModelReportProductResource.class);

  @Inject
  ModelReportProductDAOImpl service;

      @Path("/getTotalProductViews")
      @GET
      public Response getTotalProductViews(  @QueryParam("Viewed")  Integer Viewed) {
         return Response.ok(service.getTotalProductViews(Viewed).toString()).build();  
      }
      @Path("/reset")
      @GET
      public Response reset() {
         return Response.ok(service.reset().toString()).build();  
      }
      @Path("/getTotalProductsViewed")
      @GET
      public Response getTotalProductsViewed() {
         return Response.ok(service.getTotalProductsViewed().toString()).build();  
      }
}