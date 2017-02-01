package com.opencart.admin.dao.model.sale;
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

public class ModelSaleReturnDAOImpl implements ModelSaleReturnDAO {
  private Log logger = LogFactory.getLog(ModelSaleReturnDAOImpl.class);

  @Inject EntityManager em;

  public Response getReturn() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReturn");

      Query query = em.createNativeQuery(queryStr, OcReturn.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturn");
        return Response.serverError().entity("query string NOT FOUND getReturn").build();
      }

   

      List<OcReturn> list = (List<OcReturn>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturn");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturn").build();
      }
      for (OcReturn o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalReturnHistoriesByReturnStatusId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnHistoriesByReturnStatusId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnHistoriesByReturnStatusId");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnHistoriesByReturnStatusId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnHistoriesByReturnStatusId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnHistoriesByReturnStatusId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnhistoriesbyreturnstatusidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalReturnsByReturnActionId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnsByReturnActionId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnsByReturnActionId");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnsByReturnActionId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnsByReturnActionId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnsByReturnActionId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnsbyreturnactionidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editReturn() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReturn");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReturn");
        return Response.serverError().entity("query string NOT FOUND editReturn").build();
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

  public Response addReturnHistory2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addReturnHistory2");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnHistory2");
        return Response.serverError().entity("query string NOT FOUND addReturnHistory2").build();
      }

   

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addReturnHistory2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addReturnHistory2").build();
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

  public Response addReturnHistory1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnHistory1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnHistory1");
        return Response.serverError().entity("query string NOT FOUND addReturnHistory1").build();
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

  public Response deleteReturn() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReturn");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReturn");
        return Response.serverError().entity("query string NOT FOUND deleteReturn").build();
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

  public Response deleteReturn1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReturn1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReturn1");
        return Response.serverError().entity("query string NOT FOUND deleteReturn1").build();
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

  public Response addReturnHistory() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReturnHistory");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReturnHistory");
        return Response.serverError().entity("query string NOT FOUND addReturnHistory").build();
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

  public Response getTotalReturnsByReturnReasonId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnsByReturnReasonId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnsByReturnReasonId");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnsByReturnReasonId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnsByReturnReasonId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnsByReturnReasonId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnsbyreturnreasonidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalReturnsByReturnStatusId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnsByReturnStatusId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnsByReturnStatusId");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnsByReturnStatusId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnsByReturnStatusId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnsByReturnStatusId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnsbyreturnstatusidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalReturnHistories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReturnHistories");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReturnHistories");
        return Response.serverError().entity("query string NOT FOUND getTotalReturnHistories").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReturnHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReturnHistories").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreturnhistoriesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}