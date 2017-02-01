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

public class ModelAccountCustomFieldDAOImpl implements ModelAccountCustomFieldDAO {
  private Log logger = LogFactory.getLog(ModelAccountCustomFieldDAOImpl.class);

  @Inject EntityManager em;

  public Response getCustomFields2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFields2");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldValue.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFields2");
        return Response.serverError().entity("query string NOT FOUND getCustomFields2").build();
      }

   

      List<OcCustomFieldValue> list = (List<OcCustomFieldValue>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFields2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFields2").build();
      }
      for (OcCustomFieldValue o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomField() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomField");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomField");
        return Response.serverError().entity("query string NOT FOUND getCustomField").build();
      }

   

      List<OcCustomFieldDescription> list = (List<OcCustomFieldDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomField");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomField").build();
      }
      for (OcCustomFieldDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomFields1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFields1");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFields1");
        return Response.serverError().entity("query string NOT FOUND getCustomFields1").build();
      }

   

      List<OcCustomFieldDescription> list = (List<OcCustomFieldDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFields1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFields1").build();
      }
      for (OcCustomFieldDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomFields() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFields");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFields");
        return Response.serverError().entity("query string NOT FOUND getCustomFields").build();
      }

   

      List<OcCustomFieldDescription> list = (List<OcCustomFieldDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFields");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFields").build();
      }
      for (OcCustomFieldDescription o : list) {
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