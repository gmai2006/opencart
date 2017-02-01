package com.opencart.admin.rest.model.marketing;


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

import com.opencart.admin.dao.model.marketing.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelMarketingCoupon")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelMarketingCouponResource {
  Log logger = LogFactory.getLog(ModelMarketingCouponResource.class);

  @Inject
  ModelMarketingCouponDAOImpl service;

      @Path("/getCouponCategories")
      @GET
      public Response getCouponCategories() {
         return Response.ok(service.getCouponCategories().toString()).build();  
      }
      @Path("/deleteCoupon3")
      @GET
      public Response deleteCoupon3() {
         return Response.ok(service.deleteCoupon3().toString()).build();  
      }
      @Path("/deleteCoupon2")
      @GET
      public Response deleteCoupon2() {
         return Response.ok(service.deleteCoupon2().toString()).build();  
      }
      @Path("/deleteCoupon1")
      @GET
      public Response deleteCoupon1() {
         return Response.ok(service.deleteCoupon1().toString()).build();  
      }
      @Path("/getCoupon")
      @GET
      public Response getCoupon() {
         return Response.ok(service.getCoupon().toString()).build();  
      }
      @Path("/getCouponByCode")
      @GET
      public Response getCouponByCode() {
         return Response.ok(service.getCouponByCode().toString()).build();  
      }
      @Path("/getTotalCouponHistories")
      @GET
      public Response getTotalCouponHistories() {
         return Response.ok(service.getTotalCouponHistories().toString()).build();  
      }
      @Path("/getCouponProducts")
      @GET
      public Response getCouponProducts() {
         return Response.ok(service.getCouponProducts().toString()).build();  
      }
      @Path("/deleteCoupon")
      @GET
      public Response deleteCoupon() {
         return Response.ok(service.deleteCoupon().toString()).build();  
      }
      @Path("/editCoupon4")
      @GET
      public Response editCoupon4() {
         return Response.ok(service.editCoupon4().toString()).build();  
      }
      @Path("/editCoupon1")
      @GET
      public Response editCoupon1() {
         return Response.ok(service.editCoupon1().toString()).build();  
      }
      @Path("/getCouponHistories")
      @GET
      public Response getCouponHistories(  @QueryParam("OrderId")  Integer OrderId) {
         return Response.ok(service.getCouponHistories(OrderId).toString()).build();  
      }
      @Path("/editCoupon3")
      @GET
      public Response editCoupon3() {
         return Response.ok(service.editCoupon3().toString()).build();  
      }
      @Path("/editCoupon2")
      @GET
      public Response editCoupon2() {
         return Response.ok(service.editCoupon2().toString()).build();  
      }
      @Path("/editCoupon")
      @GET
      public Response editCoupon() {
         return Response.ok(service.editCoupon().toString()).build();  
      }
      @Path("/addCoupon")
      @GET
      public Response addCoupon() {
         return Response.ok(service.addCoupon().toString()).build();  
      }
      @Path("/addCoupon2")
      @GET
      public Response addCoupon2() {
         return Response.ok(service.addCoupon2().toString()).build();  
      }
      @Path("/addCoupon1")
      @GET
      public Response addCoupon1() {
         return Response.ok(service.addCoupon1().toString()).build();  
      }
      @Path("/getTotalCoupons")
      @GET
      public Response getTotalCoupons() {
         return Response.ok(service.getTotalCoupons().toString()).build();  
      }
}