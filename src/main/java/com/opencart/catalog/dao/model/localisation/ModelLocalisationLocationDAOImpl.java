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

public class ModelLocalisationLocationDAOImpl implements ModelLocalisationLocationDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationLocationDAOImpl.class);

  @Inject EntityManager em;

  public Response getLocation(  Integer LocationId) {
    JsonArray array = new JsonArray();

    if (null == LocationId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getLocation");

      Query query = em.createNativeQuery(queryStr, OcLocation.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLocation");
        return Response.serverError().entity("query string NOT FOUND getLocation").build();
      }

        query.setParameter("LocationId", LocationId); 

      List<OcLocation> list = (List<OcLocation>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLocation");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLocation").build();
      }
      for (OcLocation o : list) {
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