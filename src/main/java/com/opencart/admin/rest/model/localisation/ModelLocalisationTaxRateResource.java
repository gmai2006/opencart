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

@Path("/ModelLocalisationTaxRate")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationTaxRateResource {
  Log logger = LogFactory.getLog(ModelLocalisationTaxRateResource.class);

  @Inject
  ModelLocalisationTaxRateDAOImpl service;

      @Path("/addTaxRate")
      @GET
      public Response addTaxRate() {
         return Response.ok(service.addTaxRate().toString()).build();  
      }
      @Path("/editTaxRate2")
      @GET
      public Response editTaxRate2() {
         return Response.ok(service.editTaxRate2().toString()).build();  
      }
      @Path("/getTaxRate")
      @GET
      public Response getTaxRate(  @QueryParam("TaxRateId")  Integer TaxRateId) {
         return Response.ok(service.getTaxRate(TaxRateId).toString()).build();  
      }
      @Path("/editTaxRate1")
      @GET
      public Response editTaxRate1() {
         return Response.ok(service.editTaxRate1().toString()).build();  
      }
      @Path("/getTaxRateCustomerGroups")
      @GET
      public Response getTaxRateCustomerGroups() {
         return Response.ok(service.getTaxRateCustomerGroups().toString()).build();  
      }
      @Path("/editTaxRate")
      @GET
      public Response editTaxRate() {
         return Response.ok(service.editTaxRate().toString()).build();  
      }
      @Path("/deleteTaxRate")
      @GET
      public Response deleteTaxRate() {
         return Response.ok(service.deleteTaxRate().toString()).build();  
      }
      @Path("/getTotalTaxRates")
      @GET
      public Response getTotalTaxRates() {
         return Response.ok(service.getTotalTaxRates().toString()).build();  
      }
      @Path("/deleteTaxRate1")
      @GET
      public Response deleteTaxRate1() {
         return Response.ok(service.deleteTaxRate1().toString()).build();  
      }
      @Path("/addTaxRate1")
      @GET
      public Response addTaxRate1() {
         return Response.ok(service.addTaxRate1().toString()).build();  
      }
      @Path("/getTotalTaxRatesByGeoZoneId")
      @GET
      public Response getTotalTaxRatesByGeoZoneId() {
         return Response.ok(service.getTotalTaxRatesByGeoZoneId().toString()).build();  
      }
}