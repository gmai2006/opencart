package com.opencart.admin.dao.model.design;
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

public class ModelDesignLayoutDAOImpl implements ModelDesignLayoutDAO {
  private Log logger = LogFactory.getLog(ModelDesignLayoutDAOImpl.class);

  @Inject EntityManager em;

  public Response getLayoutRoutes() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLayoutRoutes");

      Query query = em.createNativeQuery(queryStr, OcLayoutRoute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLayoutRoutes");
        return Response.serverError().entity("query string NOT FOUND getLayoutRoutes").build();
      }

   

      List<OcLayoutRoute> list = (List<OcLayoutRoute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLayoutRoutes");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLayoutRoutes").build();
      }
      for (OcLayoutRoute o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLayout1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLayout1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLayout1");
        return Response.serverError().entity("query string NOT FOUND addLayout1").build();
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

  public Response deleteLayout() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLayout");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLayout");
        return Response.serverError().entity("query string NOT FOUND deleteLayout").build();
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

  public Response deleteLayout5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLayout5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLayout5");
        return Response.serverError().entity("query string NOT FOUND deleteLayout5").build();
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

  public Response deleteLayout4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLayout4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLayout4");
        return Response.serverError().entity("query string NOT FOUND deleteLayout4").build();
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

  public Response getLayoutModules() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLayoutModules");

      Query query = em.createNativeQuery(queryStr, OcLayoutModule.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLayoutModules");
        return Response.serverError().entity("query string NOT FOUND getLayoutModules").build();
      }

   

      List<OcLayoutModule> list = (List<OcLayoutModule>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLayoutModules");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLayoutModules").build();
      }
      for (OcLayoutModule o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLayout3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLayout3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLayout3");
        return Response.serverError().entity("query string NOT FOUND deleteLayout3").build();
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

  public Response deleteLayout2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLayout2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLayout2");
        return Response.serverError().entity("query string NOT FOUND deleteLayout2").build();
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

  public Response getLayout() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLayout");

      Query query = em.createNativeQuery(queryStr, OcLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLayout");
        return Response.serverError().entity("query string NOT FOUND getLayout").build();
      }

   

      List<OcLayout> list = (List<OcLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLayout");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLayout").build();
      }
      for (OcLayout o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLayout1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLayout1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLayout1");
        return Response.serverError().entity("query string NOT FOUND deleteLayout1").build();
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

  public Response editLayout() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLayout");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLayout");
        return Response.serverError().entity("query string NOT FOUND editLayout").build();
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

  public Response getTotalLayouts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalLayouts");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalLayouts");
        return Response.serverError().entity("query string NOT FOUND getTotalLayouts").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalLayouts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalLayouts").build();
      }
      for (Object[] o : list) {
        array.add(GettotallayoutsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLayout() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLayout");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLayout");
        return Response.serverError().entity("query string NOT FOUND addLayout").build();
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

  public Response editLayout1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLayout1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLayout1");
        return Response.serverError().entity("query string NOT FOUND editLayout1").build();
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

  public Response editLayout3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLayout3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLayout3");
        return Response.serverError().entity("query string NOT FOUND editLayout3").build();
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

  public Response editLayout2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLayout2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLayout2");
        return Response.serverError().entity("query string NOT FOUND editLayout2").build();
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