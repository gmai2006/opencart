package com.opencart.admin.rest.model.sale;


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

import com.opencart.admin.dao.model.sale.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelSaleVoucher")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSaleVoucherResource {
  Log logger = LogFactory.getLog(ModelSaleVoucherResource.class);

  @Inject
  ModelSaleVoucherDAOImpl service;

      @Path("/deleteVoucher")
      @GET
      public Response deleteVoucher() {
         return Response.ok(service.deleteVoucher().toString()).build();  
      }
      @Path("/editVoucher")
      @GET
      public Response editVoucher() {
         return Response.ok(service.editVoucher().toString()).build();  
      }
      @Path("/deleteVoucher1")
      @GET
      public Response deleteVoucher1() {
         return Response.ok(service.deleteVoucher1().toString()).build();  
      }
      @Path("/getVoucherByCode")
      @GET
      public Response getVoucherByCode() {
         return Response.ok(service.getVoucherByCode().toString()).build();  
      }
      @Path("/addVoucher")
      @GET
      public Response addVoucher() {
         return Response.ok(service.addVoucher().toString()).build();  
      }
      @Path("/getTotalVouchersByVoucherThemeId")
      @GET
      public Response getTotalVouchersByVoucherThemeId() {
         return Response.ok(service.getTotalVouchersByVoucherThemeId().toString()).build();  
      }
      @Path("/getVoucher")
      @GET
      public Response getVoucher() {
         return Response.ok(service.getVoucher().toString()).build();  
      }
      @Path("/getTotalVoucherHistories")
      @GET
      public Response getTotalVoucherHistories() {
         return Response.ok(service.getTotalVoucherHistories().toString()).build();  
      }
      @Path("/getVoucherHistories")
      @GET
      public Response getVoucherHistories(  @QueryParam("OrderId")  Integer OrderId) {
         return Response.ok(service.getVoucherHistories(OrderId).toString()).build();  
      }
      @Path("/getTotalVouchers")
      @GET
      public Response getTotalVouchers() {
         return Response.ok(service.getTotalVouchers().toString()).build();  
      }
}