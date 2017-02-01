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

public class ModelLocalisationReturnReasonDAOImpl implements ModelLocalisationReturnReasonDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationReturnReasonDAOImpl.class);

  @Inject EntityManager em;

  public Response addReturnReason1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnReason1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnReason1");
        return Response.serverError().entity("query string NOT FOUND addReturnReason1").build();
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

  public Response addReturnReason() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnReason");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnReason");
        return Response.serverError().entity("query string NOT FOUND addReturnReason").build();
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

  public Response deleteReturnReason() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReturnReason");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReturnReason");
        return Response.serverError().entity("query string NOT FOUND deleteReturnReason").build();
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

  public Response editReturnReason() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturnReason");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturnReason");
        return Response.serverError().entity("query string NOT FOUND editReturnReason").build();
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

  public Response getReturnReasons(  Integer ReturnReasonId) {
    JsonArray array = new JsonArray();

    if (null == ReturnReasonId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturnReasons");

      Query query = em.createNativeQuery(queryStr, OcReturnReason.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnReasons");
        return Response.serverError().entity("query string NOT FOUND getReturnReasons").build();
      }

        query.setParameter("ReturnReasonId", ReturnReasonId); 

      List<OcReturnReason> list = (List<OcReturnReason>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnReasons");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnReasons").build();
      }
      for (OcReturnReason o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalReturnReasons() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnReasons");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnReasons");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnReasons").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnReasons");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnReasons").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnreasonsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getReturnReasonDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturnReasonDescriptions");

      Query query = em.createNativeQuery(queryStr, OcReturnReason.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnReasonDescriptions");
        return Response.serverError().entity("query string NOT FOUND getReturnReasonDescriptions").build();
      }

   

      List<OcReturnReason> list = (List<OcReturnReason>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnReasonDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnReasonDescriptions").build();
      }
      for (OcReturnReason o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getReturnReason() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturnReason");

      Query query = em.createNativeQuery(queryStr, OcReturnReason.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnReason");
        return Response.serverError().entity("query string NOT FOUND getReturnReason").build();
      }

   

      List<OcReturnReason> list = (List<OcReturnReason>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnReason");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnReason").build();
      }
      for (OcReturnReason o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editReturnReason1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturnReason1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturnReason1");
        return Response.serverError().entity("query string NOT FOUND editReturnReason1").build();
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