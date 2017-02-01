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

@Path("/ModelCatalogCategory")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogCategoryResource {
  Log logger = LogFactory.getLog(ModelCatalogCategoryResource.class);

  @Inject
  ModelCatalogCategoryDAOImpl service;

      @Path("/editCategory10")
      @GET
      public Response editCategory10() {
         return Response.ok(service.editCategory10().toString()).build();  
      }
      @Path("/getCategoryStores")
      @GET
      public Response getCategoryStores() {
         return Response.ok(service.getCategoryStores().toString()).build();  
      }
      @Path("/editCategory17")
      @GET
      public Response editCategory17() {
         return Response.ok(service.editCategory17().toString()).build();  
      }
      @Path("/repairCategories")
      @GET
      public Response repairCategories() {
         return Response.ok(service.repairCategories().toString()).build();  
      }
      @Path("/editCategory18")
      @GET
      public Response editCategory18() {
         return Response.ok(service.editCategory18().toString()).build();  
      }
      @Path("/editCategory15")
      @GET
      public Response editCategory15() {
         return Response.ok(service.editCategory15().toString()).build();  
      }
      @Path("/editCategory16")
      @GET
      public Response editCategory16() {
         return Response.ok(service.editCategory16().toString()).build();  
      }
      @Path("/editCategory13")
      @GET
      public Response editCategory13() {
         return Response.ok(service.editCategory13().toString()).build();  
      }
      @Path("/editCategory14")
      @GET
      public Response editCategory14() {
         return Response.ok(service.editCategory14().toString()).build();  
      }
      @Path("/editCategory11")
      @GET
      public Response editCategory11() {
         return Response.ok(service.editCategory11().toString()).build();  
      }
      @Path("/getCategoryFilters")
      @GET
      public Response getCategoryFilters() {
         return Response.ok(service.getCategoryFilters().toString()).build();  
      }
      @Path("/addCategory7")
      @GET
      public Response addCategory7() {
         return Response.ok(service.addCategory7().toString()).build();  
      }
      @Path("/addCategory8")
      @GET
      public Response addCategory8() {
         return Response.ok(service.addCategory8().toString()).build();  
      }
      @Path("/addCategory3")
      @GET
      public Response addCategory3() {
         return Response.ok(service.addCategory3().toString()).build();  
      }
      @Path("/addCategory4")
      @GET
      public Response addCategory4() {
         return Response.ok(service.addCategory4().toString()).build();  
      }
      @Path("/addCategory5")
      @GET
      public Response addCategory5() {
         return Response.ok(service.addCategory5().toString()).build();  
      }
      @Path("/addCategory6")
      @GET
      public Response addCategory6() {
         return Response.ok(service.addCategory6().toString()).build();  
      }
      @Path("/addCategory1")
      @GET
      public Response addCategory1() {
         return Response.ok(service.addCategory1().toString()).build();  
      }
      @Path("/getCategoryLayouts")
      @GET
      public Response getCategoryLayouts() {
         return Response.ok(service.getCategoryLayouts().toString()).build();  
      }
      @Path("/addCategory2")
      @GET
      public Response addCategory2() {
         return Response.ok(service.addCategory2().toString()).build();  
      }
      @Path("/getCategoryDescriptions")
      @GET
      public Response getCategoryDescriptions() {
         return Response.ok(service.getCategoryDescriptions().toString()).build();  
      }
      @Path("/repairCategories2")
      @GET
      public Response repairCategories2() {
         return Response.ok(service.repairCategories2().toString()).build();  
      }
      @Path("/repairCategories1")
      @GET
      public Response repairCategories1() {
         return Response.ok(service.repairCategories1().toString()).build();  
      }
      @Path("/repairCategories3")
      @GET
      public Response repairCategories3() {
         return Response.ok(service.repairCategories3().toString()).build();  
      }
      @Path("/getTotalCategoriesByLayoutId")
      @GET
      public Response getTotalCategoriesByLayoutId() {
         return Response.ok(service.getTotalCategoriesByLayoutId().toString()).build();  
      }
      @Path("/editCategory9")
      @GET
      public Response editCategory9() {
         return Response.ok(service.editCategory9().toString()).build();  
      }
      @Path("/getCategoryPath")
      @GET
      public Response getCategoryPath(  @QueryParam("CategoryId")  Integer CategoryId) {
         return Response.ok(service.getCategoryPath(CategoryId).toString()).build();  
      }
      @Path("/deleteCategory9")
      @GET
      public Response deleteCategory9() {
         return Response.ok(service.deleteCategory9().toString()).build();  
      }
      @Path("/deleteCategory")
      @GET
      public Response deleteCategory() {
         return Response.ok(service.deleteCategory().toString()).build();  
      }
      @Path("/getTotalCategories")
      @GET
      public Response getTotalCategories() {
         return Response.ok(service.getTotalCategories().toString()).build();  
      }
      @Path("/deleteCategory5")
      @GET
      public Response deleteCategory5() {
         return Response.ok(service.deleteCategory5().toString()).build();  
      }
      @Path("/editCategory1")
      @GET
      public Response editCategory1() {
         return Response.ok(service.editCategory1().toString()).build();  
      }
      @Path("/deleteCategory6")
      @GET
      public Response deleteCategory6() {
         return Response.ok(service.deleteCategory6().toString()).build();  
      }
      @Path("/deleteCategory7")
      @GET
      public Response deleteCategory7() {
         return Response.ok(service.deleteCategory7().toString()).build();  
      }
      @Path("/editCategory3")
      @GET
      public Response editCategory3() {
         return Response.ok(service.editCategory3().toString()).build();  
      }
      @Path("/editCategory2")
      @GET
      public Response editCategory2() {
         return Response.ok(service.editCategory2().toString()).build();  
      }
      @Path("/editCategory5")
      @GET
      public Response editCategory5() {
         return Response.ok(service.editCategory5().toString()).build();  
      }
      @Path("/deleteCategory1")
      @GET
      public Response deleteCategory1() {
         return Response.ok(service.deleteCategory1().toString()).build();  
      }
      @Path("/deleteCategory2")
      @GET
      public Response deleteCategory2() {
         return Response.ok(service.deleteCategory2().toString()).build();  
      }
      @Path("/editCategory4")
      @GET
      public Response editCategory4() {
         return Response.ok(service.editCategory4().toString()).build();  
      }
      @Path("/editCategory7")
      @GET
      public Response editCategory7() {
         return Response.ok(service.editCategory7().toString()).build();  
      }
      @Path("/deleteCategory3")
      @GET
      public Response deleteCategory3() {
         return Response.ok(service.deleteCategory3().toString()).build();  
      }
      @Path("/deleteCategory4")
      @GET
      public Response deleteCategory4() {
         return Response.ok(service.deleteCategory4().toString()).build();  
      }
      @Path("/editCategory6")
      @GET
      public Response editCategory6() {
         return Response.ok(service.editCategory6().toString()).build();  
      }
}