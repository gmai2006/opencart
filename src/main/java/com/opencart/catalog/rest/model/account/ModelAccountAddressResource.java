package com.opencart.catalog.rest.model.account;


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

import com.opencart.catalog.dao.model.account.*;

import com.opencart.catalog.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelAccountAddress")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountAddressResource {
  Log logger = LogFactory.getLog(ModelAccountAddressResource.class);

  @Inject
  ModelAccountAddressDAOImpl service;

      @Path("/getAddresses")
      @GET
      public Response getAddresses() {
         return Response.ok(service.getAddresses().toString()).build();  
      }
      @Path("/getAddress2")
      @GET
      public Response getAddress2() {
         return Response.ok(service.getAddress2().toString()).build();  
      }
      @Path("/editAddress1")
      @GET
      public Response editAddress1() {
         return Response.ok(service.editAddress1().toString()).build();  
      }
      @Path("/getAddress1")
      @GET
      public Response getAddress1() {
         return Response.ok(service.getAddress1().toString()).build();  
      }
      @Path("/addAddress")
      @GET
      public Response addAddress() {
         return Response.ok(service.addAddress().toString()).build();  
      }
      @Path("/addAddress1")
      @GET
      public Response addAddress1() {
         return Response.ok(service.addAddress1().toString()).build();  
      }
      @Path("/getAddresses2")
      @GET
      public Response getAddresses2() {
         return Response.ok(service.getAddresses2().toString()).build();  
      }
      @Path("/getAddresses1")
      @GET
      public Response getAddresses1() {
         return Response.ok(service.getAddresses1().toString()).build();  
      }
      @Path("/deleteAddress")
      @GET
      public Response deleteAddress() {
         return Response.ok(service.deleteAddress().toString()).build();  
      }
      @Path("/getAddress")
      @GET
      public Response getAddress() {
         return Response.ok(service.getAddress().toString()).build();  
      }
      @Path("/editAddress")
      @GET
      public Response editAddress() {
         return Response.ok(service.editAddress().toString()).build();  
      }
      @Path("/getTotalAddresses")
      @GET
      public Response getTotalAddresses() {
         return Response.ok(service.getTotalAddresses().toString()).build();  
      }
}