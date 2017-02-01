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

@Path("/ModelReportMarketing")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelReportMarketingResource {
  Log logger = LogFactory.getLog(ModelReportMarketingResource.class);

  @Inject
  ModelReportMarketingDAOImpl service;

      @Path("/getTotalMarketing")
      @GET
      public Response getTotalMarketing() {
         return Response.ok(service.getTotalMarketing().toString()).build();  
      }
}