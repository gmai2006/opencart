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

public class ModelDesignMenuDAOImpl implements ModelDesignMenuDAO {
  private Log logger = LogFactory.getLog(ModelDesignMenuDAOImpl.class);

  @Inject EntityManager em;

  public Response deleteMenu() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteMenu");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteMenu");
        return Response.serverError().entity("query string NOT FOUND deleteMenu").build();
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

  public Response addMenu1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addMenu1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addMenu1");
        return Response.serverError().entity("query string NOT FOUND addMenu1").build();
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

  public Response addMenu() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addMenu");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addMenu");
        return Response.serverError().entity("query string NOT FOUND addMenu").build();
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

  public Response editMenu3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editMenu3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editMenu3");
        return Response.serverError().entity("query string NOT FOUND editMenu3").build();
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

  public Response editMenu4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editMenu4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editMenu4");
        return Response.serverError().entity("query string NOT FOUND editMenu4").build();
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

  public Response editMenu1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editMenu1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editMenu1");
        return Response.serverError().entity("query string NOT FOUND editMenu1").build();
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

  public Response editMenu2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editMenu2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editMenu2");
        return Response.serverError().entity("query string NOT FOUND editMenu2").build();
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

  public Response getMenuModules() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getMenuModules");

      Query query = em.createNativeQuery(queryStr, OcMenuModule.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getMenuModules");
        return Response.serverError().entity("query string NOT FOUND getMenuModules").build();
      }

   

      List<OcMenuModule> list = (List<OcMenuModule>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getMenuModules");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getMenuModules").build();
      }
      for (OcMenuModule o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editMenu() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editMenu");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editMenu");
        return Response.serverError().entity("query string NOT FOUND editMenu").build();
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

  public Response deleteMenu2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteMenu2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteMenu2");
        return Response.serverError().entity("query string NOT FOUND deleteMenu2").build();
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

  public Response getMenuDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getMenuDescriptions");

      Query query = em.createNativeQuery(queryStr, OcMenuDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getMenuDescriptions");
        return Response.serverError().entity("query string NOT FOUND getMenuDescriptions").build();
      }

   

      List<OcMenuDescription> list = (List<OcMenuDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getMenuDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getMenuDescriptions").build();
      }
      for (OcMenuDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalMenus() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalMenus");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalMenus");
        return Response.serverError().entity("query string NOT FOUND getTotalMenus").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalMenus");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalMenus").build();
      }
      for (Object[] o : list) {
        array.add(GettotalmenusDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getMenu() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getMenu");

      Query query = em.createNativeQuery(queryStr, OcMenu.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getMenu");
        return Response.serverError().entity("query string NOT FOUND getMenu").build();
      }

   

      List<OcMenu> list = (List<OcMenu>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getMenu");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getMenu").build();
      }
      for (OcMenu o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteMenu1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteMenu1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteMenu1");
        return Response.serverError().entity("query string NOT FOUND deleteMenu1").build();
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