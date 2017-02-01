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

public class ModelLocalisationStockStatusDAOImpl implements ModelLocalisationStockStatusDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationStockStatusDAOImpl.class);

  @Inject EntityManager em;

  public Response editStockStatus1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editStockStatus1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editStockStatus1");
        return Response.serverError().entity("query string NOT FOUND editStockStatus1").build();
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

  public Response addStockStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addStockStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addStockStatus");
        return Response.serverError().entity("query string NOT FOUND addStockStatus").build();
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

  public Response deleteStockStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteStockStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteStockStatus");
        return Response.serverError().entity("query string NOT FOUND deleteStockStatus").build();
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

  public Response editStockStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editStockStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editStockStatus");
        return Response.serverError().entity("query string NOT FOUND editStockStatus").build();
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

  public Response getStockStatus() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getStockStatus");

      Query query = em.createNativeQuery(queryStr, OcStockStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getStockStatus");
        return Response.serverError().entity("query string NOT FOUND getStockStatus").build();
      }

   

      List<OcStockStatus> list = (List<OcStockStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getStockStatus");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getStockStatus").build();
      }
      for (OcStockStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addStockStatus1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addStockStatus1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addStockStatus1");
        return Response.serverError().entity("query string NOT FOUND addStockStatus1").build();
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

  public Response getStockStatuses(  Integer StockStatusId) {
    JsonArray array = new JsonArray();

    if (null == StockStatusId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getStockStatuses");

      Query query = em.createNativeQuery(queryStr, OcStockStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getStockStatuses");
        return Response.serverError().entity("query string NOT FOUND getStockStatuses").build();
      }

        query.setParameter("StockStatusId", StockStatusId); 

      List<OcStockStatus> list = (List<OcStockStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getStockStatuses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getStockStatuses").build();
      }
      for (OcStockStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStockStatuses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStockStatuses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStockStatuses");
        return Response.serverError().entity("query string NOT FOUND getTotalStockStatuses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStockStatuses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStockStatuses").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstockstatusesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getStockStatusDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getStockStatusDescriptions");

      Query query = em.createNativeQuery(queryStr, OcStockStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getStockStatusDescriptions");
        return Response.serverError().entity("query string NOT FOUND getStockStatusDescriptions").build();
      }

   

      List<OcStockStatus> list = (List<OcStockStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getStockStatusDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getStockStatusDescriptions").build();
      }
      for (OcStockStatus o : list) {
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