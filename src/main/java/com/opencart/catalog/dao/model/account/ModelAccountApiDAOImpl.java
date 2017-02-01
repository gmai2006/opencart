package com.opencart.catalog.dao.model.account;
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

import com.opencart.catalog.model.*;

public class ModelAccountApiDAOImpl implements ModelAccountApiDAO {
  private Log logger = LogFactory.getLog(ModelAccountApiDAOImpl.class);

  @Inject EntityManager em;

  public Response getApiIps() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getApiIps");

      Query query = em.createNativeQuery(queryStr, OcApiIp.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getApiIps");
        return Response.serverError().entity("query string NOT FOUND getApiIps").build();
      }

   

      List<OcApiIp> list = (List<OcApiIp>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getApiIps");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getApiIps").build();
      }
      for (OcApiIp o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addApiSession() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addApiSession");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addApiSession");
        return Response.serverError().entity("query string NOT FOUND addApiSession").build();
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

  public Response getApiByKey() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getApiByKey");

      Query query = em.createNativeQuery(queryStr, OcApi.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getApiByKey");
        return Response.serverError().entity("query string NOT FOUND getApiByKey").build();
      }

   

      List<OcApi> list = (List<OcApi>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getApiByKey");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getApiByKey").build();
      }
      for (OcApi o : list) {
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