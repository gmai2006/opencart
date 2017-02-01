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

public class ModelReportCustomerDAOImpl implements ModelReportCustomerDAO {
  private Log logger = LogFactory.getLog(ModelReportCustomerDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalCustomersByYear() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByYear");

      Query query = em.createNativeQuery(queryStr, GettotalcustomersbyyearDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByYear");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByYear").build();
      }

   

      List<GettotalcustomersbyyearDTO> list = (List<GettotalcustomersbyyearDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByYear");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByYear").build();
      }
      for (GettotalcustomersbyyearDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCustomersByDay() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByDay");

      Query query = em.createNativeQuery(queryStr, GettotalcustomersbydayDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByDay");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByDay").build();
      }

   

      List<GettotalcustomersbydayDTO> list = (List<GettotalcustomersbydayDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByDay");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByDay").build();
      }
      for (GettotalcustomersbydayDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCustomersByWeek() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByWeek");

      Query query = em.createNativeQuery(queryStr, GettotalcustomersbyweekDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByWeek");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByWeek").build();
      }

   

      List<GettotalcustomersbyweekDTO> list = (List<GettotalcustomersbyweekDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByWeek");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByWeek").build();
      }
      for (GettotalcustomersbyweekDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCustomersByMonth() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomersByMonth");

      Query query = em.createNativeQuery(queryStr, GettotalcustomersbymonthDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomersByMonth");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomersByMonth").build();
      }

   

      List<GettotalcustomersbymonthDTO> list = (List<GettotalcustomersbymonthDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomersByMonth");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomersByMonth").build();
      }
      for (GettotalcustomersbymonthDTO o : list) {
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