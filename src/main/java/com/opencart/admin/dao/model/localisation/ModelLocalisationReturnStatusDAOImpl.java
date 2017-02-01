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

public class ModelLocalisationReturnStatusDAOImpl implements ModelLocalisationReturnStatusDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationReturnStatusDAOImpl.class);

  @Inject EntityManager em;

  public Response addReturnStatus1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnStatus1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnStatus1");
        return Response.serverError().entity("query string NOT FOUND addReturnStatus1").build();
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

  public Response getReturnStatusDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturnStatusDescriptions");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnStatusDescriptions");
        return Response.serverError().entity("query string NOT FOUND getReturnStatusDescriptions").build();
      }

   

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnStatusDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnStatusDescriptions").build();
      }
      for (OcReturnStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editReturnStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturnStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturnStatus");
        return Response.serverError().entity("query string NOT FOUND editReturnStatus").build();
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

  public Response getReturnStatus() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturnStatus");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnStatus");
        return Response.serverError().entity("query string NOT FOUND getReturnStatus").build();
      }

   

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnStatus");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnStatus").build();
      }
      for (OcReturnStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getReturnStatuses(  Integer ReturnStatusId) {
    JsonArray array = new JsonArray();

    if (null == ReturnStatusId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturnStatuses");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnStatuses");
        return Response.serverError().entity("query string NOT FOUND getReturnStatuses").build();
      }

        query.setParameter("ReturnStatusId", ReturnStatusId); 

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnStatuses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnStatuses").build();
      }
      for (OcReturnStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addReturnStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnStatus");
        return Response.serverError().entity("query string NOT FOUND addReturnStatus").build();
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

  public Response editReturnStatus1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturnStatus1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturnStatus1");
        return Response.serverError().entity("query string NOT FOUND editReturnStatus1").build();
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

  public Response getTotalReturnStatuses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnStatuses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnStatuses");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnStatuses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnStatuses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnStatuses").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnstatusesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteReturnStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReturnStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReturnStatus");
        return Response.serverError().entity("query string NOT FOUND deleteReturnStatus").build();
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

}