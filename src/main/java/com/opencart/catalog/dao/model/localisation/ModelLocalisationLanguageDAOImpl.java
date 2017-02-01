package com.opencart.catalog.dao.model.localisation;
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

public class ModelLocalisationLanguageDAOImpl implements ModelLocalisationLanguageDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationLanguageDAOImpl.class);

  @Inject EntityManager em;

  public Response getLanguage() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLanguage");

      Query query = em.createNativeQuery(queryStr, OcLanguage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLanguage");
        return Response.serverError().entity("query string NOT FOUND getLanguage").build();
      }

   

      List<OcLanguage> list = (List<OcLanguage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLanguage");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLanguage").build();
      }
      for (OcLanguage o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getLanguages() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLanguages");

      Query query = em.createNativeQuery(queryStr, OcLanguage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLanguages");
        return Response.serverError().entity("query string NOT FOUND getLanguages").build();
      }

   

      List<OcLanguage> list = (List<OcLanguage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLanguages");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLanguages").build();
      }
      for (OcLanguage o : list) {
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