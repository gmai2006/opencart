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

public class ModelDesignThemeDAOImpl implements ModelDesignThemeDAO {
  private Log logger = LogFactory.getLog(ModelDesignThemeDAOImpl.class);

  @Inject EntityManager em;

  public Response editTheme1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTheme1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTheme1");
        return Response.serverError().entity("query string NOT FOUND editTheme1").build();
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

  public Response getTheme() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTheme");

      Query query = em.createNativeQuery(queryStr, OcTheme.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTheme");
        return Response.serverError().entity("query string NOT FOUND getTheme").build();
      }

   

      List<OcTheme> list = (List<OcTheme>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTheme");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTheme").build();
      }
      for (OcTheme o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editTheme() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTheme");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTheme");
        return Response.serverError().entity("query string NOT FOUND editTheme").build();
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

  public Response deleteTheme() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteTheme");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteTheme");
        return Response.serverError().entity("query string NOT FOUND deleteTheme").build();
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