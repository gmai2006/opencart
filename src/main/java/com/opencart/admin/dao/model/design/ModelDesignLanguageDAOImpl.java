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

public class ModelDesignLanguageDAOImpl implements ModelDesignLanguageDAO {
  private Log logger = LogFactory.getLog(ModelDesignLanguageDAOImpl.class);

  @Inject EntityManager em;

  public Response editTranslation1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTranslation1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTranslation1");
        return Response.serverError().entity("query string NOT FOUND editTranslation1").build();
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

  public Response editTranslation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTranslation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTranslation");
        return Response.serverError().entity("query string NOT FOUND editTranslation").build();
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

  public Response getTotalTranslations() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTranslations");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTranslations");
        return Response.serverError().entity("query string NOT FOUND getTotalTranslations").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTranslations");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTranslations").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltranslationsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTranslations() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTranslations");

      Query query = em.createNativeQuery(queryStr, OcTranslation.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTranslations");
        return Response.serverError().entity("query string NOT FOUND getTranslations").build();
      }

   

      List<OcTranslation> list = (List<OcTranslation>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTranslations");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTranslations").build();
      }
      for (OcTranslation o : list) {
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