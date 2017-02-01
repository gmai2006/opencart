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

public class ModelAccountRewardDAOImpl implements ModelAccountRewardDAO {
  private Log logger = LogFactory.getLog(ModelAccountRewardDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalPoints(  Integer Points) {
    JsonArray array = new JsonArray();

    if (null == Points ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTotalPoints");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalPoints");
        return Response.serverError().entity("query string NOT FOUND getTotalPoints").build();
      }

        query.setParameter("Points", Points); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalPoints");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalPoints").build();
      }
      for (Object[] o : list) {
        array.add(GettotalpointsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalRewards() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalRewards");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalRewards");
        return Response.serverError().entity("query string NOT FOUND getTotalRewards").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalRewards");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalRewards").build();
      }
      for (Object[] o : list) {
        array.add(GettotalrewardsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}