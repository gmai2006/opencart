package com.opencart.catalog.dao.model.account;
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

public class ModelAccountCustomerDAOImpl implements ModelAccountCustomerDAO {
  private Log logger = LogFactory.getLog(ModelAccountCustomerDAOImpl.class);

  @Inject EntityManager em;

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

  public Response editCode() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCode");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCode");
        return Response.serverError().entity("query string NOT FOUND editCode").build();
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

  public Response getTotalCustomersByEmail() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByEmail");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByEmail");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByEmail").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByEmail");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByEmail").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomersbyemailDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomerByToken1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("getCustomerByToken1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerByToken1");
        return Response.serverError().entity("query string NOT FOUND getCustomerByToken1").build();
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

      Query query = em.createNativeQuery(queryStr, OcCustomerLogin.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLoginAttempts");
        return Response.serverError().entity("query string NOT FOUND getLoginAttempts").build();
      }

   

      List<OcCustomerLogin> list = (List<OcCustomerLogin>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLoginAttempts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLoginAttempts").build();
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

  public Response editNewsletter() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editNewsletter");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editNewsletter");
        return Response.serverError().entity("query string NOT FOUND editNewsletter").build();
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

  public Response getCustomerByCode(  Integer CustomerId) {
    JsonArray array = new JsonArray();

    if (null == CustomerId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getCustomerByCode");

      Query query = em.createNativeQuery(queryStr, OcCustomer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerByCode");
        return Response.serverError().entity("query string NOT FOUND getCustomerByCode").build();
      }

        query.setParameter("CustomerId", CustomerId); 

      List<OcCustomer> list = (List<OcCustomer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerByCode").build();
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

  public Response addLoginAttempt() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLoginAttempt");

      Query query = em.createNativeQuery(queryStr, OcCustomerLogin.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLoginAttempt");
        return Response.serverError().entity("query string NOT FOUND addLoginAttempt").build();
      }

   

      List<OcCustomerLogin> list = (List<OcCustomerLogin>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLoginAttempt");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLoginAttempt").build();
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

  public Response getCustomerByToken() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomerByToken");

      Query query = em.createNativeQuery(queryStr, OcCustomer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerByToken");
        return Response.serverError().entity("query string NOT FOUND getCustomerByToken").build();
      }

   

      List<OcCustomer> list = (List<OcCustomer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerByToken");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerByToken").build();
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

}