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

@Path("/ModelToolUpload")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelToolUploadResource {
  Log logger = LogFactory.getLog(ModelToolUploadResource.class);

  @Inject
  ModelToolUploadDAOImpl service;

      @Path("/getUploadByCode")
      @GET
      public Response getUploadByCode() {
         return Response.ok(service.getUploadByCode().toString()).build();  
      }
      @Path("/addUpload")
      @GET
      public Response addUpload() {
         return Response.ok(service.addUpload().toString()).build();  
      }
      @Path("/getUpload")
      @GET
      public Response getUpload() {
         return Response.ok(service.getUpload().toString()).build();  
      }
      @Path("/deleteUpload")
      @GET
      public Response deleteUpload() {
         return Response.ok(service.deleteUpload().toString()).build();  
      }
}