package com.opencart.admin.dao.model.marketing;
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

public class ModelMarketingMarketingDAOImpl implements ModelMarketingMarketingDAO {
  private Log logger = LogFactory.getLog(ModelMarketingMarketingDAOImpl.class);

  @Inject EntityManager em;

  public Response getMarketing() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getMarketing");

      Query query = em.createNativeQuery(queryStr, OcMarketing.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getMarketing");
        return Response.serverError().entity("query string NOT FOUND getMarketing").build();
      }

   

      List<OcMarketing> list = (List<OcMarketing>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getMarketing");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getMarketing").build();
      }
      for (OcMarketing o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editMarketing() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editMarketing");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editMarketing");
        return Response.serverError().entity("query string NOT FOUND editMarketing").build();
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

  public Response addMarketing() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addMarketing");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addMarketing");
        return Response.serverError().entity("query string NOT FOUND addMarketing").build();
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

  public Response getMarketingByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getMarketingByCode");

      Query query = em.createNativeQuery(queryStr, OcMarketing.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getMarketingByCode");
        return Response.serverError().entity("query string NOT FOUND getMarketingByCode").build();
      }

   

      List<OcMarketing> list = (List<OcMarketing>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getMarketingByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getMarketingByCode").build();
      }
      for (OcMarketing o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteMarketing() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteMarketing");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteMarketing");
        return Response.serverError().entity("query string NOT FOUND deleteMarketing").build();
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