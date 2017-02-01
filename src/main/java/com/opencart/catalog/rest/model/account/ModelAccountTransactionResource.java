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

@Path("/ModelAccountTransaction")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountTransactionResource {
  Log logger = LogFactory.getLog(ModelAccountTransactionResource.class);

  @Inject
  ModelAccountTransactionDAOImpl service;

      @Path("/getTotalAmount")
      @GET
      public Response getTotalAmount(  @QueryParam("Amount")  Long Amount) {
         return Response.ok(service.getTotalAmount(Amount).toString()).build();  
      }
      @Path("/getTotalTransactions")
      @GET
      public Response getTotalTransactions() {
         return Response.ok(service.getTotalTransactions().toString()).build();  
      }
}