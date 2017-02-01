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

@Path("/ModelAccountReward")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelAccountRewardResource {
  Log logger = LogFactory.getLog(ModelAccountRewardResource.class);

  @Inject
  ModelAccountRewardDAOImpl service;

      @Path("/getTotalPoints")
      @GET
      public Response getTotalPoints(  @QueryParam("Points")  Integer Points) {
         return Response.ok(service.getTotalPoints(Points).toString()).build();  
      }
      @Path("/getTotalRewards")
      @GET
      public Response getTotalRewards() {
         return Response.ok(service.getTotalRewards().toString()).build();  
      }
}