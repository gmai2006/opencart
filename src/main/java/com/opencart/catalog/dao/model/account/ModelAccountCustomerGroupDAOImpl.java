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

public class ModelAccountCustomerGroupDAOImpl implements ModelAccountCustomerGroupDAO {
  private Log logger = LogFactory.getLog(ModelAccountCustomerGroupDAOImpl.class);

  @Inject EntityManager em;

  public Response getCustomerGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomerGroups");

      Query query = em.createNativeQuery(queryStr, OcCustomerGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerGroups");
        return Response.serverError().entity("query string NOT FOUND getCustomerGroups").build();
      }

   

      List<OcCustomerGroup> list = (List<OcCustomerGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerGroups").build();
      }
      for (OcCustomerGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomerGroup() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomerGroup");

      Query query = em.createNativeQuery(queryStr, OcCustomerGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerGroup");
        return Response.serverError().entity("query string NOT FOUND getCustomerGroup").build();
      }

   

      List<OcCustomerGroup> list = (List<OcCustomerGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerGroup");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerGroup").build();
      }
      for (OcCustomerGroup o : list) {
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