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

@Path("/ModelSettingSetting")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelSettingSettingResource {
  Log logger = LogFactory.getLog(ModelSettingSettingResource.class);

  @Inject
  ModelSettingSettingDAOImpl service;

      @Path("/editSettingValue")
      @GET
      public Response editSettingValue() {
         return Response.ok(service.editSettingValue().toString()).build();  
      }
      @Path("/editSetting1")
      @GET
      public Response editSetting1() {
         return Response.ok(service.editSetting1().toString()).build();  
      }
      @Path("/editSettingValue1")
      @GET
      public Response editSettingValue1() {
         return Response.ok(service.editSettingValue1().toString()).build();  
      }
      @Path("/editSetting2")
      @GET
      public Response editSetting2() {
         return Response.ok(service.editSetting2().toString()).build();  
      }
      @Path("/getSetting")
      @GET
      public Response getSetting() {
         return Response.ok(service.getSetting().toString()).build();  
      }
      @Path("/editSetting")
      @GET
      public Response editSetting() {
         return Response.ok(service.editSetting().toString()).build();  
      }
      @Path("/getSettingValue")
      @GET
      public Response getSettingValue(  @QueryParam("Value")  String Value) {
         return Response.ok(service.getSettingValue(Value).toString()).build();  
      }
      @Path("/deleteSetting")
      @GET
      public Response deleteSetting() {
         return Response.ok(service.deleteSetting().toString()).build();  
      }
}