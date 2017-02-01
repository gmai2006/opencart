package com.opencart.admin.dao.model.setting;
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

public class ModelSettingSettingDAOImpl implements ModelSettingSettingDAO {
  private Log logger = LogFactory.getLog(ModelSettingSettingDAOImpl.class);

  @Inject EntityManager em;

  public Response editSettingValue() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editSettingValue");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editSettingValue");
        return Response.serverError().entity("query string NOT FOUND editSettingValue").build();
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

  public Response editSetting1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editSetting1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editSetting1");
        return Response.serverError().entity("query string NOT FOUND editSetting1").build();
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

  public Response editSettingValue1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editSettingValue1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editSettingValue1");
        return Response.serverError().entity("query string NOT FOUND editSettingValue1").build();
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

  public Response editSetting2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editSetting2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editSetting2");
        return Response.serverError().entity("query string NOT FOUND editSetting2").build();
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

  public Response getSetting() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getSetting");

      Query query = em.createNativeQuery(queryStr, OcSetting.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getSetting");
        return Response.serverError().entity("query string NOT FOUND getSetting").build();
      }

   

      List<OcSetting> list = (List<OcSetting>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getSetting");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getSetting").build();
      }
      for (OcSetting o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editSetting() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editSetting");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editSetting");
        return Response.serverError().entity("query string NOT FOUND editSetting").build();
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

  public Response getSettingValue(  String Value) {
    JsonArray array = new JsonArray();

    if (null == Value ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getSettingValue");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getSettingValue");
        return Response.serverError().entity("query string NOT FOUND getSettingValue").build();
      }

        query.setParameter("Value", Value); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getSettingValue");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getSettingValue").build();
      }
      for (Object[] o : list) {
        array.add(GetsettingvalueDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteSetting() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteSetting");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteSetting");
        return Response.serverError().entity("query string NOT FOUND deleteSetting").build();
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