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

@Path("/ModelCustomerCustomer")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCustomerCustomerResource {
  Log logger = LogFactory.getLog(ModelCustomerCustomerResource.class);

  @Inject
  ModelCustomerCustomerDAOImpl service;

      @Path("/editCustomer3")
      @GET
      public Response editCustomer3() {
         return Response.ok(service.editCustomer3().toString()).build();  
      }
      @Path("/editCustomer")
      @GET
      public Response editCustomer() {
         return Response.ok(service.editCustomer().toString()).build();  
      }
      @Path("/editCustomer2")
      @GET
      public Response editCustomer2() {
         return Response.ok(service.editCustomer2().toString()).build();  
      }
      @Path("/getAddress2")
      @GET
      public Response getAddress2() {
         return Response.ok(service.getAddress2().toString()).build();  
      }
      @Path("/deleteCustomer5")
      @GET
      public Response deleteCustomer5() {
         return Response.ok(service.deleteCustomer5().toString()).build();  
      }
      @Path("/editCustomer1")
      @GET
      public Response editCustomer1() {
         return Response.ok(service.editCustomer1().toString()).build();  
      }
      @Path("/deleteCustomer3")
      @GET
      public Response deleteCustomer3() {
         return Response.ok(service.deleteCustomer3().toString()).build();  
      }
      @Path("/getAddress1")
      @GET
      public Response getAddress1() {
         return Response.ok(service.getAddress1().toString()).build();  
      }
      @Path("/deleteCustomer4")
      @GET
      public Response deleteCustomer4() {
         return Response.ok(service.deleteCustomer4().toString()).build();  
      }
      @Path("/deleteCustomer1")
      @GET
      public Response deleteCustomer1() {
         return Response.ok(service.deleteCustomer1().toString()).build();  
      }
      @Path("/getTotalAddressesByZoneId")
      @GET
      public Response getTotalAddressesByZoneId() {
         return Response.ok(service.getTotalAddressesByZoneId().toString()).build();  
      }
      @Path("/deleteCustomer2")
      @GET
      public Response deleteCustomer2() {
         return Response.ok(service.deleteCustomer2().toString()).build();  
      }
      @Path("/editCustomer4")
      @GET
      public Response editCustomer4() {
         return Response.ok(service.editCustomer4().toString()).build();  
      }
      @Path("/getRewards")
      @GET
      public Response getRewards() {
         return Response.ok(service.getRewards().toString()).build();  
      }
      @Path("/deleteTransaction")
      @GET
      public Response deleteTransaction() {
         return Response.ok(service.deleteTransaction().toString()).build();  
      }
      @Path("/addHistory")
      @GET
      public Response addHistory() {
         return Response.ok(service.addHistory().toString()).build();  
      }
      @Path("/deleteLoginAttempts")
      @GET
      public Response deleteLoginAttempts() {
         return Response.ok(service.deleteLoginAttempts().toString()).build();  
      }
      @Path("/getTotalIps")
      @GET
      public Response getTotalIps() {
         return Response.ok(service.getTotalIps().toString()).build();  
      }
      @Path("/addCustomer")
      @GET
      public Response addCustomer() {
         return Response.ok(service.addCustomer().toString()).build();  
      }
      @Path("/getTotalHistories")
      @GET
      public Response getTotalHistories() {
         return Response.ok(service.getTotalHistories().toString()).build();  
      }
      @Path("/getTotalRewards")
      @GET
      public Response getTotalRewards() {
         return Response.ok(service.getTotalRewards().toString()).build();  
      }
      @Path("/getTotalCustomersAwaitingApproval")
      @GET
      public Response getTotalCustomersAwaitingApproval() {
         return Response.ok(service.getTotalCustomersAwaitingApproval().toString()).build();  
      }
      @Path("/deleteReward")
      @GET
      public Response deleteReward() {
         return Response.ok(service.deleteReward().toString()).build();  
      }
      @Path("/getRewardTotal")
      @GET
      public Response getRewardTotal(  @QueryParam("Points")  Integer Points) {
         return Response.ok(service.getRewardTotal(Points).toString()).build();  
      }
      @Path("/getTotalCustomersByCustomerGroupId")
      @GET
      public Response getTotalCustomersByCustomerGroupId() {
         return Response.ok(service.getTotalCustomersByCustomerGroupId().toString()).build();  
      }
      @Path("/getAddress")
      @GET
      public Response getAddress() {
         return Response.ok(service.getAddress().toString()).build();  
      }
      @Path("/addTransaction")
      @GET
      public Response addTransaction() {
         return Response.ok(service.addTransaction().toString()).build();  
      }
      @Path("/getAddresses")
      @GET
      public Response getAddresses(  @QueryParam("AddressId")  Integer AddressId) {
         return Response.ok(service.getAddresses(AddressId).toString()).build();  
      }
      @Path("/getTotalAddressesByCustomerId")
      @GET
      public Response getTotalAddressesByCustomerId() {
         return Response.ok(service.getTotalAddressesByCustomerId().toString()).build();  
      }
      @Path("/getTotalAddressesByCountryId")
      @GET
      public Response getTotalAddressesByCountryId() {
         return Response.ok(service.getTotalAddressesByCountryId().toString()).build();  
      }
      @Path("/addCustomer1")
      @GET
      public Response addCustomer1() {
         return Response.ok(service.addCustomer1().toString()).build();  
      }
      @Path("/addCustomer2")
      @GET
      public Response addCustomer2() {
         return Response.ok(service.addCustomer2().toString()).build();  
      }
      @Path("/editToken")
      @GET
      public Response editToken() {
         return Response.ok(service.editToken().toString()).build();  
      }
      @Path("/getTotalCustomerRewardsByOrderId")
      @GET
      public Response getTotalCustomerRewardsByOrderId() {
         return Response.ok(service.getTotalCustomerRewardsByOrderId().toString()).build();  
      }
      @Path("/getTransactions")
      @GET
      public Response getTransactions() {
         return Response.ok(service.getTransactions().toString()).build();  
      }
      @Path("/deleteCustomer")
      @GET
      public Response deleteCustomer() {
         return Response.ok(service.deleteCustomer().toString()).build();  
      }
      @Path("/getCustomerByEmail")
      @GET
      public Response getCustomerByEmail() {
         return Response.ok(service.getCustomerByEmail().toString()).build();  
      }
      @Path("/getTotalCustomersByIp")
      @GET
      public Response getTotalCustomersByIp() {
         return Response.ok(service.getTotalCustomersByIp().toString()).build();  
      }
      @Path("/getTransactionTotal")
      @GET
      public Response getTransactionTotal(  @QueryParam("Amount")  Long Amount) {
         return Response.ok(service.getTransactionTotal(Amount).toString()).build();  
      }
      @Path("/getTotalTransactions")
      @GET
      public Response getTotalTransactions() {
         return Response.ok(service.getTotalTransactions().toString()).build();  
      }
      @Path("/getCustomer")
      @GET
      public Response getCustomer() {
         return Response.ok(service.getCustomer().toString()).build();  
      }
      @Path("/addReward")
      @GET
      public Response addReward() {
         return Response.ok(service.addReward().toString()).build();  
      }
      @Path("/approve")
      @GET
      public Response approve() {
         return Response.ok(service.approve().toString()).build();  
      }
      @Path("/getTotalLoginAttempts")
      @GET
      public Response getTotalLoginAttempts() {
         return Response.ok(service.getTotalLoginAttempts().toString()).build();  
      }
      @Path("/getHistories")
      @GET
      public Response getHistories(  @QueryParam("Comment")  String Comment) {
         return Response.ok(service.getHistories(Comment).toString()).build();  
      }
      @Path("/getIps")
      @GET
      public Response getIps() {
         return Response.ok(service.getIps().toString()).build();  
      }
      @Path("/getTotalTransactionsByOrderId")
      @GET
      public Response getTotalTransactionsByOrderId() {
         return Response.ok(service.getTotalTransactionsByOrderId().toString()).build();  
      }
}