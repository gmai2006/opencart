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

public class ModelCatalogManufacturerDAOImpl implements ModelCatalogManufacturerDAO {
  private Log logger = LogFactory.getLog(ModelCatalogManufacturerDAOImpl.class);

  @Inject EntityManager em;

  public Response addManufacturer2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addManufacturer2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addManufacturer2");
        return Response.serverError().entity("query string NOT FOUND addManufacturer2").build();
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

  public Response getTotalManufacturers() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalManufacturers");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalManufacturers");
        return Response.serverError().entity("query string NOT FOUND getTotalManufacturers").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalManufacturers");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalManufacturers").build();
      }
      for (Object[] o : list) {
        array.add(GettotalmanufacturersDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteManufacturer() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteManufacturer");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteManufacturer");
        return Response.serverError().entity("query string NOT FOUND deleteManufacturer").build();
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

  public Response addManufacturer() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addManufacturer");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addManufacturer");
        return Response.serverError().entity("query string NOT FOUND addManufacturer").build();
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

  public Response deleteManufacturer1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteManufacturer1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteManufacturer1");
        return Response.serverError().entity("query string NOT FOUND deleteManufacturer1").build();
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

  public Response editManufacturer1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editManufacturer1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editManufacturer1");
        return Response.serverError().entity("query string NOT FOUND editManufacturer1").build();
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

  public Response editManufacturer2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editManufacturer2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editManufacturer2");
        return Response.serverError().entity("query string NOT FOUND editManufacturer2").build();
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

  public Response editManufacturer() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editManufacturer");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editManufacturer");
        return Response.serverError().entity("query string NOT FOUND editManufacturer").build();
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

  public Response editManufacturer3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editManufacturer3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editManufacturer3");
        return Response.serverError().entity("query string NOT FOUND editManufacturer3").build();
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

  public Response getManufacturerStores() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getManufacturerStores");

      Query query = em.createNativeQuery(queryStr, OcManufacturerToStore.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getManufacturerStores");
        return Response.serverError().entity("query string NOT FOUND getManufacturerStores").build();
      }

   

      List<OcManufacturerToStore> list = (List<OcManufacturerToStore>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getManufacturerStores");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getManufacturerStores").build();
      }
      for (OcManufacturerToStore o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addManufacturer1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addManufacturer1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addManufacturer1");
        return Response.serverError().entity("query string NOT FOUND addManufacturer1").build();
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