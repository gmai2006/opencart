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

public class ModelLocalisationGeoZoneDAOImpl implements ModelLocalisationGeoZoneDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationGeoZoneDAOImpl.class);

  @Inject EntityManager em;

  public Response addGeoZone() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addGeoZone");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addGeoZone");
        return Response.serverError().entity("query string NOT FOUND addGeoZone").build();
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

  public Response getGeoZone() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getGeoZone");

      Query query = em.createNativeQuery(queryStr, OcGeoZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getGeoZone");
        return Response.serverError().entity("query string NOT FOUND getGeoZone").build();
      }

   

      List<OcGeoZone> list = (List<OcGeoZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getGeoZone");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getGeoZone").build();
      }
      for (OcGeoZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editGeoZone3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editGeoZone3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editGeoZone3");
        return Response.serverError().entity("query string NOT FOUND editGeoZone3").build();
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

  public Response editGeoZone() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editGeoZone");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editGeoZone");
        return Response.serverError().entity("query string NOT FOUND editGeoZone").build();
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

  public Response getTotalGeoZones() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalGeoZones");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalGeoZones");
        return Response.serverError().entity("query string NOT FOUND getTotalGeoZones").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalGeoZones");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalGeoZones").build();
      }
      for (Object[] o : list) {
        array.add(GettotalgeozonesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalZoneToGeoZoneByZoneId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalZoneToGeoZoneByZoneId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalZoneToGeoZoneByZoneId");
        return Response.serverError().entity("query string NOT FOUND getTotalZoneToGeoZoneByZoneId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalZoneToGeoZoneByZoneId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalZoneToGeoZoneByZoneId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalzonetogeozonebyzoneidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editGeoZone1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editGeoZone1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editGeoZone1");
        return Response.serverError().entity("query string NOT FOUND editGeoZone1").build();
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

  public Response getGeoZones() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getGeoZones");

      Query query = em.createNativeQuery(queryStr, OcGeoZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getGeoZones");
        return Response.serverError().entity("query string NOT FOUND getGeoZones").build();
      }

   

      List<OcGeoZone> list = (List<OcGeoZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getGeoZones");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getGeoZones").build();
      }
      for (OcGeoZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editGeoZone2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editGeoZone2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editGeoZone2");
        return Response.serverError().entity("query string NOT FOUND editGeoZone2").build();
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

  public Response addGeoZone2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addGeoZone2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addGeoZone2");
        return Response.serverError().entity("query string NOT FOUND addGeoZone2").build();
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

  public Response getZoneToGeoZones() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getZoneToGeoZones");

      Query query = em.createNativeQuery(queryStr, OcZoneToGeoZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getZoneToGeoZones");
        return Response.serverError().entity("query string NOT FOUND getZoneToGeoZones").build();
      }

   

      List<OcZoneToGeoZone> list = (List<OcZoneToGeoZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getZoneToGeoZones");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getZoneToGeoZones").build();
      }
      for (OcZoneToGeoZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalZoneToGeoZoneByGeoZoneId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalZoneToGeoZoneByGeoZoneId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalZoneToGeoZoneByGeoZoneId");
        return Response.serverError().entity("query string NOT FOUND getTotalZoneToGeoZoneByGeoZoneId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalZoneToGeoZoneByGeoZoneId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalZoneToGeoZoneByGeoZoneId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalzonetogeozonebygeozoneidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addGeoZone1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addGeoZone1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addGeoZone1");
        return Response.serverError().entity("query string NOT FOUND addGeoZone1").build();
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

  public Response deleteGeoZone1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteGeoZone1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteGeoZone1");
        return Response.serverError().entity("query string NOT FOUND deleteGeoZone1").build();
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

  public Response getTotalZoneToGeoZoneByCountryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalZoneToGeoZoneByCountryId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalZoneToGeoZoneByCountryId");
        return Response.serverError().entity("query string NOT FOUND getTotalZoneToGeoZoneByCountryId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalZoneToGeoZoneByCountryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalZoneToGeoZoneByCountryId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalzonetogeozonebycountryidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteGeoZone() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteGeoZone");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteGeoZone");
        return Response.serverError().entity("query string NOT FOUND deleteGeoZone").build();
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