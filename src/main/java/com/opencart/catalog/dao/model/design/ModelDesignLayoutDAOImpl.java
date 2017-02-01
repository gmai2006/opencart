package com.opencart.catalog.dao.model.design;
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

public class ModelDesignLayoutDAOImpl implements ModelDesignLayoutDAO {
  private Log logger = LogFactory.getLog(ModelDesignLayoutDAOImpl.class);

  @Inject EntityManager em;

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

  public Response getLayout() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLayout");

      Query query = em.createNativeQuery(queryStr, OcLayoutRoute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLayout");
        return Response.serverError().entity("query string NOT FOUND getLayout").build();
      }

   

      List<OcLayoutRoute> list = (List<OcLayoutRoute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLayout");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLayout").build();
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

}