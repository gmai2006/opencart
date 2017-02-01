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

public class ModelLocalisationLengthClassDAOImpl implements ModelLocalisationLengthClassDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationLengthClassDAOImpl.class);

  @Inject EntityManager em;

  public Response getLengthClass() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLengthClass");

      Query query = em.createNativeQuery(queryStr, OcLengthClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLengthClass");
        return Response.serverError().entity("query string NOT FOUND getLengthClass").build();
      }

   

      List<OcLengthClassDescription> list = (List<OcLengthClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLengthClass");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLengthClass").build();
      }
      for (OcLengthClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editLengthClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLengthClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLengthClass1");
        return Response.serverError().entity("query string NOT FOUND editLengthClass1").build();
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

  public Response editLengthClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLengthClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLengthClass");
        return Response.serverError().entity("query string NOT FOUND editLengthClass").build();
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

  public Response editLengthClass2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLengthClass2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLengthClass2");
        return Response.serverError().entity("query string NOT FOUND editLengthClass2").build();
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

  public Response getLengthClassDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLengthClassDescriptions");

      Query query = em.createNativeQuery(queryStr, OcLengthClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLengthClassDescriptions");
        return Response.serverError().entity("query string NOT FOUND getLengthClassDescriptions").build();
      }

   

      List<OcLengthClassDescription> list = (List<OcLengthClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLengthClassDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLengthClassDescriptions").build();
      }
      for (OcLengthClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getLengthClassDescriptionByUnit() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLengthClassDescriptionByUnit");

      Query query = em.createNativeQuery(queryStr, OcLengthClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLengthClassDescriptionByUnit");
        return Response.serverError().entity("query string NOT FOUND getLengthClassDescriptionByUnit").build();
      }

   

      List<OcLengthClassDescription> list = (List<OcLengthClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLengthClassDescriptionByUnit");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLengthClassDescriptionByUnit").build();
      }
      for (OcLengthClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLengthClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLengthClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLengthClass");
        return Response.serverError().entity("query string NOT FOUND addLengthClass").build();
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

  public Response addLengthClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLengthClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLengthClass1");
        return Response.serverError().entity("query string NOT FOUND addLengthClass1").build();
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

  public Response deleteLengthClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLengthClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLengthClass1");
        return Response.serverError().entity("query string NOT FOUND deleteLengthClass1").build();
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

  public Response getTotalLengthClasses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalLengthClasses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalLengthClasses");
        return Response.serverError().entity("query string NOT FOUND getTotalLengthClasses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalLengthClasses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalLengthClasses").build();
      }
      for (Object[] o : list) {
        array.add(GettotallengthclassesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLengthClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLengthClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLengthClass");
        return Response.serverError().entity("query string NOT FOUND deleteLengthClass").build();
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

  public Response getLengthClasses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLengthClasses");

      Query query = em.createNativeQuery(queryStr, OcLengthClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLengthClasses");
        return Response.serverError().entity("query string NOT FOUND getLengthClasses").build();
      }

   

      List<OcLengthClassDescription> list = (List<OcLengthClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLengthClasses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLengthClasses").build();
      }
      for (OcLengthClassDescription o : list) {
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