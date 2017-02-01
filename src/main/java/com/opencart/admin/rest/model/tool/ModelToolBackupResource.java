package com.opencart.admin.rest.model.tool;


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

import com.opencart.admin.dao.model.tool.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelToolBackup")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelToolBackupResource {
  Log logger = LogFactory.getLog(ModelToolBackupResource.class);

  @Inject
  ModelToolBackupDAOImpl service;

      @Path("/getTables")
      @GET
      public Response getTables() {
         return Response.ok(service.getTables().toString()).build();  
      }
}