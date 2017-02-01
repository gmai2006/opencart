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

@Path("/ModelReportSale")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelReportSaleResource {
  Log logger = LogFactory.getLog(ModelReportSaleResource.class);

  @Inject
  ModelReportSaleDAOImpl service;

      @Path("/getTotalOrdersByYear")
      @GET
      public Response getTotalOrdersByYear() {
         return Response.ok(service.getTotalOrdersByYear().toString()).build();  
      }
      @Path("/getTotalOrdersByDay")
      @GET
      public Response getTotalOrdersByDay() {
         return Response.ok(service.getTotalOrdersByDay().toString()).build();  
      }
      @Path("/getTotalOrdersByCountry")
      @GET
      public Response getTotalOrdersByCountry() {
         return Response.ok(service.getTotalOrdersByCountry().toString()).build();  
      }
      @Path("/getTotalOrdersByWeek")
      @GET
      public Response getTotalOrdersByWeek() {
         return Response.ok(service.getTotalOrdersByWeek().toString()).build();  
      }
      @Path("/getTotalOrdersByMonth")
      @GET
      public Response getTotalOrdersByMonth() {
         return Response.ok(service.getTotalOrdersByMonth().toString()).build();  
      }
}