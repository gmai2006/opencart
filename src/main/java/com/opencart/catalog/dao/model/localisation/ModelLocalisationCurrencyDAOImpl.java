package com.opencart.catalog.dao.model.localisation;
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

public class ModelLocalisationCurrencyDAOImpl implements ModelLocalisationCurrencyDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationCurrencyDAOImpl.class);

  @Inject EntityManager em;

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

}