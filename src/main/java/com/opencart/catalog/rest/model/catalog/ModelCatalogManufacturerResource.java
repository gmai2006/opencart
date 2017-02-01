package com.opencart.catalog.rest.model.catalog;


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

import com.opencart.catalog.dao.model.catalog.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCatalogManufacturer")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogManufacturerResource {
  Log logger = LogFactory.getLog(ModelCatalogManufacturerResource.class);

  @Inject
  ModelCatalogManufacturerDAOImpl service;

      @Path("/getManufacturer")
      @GET
      public Response getManufacturer() {
         return Response.ok(service.getManufacturer().toString()).build();  
      }
      @Path("/getManufacturers")
      @GET
      public Response getManufacturers() {
         return Response.ok(service.getManufacturers().toString()).build();  
      }
}