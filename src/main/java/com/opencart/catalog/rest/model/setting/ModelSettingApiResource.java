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

@Path("/ModelSettingApi")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSettingApiResource {
  Log logger = LogFactory.getLog(ModelSettingApiResource.class);

  @Inject
  ModelSettingApiDAOImpl service;

      @Path("/login")
      @GET
      public Response login() {
         return Response.ok(service.login().toString()).build();  
      }
}