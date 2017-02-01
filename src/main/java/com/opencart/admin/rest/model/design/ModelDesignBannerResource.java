package com.opencart.admin.rest.model.design;


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

import com.opencart.admin.dao.model.design.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelDesignBanner")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelDesignBannerResource {
  Log logger = LogFactory.getLog(ModelDesignBannerResource.class);

  @Inject
  ModelDesignBannerDAOImpl service;

      @Path("/addBanner")
      @GET
      public Response addBanner() {
         return Response.ok(service.addBanner().toString()).build();  
      }
      @Path("/addBanner1")
      @GET
      public Response addBanner1() {
         return Response.ok(service.addBanner1().toString()).build();  
      }
      @Path("/getBannerImages")
      @GET
      public Response getBannerImages() {
         return Response.ok(service.getBannerImages().toString()).build();  
      }
      @Path("/deleteBanner")
      @GET
      public Response deleteBanner() {
         return Response.ok(service.deleteBanner().toString()).build();  
      }
      @Path("/editBanner2")
      @GET
      public Response editBanner2() {
         return Response.ok(service.editBanner2().toString()).build();  
      }
      @Path("/editBanner")
      @GET
      public Response editBanner() {
         return Response.ok(service.editBanner().toString()).build();  
      }
      @Path("/getTotalBanners")
      @GET
      public Response getTotalBanners() {
         return Response.ok(service.getTotalBanners().toString()).build();  
      }
      @Path("/editBanner1")
      @GET
      public Response editBanner1() {
         return Response.ok(service.editBanner1().toString()).build();  
      }
      @Path("/getBanner")
      @GET
      public Response getBanner() {
         return Response.ok(service.getBanner().toString()).build();  
      }
      @Path("/deleteBanner1")
      @GET
      public Response deleteBanner1() {
         return Response.ok(service.deleteBanner1().toString()).build();  
      }
}