package com.opencart.admin.dao.model.user;
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

public class ModelUserApiDAOImpl implements ModelUserApiDAO {
  private Log logger = LogFactory.getLog(ModelUserApiDAOImpl.class);

  @Inject EntityManager em;

  public Response deleteApiSession() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteApiSession");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteApiSession");
        return Response.serverError().entity("query string NOT FOUND deleteApiSession").build();
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

  public Response editApi() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editApi");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editApi");
        return Response.serverError().entity("query string NOT FOUND editApi").build();
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

  public Response addApiSession() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addApiSession");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addApiSession");
        return Response.serverError().entity("query string NOT FOUND addApiSession").build();
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

  public Response getApiSessions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getApiSessions");

      Query query = em.createNativeQuery(queryStr, OcApiSession.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getApiSessions");
        return Response.serverError().entity("query string NOT FOUND getApiSessions").build();
      }

   

      List<OcApiSession> list = (List<OcApiSession>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getApiSessions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getApiSessions").build();
      }
      for (OcApiSession o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getApi() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getApi");

      Query query = em.createNativeQuery(queryStr, OcApi.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getApi");
        return Response.serverError().entity("query string NOT FOUND getApi").build();
      }

   

      List<OcApi> list = (List<OcApi>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getApi");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getApi").build();
      }
      for (OcApi o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addApi() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addApi");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addApi");
        return Response.serverError().entity("query string NOT FOUND addApi").build();
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

  public Response addApiIp() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addApiIp");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addApiIp");
        return Response.serverError().entity("query string NOT FOUND addApiIp").build();
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

  public Response getApiIps() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getApiIps");

      Query query = em.createNativeQuery(queryStr, OcApiIp.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getApiIps");
        return Response.serverError().entity("query string NOT FOUND getApiIps").build();
      }

   

      List<OcApiIp> list = (List<OcApiIp>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getApiIps");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getApiIps").build();
      }
      for (OcApiIp o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteApi() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteApi");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteApi");
        return Response.serverError().entity("query string NOT FOUND deleteApi").build();
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

  public Response editApi1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editApi1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editApi1");
        return Response.serverError().entity("query string NOT FOUND editApi1").build();
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

  public Response editApi2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editApi2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editApi2");
        return Response.serverError().entity("query string NOT FOUND editApi2").build();
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

  public Response addApi1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addApi1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addApi1");
        return Response.serverError().entity("query string NOT FOUND addApi1").build();
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

  public Response getTotalApis() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalApis");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalApis");
        return Response.serverError().entity("query string NOT FOUND getTotalApis").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalApis");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalApis").build();
      }
      for (Object[] o : list) {
        array.add(GettotalapisDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}