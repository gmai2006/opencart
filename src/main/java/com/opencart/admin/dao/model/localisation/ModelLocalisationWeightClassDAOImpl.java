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

public class ModelLocalisationWeightClassDAOImpl implements ModelLocalisationWeightClassDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationWeightClassDAOImpl.class);

  @Inject EntityManager em;

  public Response editWeightClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editWeightClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editWeightClass1");
        return Response.serverError().entity("query string NOT FOUND editWeightClass1").build();
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

  public Response getTotalWeightClasses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalWeightClasses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalWeightClasses");
        return Response.serverError().entity("query string NOT FOUND getTotalWeightClasses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalWeightClasses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalWeightClasses").build();
      }
      for (Object[] o : list) {
        array.add(GettotalweightclassesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteWeightClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteWeightClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteWeightClass");
        return Response.serverError().entity("query string NOT FOUND deleteWeightClass").build();
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

  public Response getWeightClassDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getWeightClassDescriptions");

      Query query = em.createNativeQuery(queryStr, OcWeightClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getWeightClassDescriptions");
        return Response.serverError().entity("query string NOT FOUND getWeightClassDescriptions").build();
      }

   

      List<OcWeightClassDescription> list = (List<OcWeightClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getWeightClassDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getWeightClassDescriptions").build();
      }
      for (OcWeightClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteWeightClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteWeightClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteWeightClass1");
        return Response.serverError().entity("query string NOT FOUND deleteWeightClass1").build();
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

  public Response getWeightClassDescriptionByUnit() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getWeightClassDescriptionByUnit");

      Query query = em.createNativeQuery(queryStr, OcWeightClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getWeightClassDescriptionByUnit");
        return Response.serverError().entity("query string NOT FOUND getWeightClassDescriptionByUnit").build();
      }

   

      List<OcWeightClassDescription> list = (List<OcWeightClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getWeightClassDescriptionByUnit");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getWeightClassDescriptionByUnit").build();
      }
      for (OcWeightClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addWeightClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addWeightClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addWeightClass1");
        return Response.serverError().entity("query string NOT FOUND addWeightClass1").build();
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

  public Response editWeightClass2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editWeightClass2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editWeightClass2");
        return Response.serverError().entity("query string NOT FOUND editWeightClass2").build();
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

  public Response addWeightClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addWeightClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addWeightClass");
        return Response.serverError().entity("query string NOT FOUND addWeightClass").build();
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

  public Response editWeightClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editWeightClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editWeightClass");
        return Response.serverError().entity("query string NOT FOUND editWeightClass").build();
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

  public Response getWeightClass() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getWeightClass");

      Query query = em.createNativeQuery(queryStr, OcWeightClass.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getWeightClass");
        return Response.serverError().entity("query string NOT FOUND getWeightClass").build();
      }

   

      List<OcWeightClass> list = (List<OcWeightClass>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getWeightClass");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getWeightClass").build();
      }
      for (OcWeightClass o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getWeightClasses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getWeightClasses");

      Query query = em.createNativeQuery(queryStr, OcWeightClass.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getWeightClasses");
        return Response.serverError().entity("query string NOT FOUND getWeightClasses").build();
      }

   

      List<OcWeightClass> list = (List<OcWeightClass>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getWeightClasses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getWeightClasses").build();
      }
      for (OcWeightClass o : list) {
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