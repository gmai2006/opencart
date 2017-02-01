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

public class ModelCatalogReviewDAOImpl implements ModelCatalogReviewDAO {
  private Log logger = LogFactory.getLog(ModelCatalogReviewDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalReviewsByProductId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalReviewsByProductId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalReviewsByProductId");
        return Response.serverError().entity("query string NOT FOUND getTotalReviewsByProductId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalReviewsByProductId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalReviewsByProductId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalreviewsbyproductidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getReviewsByProductId(  Integer ReviewId) {
    JsonArray array = new JsonArray();

    if (null == ReviewId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReviewsByProductId");

      Query query = em.createNativeQuery(queryStr, OcProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReviewsByProductId");
        return Response.serverError().entity("query string NOT FOUND getReviewsByProductId").build();
      }

        query.setParameter("ReviewId", ReviewId); 

      List<OcProduct> list = (List<OcProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReviewsByProductId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReviewsByProductId").build();
      }
      for (OcProduct o : list) {
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

}