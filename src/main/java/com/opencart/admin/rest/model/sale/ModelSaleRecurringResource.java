package com.opencart.admin.rest.model.sale;


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

import com.opencart.admin.dao.model.sale.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelSaleRecurring")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSaleRecurringResource {
  Log logger = LogFactory.getLog(ModelSaleRecurringResource.class);

  @Inject
  ModelSaleRecurringDAOImpl service;

      @Path("/getRecurringTransactions")
      @GET
      public Response getRecurringTransactions(  @QueryParam("Amount")  Long Amount) {
         return Response.ok(service.getRecurringTransactions(Amount).toString()).build();  
      }
      @Path("/getRecurring")
      @GET
      public Response getRecurring() {
         return Response.ok(service.getRecurring().toString()).build();  
      }
}