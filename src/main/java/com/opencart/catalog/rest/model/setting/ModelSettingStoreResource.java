package com.opencart.catalog.rest.model.setting;


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

import com.opencart.catalog.dao.model.setting.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelSettingStore")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSettingStoreResource {
  Log logger = LogFactory.getLog(ModelSettingStoreResource.class);

  @Inject
  ModelSettingStoreDAOImpl service;

      @Path("/getStores")
      @GET
      public Response getStores() {
         return Response.ok(service.getStores().toString()).build();  
      }
}