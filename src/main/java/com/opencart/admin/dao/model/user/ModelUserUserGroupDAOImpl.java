package com.opencart.admin.dao.model.user;
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

public class ModelUserUserGroupDAOImpl implements ModelUserUserGroupDAO {
  private Log logger = LogFactory.getLog(ModelUserUserGroupDAOImpl.class);

  @Inject EntityManager em;

  public Response deleteUserGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteUserGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteUserGroup");
        return Response.serverError().entity("query string NOT FOUND deleteUserGroup").build();
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

  public Response removePermission1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("removePermission1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND removePermission1");
        return Response.serverError().entity("query string NOT FOUND removePermission1").build();
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

  public Response addUserGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addUserGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addUserGroup");
        return Response.serverError().entity("query string NOT FOUND addUserGroup").build();
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

  public Response addPermission() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addPermission");

      Query query = em.createNativeQuery(queryStr, OcUserGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addPermission");
        return Response.serverError().entity("query string NOT FOUND addPermission").build();
      }

   

      List<OcUserGroup> list = (List<OcUserGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addPermission");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addPermission").build();
      }
      for (OcUserGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addPermission1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addPermission1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addPermission1");
        return Response.serverError().entity("query string NOT FOUND addPermission1").build();
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

  public Response getUserGroup() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUserGroup");

      Query query = em.createNativeQuery(queryStr, OcUserGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUserGroup");
        return Response.serverError().entity("query string NOT FOUND getUserGroup").build();
      }

   

      List<OcUserGroup> list = (List<OcUserGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUserGroup");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUserGroup").build();
      }
      for (OcUserGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response removePermission() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("removePermission");

      Query query = em.createNativeQuery(queryStr, OcUserGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND removePermission");
        return Response.serverError().entity("query string NOT FOUND removePermission").build();
      }

   

      List<OcUserGroup> list = (List<OcUserGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for removePermission");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for removePermission").build();
      }
      for (OcUserGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editUserGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editUserGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editUserGroup");
        return Response.serverError().entity("query string NOT FOUND editUserGroup").build();
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

  public Response getTotalUserGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalUserGroups");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalUserGroups");
        return Response.serverError().entity("query string NOT FOUND getTotalUserGroups").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalUserGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalUserGroups").build();
      }
      for (Object[] o : list) {
        array.add(GettotalusergroupsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}