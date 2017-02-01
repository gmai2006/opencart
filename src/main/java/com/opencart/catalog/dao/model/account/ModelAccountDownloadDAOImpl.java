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

public class ModelAccountDownloadDAOImpl implements ModelAccountDownloadDAO {
  private Log logger = LogFactory.getLog(ModelAccountDownloadDAOImpl.class);

  @Inject EntityManager em;

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

  public Response getDownload(  String Filename) {
    JsonArray array = new JsonArray();

    if (null == Filename ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getDownload");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getDownload");
        return Response.serverError().entity("query string NOT FOUND getDownload").build();
      }

        query.setParameter("Filename", Filename); 

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getDownload");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getDownload").build();
      }
      for (OcOrderProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getDownloads(  Integer DownloadId) {
    JsonArray array = new JsonArray();

    if (null == DownloadId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getDownloads");

      Query query = em.createNativeQuery(queryStr, OcDownloadDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getDownloads");
        return Response.serverError().entity("query string NOT FOUND getDownloads").build();
      }

        query.setParameter("DownloadId", DownloadId); 

      List<OcDownloadDescription> list = (List<OcDownloadDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getDownloads");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getDownloads").build();
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

}