package com.opencart.catalog.rest.model.checkout;


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

import com.opencart.catalog.dao.model.checkout.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCheckoutOrder")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCheckoutOrderResource {
  Log logger = LogFactory.getLog(ModelCheckoutOrderResource.class);

  @Inject
  ModelCheckoutOrderDAOImpl service;

      @Path("/editOrder")
      @GET
      public Response editOrder() {
         return Response.ok(service.editOrder().toString()).build();  
      }
      @Path("/deleteOrder7")
      @GET
      public Response deleteOrder7() {
         return Response.ok(service.deleteOrder7().toString()).build();  
      }
      @Path("/deleteOrder3")
      @GET
      public Response deleteOrder3() {
         return Response.ok(service.deleteOrder3().toString()).build();  
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
      @Path("/deleteOrder6")
      @GET
      public Response deleteOrder6() {
         return Response.ok(service.deleteOrder6().toString()).build();  
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
      @Path("/addOrderHistory")
      @GET
      public Response addOrderHistory() {
         return Response.ok(service.addOrderHistory().toString()).build();  
      }
      @Path("/addOrder4")
      @GET
      public Response addOrder4() {
         return Response.ok(service.addOrder4().toString()).build();  
      }
      @Path("/addOrder3")
      @GET
      public Response addOrder3() {
         return Response.ok(service.addOrder3().toString()).build();  
      }
      @Path("/addOrder2")
      @GET
      public Response addOrder2() {
         return Response.ok(service.addOrder2().toString()).build();  
      }
      @Path("/addOrder1")
      @GET
      public Response addOrder1() {
         return Response.ok(service.addOrder1().toString()).build();  
      }
      @Path("/addOrder5")
      @GET
      public Response addOrder5() {
         return Response.ok(service.addOrder5().toString()).build();  
      }
      @Path("/addOrderHistory20")
      @GET
      public Response addOrderHistory20() {
         return Response.ok(service.addOrderHistory20().toString()).build();  
      }
      @Path("/addOrder")
      @GET
      public Response addOrder() {
         return Response.ok(service.addOrder().toString()).build();  
      }
      @Path("/deleteOrder")
      @GET
      public Response deleteOrder() {
         return Response.ok(service.deleteOrder().toString()).build();  
      }
      @Path("/addOrderHistory6")
      @GET
      public Response addOrderHistory6() {
         return Response.ok(service.addOrderHistory6().toString()).build();  
      }
      @Path("/editOrder3")
      @GET
      public Response editOrder3() {
         return Response.ok(service.editOrder3().toString()).build();  
      }
      @Path("/addOrderHistory5")
      @GET
      public Response addOrderHistory5() {
         return Response.ok(service.addOrderHistory5().toString()).build();  
      }
      @Path("/editOrder2")
      @GET
      public Response editOrder2() {
         return Response.ok(service.editOrder2().toString()).build();  
      }
      @Path("/addOrderHistory4")
      @GET
      public Response addOrderHistory4() {
         return Response.ok(service.addOrderHistory4().toString()).build();  
      }
      @Path("/getOrder4")
      @GET
      public Response getOrder4() {
         return Response.ok(service.getOrder4().toString()).build();  
      }
      @Path("/editOrder1")
      @GET
      public Response editOrder1() {
         return Response.ok(service.editOrder1().toString()).build();  
      }
      @Path("/addOrderHistory3")
      @GET
      public Response addOrderHistory3() {
         return Response.ok(service.addOrderHistory3().toString()).build();  
      }
      @Path("/addOrderHistory2")
      @GET
      public Response addOrderHistory2() {
         return Response.ok(service.addOrderHistory2().toString()).build();  
      }
      @Path("/getOrder2")
      @GET
      public Response getOrder2() {
         return Response.ok(service.getOrder2().toString()).build();  
      }
      @Path("/addOrderHistory1")
      @GET
      public Response addOrderHistory1() {
         return Response.ok(service.addOrderHistory1().toString()).build();  
      }
      @Path("/getOrder3")
      @GET
      public Response getOrder3() {
         return Response.ok(service.getOrder3().toString()).build();  
      }
      @Path("/getOrder1")
      @GET
      public Response getOrder1() {
         return Response.ok(service.getOrder1().toString()).build();  
      }
      @Path("/addOrderHistory10")
      @GET
      public Response addOrderHistory10() {
         return Response.ok(service.addOrderHistory10().toString()).build();  
      }
      @Path("/addOrderHistory11")
      @GET
      public Response addOrderHistory11() {
         return Response.ok(service.addOrderHistory11().toString()).build();  
      }
      @Path("/editOrder9")
      @GET
      public Response editOrder9() {
         return Response.ok(service.editOrder9().toString()).build();  
      }
      @Path("/editOrder8")
      @GET
      public Response editOrder8() {
         return Response.ok(service.editOrder8().toString()).build();  
      }
      @Path("/editOrder7")
      @GET
      public Response editOrder7() {
         return Response.ok(service.editOrder7().toString()).build();  
      }
      @Path("/addOrderHistory9")
      @GET
      public Response addOrderHistory9() {
         return Response.ok(service.addOrderHistory9().toString()).build();  
      }
      @Path("/editOrder6")
      @GET
      public Response editOrder6() {
         return Response.ok(service.editOrder6().toString()).build();  
      }
      @Path("/addOrderHistory8")
      @GET
      public Response addOrderHistory8() {
         return Response.ok(service.addOrderHistory8().toString()).build();  
      }
      @Path("/editOrder5")
      @GET
      public Response editOrder5() {
         return Response.ok(service.editOrder5().toString()).build();  
      }
      @Path("/addOrderHistory7")
      @GET
      public Response addOrderHistory7() {
         return Response.ok(service.addOrderHistory7().toString()).build();  
      }
      @Path("/editOrder4")
      @GET
      public Response editOrder4() {
         return Response.ok(service.editOrder4().toString()).build();  
      }
      @Path("/getOrder")
      @GET
      public Response getOrder() {
         return Response.ok(service.getOrder().toString()).build();  
      }
      @Path("/addOrderHistory18")
      @GET
      public Response addOrderHistory18() {
         return Response.ok(service.addOrderHistory18().toString()).build();  
      }
      @Path("/addOrderHistory19")
      @GET
      public Response addOrderHistory19() {
         return Response.ok(service.addOrderHistory19().toString()).build();  
      }
      @Path("/addOrderHistory16")
      @GET
      public Response addOrderHistory16() {
         return Response.ok(service.addOrderHistory16().toString()).build();  
      }
      @Path("/addOrderHistory17")
      @GET
      public Response addOrderHistory17() {
         return Response.ok(service.addOrderHistory17().toString()).build();  
      }
      @Path("/addOrderHistory14")
      @GET
      public Response addOrderHistory14() {
         return Response.ok(service.addOrderHistory14().toString()).build();  
      }
      @Path("/addOrderHistory15")
      @GET
      public Response addOrderHistory15() {
         return Response.ok(service.addOrderHistory15().toString()).build();  
      }
      @Path("/addOrderHistory12")
      @GET
      public Response addOrderHistory12() {
         return Response.ok(service.addOrderHistory12().toString()).build();  
      }
      @Path("/addOrderHistory13")
      @GET
      public Response addOrderHistory13() {
         return Response.ok(service.addOrderHistory13().toString()).build();  
      }
}