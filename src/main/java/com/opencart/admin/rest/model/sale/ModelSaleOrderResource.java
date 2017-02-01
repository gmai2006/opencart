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

@Path("/ModelSaleOrder")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSaleOrderResource {
  Log logger = LogFactory.getLog(ModelSaleOrderResource.class);

  @Inject
  ModelSaleOrderDAOImpl service;

      @Path("/getTotalOrdersByProcessingStatus")
      @GET
      public Response getTotalOrdersByProcessingStatus() {
         return Response.ok(service.getTotalOrdersByProcessingStatus().toString()).build();  
      }
      @Path("/getTotalOrdersByLanguageId")
      @GET
      public Response getTotalOrdersByLanguageId() {
         return Response.ok(service.getTotalOrdersByLanguageId().toString()).build();  
      }
      @Path("/getOrderHistories")
      @GET
      public Response getOrderHistories(  @QueryParam("DateAdded")  java.sql.Timestamp DateAdded) {
         return Response.ok(service.getOrderHistories(DateAdded).toString()).build();  
      }
      @Path("/getTotalOrdersByCompleteStatus")
      @GET
      public Response getTotalOrdersByCompleteStatus() {
         return Response.ok(service.getTotalOrdersByCompleteStatus().toString()).build();  
      }
      @Path("/getOrderProducts")
      @GET
      public Response getOrderProducts() {
         return Response.ok(service.getOrderProducts().toString()).build();  
      }
      @Path("/getOrderVoucherByVoucherId")
      @GET
      public Response getOrderVoucherByVoucherId() {
         return Response.ok(service.getOrderVoucherByVoucherId().toString()).build();  
      }
      @Path("/deleteOrder7")
      @GET
      public Response deleteOrder7() {
         return Response.ok(service.deleteOrder7().toString()).build();  
      }
      @Path("/deleteOrder8")
      @GET
      public Response deleteOrder8() {
         return Response.ok(service.deleteOrder8().toString()).build();  
      }
      @Path("/deleteOrder9")
      @GET
      public Response deleteOrder9() {
         return Response.ok(service.deleteOrder9().toString()).build();  
      }
      @Path("/getTotalOrderHistoriesByOrderStatusId")
      @GET
      public Response getTotalOrderHistoriesByOrderStatusId() {
         return Response.ok(service.getTotalOrderHistoriesByOrderStatusId().toString()).build();  
      }
      @Path("/deleteOrder3")
      @GET
      public Response deleteOrder3() {
         return Response.ok(service.deleteOrder3().toString()).build();  
      }
      @Path("/createInvoiceNo")
      @GET
      public Response createInvoiceNo(  @QueryParam("InvoiceNo")  Integer InvoiceNo) {
         return Response.ok(service.createInvoiceNo(InvoiceNo).toString()).build();  
      }
      @Path("/deleteOrder4")
      @GET
      public Response deleteOrder4() {
         return Response.ok(service.deleteOrder4().toString()).build();  
      }
      @Path("/deleteOrder5")
      @GET
      public Response deleteOrder5() {
         return Response.ok(service.deleteOrder5().toString()).build();  
      }
      @Path("/getTotalOrdersByOrderStatusId")
      @GET
      public Response getTotalOrdersByOrderStatusId() {
         return Response.ok(service.getTotalOrdersByOrderStatusId().toString()).build();  
      }
      @Path("/deleteOrder6")
      @GET
      public Response deleteOrder6() {
         return Response.ok(service.deleteOrder6().toString()).build();  
      }
      @Path("/getOrderTotals")
      @GET
      public Response getOrderTotals() {
         return Response.ok(service.getOrderTotals().toString()).build();  
      }
      @Path("/deleteOrder1")
      @GET
      public Response deleteOrder1() {
         return Response.ok(service.deleteOrder1().toString()).build();  
      }
      @Path("/deleteOrder2")
      @GET
      public Response deleteOrder2() {
         return Response.ok(service.deleteOrder2().toString()).build();  
      }
      @Path("/getTotalEmailsByProductsOrdered")
      @GET
      public Response getTotalEmailsByProductsOrdered(  @QueryParam("Email")  String Email) {
         return Response.ok(service.getTotalEmailsByProductsOrdered(Email).toString()).build();  
      }
      @Path("/deleteOrder")
      @GET
      public Response deleteOrder() {
         return Response.ok(service.deleteOrder().toString()).build();  
      }
      @Path("/getEmailsByProductsOrdered")
      @GET
      public Response getEmailsByProductsOrdered(  @QueryParam("Email")  String Email) {
         return Response.ok(service.getEmailsByProductsOrdered(Email).toString()).build();  
      }
      @Path("/getTotalOrdersByCurrencyId")
      @GET
      public Response getTotalOrdersByCurrencyId() {
         return Response.ok(service.getTotalOrdersByCurrencyId().toString()).build();  
      }
      @Path("/getOrderOptions")
      @GET
      public Response getOrderOptions() {
         return Response.ok(service.getOrderOptions().toString()).build();  
      }
      @Path("/getTotalOrdersByStoreId")
      @GET
      public Response getTotalOrdersByStoreId() {
         return Response.ok(service.getTotalOrdersByStoreId().toString()).build();  
      }
      @Path("/getOrderVouchers")
      @GET
      public Response getOrderVouchers() {
         return Response.ok(service.getOrderVouchers().toString()).build();  
      }
      @Path("/getOrder4")
      @GET
      public Response getOrder4() {
         return Response.ok(service.getOrder4().toString()).build();  
      }
      @Path("/getOrder5")
      @GET
      public Response getOrder5() {
         return Response.ok(service.getOrder5().toString()).build();  
      }
      @Path("/getOrder2")
      @GET
      public Response getOrder2() {
         return Response.ok(service.getOrder2().toString()).build();  
      }
      @Path("/getOrder3")
      @GET
      public Response getOrder3() {
         return Response.ok(service.getOrder3().toString()).build();  
      }
      @Path("/getTotalOrderHistories")
      @GET
      public Response getTotalOrderHistories() {
         return Response.ok(service.getTotalOrderHistories().toString()).build();  
      }
      @Path("/getOrder1")
      @GET
      public Response getOrder1() {
         return Response.ok(service.getOrder1().toString()).build();  
      }
      @Path("/getOrder")
      @GET
      public Response getOrder() {
         return Response.ok(service.getOrder().toString()).build();  
      }
      @Path("/createInvoiceNo1")
      @GET
      public Response createInvoiceNo1() {
         return Response.ok(service.createInvoiceNo1().toString()).build();  
      }
}