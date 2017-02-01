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

public class ModelCatalogReviewDAOImpl implements ModelCatalogReviewDAO {
  private Log logger = LogFactory.getLog(ModelCatalogReviewDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalReviewsAwaitingApproval() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReviewsAwaitingApproval");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReviewsAwaitingApproval");
        return Response.serverError().entity("query string NOT FOUND getTotalReviewsAwaitingApproval").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReviewsAwaitingApproval");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReviewsAwaitingApproval").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreviewsawaitingapprovalDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editReview() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editReview");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editReview");
        return Response.serverError().entity("query string NOT FOUND editReview").build();
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

  public Response getReview() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getReview");

      Query query = em.createNativeQuery(queryStr, OcProductDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReview");
        return Response.serverError().entity("query string NOT FOUND getReview").build();
      }

   

      List<OcProductDescription> list = (List<OcProductDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReview");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReview").build();
      }
      for (OcProductDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addReview() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addReview");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addReview");
        return Response.serverError().entity("query string NOT FOUND addReview").build();
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

  public Response deleteReview() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteReview");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteReview");
        return Response.serverError().entity("query string NOT FOUND deleteReview").build();
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