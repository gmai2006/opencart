package com.opencart.admin.dao.model.customer;
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

public class ModelCustomerCustomerGroupDAOImpl implements ModelCustomerCustomerGroupDAO {
  private Log logger = LogFactory.getLog(ModelCustomerCustomerGroupDAOImpl.class);

  @Inject EntityManager em;

  public Response addCustomerGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomerGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomerGroup");
        return Response.serverError().entity("query string NOT FOUND addCustomerGroup").build();
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

  public Response getTotalCustomerGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomerGroups");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomerGroups");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomerGroups").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomerGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomerGroups").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomergroupsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomerGroup() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomerGroup");

      Query query = em.createNativeQuery(queryStr, OcCustomerGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerGroup");
        return Response.serverError().entity("query string NOT FOUND getCustomerGroup").build();
      }

   

      List<OcCustomerGroup> list = (List<OcCustomerGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerGroup");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerGroup").build();
      }
      for (OcCustomerGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomerGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomerGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomerGroup");
        return Response.serverError().entity("query string NOT FOUND deleteCustomerGroup").build();
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

  public Response editCustomerGroup() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomerGroup");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomerGroup");
        return Response.serverError().entity("query string NOT FOUND editCustomerGroup").build();
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

  public Response addCustomerGroup1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomerGroup1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomerGroup1");
        return Response.serverError().entity("query string NOT FOUND addCustomerGroup1").build();
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

  public Response editCustomerGroup1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomerGroup1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomerGroup1");
        return Response.serverError().entity("query string NOT FOUND editCustomerGroup1").build();
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

  public Response deleteCustomerGroup1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomerGroup1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomerGroup1");
        return Response.serverError().entity("query string NOT FOUND deleteCustomerGroup1").build();
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

  public Response editCustomerGroup2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomerGroup2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomerGroup2");
        return Response.serverError().entity("query string NOT FOUND editCustomerGroup2").build();
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

  public Response getCustomerGroupDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomerGroupDescriptions");

      Query query = em.createNativeQuery(queryStr, OcCustomerGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomerGroupDescriptions");
        return Response.serverError().entity("query string NOT FOUND getCustomerGroupDescriptions").build();
      }

   

      List<OcCustomerGroupDescription> list = (List<OcCustomerGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomerGroupDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomerGroupDescriptions").build();
      }
      for (OcCustomerGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomerGroup2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomerGroup2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomerGroup2");
        return Response.serverError().entity("query string NOT FOUND deleteCustomerGroup2").build();
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

  public Response deleteCustomerGroup3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomerGroup3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomerGroup3");
        return Response.serverError().entity("query string NOT FOUND deleteCustomerGroup3").build();
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

  public Response deleteCustomerGroup4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomerGroup4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomerGroup4");
        return Response.serverError().entity("query string NOT FOUND deleteCustomerGroup4").build();
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

  public Response deleteCustomerGroup5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomerGroup5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomerGroup5");
        return Response.serverError().entity("query string NOT FOUND deleteCustomerGroup5").build();
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