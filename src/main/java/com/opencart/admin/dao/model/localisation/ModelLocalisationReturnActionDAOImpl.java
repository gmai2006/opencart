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

public class ModelLocalisationReturnActionDAOImpl implements ModelLocalisationReturnActionDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationReturnActionDAOImpl.class);

  @Inject EntityManager em;

  public Response editReturnAction() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturnAction");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturnAction");
        return Response.serverError().entity("query string NOT FOUND editReturnAction").build();
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

  public Response editReturnAction1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturnAction1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturnAction1");
        return Response.serverError().entity("query string NOT FOUND editReturnAction1").build();
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

  public Response getTotalReturnActions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnActions");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnActions");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnActions").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnActions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnActions").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnactionsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getReturnAction() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturnAction");

      Query query = em.createNativeQuery(queryStr, OcReturnAction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnAction");
        return Response.serverError().entity("query string NOT FOUND getReturnAction").build();
      }

   

      List<OcReturnAction> list = (List<OcReturnAction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnAction");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnAction").build();
      }
      for (OcReturnAction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteReturnAction() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReturnAction");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReturnAction");
        return Response.serverError().entity("query string NOT FOUND deleteReturnAction").build();
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

  public Response getReturnActions(  Integer ReturnActionId) {
    JsonArray array = new JsonArray();

    if (null == ReturnActionId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturnActions");

      Query query = em.createNativeQuery(queryStr, OcReturnAction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnActions");
        return Response.serverError().entity("query string NOT FOUND getReturnActions").build();
      }

        query.setParameter("ReturnActionId", ReturnActionId); 

      List<OcReturnAction> list = (List<OcReturnAction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnActions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnActions").build();
      }
      for (OcReturnAction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getReturnActionDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturnActionDescriptions");

      Query query = em.createNativeQuery(queryStr, OcReturnAction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnActionDescriptions");
        return Response.serverError().entity("query string NOT FOUND getReturnActionDescriptions").build();
      }

   

      List<OcReturnAction> list = (List<OcReturnAction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnActionDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnActionDescriptions").build();
      }
      for (OcReturnAction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addReturnAction1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnAction1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnAction1");
        return Response.serverError().entity("query string NOT FOUND addReturnAction1").build();
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

  public Response addReturnAction() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnAction");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnAction");
        return Response.serverError().entity("query string NOT FOUND addReturnAction").build();
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