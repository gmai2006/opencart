package com.opencart.catalog.dao;
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

public class ModelAccountAddressDAOImpl implements ModelAccountAddressDAO {
  private Log logger = LogFactory.getLog(ModelAccountAddressDAOImpl.class);

  @Inject EntityManager em;

  public Response getAddresses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddresses");

      Query query = em.createNativeQuery(queryStr, OcAddress.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddresses");
        return Response.serverError().entity("query string NOT FOUND getAddresses").build();
      }

   

      List<OcAddress> list = (List<OcAddress>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddresses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddresses").build();
      }
      for (OcAddress o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getAddress2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddress2");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddress2");
        return Response.serverError().entity("query string NOT FOUND getAddress2").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddress2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddress2").build();
      }
      for (OcZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editAddress1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAddress1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAddress1");
        return Response.serverError().entity("query string NOT FOUND editAddress1").build();
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

  public Response getAddress1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddress1");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddress1");
        return Response.serverError().entity("query string NOT FOUND getAddress1").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddress1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddress1").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addAddress() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAddress");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAddress");
        return Response.serverError().entity("query string NOT FOUND addAddress").build();
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

  public Response addAddress1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAddress1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAddress1");
        return Response.serverError().entity("query string NOT FOUND addAddress1").build();
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

  public Response getAddresses2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddresses2");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddresses2");
        return Response.serverError().entity("query string NOT FOUND getAddresses2").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddresses2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddresses2").build();
      }
      for (OcZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getAddresses1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddresses1");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddresses1");
        return Response.serverError().entity("query string NOT FOUND getAddresses1").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddresses1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddresses1").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteAddress() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAddress");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAddress");
        return Response.serverError().entity("query string NOT FOUND deleteAddress").build();
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

  public Response getAddress() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAddress");

      Query query = em.createNativeQuery(queryStr, OcAddress.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAddress");
        return Response.serverError().entity("query string NOT FOUND getAddress").build();
      }

   

      List<OcAddress> list = (List<OcAddress>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAddress");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAddress").build();
      }
      for (OcAddress o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editAddress() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAddress");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAddress");
        return Response.serverError().entity("query string NOT FOUND editAddress").build();
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

  public Response getTotalAddresses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAddresses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAddresses");
        return Response.serverError().entity("query string NOT FOUND getTotalAddresses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAddresses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAddresses").build();
      }
      for (Object[] o : list) {
        array.add(GettotaladdressesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}