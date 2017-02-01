package com.opencart.admin.rest.model.localisation;


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

import com.opencart.admin.dao.model.localisation.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelLocalisationCurrency")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationCurrencyResource {
  Log logger = LogFactory.getLog(ModelLocalisationCurrencyResource.class);

  @Inject
  ModelLocalisationCurrencyDAOImpl service;

      @Path("/getCurrency")
      @GET
      public Response getCurrency() {
         return Response.ok(service.getCurrency().toString()).build();  
      }
      @Path("/deleteCurrency")
      @GET
      public Response deleteCurrency() {
         return Response.ok(service.deleteCurrency().toString()).build();  
      }
      @Path("/getCurrencies")
      @GET
      public Response getCurrencies() {
         return Response.ok(service.getCurrencies().toString()).build();  
      }
      @Path("/refresh3")
      @GET
      public Response refresh3() {
         return Response.ok(service.refresh3().toString()).build();  
      }
      @Path("/refresh2")
      @GET
      public Response refresh2() {
         return Response.ok(service.refresh2().toString()).build();  
      }
      @Path("/getCurrencyByCode")
      @GET
      public Response getCurrencyByCode() {
         return Response.ok(service.getCurrencyByCode().toString()).build();  
      }
      @Path("/getTotalCurrencies")
      @GET
      public Response getTotalCurrencies() {
         return Response.ok(service.getTotalCurrencies().toString()).build();  
      }
      @Path("/refresh")
      @GET
      public Response refresh() {
         return Response.ok(service.refresh().toString()).build();  
      }
      @Path("/refresh1")
      @GET
      public Response refresh1() {
         return Response.ok(service.refresh1().toString()).build();  
      }
      @Path("/addCurrency")
      @GET
      public Response addCurrency() {
         return Response.ok(service.addCurrency().toString()).build();  
      }
      @Path("/editCurrency")
      @GET
      public Response editCurrency() {
         return Response.ok(service.editCurrency().toString()).build();  
      }
}