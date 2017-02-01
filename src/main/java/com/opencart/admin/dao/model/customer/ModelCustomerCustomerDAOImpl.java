package com.opencart.admin.dao.model.customer;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opencart.utils.BeanUtils;
import com.opencart.dao.DAOUtils;
import com.opencart.utils.BeanUtils;
import com.opencart.model.*;

import com.opencart.admin.model.*;

public class ModelCustomerCustomerDAOImpl implements ModelCustomerCustomerDAO {
  private Log logger = LogFactory.getLog(ModelCustomerCustomerDAOImpl.class);

  @Inject EntityManager em;

  public Response editCustomer3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomer3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomer3");
        return Response.serverError().entity("query string NOT FOUND editCustomer3").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response editCustomer() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomer");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomer");
        return Response.serverError().entity("query string NOT FOUND editCustomer").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response editCustomer2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomer2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomer2");
        return Response.serverError().entity("query string NOT FOUND editCustomer2").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getAddress2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddress2");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddress2");
        return Response.serverError().entity("query string NOT FOUND getAddress2").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddress2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddress2").build();
      }
      for (OcZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomer5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomer5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomer5");
        return Response.serverError().entity("query string NOT FOUND deleteCustomer5").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response editCustomer1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomer1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomer1");
        return Response.serverError().entity("query string NOT FOUND editCustomer1").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response deleteCustomer3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomer3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomer3");
        return Response.serverError().entity("query string NOT FOUND deleteCustomer3").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getAddress1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddress1");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddress1");
        return Response.serverError().entity("query string NOT FOUND getAddress1").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddress1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddress1").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomer4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomer4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomer4");
        return Response.serverError().entity("query string NOT FOUND deleteCustomer4").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response deleteCustomer1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomer1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomer1");
        return Response.serverError().entity("query string NOT FOUND deleteCustomer1").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getTotalAddressesByZoneId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAddressesByZoneId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAddressesByZoneId");
        return Response.serverError().entity("query string NOT FOUND getTotalAddressesByZoneId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAddressesByZoneId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAddressesByZoneId").build();
      }
      for (Object[] o : list) {
        array.add(GettotaladdressesbyzoneidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomer2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomer2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomer2");
        return Response.serverError().entity("query string NOT FOUND deleteCustomer2").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response editCustomer4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomer4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomer4");
        return Response.serverError().entity("query string NOT FOUND editCustomer4").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getRewards() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getRewards");

      Query query = em.createNativeQuery(queryStr, OcCustomerReward.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRewards");
        return Response.serverError().entity("query string NOT FOUND getRewards").build();
      }

   

      List<OcCustomerReward> list = (List<OcCustomerReward>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRewards");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRewards").build();
      }
      for (OcCustomerReward o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteTransaction() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteTransaction");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteTransaction");
        return Response.serverError().entity("query string NOT FOUND deleteTransaction").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response addHistory() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addHistory");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addHistory");
        return Response.serverError().entity("query string NOT FOUND addHistory").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response deleteLoginAttempts() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLoginAttempts");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLoginAttempts");
        return Response.serverError().entity("query string NOT FOUND deleteLoginAttempts").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getTotalIps() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalIps");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalIps");
        return Response.serverError().entity("query string NOT FOUND getTotalIps").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalIps");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalIps").build();
      }
      for (Object[] o : list) {
        array.add(GettotalipsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addCustomer() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomer");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomer");
        return Response.serverError().entity("query string NOT FOUND addCustomer").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getTotalHistories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalHistories");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalHistories");
        return Response.serverError().entity("query string NOT FOUND getTotalHistories").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalHistories").build();
      }
      for (Object[] o : list) {
        array.add(GettotalhistoriesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalRewards() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalRewards");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalRewards");
        return Response.serverError().entity("query string NOT FOUND getTotalRewards").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalRewards");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalRewards").build();
      }
      for (Object[] o : list) {
        array.add(GettotalrewardsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCustomersAwaitingApproval() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersAwaitingApproval");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersAwaitingApproval");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersAwaitingApproval").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersAwaitingApproval");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersAwaitingApproval").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomersawaitingapprovalDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteReward() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReward");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReward");
        return Response.serverError().entity("query string NOT FOUND deleteReward").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getRewardTotal(  Integer Points) {
    JsonArray array = new JsonArray();

    if (null == Points ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getRewardTotal");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRewardTotal");
        return Response.serverError().entity("query string NOT FOUND getRewardTotal").build();
      }

        query.setParameter("Points", Points); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRewardTotal");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRewardTotal").build();
      }
      for (Object[] o : list) {
        array.add(GetrewardtotalDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCustomersByCustomerGroupId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByCustomerGroupId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByCustomerGroupId");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByCustomerGroupId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByCustomerGroupId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByCustomerGroupId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomersbycustomergroupidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getAddress() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddress");

      Query query = em.createNativeQuery(queryStr, OcAddress.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddress");
        return Response.serverError().entity("query string NOT FOUND getAddress").build();
      }

   

      List<OcAddress> list = (List<OcAddress>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddress");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddress").build();
      }
      for (OcAddress o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addTransaction() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addTransaction");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addTransaction");
        return Response.serverError().entity("query string NOT FOUND addTransaction").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getAddresses(  Integer AddressId) {
    JsonArray array = new JsonArray();

    if (null == AddressId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getAddresses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddresses");
        return Response.serverError().entity("query string NOT FOUND getAddresses").build();
      }

        query.setParameter("AddressId", AddressId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddresses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddresses").build();
      }
      for (Object[] o : list) {
        array.add(GetaddressesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalAddressesByCustomerId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAddressesByCustomerId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAddressesByCustomerId");
        return Response.serverError().entity("query string NOT FOUND getTotalAddressesByCustomerId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAddressesByCustomerId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAddressesByCustomerId").build();
      }
      for (Object[] o : list) {
        array.add(GettotaladdressesbycustomeridDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalAddressesByCountryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAddressesByCountryId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAddressesByCountryId");
        return Response.serverError().entity("query string NOT FOUND getTotalAddressesByCountryId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAddressesByCountryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAddressesByCountryId").build();
      }
      for (Object[] o : list) {
        array.add(GettotaladdressesbycountryidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addCustomer1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomer1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomer1");
        return Response.serverError().entity("query string NOT FOUND addCustomer1").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response addCustomer2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomer2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomer2");
        return Response.serverError().entity("query string NOT FOUND addCustomer2").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response editToken() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editToken");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editToken");
        return Response.serverError().entity("query string NOT FOUND editToken").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getTotalCustomerRewardsByOrderId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomerRewardsByOrderId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomerRewardsByOrderId");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomerRewardsByOrderId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomerRewardsByOrderId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomerRewardsByOrderId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomerrewardsbyorderidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTransactions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTransactions");

      Query query = em.createNativeQuery(queryStr, OcCustomerTransaction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTransactions");
        return Response.serverError().entity("query string NOT FOUND getTransactions").build();
      }

   

      List<OcCustomerTransaction> list = (List<OcCustomerTransaction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTransactions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTransactions").build();
      }
      for (OcCustomerTransaction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomer() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomer");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomer");
        return Response.serverError().entity("query string NOT FOUND deleteCustomer").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getCustomerByEmail() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomerByEmail");

      Query query = em.createNativeQuery(queryStr, OcCustomer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerByEmail");
        return Response.serverError().entity("query string NOT FOUND getCustomerByEmail").build();
      }

   

      List<OcCustomer> list = (List<OcCustomer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerByEmail");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerByEmail").build();
      }
      for (OcCustomer o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCustomersByIp() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByIp");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByIp");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByIp").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByIp");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByIp").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomersbyipDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTransactionTotal(  Long Amount) {
    JsonArray array = new JsonArray();

    if (null == Amount ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTransactionTotal");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTransactionTotal");
        return Response.serverError().entity("query string NOT FOUND getTransactionTotal").build();
      }

        query.setParameter("Amount", Amount); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTransactionTotal");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTransactionTotal").build();
      }
      for (Object[] o : list) {
        array.add(GettransactiontotalDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalTransactions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTransactions");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTransactions");
        return Response.serverError().entity("query string NOT FOUND getTotalTransactions").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTransactions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTransactions").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltransactionsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomer() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomer");

      Query query = em.createNativeQuery(queryStr, OcCustomer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomer");
        return Response.serverError().entity("query string NOT FOUND getCustomer").build();
      }

   

      List<OcCustomer> list = (List<OcCustomer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomer");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomer").build();
      }
      for (OcCustomer o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addReward() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReward");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReward");
        return Response.serverError().entity("query string NOT FOUND addReward").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response approve() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("approve");

      if (null == queryStr) {
        logger.error("query string NOT FOUND approve");
        return Response.serverError().entity("query string NOT FOUND approve").build();
      }

      Map<String, Object> map = new HashMap<String, Object>();
   


      result = DAOUtils.updateByQuery(em, queryStr, map);

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(result).build();
  }

  public Response getTotalLoginAttempts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalLoginAttempts");

      Query query = em.createNativeQuery(queryStr, OcCustomerLogin.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalLoginAttempts");
        return Response.serverError().entity("query string NOT FOUND getTotalLoginAttempts").build();
      }

   

      List<OcCustomerLogin> list = (List<OcCustomerLogin>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalLoginAttempts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalLoginAttempts").build();
      }
      for (OcCustomerLogin o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getHistories(  String Comment) {
    JsonArray array = new JsonArray();

    if (null == Comment ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getHistories");

      Query query = em.createNativeQuery(queryStr, OcCustomerHistory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getHistories");
        return Response.serverError().entity("query string NOT FOUND getHistories").build();
      }

        query.setParameter("Comment", Comment); 

      List<OcCustomerHistory> list = (List<OcCustomerHistory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getHistories").build();
      }
      for (OcCustomerHistory o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getIps() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getIps");

      Query query = em.createNativeQuery(queryStr, OcCustomerIp.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getIps");
        return Response.serverError().entity("query string NOT FOUND getIps").build();
      }

   

      List<OcCustomerIp> list = (List<OcCustomerIp>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getIps");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getIps").build();
      }
      for (OcCustomerIp o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalTransactionsByOrderId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTransactionsByOrderId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTransactionsByOrderId");
        return Response.serverError().entity("query string NOT FOUND getTotalTransactionsByOrderId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTransactionsByOrderId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTransactionsByOrderId").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltransactionsbyorderidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}