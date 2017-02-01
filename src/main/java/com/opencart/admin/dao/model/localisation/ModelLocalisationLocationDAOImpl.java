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

public class ModelLocalisationLocationDAOImpl implements ModelLocalisationLocationDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationLocationDAOImpl.class);

  @Inject EntityManager em;

  public Response deleteLocation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLocation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLocation");
        return Response.serverError().entity("query string NOT FOUND deleteLocation").build();
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

  public Response getLocation() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLocation");

      Query query = em.createNativeQuery(queryStr, OcLocation.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLocation");
        return Response.serverError().entity("query string NOT FOUND getLocation").build();
      }

   

      List<OcLocation> list = (List<OcLocation>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLocation");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLocation").build();
      }
      for (OcLocation o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editLocation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLocation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLocation");
        return Response.serverError().entity("query string NOT FOUND editLocation").build();
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

  public Response addLocation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLocation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLocation");
        return Response.serverError().entity("query string NOT FOUND addLocation").build();
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

  public Response getTotalLocations() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalLocations");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalLocations");
        return Response.serverError().entity("query string NOT FOUND getTotalLocations").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalLocations");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalLocations").build();
      }
      for (Object[] o : list) {
        array.add(GettotallocationsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}