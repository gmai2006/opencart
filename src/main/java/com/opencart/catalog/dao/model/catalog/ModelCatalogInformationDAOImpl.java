package com.opencart.catalog.dao.model.catalog;
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

public class ModelCatalogInformationDAOImpl implements ModelCatalogInformationDAO {
  private Log logger = LogFactory.getLog(ModelCatalogInformationDAOImpl.class);

  @Inject EntityManager em;

  public Response getInformations() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformations");

      Query query = em.createNativeQuery(queryStr, OcInformation.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformations");
        return Response.serverError().entity("query string NOT FOUND getInformations").build();
      }

   

      List<OcInformation> list = (List<OcInformation>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformations");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformations").build();
      }
      for (OcInformation o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getInformation() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformation");

      Query query = em.createNativeQuery(queryStr, OcInformation.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformation");
        return Response.serverError().entity("query string NOT FOUND getInformation").build();
      }

   

      List<OcInformation> list = (List<OcInformation>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformation");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformation").build();
      }
      for (OcInformation o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getInformationLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformationLayoutId");

      Query query = em.createNativeQuery(queryStr, OcInformationToLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformationLayoutId");
        return Response.serverError().entity("query string NOT FOUND getInformationLayoutId").build();
      }

   

      List<OcInformationToLayout> list = (List<OcInformationToLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformationLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformationLayoutId").build();
      }
      for (OcInformationToLayout o : list) {
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