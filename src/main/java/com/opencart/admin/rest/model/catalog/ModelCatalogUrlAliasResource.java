package com.opencart.admin.rest.model.catalog;


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

import com.opencart.admin.dao.model.catalog.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCatalogUrlAlias")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogUrlAliasResource {
  Log logger = LogFactory.getLog(ModelCatalogUrlAliasResource.class);

  @Inject
  ModelCatalogUrlAliasDAOImpl service;

      @Path("/getUrlAlias")
      @GET
      public Response getUrlAlias() {
         return Response.ok(service.getUrlAlias().toString()).build();  
      }
}