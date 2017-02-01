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

public class ModelLocalisationZoneDAOImpl implements ModelLocalisationZoneDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationZoneDAOImpl.class);

  @Inject EntityManager em;

  public Response getZonesByCountryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getZonesByCountryId");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getZonesByCountryId");
        return Response.serverError().entity("query string NOT FOUND getZonesByCountryId").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getZonesByCountryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getZonesByCountryId").build();
      }
      for (OcZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getZone() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getZone");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getZone");
        return Response.serverError().entity("query string NOT FOUND getZone").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getZone");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getZone").build();
      }
      for (OcZone o : list) {
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