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

@Path("/ModelCatalogInformation")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogInformationResource {
  Log logger = LogFactory.getLog(ModelCatalogInformationResource.class);

  @Inject
  ModelCatalogInformationDAOImpl service;

      @Path("/getInformations")
      @GET
      public Response getInformations() {
         return Response.ok(service.getInformations().toString()).build();  
      }
      @Path("/getInformation")
      @GET
      public Response getInformation() {
         return Response.ok(service.getInformation().toString()).build();  
      }
      @Path("/getInformationLayoutId")
      @GET
      public Response getInformationLayoutId() {
         return Response.ok(service.getInformationLayoutId().toString()).build();  
      }
}