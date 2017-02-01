package com.opencart.admin.dao.model.report;
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

public class ModelReportProductDAOImpl implements ModelReportProductDAO {
  private Log logger = LogFactory.getLog(ModelReportProductDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalProductViews(  Integer Viewed) {
    JsonArray array = new JsonArray();

    if (null == Viewed ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductViews");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductViews");
        return Response.serverError().entity("query string NOT FOUND getTotalProductViews").build();
      }

        query.setParameter("Viewed", Viewed); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductViews");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductViews").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductviewsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response reset() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("reset");

      if (null == queryStr) {
        logger.error("query string NOT FOUND reset");
        return Response.serverError().entity("query string NOT FOUND reset").build();
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

  public Response getTotalProductsViewed() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsViewed");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsViewed");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsViewed").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsViewed");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsViewed").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsviewedDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}