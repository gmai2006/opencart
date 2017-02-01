package com.opencart.admin.dao.model.localisation;
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

public class ModelLocalisationOrderStatusDAOImpl implements ModelLocalisationOrderStatusDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationOrderStatusDAOImpl.class);

  @Inject EntityManager em;

  public Response getOrderStatuses(  Integer OrderStatusId) {
    JsonArray array = new JsonArray();

    if (null == OrderStatusId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getOrderStatuses");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderStatuses");
        return Response.serverError().entity("query string NOT FOUND getOrderStatuses").build();
      }

        query.setParameter("OrderStatusId", OrderStatusId); 

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderStatuses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderStatuses").build();
      }
      for (OcOrderStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderStatus");
        return Response.serverError().entity("query string NOT FOUND addOrderStatus").build();
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

  public Response getTotalOrderStatuses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrderStatuses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrderStatuses");
        return Response.serverError().entity("query string NOT FOUND getTotalOrderStatuses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrderStatuses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrderStatuses").build();
      }
      for (Object[] o : list) {
        array.add(GettotalorderstatusesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOrderStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrderStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrderStatus");
        return Response.serverError().entity("query string NOT FOUND editOrderStatus").build();
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

  public Response getOrderStatus() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderStatus");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderStatus");
        return Response.serverError().entity("query string NOT FOUND getOrderStatus").build();
      }

   

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderStatus");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderStatus").build();
      }
      for (OcOrderStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteOrderStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrderStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrderStatus");
        return Response.serverError().entity("query string NOT FOUND deleteOrderStatus").build();
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

  public Response editOrderStatus1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrderStatus1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrderStatus1");
        return Response.serverError().entity("query string NOT FOUND editOrderStatus1").build();
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

  public Response addOrderStatus1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderStatus1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderStatus1");
        return Response.serverError().entity("query string NOT FOUND addOrderStatus1").build();
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

  public Response getOrderStatusDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderStatusDescriptions");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderStatusDescriptions");
        return Response.serverError().entity("query string NOT FOUND getOrderStatusDescriptions").build();
      }

   

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderStatusDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderStatusDescriptions").build();
      }
      for (OcOrderStatus o : list) {
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