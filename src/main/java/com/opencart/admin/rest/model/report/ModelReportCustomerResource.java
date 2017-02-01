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

@Path("/ModelReportCustomer")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelReportCustomerResource {
  Log logger = LogFactory.getLog(ModelReportCustomerResource.class);

  @Inject
  ModelReportCustomerDAOImpl service;

      @Path("/getTotalCustomersByYear")
      @GET
      public Response getTotalCustomersByYear() {
         return Response.ok(service.getTotalCustomersByYear().toString()).build();  
      }
      @Path("/getTotalCustomersByDay")
      @GET
      public Response getTotalCustomersByDay() {
         return Response.ok(service.getTotalCustomersByDay().toString()).build();  
      }
      @Path("/getTotalCustomersByWeek")
      @GET
      public Response getTotalCustomersByWeek() {
         return Response.ok(service.getTotalCustomersByWeek().toString()).build();  
      }
      @Path("/getTotalCustomersByMonth")
      @GET
      public Response getTotalCustomersByMonth() {
         return Response.ok(service.getTotalCustomersByMonth().toString()).build();  
      }
}