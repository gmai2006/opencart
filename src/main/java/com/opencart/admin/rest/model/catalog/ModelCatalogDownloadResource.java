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

@Path("/ModelCatalogDownload")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogDownloadResource {
  Log logger = LogFactory.getLog(ModelCatalogDownloadResource.class);

  @Inject
  ModelCatalogDownloadDAOImpl service;

      @Path("/editDownload")
      @GET
      public Response editDownload() {
         return Response.ok(service.editDownload().toString()).build();  
      }
      @Path("/deleteDownload1")
      @GET
      public Response deleteDownload1() {
         return Response.ok(service.deleteDownload1().toString()).build();  
      }
      @Path("/addDownload")
      @GET
      public Response addDownload() {
         return Response.ok(service.addDownload().toString()).build();  
      }
      @Path("/editDownload1")
      @GET
      public Response editDownload1() {
         return Response.ok(service.editDownload1().toString()).build();  
      }
      @Path("/getTotalDownloads")
      @GET
      public Response getTotalDownloads() {
         return Response.ok(service.getTotalDownloads().toString()).build();  
      }
      @Path("/getDownloadDescriptions")
      @GET
      public Response getDownloadDescriptions() {
         return Response.ok(service.getDownloadDescriptions().toString()).build();  
      }
      @Path("/editDownload2")
      @GET
      public Response editDownload2() {
         return Response.ok(service.editDownload2().toString()).build();  
      }
      @Path("/getDownload")
      @GET
      public Response getDownload() {
         return Response.ok(service.getDownload().toString()).build();  
      }
      @Path("/addDownload1")
      @GET
      public Response addDownload1() {
         return Response.ok(service.addDownload1().toString()).build();  
      }
      @Path("/deleteDownload")
      @GET
      public Response deleteDownload() {
         return Response.ok(service.deleteDownload().toString()).build();  
      }
}