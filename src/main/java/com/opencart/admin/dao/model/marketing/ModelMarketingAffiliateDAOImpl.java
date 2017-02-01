package com.opencart.admin.dao.model.marketing;
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

public class ModelMarketingAffiliateDAOImpl implements ModelMarketingAffiliateDAO {
  private Log logger = LogFactory.getLog(ModelMarketingAffiliateDAOImpl.class);

  @Inject EntityManager em;

  public Response getTransactions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTransactions");

      Query query = em.createNativeQuery(queryStr, OcAffiliateTransaction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTransactions");
        return Response.serverError().entity("query string NOT FOUND getTransactions").build();
      }

   

      List<OcAffiliateTransaction> list = (List<OcAffiliateTransaction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTransactions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTransactions").build();
      }
      for (OcAffiliateTransaction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteAffiliate2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAffiliate2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAffiliate2");
        return Response.serverError().entity("query string NOT FOUND deleteAffiliate2").build();
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

  public Response getAffiliateByEmail() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAffiliateByEmail");

      Query query = em.createNativeQuery(queryStr, OcAffiliate.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAffiliateByEmail");
        return Response.serverError().entity("query string NOT FOUND getAffiliateByEmail").build();
      }

   

      List<OcAffiliate> list = (List<OcAffiliate>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAffiliateByEmail");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAffiliateByEmail").build();
      }
      for (OcAffiliate o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getAffiliate() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAffiliate");

      Query query = em.createNativeQuery(queryStr, OcAffiliate.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAffiliate");
        return Response.serverError().entity("query string NOT FOUND getAffiliate").build();
      }

   

      List<OcAffiliate> list = (List<OcAffiliate>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAffiliate");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAffiliate").build();
      }
      for (OcAffiliate o : list) {
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

  public Response editAffiliate() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAffiliate");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAffiliate");
        return Response.serverError().entity("query string NOT FOUND editAffiliate").build();
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

  public Response getTotalAffiliatesByCountryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAffiliatesByCountryId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAffiliatesByCountryId");
        return Response.serverError().entity("query string NOT FOUND getTotalAffiliatesByCountryId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAffiliatesByCountryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAffiliatesByCountryId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalaffiliatesbycountryidDTO.fromArray(o).toJson());
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

  public Response getAffiliatesByNewsletter() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAffiliatesByNewsletter");

      Query query = em.createNativeQuery(queryStr, OcAffiliate.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAffiliatesByNewsletter");
        return Response.serverError().entity("query string NOT FOUND getAffiliatesByNewsletter").build();
      }

   

      List<OcAffiliate> list = (List<OcAffiliate>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAffiliatesByNewsletter");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAffiliatesByNewsletter").build();
      }
      for (OcAffiliate o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteAffiliate() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAffiliate");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAffiliate");
        return Response.serverError().entity("query string NOT FOUND deleteAffiliate").build();
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

  public Response editAffiliate1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAffiliate1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAffiliate1");
        return Response.serverError().entity("query string NOT FOUND editAffiliate1").build();
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

  public Response addAffiliate() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAffiliate");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAffiliate");
        return Response.serverError().entity("query string NOT FOUND addAffiliate").build();
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

      Query query = em.createNativeQuery(queryStr, OcAffiliateLogin.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalLoginAttempts");
        return Response.serverError().entity("query string NOT FOUND getTotalLoginAttempts").build();
      }

   

      List<OcAffiliateLogin> list = (List<OcAffiliateLogin>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalLoginAttempts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalLoginAttempts").build();
      }
      for (OcAffiliateLogin o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteAffiliate1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAffiliate1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAffiliate1");
        return Response.serverError().entity("query string NOT FOUND deleteAffiliate1").build();
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

  public Response getTotalAffiliatesByZoneId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAffiliatesByZoneId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAffiliatesByZoneId");
        return Response.serverError().entity("query string NOT FOUND getTotalAffiliatesByZoneId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAffiliatesByZoneId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAffiliatesByZoneId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalaffiliatesbyzoneidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalAffiliatesAwaitingApproval() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAffiliatesAwaitingApproval");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAffiliatesAwaitingApproval");
        return Response.serverError().entity("query string NOT FOUND getTotalAffiliatesAwaitingApproval").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAffiliatesAwaitingApproval");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAffiliatesAwaitingApproval").build();
      }
      for (Object[] o : list) {
        array.add(GettotalaffiliatesawaitingapprovalDTO.fromArray(o).toJson());
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

  public Response getAffiliateByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAffiliateByCode");

      Query query = em.createNativeQuery(queryStr, OcAffiliate.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAffiliateByCode");
        return Response.serverError().entity("query string NOT FOUND getAffiliateByCode").build();
      }

   

      List<OcAffiliate> list = (List<OcAffiliate>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAffiliateByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAffiliateByCode").build();
      }
      for (OcAffiliate o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}