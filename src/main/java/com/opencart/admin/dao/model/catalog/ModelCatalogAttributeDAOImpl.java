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

public class ModelCatalogAttributeDAOImpl implements ModelCatalogAttributeDAO {
  private Log logger = LogFactory.getLog(ModelCatalogAttributeDAOImpl.class);

  @Inject EntityManager em;

  public Response editAttribute1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAttribute1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAttribute1");
        return Response.serverError().entity("query string NOT FOUND editAttribute1").build();
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

  public Response getAttribute() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAttribute");

      Query query = em.createNativeQuery(queryStr, OcAttribute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAttribute");
        return Response.serverError().entity("query string NOT FOUND getAttribute").build();
      }

   

      List<OcAttribute> list = (List<OcAttribute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAttribute");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAttribute").build();
      }
      for (OcAttribute o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalAttributes() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAttributes");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAttributes");
        return Response.serverError().entity("query string NOT FOUND getTotalAttributes").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAttributes");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAttributes").build();
      }
      for (Object[] o : list) {
        array.add(GettotalattributesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addAttribute() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAttribute");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAttribute");
        return Response.serverError().entity("query string NOT FOUND addAttribute").build();
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

  public Response deleteAttribute() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAttribute");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAttribute");
        return Response.serverError().entity("query string NOT FOUND deleteAttribute").build();
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

  public Response editAttribute() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAttribute");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAttribute");
        return Response.serverError().entity("query string NOT FOUND editAttribute").build();
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

  public Response deleteAttribute1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAttribute1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAttribute1");
        return Response.serverError().entity("query string NOT FOUND deleteAttribute1").build();
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

  public Response getTotalAttributesByAttributeGroupId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAttributesByAttributeGroupId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAttributesByAttributeGroupId");
        return Response.serverError().entity("query string NOT FOUND getTotalAttributesByAttributeGroupId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAttributesByAttributeGroupId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAttributesByAttributeGroupId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalattributesbyattributegroupidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addAttribute1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAttribute1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAttribute1");
        return Response.serverError().entity("query string NOT FOUND addAttribute1").build();
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

  public Response editAttribute2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAttribute2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAttribute2");
        return Response.serverError().entity("query string NOT FOUND editAttribute2").build();
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

  public Response getAttributeDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAttributeDescriptions");

      Query query = em.createNativeQuery(queryStr, OcAttributeDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAttributeDescriptions");
        return Response.serverError().entity("query string NOT FOUND getAttributeDescriptions").build();
      }

   

      List<OcAttributeDescription> list = (List<OcAttributeDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAttributeDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAttributeDescriptions").build();
      }
      for (OcAttributeDescription o : list) {
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