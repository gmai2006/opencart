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

public class ModelAccountTransactionDAOImpl implements ModelAccountTransactionDAO {
  private Log logger = LogFactory.getLog(ModelAccountTransactionDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalAmount(  Long Amount) {
    JsonArray array = new JsonArray();

    if (null == Amount ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTotalAmount");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAmount");
        return Response.serverError().entity("query string NOT FOUND getTotalAmount").build();
      }

        query.setParameter("Amount", Amount); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAmount");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAmount").build();
      }
      for (Object[] o : list) {
        array.add(GettotalamountDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalTransactions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTransactions");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTransactions");
        return Response.serverError().entity("query string NOT FOUND getTotalTransactions").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTransactions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTransactions").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltransactionsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}