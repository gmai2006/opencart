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

@Path("/ModelLocalisationTaxClass")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationTaxClassResource {
  Log logger = LogFactory.getLog(ModelLocalisationTaxClassResource.class);

  @Inject
  ModelLocalisationTaxClassDAOImpl service;

      @Path("/editTaxClass")
      @GET
      public Response editTaxClass() {
         return Response.ok(service.editTaxClass().toString()).build();  
      }
      @Path("/getTaxClass")
      @GET
      public Response getTaxClass() {
         return Response.ok(service.getTaxClass().toString()).build();  
      }
      @Path("/addTaxClass")
      @GET
      public Response addTaxClass() {
         return Response.ok(service.addTaxClass().toString()).build();  
      }
      @Path("/deleteTaxClass")
      @GET
      public Response deleteTaxClass() {
         return Response.ok(service.deleteTaxClass().toString()).build();  
      }
      @Path("/getTotalTaxClasses")
      @GET
      public Response getTotalTaxClasses() {
         return Response.ok(service.getTotalTaxClasses().toString()).build();  
      }
      @Path("/editTaxClass2")
      @GET
      public Response editTaxClass2() {
         return Response.ok(service.editTaxClass2().toString()).build();  
      }
      @Path("/getTotalTaxRulesByTaxRateId")
      @GET
      public Response getTotalTaxRulesByTaxRateId(  @QueryParam("TaxClassId")  Integer TaxClassId) {
         return Response.ok(service.getTotalTaxRulesByTaxRateId(TaxClassId).toString()).build();  
      }
      @Path("/editTaxClass1")
      @GET
      public Response editTaxClass1() {
         return Response.ok(service.editTaxClass1().toString()).build();  
      }
      @Path("/getTaxRules")
      @GET
      public Response getTaxRules() {
         return Response.ok(service.getTaxRules().toString()).build();  
      }
      @Path("/deleteTaxClass1")
      @GET
      public Response deleteTaxClass1() {
         return Response.ok(service.deleteTaxClass1().toString()).build();  
      }
      @Path("/getTaxClasses")
      @GET
      public Response getTaxClasses() {
         return Response.ok(service.getTaxClasses().toString()).build();  
      }
      @Path("/addTaxClass1")
      @GET
      public Response addTaxClass1() {
         return Response.ok(service.addTaxClass1().toString()).build();  
      }
}