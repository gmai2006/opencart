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

public class ModelCatalogManufacturerDAOImpl implements ModelCatalogManufacturerDAO {
  private Log logger = LogFactory.getLog(ModelCatalogManufacturerDAOImpl.class);

  @Inject EntityManager em;

  public Response getManufacturer() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getManufacturer");

      Query query = em.createNativeQuery(queryStr, OcManufacturer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getManufacturer");
        return Response.serverError().entity("query string NOT FOUND getManufacturer").build();
      }

   

      List<OcManufacturer> list = (List<OcManufacturer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getManufacturer");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getManufacturer").build();
      }
      for (OcManufacturer o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getManufacturers() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getManufacturers");

      Query query = em.createNativeQuery(queryStr, OcManufacturer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getManufacturers");
        return Response.serverError().entity("query string NOT FOUND getManufacturers").build();
      }

   

      List<OcManufacturer> list = (List<OcManufacturer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getManufacturers");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getManufacturers").build();
      }
      for (OcManufacturer o : list) {
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