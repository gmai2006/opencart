package com.opencart.admin.dao.model.sale;
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

public class ModelSaleVoucherThemeDAOImpl implements ModelSaleVoucherThemeDAO {
  private Log logger = LogFactory.getLog(ModelSaleVoucherThemeDAOImpl.class);

  @Inject EntityManager em;

  public Response getVoucherThemes() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getVoucherThemes");

      Query query = em.createNativeQuery(queryStr, OcVoucherTheme.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getVoucherThemes");
        return Response.serverError().entity("query string NOT FOUND getVoucherThemes").build();
      }

   

      List<OcVoucherTheme> list = (List<OcVoucherTheme>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getVoucherThemes");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getVoucherThemes").build();
      }
      for (OcVoucherTheme o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editVoucherTheme1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editVoucherTheme1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editVoucherTheme1");
        return Response.serverError().entity("query string NOT FOUND editVoucherTheme1").build();
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

  public Response editVoucherTheme2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editVoucherTheme2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editVoucherTheme2");
        return Response.serverError().entity("query string NOT FOUND editVoucherTheme2").build();
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

  public Response deleteVoucherTheme() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteVoucherTheme");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteVoucherTheme");
        return Response.serverError().entity("query string NOT FOUND deleteVoucherTheme").build();
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

  public Response getTotalVoucherThemes() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalVoucherThemes");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalVoucherThemes");
        return Response.serverError().entity("query string NOT FOUND getTotalVoucherThemes").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalVoucherThemes");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalVoucherThemes").build();
      }
      for (Object[] o : list) {
        array.add(GettotalvoucherthemesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addVoucherTheme() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addVoucherTheme");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addVoucherTheme");
        return Response.serverError().entity("query string NOT FOUND addVoucherTheme").build();
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

  public Response getVoucherThemeDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getVoucherThemeDescriptions");

      Query query = em.createNativeQuery(queryStr, OcVoucherThemeDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getVoucherThemeDescriptions");
        return Response.serverError().entity("query string NOT FOUND getVoucherThemeDescriptions").build();
      }

   

      List<OcVoucherThemeDescription> list = (List<OcVoucherThemeDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getVoucherThemeDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getVoucherThemeDescriptions").build();
      }
      for (OcVoucherThemeDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addVoucherTheme1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addVoucherTheme1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addVoucherTheme1");
        return Response.serverError().entity("query string NOT FOUND addVoucherTheme1").build();
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

  public Response editVoucherTheme() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editVoucherTheme");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editVoucherTheme");
        return Response.serverError().entity("query string NOT FOUND editVoucherTheme").build();
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

  public Response deleteVoucherTheme1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteVoucherTheme1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteVoucherTheme1");
        return Response.serverError().entity("query string NOT FOUND deleteVoucherTheme1").build();
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

  public Response getVoucherTheme() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getVoucherTheme");

      Query query = em.createNativeQuery(queryStr, OcVoucherTheme.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getVoucherTheme");
        return Response.serverError().entity("query string NOT FOUND getVoucherTheme").build();
      }

   

      List<OcVoucherTheme> list = (List<OcVoucherTheme>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getVoucherTheme");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getVoucherTheme").build();
      }
      for (OcVoucherTheme o : list) {
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