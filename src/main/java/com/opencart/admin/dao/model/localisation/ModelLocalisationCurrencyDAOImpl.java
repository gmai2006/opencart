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

public class ModelLocalisationCurrencyDAOImpl implements ModelLocalisationCurrencyDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationCurrencyDAOImpl.class);

  @Inject EntityManager em;

  public Response getCurrency() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCurrency");

      Query query = em.createNativeQuery(queryStr, OcCurrency.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCurrency");
        return Response.serverError().entity("query string NOT FOUND getCurrency").build();
      }

   

      List<OcCurrency> list = (List<OcCurrency>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCurrency");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCurrency").build();
      }
      for (OcCurrency o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCurrency() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCurrency");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCurrency");
        return Response.serverError().entity("query string NOT FOUND deleteCurrency").build();
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

  public Response getCurrencies() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCurrencies");

      Query query = em.createNativeQuery(queryStr, OcCurrency.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCurrencies");
        return Response.serverError().entity("query string NOT FOUND getCurrencies").build();
      }

   

      List<OcCurrency> list = (List<OcCurrency>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCurrencies");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCurrencies").build();
      }
      for (OcCurrency o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response refresh3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("refresh3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND refresh3");
        return Response.serverError().entity("query string NOT FOUND refresh3").build();
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

  public Response refresh2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("refresh2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND refresh2");
        return Response.serverError().entity("query string NOT FOUND refresh2").build();
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

  public Response getCurrencyByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCurrencyByCode");

      Query query = em.createNativeQuery(queryStr, OcCurrency.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCurrencyByCode");
        return Response.serverError().entity("query string NOT FOUND getCurrencyByCode").build();
      }

   

      List<OcCurrency> list = (List<OcCurrency>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCurrencyByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCurrencyByCode").build();
      }
      for (OcCurrency o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCurrencies() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCurrencies");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCurrencies");
        return Response.serverError().entity("query string NOT FOUND getTotalCurrencies").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCurrencies");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCurrencies").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcurrenciesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response refresh() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("refresh");

      Query query = em.createNativeQuery(queryStr, OcCurrency.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND refresh");
        return Response.serverError().entity("query string NOT FOUND refresh").build();
      }

   

      List<OcCurrency> list = (List<OcCurrency>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for refresh");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for refresh").build();
      }
      for (OcCurrency o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response refresh1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("refresh1");

      Query query = em.createNativeQuery(queryStr, OcCurrency.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND refresh1");
        return Response.serverError().entity("query string NOT FOUND refresh1").build();
      }

   

      List<OcCurrency> list = (List<OcCurrency>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for refresh1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for refresh1").build();
      }
      for (OcCurrency o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addCurrency() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCurrency");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCurrency");
        return Response.serverError().entity("query string NOT FOUND addCurrency").build();
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

  public Response editCurrency() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCurrency");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCurrency");
        return Response.serverError().entity("query string NOT FOUND editCurrency").build();
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