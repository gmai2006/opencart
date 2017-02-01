package com.opencart.catalog.rest.model.account;


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

import com.opencart.catalog.dao.model.account.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAccountDownload")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountDownloadResource {
  Log logger = LogFactory.getLog(ModelAccountDownloadResource.class);

  @Inject
  ModelAccountDownloadDAOImpl service;

      @Path("/getTotalDownloads")
      @GET
      public Response getTotalDownloads() {
         return Response.ok(service.getTotalDownloads().toString()).build();  
      }
      @Path("/getDownload")
      @GET
      public Response getDownload(  @QueryParam("Filename")  String Filename) {
         return Response.ok(service.getDownload(Filename).toString()).build();  
      }
      @Path("/getDownloads")
      @GET
      public Response getDownloads(  @QueryParam("DownloadId")  Integer DownloadId) {
         return Response.ok(service.getDownloads(DownloadId).toString()).build();  
      }
}