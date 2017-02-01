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

public class ModelLocalisationCountryDAOImpl implements ModelLocalisationCountryDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationCountryDAOImpl.class);

  @Inject EntityManager em;

  public Response addCountry() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCountry");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCountry");
        return Response.serverError().entity("query string NOT FOUND addCountry").build();
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

  public Response getCountries() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCountries");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCountries");
        return Response.serverError().entity("query string NOT FOUND getCountries").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCountries");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCountries").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCountry() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCountry");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCountry");
        return Response.serverError().entity("query string NOT FOUND getCountry").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCountry");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCountry").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCountry() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCountry");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCountry");
        return Response.serverError().entity("query string NOT FOUND editCountry").build();
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

  public Response deleteCountry() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCountry");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCountry");
        return Response.serverError().entity("query string NOT FOUND deleteCountry").build();
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

  public Response getTotalCountries() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCountries");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCountries");
        return Response.serverError().entity("query string NOT FOUND getTotalCountries").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCountries");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCountries").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcountriesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}