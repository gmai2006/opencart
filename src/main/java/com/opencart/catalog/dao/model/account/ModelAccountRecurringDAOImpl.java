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

public class ModelAccountRecurringDAOImpl implements ModelAccountRecurringDAO {
  private Log logger = LogFactory.getLog(ModelAccountRecurringDAOImpl.class);

  @Inject EntityManager em;

  public Response addOrderRecurringTransaction() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderRecurringTransaction");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderRecurringTransaction");
        return Response.serverError().entity("query string NOT FOUND addOrderRecurringTransaction").build();
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

  public Response getOrderRecurringTransactions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderRecurringTransactions");

      Query query = em.createNativeQuery(queryStr, OcOrderRecurringTransaction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderRecurringTransactions");
        return Response.serverError().entity("query string NOT FOUND getOrderRecurringTransactions").build();
      }

   

      List<OcOrderRecurringTransaction> list = (List<OcOrderRecurringTransaction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderRecurringTransactions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderRecurringTransactions").build();
      }
      for (OcOrderRecurringTransaction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOrderRecurrings() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderRecurrings");

      Query query = em.createNativeQuery(queryStr, OcOrderRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderRecurrings");
        return Response.serverError().entity("query string NOT FOUND getOrderRecurrings").build();
      }

   

      List<OcOrderRecurring> list = (List<OcOrderRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderRecurrings");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderRecurrings").build();
      }
      for (OcOrderRecurring o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOrderRecurringByReference() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderRecurringByReference");

      Query query = em.createNativeQuery(queryStr, OcOrderRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderRecurringByReference");
        return Response.serverError().entity("query string NOT FOUND getOrderRecurringByReference").build();
      }

   

      List<OcOrderRecurring> list = (List<OcOrderRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderRecurringByReference");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderRecurringByReference").build();
      }
      for (OcOrderRecurring o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOrderRecurring() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderRecurring");

      Query query = em.createNativeQuery(queryStr, OcOrderRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderRecurring");
        return Response.serverError().entity("query string NOT FOUND getOrderRecurring").build();
      }

   

      List<OcOrderRecurring> list = (List<OcOrderRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderRecurring");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderRecurring").build();
      }
      for (OcOrderRecurring o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrderRecurrings() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrderRecurrings");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrderRecurrings");
        return Response.serverError().entity("query string NOT FOUND getTotalOrderRecurrings").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrderRecurrings");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrderRecurrings").build();
      }
      for (Object[] o : list) {
        array.add(GettotalorderrecurringsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOrderRecurringStatus() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrderRecurringStatus");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrderRecurringStatus");
        return Response.serverError().entity("query string NOT FOUND editOrderRecurringStatus").build();
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