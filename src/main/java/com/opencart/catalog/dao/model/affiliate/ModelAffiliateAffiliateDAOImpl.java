package com.opencart.catalog.dao.model.affiliate;
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

import com.opencart.catalog.model.*;

public class ModelAffiliateAffiliateDAOImpl implements ModelAffiliateAffiliateDAO {
  private Log logger = LogFactory.getLog(ModelAffiliateAffiliateDAOImpl.class);

  @Inject EntityManager em;

  public Response addLoginAttempt1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLoginAttempt1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLoginAttempt1");
        return Response.serverError().entity("query string NOT FOUND addLoginAttempt1").build();
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

  public Response editPayment() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editPayment");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editPayment");
        return Response.serverError().entity("query string NOT FOUND editPayment").build();
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

  public Response addLoginAttempt2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLoginAttempt2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLoginAttempt2");
        return Response.serverError().entity("query string NOT FOUND addLoginAttempt2").build();
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

  public Response getTotalAffiliatesByEmail() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAffiliatesByEmail");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAffiliatesByEmail");
        return Response.serverError().entity("query string NOT FOUND getTotalAffiliatesByEmail").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAffiliatesByEmail");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAffiliatesByEmail").build();
      }
      for (Object[] o : list) {
        array.add(GettotalaffiliatesbyemailDTO.fromArray(o).toJson());
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

  public Response editPassword() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editPassword");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editPassword");
        return Response.serverError().entity("query string NOT FOUND editPassword").build();
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

  public Response getLoginAttempts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLoginAttempts");

      Query query = em.createNativeQuery(queryStr, OcAffiliateLogin.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLoginAttempts");
        return Response.serverError().entity("query string NOT FOUND getLoginAttempts").build();
      }

   

      List<OcAffiliateLogin> list = (List<OcAffiliateLogin>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLoginAttempts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLoginAttempts").build();
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

  public Response addLoginAttempt() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLoginAttempt");

      Query query = em.createNativeQuery(queryStr, OcAffiliateLogin.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLoginAttempt");
        return Response.serverError().entity("query string NOT FOUND addLoginAttempt").build();
      }

   

      List<OcAffiliateLogin> list = (List<OcAffiliateLogin>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLoginAttempt");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLoginAttempt").build();
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