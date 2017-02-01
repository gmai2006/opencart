package com.opencart.catalog.rest;


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

import com.opencart.catalog.dao.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCatalogProduct")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogProductResource {
  Log logger = LogFactory.getLog(ModelCatalogProductResource.class);

  @Inject
  ModelCatalogProductDAOImpl service;

      @Path("/getProductDiscounts")
      @GET
      public Response getProductDiscounts() {
         return Response.ok(service.getProductDiscounts().toString()).build();  
      }
      @Path("/getProductAttributes1")
      @GET
      public Response getProductAttributes1(  @QueryParam("AttributeId")  Integer AttributeId) {
         return Response.ok(service.getProductAttributes1(AttributeId).toString()).build();  
      }
      @Path("/getProductOptions")
      @GET
      public Response getProductOptions() {
         return Response.ok(service.getProductOptions().toString()).build();  
      }
      @Path("/getProduct")
      @GET
      public Response getProduct() {
         return Response.ok(service.getProduct().toString()).build();  
      }
      @Path("/getProductImages")
      @GET
      public Response getProductImages() {
         return Response.ok(service.getProductImages().toString()).build();  
      }
      @Path("/getProductAttributes")
      @GET
      public Response getProductAttributes(  @QueryParam("AttributeGroupId")  Integer AttributeGroupId) {
         return Response.ok(service.getProductAttributes(AttributeGroupId).toString()).build();  
      }
      @Path("/getProductOptions1")
      @GET
      public Response getProductOptions1() {
         return Response.ok(service.getProductOptions1().toString()).build();  
      }
      @Path("/getProfile")
      @GET
      public Response getProfile() {
         return Response.ok(service.getProfile().toString()).build();  
      }
      @Path("/getTotalProductSpecials")
      @GET
      public Response getTotalProductSpecials(  @QueryParam("ProductId")  Integer ProductId) {
         return Response.ok(service.getTotalProductSpecials(ProductId).toString()).build();  
      }
      @Path("/getProductRelated")
      @GET
      public Response getProductRelated() {
         return Response.ok(service.getProductRelated().toString()).build();  
      }
      @Path("/getLatestProducts")
      @GET
      public Response getLatestProducts(  @QueryParam("ProductId")  Integer ProductId) {
         return Response.ok(service.getLatestProducts(ProductId).toString()).build();  
      }
      @Path("/getBestSellerProducts")
      @GET
      public Response getBestSellerProducts(  @QueryParam("ProductId")  Integer ProductId) {
         return Response.ok(service.getBestSellerProducts(ProductId).toString()).build();  
      }
      @Path("/getProductLayoutId")
      @GET
      public Response getProductLayoutId() {
         return Response.ok(service.getProductLayoutId().toString()).build();  
      }
      @Path("/getCategories")
      @GET
      public Response getCategories() {
         return Response.ok(service.getCategories().toString()).build();  
      }
      @Path("/getPopularProducts")
      @GET
      public Response getPopularProducts(  @QueryParam("ProductId")  Integer ProductId) {
         return Response.ok(service.getPopularProducts(ProductId).toString()).build();  
      }
      @Path("/getProfiles")
      @GET
      public Response getProfiles() {
         return Response.ok(service.getProfiles().toString()).build();  
      }
      @Path("/updateViewed")
      @GET
      public Response updateViewed() {
         return Response.ok(service.updateViewed().toString()).build();  
      }
}