package com.opencart.admin.dao.model.sale;
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

public class ModelSaleRecurringDAOImpl implements ModelSaleRecurringDAO {
  private Log logger = LogFactory.getLog(ModelSaleRecurringDAOImpl.class);

  @Inject EntityManager em;

  public Response getRecurringTransactions(  Long Amount) {
    JsonArray array = new JsonArray();

    if (null == Amount ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getRecurringTransactions");

      Query query = em.createNativeQuery(queryStr, OcOrderRecurringTransaction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRecurringTransactions");
        return Response.serverError().entity("query string NOT FOUND getRecurringTransactions").build();
      }

        query.setParameter("Amount", Amount); 

      List<OcOrderRecurringTransaction> list = (List<OcOrderRecurringTransaction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRecurringTransactions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRecurringTransactions").build();
      }
      for (OcOrderRecurringTransaction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getRecurring() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getRecurring");

      Query query = em.createNativeQuery(queryStr, OcOrderRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRecurring");
        return Response.serverError().entity("query string NOT FOUND getRecurring").build();
      }

   

      List<OcOrderRecurring> list = (List<OcOrderRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRecurring");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRecurring").build();
      }
      for (OcOrderRecurring o : list) {
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