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

public class ModelCatalogAttributeGroupDAOImpl implements ModelCatalogAttributeGroupDAO {
  private Log logger = LogFactory.getLog(ModelCatalogAttributeGroupDAOImpl.class);

  @Inject EntityManager em;

  public Response addAttributeGroup1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAttributeGroup1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAttributeGroup1");
        return Response.serverError().entity("query string NOT FOUND addAttributeGroup1").build();
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

  public Response getAttributeGroupDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAttributeGroupDescriptions");

      Query query = em.createNativeQuery(queryStr, OcAttributeGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAttributeGroupDescriptions");
        return Response.serverError().entity("query string NOT FOUND getAttributeGroupDescriptions").build();
      }

   

      List<OcAttributeGroupDescription> list = (List<OcAttributeGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAttributeGroupDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAttributeGroupDescriptions").build();
      }
      for (OcAttributeGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getAttributeGroup() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getAttributeGroup");

      Query query = em.createNativeQuery(queryStr, OcAttributeGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getAttributeGroup");
        return Response.serverError().entity("query string NOT FOUND getAttributeGroup").build();
      }

   

      List<OcAttributeGroup> list = (List<OcAttributeGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getAttributeGroup");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getAttributeGroup").build();
      }
      for (OcAttributeGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalAttributeGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalAttributeGroups");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalAttributeGroups");
        return Response.serverError().entity("query string NOT FOUND getTotalAttributeGroups").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalAttributeGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalAttributeGroups").build();
      }
      for (Object[] o : list) {
        array.add(GettotalattributegroupsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editAttributeGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAttributeGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAttributeGroup");
        return Response.serverError().entity("query string NOT FOUND editAttributeGroup").build();
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

  public Response deleteAttributeGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAttributeGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAttributeGroup");
        return Response.serverError().entity("query string NOT FOUND deleteAttributeGroup").build();
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

  public Response deleteAttributeGroup1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteAttributeGroup1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteAttributeGroup1");
        return Response.serverError().entity("query string NOT FOUND deleteAttributeGroup1").build();
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

  public Response addAttributeGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addAttributeGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addAttributeGroup");
        return Response.serverError().entity("query string NOT FOUND addAttributeGroup").build();
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

  public Response editAttributeGroup2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAttributeGroup2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAttributeGroup2");
        return Response.serverError().entity("query string NOT FOUND editAttributeGroup2").build();
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

  public Response editAttributeGroup1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editAttributeGroup1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editAttributeGroup1");
        return Response.serverError().entity("query string NOT FOUND editAttributeGroup1").build();
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