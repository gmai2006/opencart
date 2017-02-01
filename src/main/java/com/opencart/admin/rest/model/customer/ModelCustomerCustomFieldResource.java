package com.opencart.admin.rest.model.customer;


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

import com.opencart.admin.dao.model.customer.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCustomerCustomField")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCustomerCustomFieldResource {
  Log logger = LogFactory.getLog(ModelCustomerCustomFieldResource.class);

  @Inject
  ModelCustomerCustomFieldDAOImpl service;

      @Path("/addCustomField4")
      @GET
      public Response addCustomField4() {
         return Response.ok(service.addCustomField4().toString()).build();  
      }
      @Path("/editCustomField1")
      @GET
      public Response editCustomField1() {
         return Response.ok(service.editCustomField1().toString()).build();  
      }
      @Path("/getCustomFieldValue")
      @GET
      public Response getCustomFieldValue() {
         return Response.ok(service.getCustomFieldValue().toString()).build();  
      }
      @Path("/editCustomField2")
      @GET
      public Response editCustomField2() {
         return Response.ok(service.editCustomField2().toString()).build();  
      }
      @Path("/editCustomField3")
      @GET
      public Response editCustomField3() {
         return Response.ok(service.editCustomField3().toString()).build();  
      }
      @Path("/addCustomField")
      @GET
      public Response addCustomField() {
         return Response.ok(service.addCustomField().toString()).build();  
      }
      @Path("/addCustomField1")
      @GET
      public Response addCustomField1() {
         return Response.ok(service.addCustomField1().toString()).build();  
      }
      @Path("/editCustomField5")
      @GET
      public Response editCustomField5() {
         return Response.ok(service.editCustomField5().toString()).build();  
      }
      @Path("/editCustomField6")
      @GET
      public Response editCustomField6() {
         return Response.ok(service.editCustomField6().toString()).build();  
      }
      @Path("/addCustomField3")
      @GET
      public Response addCustomField3() {
         return Response.ok(service.addCustomField3().toString()).build();  
      }
      @Path("/editCustomField7")
      @GET
      public Response editCustomField7() {
         return Response.ok(service.editCustomField7().toString()).build();  
      }
      @Path("/editCustomField8")
      @GET
      public Response editCustomField8() {
         return Response.ok(service.editCustomField8().toString()).build();  
      }
      @Path("/getCustomFieldCustomerGroups")
      @GET
      public Response getCustomFieldCustomerGroups() {
         return Response.ok(service.getCustomFieldCustomerGroups().toString()).build();  
      }
      @Path("/editCustomField9")
      @GET
      public Response editCustomField9() {
         return Response.ok(service.editCustomField9().toString()).build();  
      }
      @Path("/getCustomFieldDescriptions")
      @GET
      public Response getCustomFieldDescriptions() {
         return Response.ok(service.getCustomFieldDescriptions().toString()).build();  
      }
      @Path("/editCustomField")
      @GET
      public Response editCustomField() {
         return Response.ok(service.editCustomField().toString()).build();  
      }
      @Path("/deleteCustomField")
      @GET
      public Response deleteCustomField() {
         return Response.ok(service.deleteCustomField().toString()).build();  
      }
      @Path("/getCustomFieldValues")
      @GET
      public Response getCustomFieldValues() {
         return Response.ok(service.getCustomFieldValues().toString()).build();  
      }
      @Path("/getCustomFieldValueDescriptions1")
      @GET
      public Response getCustomFieldValueDescriptions1() {
         return Response.ok(service.getCustomFieldValueDescriptions1().toString()).build();  
      }
      @Path("/getCustomField")
      @GET
      public Response getCustomField() {
         return Response.ok(service.getCustomField().toString()).build();  
      }
      @Path("/deleteCustomField2")
      @GET
      public Response deleteCustomField2() {
         return Response.ok(service.deleteCustomField2().toString()).build();  
      }
      @Path("/deleteCustomField3")
      @GET
      public Response deleteCustomField3() {
         return Response.ok(service.deleteCustomField3().toString()).build();  
      }
      @Path("/deleteCustomField4")
      @GET
      public Response deleteCustomField4() {
         return Response.ok(service.deleteCustomField4().toString()).build();  
      }
      @Path("/deleteCustomField1")
      @GET
      public Response deleteCustomField1() {
         return Response.ok(service.deleteCustomField1().toString()).build();  
      }
      @Path("/getTotalCustomFields")
      @GET
      public Response getTotalCustomFields() {
         return Response.ok(service.getTotalCustomFields().toString()).build();  
      }
      @Path("/getCustomFieldValueDescriptions")
      @GET
      public Response getCustomFieldValueDescriptions() {
         return Response.ok(service.getCustomFieldValueDescriptions().toString()).build();  
      }
}