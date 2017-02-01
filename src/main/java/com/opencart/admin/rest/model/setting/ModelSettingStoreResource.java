package com.opencart.admin.rest.model.setting;


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

import com.opencart.admin.dao.model.setting.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelSettingStore")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSettingStoreResource {
  Log logger = LogFactory.getLog(ModelSettingStoreResource.class);

  @Inject
  ModelSettingStoreDAOImpl service;

      @Path("/getTotalStoresByLanguage")
      @GET
      public Response getTotalStoresByLanguage() {
         return Response.ok(service.getTotalStoresByLanguage().toString()).build();  
      }
      @Path("/getTotalStoresByCountryId")
      @GET
      public Response getTotalStoresByCountryId() {
         return Response.ok(service.getTotalStoresByCountryId().toString()).build();  
      }
      @Path("/getStores")
      @GET
      public Response getStores() {
         return Response.ok(service.getStores().toString()).build();  
      }
      @Path("/getTotalStoresByCustomerGroupId")
      @GET
      public Response getTotalStoresByCustomerGroupId() {
         return Response.ok(service.getTotalStoresByCustomerGroupId().toString()).build();  
      }
      @Path("/getStore")
      @GET
      public Response getStore() {
         return Response.ok(service.getStore().toString()).build();  
      }
      @Path("/getTotalStoresByInformationId1")
      @GET
      public Response getTotalStoresByInformationId1() {
         return Response.ok(service.getTotalStoresByInformationId1().toString()).build();  
      }
      @Path("/editStore")
      @GET
      public Response editStore() {
         return Response.ok(service.editStore().toString()).build();  
      }
      @Path("/getTotalStoresByZoneId")
      @GET
      public Response getTotalStoresByZoneId() {
         return Response.ok(service.getTotalStoresByZoneId().toString()).build();  
      }
      @Path("/deleteStore1")
      @GET
      public Response deleteStore1() {
         return Response.ok(service.deleteStore1().toString()).build();  
      }
      @Path("/addStore")
      @GET
      public Response addStore() {
         return Response.ok(service.addStore().toString()).build();  
      }
      @Path("/getTotalStoresByCurrency")
      @GET
      public Response getTotalStoresByCurrency() {
         return Response.ok(service.getTotalStoresByCurrency().toString()).build();  
      }
      @Path("/deleteStore")
      @GET
      public Response deleteStore() {
         return Response.ok(service.deleteStore().toString()).build();  
      }
      @Path("/getTotalStoresByInformationId")
      @GET
      public Response getTotalStoresByInformationId() {
         return Response.ok(service.getTotalStoresByInformationId().toString()).build();  
      }
      @Path("/addStore2")
      @GET
      public Response addStore2() {
         return Response.ok(service.addStore2().toString()).build();  
      }
      @Path("/addStore1")
      @GET
      public Response addStore1() {
         return Response.ok(service.addStore1().toString()).build();  
      }
      @Path("/getTotalStoresByOrderStatusId")
      @GET
      public Response getTotalStoresByOrderStatusId() {
         return Response.ok(service.getTotalStoresByOrderStatusId().toString()).build();  
      }
      @Path("/getTotalStores")
      @GET
      public Response getTotalStores() {
         return Response.ok(service.getTotalStores().toString()).build();  
      }
      @Path("/getTotalStoresByLayoutId")
      @GET
      public Response getTotalStoresByLayoutId() {
         return Response.ok(service.getTotalStoresByLayoutId().toString()).build();  
      }
}