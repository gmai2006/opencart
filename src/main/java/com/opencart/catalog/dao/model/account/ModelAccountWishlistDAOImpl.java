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

public class ModelAccountWishlistDAOImpl implements ModelAccountWishlistDAO {
  private Log logger = LogFactory.getLog(ModelAccountWishlistDAOImpl.class);

  @Inject EntityManager em;

  public Response addWishlist1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addWishlist1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addWishlist1");
        return Response.serverError().entity("query string NOT FOUND addWishlist1").build();
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

  public Response getTotalWishlist() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalWishlist");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalWishlist");
        return Response.serverError().entity("query string NOT FOUND getTotalWishlist").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalWishlist");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalWishlist").build();
      }
      for (Object[] o : list) {
        array.add(GettotalwishlistDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteWishlist() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteWishlist");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteWishlist");
        return Response.serverError().entity("query string NOT FOUND deleteWishlist").build();
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

  public Response getWishlist() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getWishlist");

      Query query = em.createNativeQuery(queryStr, OcCustomerWishlist.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getWishlist");
        return Response.serverError().entity("query string NOT FOUND getWishlist").build();
      }

   

      List<OcCustomerWishlist> list = (List<OcCustomerWishlist>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getWishlist");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getWishlist").build();
      }
      for (OcCustomerWishlist o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addWishlist() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addWishlist");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addWishlist");
        return Response.serverError().entity("query string NOT FOUND addWishlist").build();
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