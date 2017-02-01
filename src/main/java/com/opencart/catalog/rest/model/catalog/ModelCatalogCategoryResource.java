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

@Path("/ModelCatalogCategory")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogCategoryResource {
  Log logger = LogFactory.getLog(ModelCatalogCategoryResource.class);

  @Inject
  ModelCatalogCategoryDAOImpl service;

      @Path("/getTotalCategoriesByCategoryId")
      @GET
      public Response getTotalCategoriesByCategoryId() {
         return Response.ok(service.getTotalCategoriesByCategoryId().toString()).build();  
      }
      @Path("/getCategoryFilters")
      @GET
      public Response getCategoryFilters(  @QueryParam("FilterId")  Integer FilterId) {
         return Response.ok(service.getCategoryFilters(FilterId).toString()).build();  
      }
      @Path("/getCategoryLayoutId")
      @GET
      public Response getCategoryLayoutId() {
         return Response.ok(service.getCategoryLayoutId().toString()).build();  
      }
      @Path("/getCategories")
      @GET
      public Response getCategories() {
         return Response.ok(service.getCategories().toString()).build();  
      }
      @Path("/getCategoryFilters2")
      @GET
      public Response getCategoryFilters2(  @QueryParam("FilterId")  Integer FilterId) {
         return Response.ok(service.getCategoryFilters2(FilterId).toString()).build();  
      }
      @Path("/getCategory")
      @GET
      public Response getCategory() {
         return Response.ok(service.getCategory().toString()).build();  
      }
      @Path("/getCategoryFilters1")
      @GET
      public Response getCategoryFilters1(  @QueryParam("FilterGroupId")  Integer FilterGroupId) {
         return Response.ok(service.getCategoryFilters1(FilterGroupId).toString()).build();  
      }
}