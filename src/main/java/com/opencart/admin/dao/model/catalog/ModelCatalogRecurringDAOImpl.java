package com.opencart.admin.dao.model.catalog;
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

public class ModelCatalogRecurringDAOImpl implements ModelCatalogRecurringDAO {
  private Log logger = LogFactory.getLog(ModelCatalogRecurringDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalRecurrings() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalRecurrings");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalRecurrings");
        return Response.serverError().entity("query string NOT FOUND getTotalRecurrings").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalRecurrings");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalRecurrings").build();
      }
      for (Object[] o : list) {
        array.add(GettotalrecurringsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteRecurring1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteRecurring1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteRecurring1");
        return Response.serverError().entity("query string NOT FOUND deleteRecurring1").build();
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

  public Response addRecurring1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addRecurring1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addRecurring1");
        return Response.serverError().entity("query string NOT FOUND addRecurring1").build();
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

  public Response deleteRecurring() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteRecurring");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteRecurring");
        return Response.serverError().entity("query string NOT FOUND deleteRecurring").build();
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

  public Response deleteRecurring3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteRecurring3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteRecurring3");
        return Response.serverError().entity("query string NOT FOUND deleteRecurring3").build();
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

  public Response deleteRecurring2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteRecurring2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteRecurring2");
        return Response.serverError().entity("query string NOT FOUND deleteRecurring2").build();
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

  public Response editRecurring() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editRecurring");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editRecurring");
        return Response.serverError().entity("query string NOT FOUND editRecurring").build();
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

  public Response getRecurringDescription() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getRecurringDescription");

      Query query = em.createNativeQuery(queryStr, OcRecurringDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRecurringDescription");
        return Response.serverError().entity("query string NOT FOUND getRecurringDescription").build();
      }

   

      List<OcRecurringDescription> list = (List<OcRecurringDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRecurringDescription");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRecurringDescription").build();
      }
      for (OcRecurringDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editRecurring1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editRecurring1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editRecurring1");
        return Response.serverError().entity("query string NOT FOUND editRecurring1").build();
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

  public Response getRecurring() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getRecurring");

      Query query = em.createNativeQuery(queryStr, OcRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRecurring");
        return Response.serverError().entity("query string NOT FOUND getRecurring").build();
      }

   

      List<OcRecurring> list = (List<OcRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRecurring");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRecurring").build();
      }
      for (OcRecurring o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addRecurring() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addRecurring");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addRecurring");
        return Response.serverError().entity("query string NOT FOUND addRecurring").build();
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

  public Response editRecurring2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editRecurring2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editRecurring2");
        return Response.serverError().entity("query string NOT FOUND editRecurring2").build();
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