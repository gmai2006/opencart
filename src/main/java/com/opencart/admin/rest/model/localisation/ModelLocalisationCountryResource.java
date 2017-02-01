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

@Path("/ModelLocalisationCountry")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationCountryResource {
  Log logger = LogFactory.getLog(ModelLocalisationCountryResource.class);

  @Inject
  ModelLocalisationCountryDAOImpl service;

      @Path("/addCountry")
      @GET
      public Response addCountry() {
         return Response.ok(service.addCountry().toString()).build();  
      }
      @Path("/getCountries")
      @GET
      public Response getCountries() {
         return Response.ok(service.getCountries().toString()).build();  
      }
      @Path("/getCountry")
      @GET
      public Response getCountry() {
         return Response.ok(service.getCountry().toString()).build();  
      }
      @Path("/editCountry")
      @GET
      public Response editCountry() {
         return Response.ok(service.editCountry().toString()).build();  
      }
      @Path("/deleteCountry")
      @GET
      public Response deleteCountry() {
         return Response.ok(service.deleteCountry().toString()).build();  
      }
      @Path("/getTotalCountries")
      @GET
      public Response getTotalCountries() {
         return Response.ok(service.getTotalCountries().toString()).build();  
      }
}