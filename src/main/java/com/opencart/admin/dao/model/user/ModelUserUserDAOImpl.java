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

public class ModelUserUserDAOImpl implements ModelUserUserDAO {
  private Log logger = LogFactory.getLog(ModelUserUserDAOImpl.class);

  @Inject EntityManager em;

  public Response editCode() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCode");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCode");
        return Response.serverError().entity("query string NOT FOUND editCode").build();
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

  public Response getUserByUsername() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUserByUsername");

      Query query = em.createNativeQuery(queryStr, OcUser.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUserByUsername");
        return Response.serverError().entity("query string NOT FOUND getUserByUsername").build();
      }

   

      List<OcUser> list = (List<OcUser>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUserByUsername");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUserByUsername").build();
      }
      for (OcUser o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editUser1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editUser1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editUser1");
        return Response.serverError().entity("query string NOT FOUND editUser1").build();
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

  public Response addUser() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addUser");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addUser");
        return Response.serverError().entity("query string NOT FOUND addUser").build();
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

  public Response getUser() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUser");

      Query query = em.createNativeQuery(queryStr, OcUser.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUser");
        return Response.serverError().entity("query string NOT FOUND getUser").build();
      }

   

      List<OcUser> list = (List<OcUser>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUser");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUser").build();
      }
      for (OcUser o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editUser() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editUser");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editUser");
        return Response.serverError().entity("query string NOT FOUND editUser").build();
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

  public Response getTotalUsersByGroupId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalUsersByGroupId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalUsersByGroupId");
        return Response.serverError().entity("query string NOT FOUND getTotalUsersByGroupId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalUsersByGroupId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalUsersByGroupId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalusersbygroupidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getUserByEmail() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUserByEmail");

      Query query = em.createNativeQuery(queryStr, OcUser.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUserByEmail");
        return Response.serverError().entity("query string NOT FOUND getUserByEmail").build();
      }

   

      List<OcUser> list = (List<OcUser>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUserByEmail");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUserByEmail").build();
      }
      for (OcUser o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getUserByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUserByCode");

      Query query = em.createNativeQuery(queryStr, OcUser.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUserByCode");
        return Response.serverError().entity("query string NOT FOUND getUserByCode").build();
      }

   

      List<OcUser> list = (List<OcUser>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUserByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUserByCode").build();
      }
      for (OcUser o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editPassword() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editPassword");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editPassword");
        return Response.serverError().entity("query string NOT FOUND editPassword").build();
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

  public Response deleteUser() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteUser");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteUser");
        return Response.serverError().entity("query string NOT FOUND deleteUser").build();
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

  public Response getTotalUsersByEmail() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalUsersByEmail");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalUsersByEmail");
        return Response.serverError().entity("query string NOT FOUND getTotalUsersByEmail").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalUsersByEmail");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalUsersByEmail").build();
      }
      for (Object[] o : list) {
        array.add(GettotalusersbyemailDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalUsers() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalUsers");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalUsers");
        return Response.serverError().entity("query string NOT FOUND getTotalUsers").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalUsers");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalUsers").build();
      }
      for (Object[] o : list) {
        array.add(GettotalusersDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}