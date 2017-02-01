package com.opencart.admin.dao.model.catalog;
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

public class ModelCatalogDownloadDAOImpl implements ModelCatalogDownloadDAO {
  private Log logger = LogFactory.getLog(ModelCatalogDownloadDAOImpl.class);

  @Inject EntityManager em;

  public Response editDownload() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editDownload");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editDownload");
        return Response.serverError().entity("query string NOT FOUND editDownload").build();
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

  public Response deleteDownload1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteDownload1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteDownload1");
        return Response.serverError().entity("query string NOT FOUND deleteDownload1").build();
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

  public Response addDownload() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addDownload");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addDownload");
        return Response.serverError().entity("query string NOT FOUND addDownload").build();
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

  public Response editDownload1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editDownload1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editDownload1");
        return Response.serverError().entity("query string NOT FOUND editDownload1").build();
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

  public Response getTotalDownloads() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalDownloads");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalDownloads");
        return Response.serverError().entity("query string NOT FOUND getTotalDownloads").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalDownloads");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalDownloads").build();
      }
      for (Object[] o : list) {
        array.add(GettotaldownloadsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getDownloadDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getDownloadDescriptions");

      Query query = em.createNativeQuery(queryStr, OcDownloadDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getDownloadDescriptions");
        return Response.serverError().entity("query string NOT FOUND getDownloadDescriptions").build();
      }

   

      List<OcDownloadDescription> list = (List<OcDownloadDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getDownloadDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getDownloadDescriptions").build();
      }
      for (OcDownloadDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editDownload2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editDownload2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editDownload2");
        return Response.serverError().entity("query string NOT FOUND editDownload2").build();
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

  public Response getDownload() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getDownload");

      Query query = em.createNativeQuery(queryStr, OcDownloadDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getDownload");
        return Response.serverError().entity("query string NOT FOUND getDownload").build();
      }

   

      List<OcDownloadDescription> list = (List<OcDownloadDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getDownload");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getDownload").build();
      }
      for (OcDownloadDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addDownload1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addDownload1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addDownload1");
        return Response.serverError().entity("query string NOT FOUND addDownload1").build();
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

  public Response deleteDownload() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteDownload");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteDownload");
        return Response.serverError().entity("query string NOT FOUND deleteDownload").build();
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