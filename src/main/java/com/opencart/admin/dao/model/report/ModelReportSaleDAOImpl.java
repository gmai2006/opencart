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

public class ModelReportSaleDAOImpl implements ModelReportSaleDAO {
  private Log logger = LogFactory.getLog(ModelReportSaleDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalOrdersByYear() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByYear");

      Query query = em.createNativeQuery(queryStr, GettotalordersbyyearDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByYear");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByYear").build();
      }

   

      List<GettotalordersbyyearDTO> list = (List<GettotalordersbyyearDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByYear");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByYear").build();
      }
      for (GettotalordersbyyearDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrdersByDay() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByDay");

      Query query = em.createNativeQuery(queryStr, GettotalordersbydayDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByDay");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByDay").build();
      }

   

      List<GettotalordersbydayDTO> list = (List<GettotalordersbydayDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByDay");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByDay").build();
      }
      for (GettotalordersbydayDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrdersByCountry() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByCountry");

      Query query = em.createNativeQuery(queryStr, GettotalordersbycountryDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByCountry");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByCountry").build();
      }

   

      List<GettotalordersbycountryDTO> list = (List<GettotalordersbycountryDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByCountry");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByCountry").build();
      }
      for (GettotalordersbycountryDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrdersByWeek() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByWeek");

      Query query = em.createNativeQuery(queryStr, GettotalordersbyweekDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByWeek");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByWeek").build();
      }

   

      List<GettotalordersbyweekDTO> list = (List<GettotalordersbyweekDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByWeek");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByWeek").build();
      }
      for (GettotalordersbyweekDTO o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrdersByMonth() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByMonth");

      Query query = em.createNativeQuery(queryStr, GettotalordersbymonthDTO.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByMonth");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByMonth").build();
      }

   

      List<GettotalordersbymonthDTO> list = (List<GettotalordersbymonthDTO>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByMonth");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByMonth").build();
      }
      for (GettotalordersbymonthDTO o : list) {
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