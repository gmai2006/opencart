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

public class ModelAccountReturnDAOImpl implements ModelAccountReturnDAO {
  private Log logger = LogFactory.getLog(ModelAccountReturnDAOImpl.class);

  @Inject EntityManager em;

  public Response getReturn(  Integer ReturnId) {
    JsonArray array = new JsonArray();

    if (null == ReturnId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturn");

      Query query = em.createNativeQuery(queryStr, OcReturnReason.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturn");
        return Response.serverError().entity("query string NOT FOUND getReturn").build();
      }

        query.setParameter("ReturnId", ReturnId); 

      List<OcReturnReason> list = (List<OcReturnReason>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturn");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturn").build();
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

  public Response getReturnHistories(  java.sql.Timestamp DateAdded) {
    JsonArray array = new JsonArray();

    if (null == DateAdded ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturnHistories");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnHistories");
        return Response.serverError().entity("query string NOT FOUND getReturnHistories").build();
      }

        query.setParameter("DateAdded", DateAdded); 

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnHistories").build();
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

  public Response getTotalReturns() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturns");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturns");
        return Response.serverError().entity("query string NOT FOUND getTotalReturns").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturns");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturns").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addReturn() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturn");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturn");
        return Response.serverError().entity("query string NOT FOUND addReturn").build();
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

  public Response getReturns(  Integer ReturnId) {
    JsonArray array = new JsonArray();

    if (null == ReturnId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturns");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturns");
        return Response.serverError().entity("query string NOT FOUND getReturns").build();
      }

        query.setParameter("ReturnId", ReturnId); 

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturns");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturns").build();
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

}