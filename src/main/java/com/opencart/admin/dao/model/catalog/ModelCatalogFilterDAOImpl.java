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

public class ModelCatalogFilterDAOImpl implements ModelCatalogFilterDAO {
  private Log logger = LogFactory.getLog(ModelCatalogFilterDAOImpl.class);

  @Inject EntityManager em;

  public Response editFilter1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter1");
        return Response.serverError().entity("query string NOT FOUND editFilter1").build();
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

  public Response deleteFilter() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteFilter");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteFilter");
        return Response.serverError().entity("query string NOT FOUND deleteFilter").build();
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

  public Response getFilterGroup() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getFilterGroup");

      Query query = em.createNativeQuery(queryStr, OcFilterGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getFilterGroup");
        return Response.serverError().entity("query string NOT FOUND getFilterGroup").build();
      }

   

      List<OcFilterGroup> list = (List<OcFilterGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getFilterGroup");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getFilterGroup").build();
      }
      for (OcFilterGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteFilter3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteFilter3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteFilter3");
        return Response.serverError().entity("query string NOT FOUND deleteFilter3").build();
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

  public Response getFilterDescriptions1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getFilterDescriptions1");

      Query query = em.createNativeQuery(queryStr, OcFilterDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getFilterDescriptions1");
        return Response.serverError().entity("query string NOT FOUND getFilterDescriptions1").build();
      }

   

      List<OcFilterDescription> list = (List<OcFilterDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getFilterDescriptions1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getFilterDescriptions1").build();
      }
      for (OcFilterDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getFilter() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getFilter");

      Query query = em.createNativeQuery(queryStr, OcFilterGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getFilter");
        return Response.serverError().entity("query string NOT FOUND getFilter").build();
      }

   

      List<OcFilterGroupDescription> list = (List<OcFilterGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getFilter");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getFilter").build();
      }
      for (OcFilterGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteFilter1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteFilter1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteFilter1");
        return Response.serverError().entity("query string NOT FOUND deleteFilter1").build();
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

  public Response editFilter() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter");
        return Response.serverError().entity("query string NOT FOUND editFilter").build();
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

  public Response deleteFilter2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteFilter2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteFilter2");
        return Response.serverError().entity("query string NOT FOUND deleteFilter2").build();
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

  public Response addFilter2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addFilter2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addFilter2");
        return Response.serverError().entity("query string NOT FOUND addFilter2").build();
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

  public Response addFilter1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addFilter1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addFilter1");
        return Response.serverError().entity("query string NOT FOUND addFilter1").build();
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

  public Response addFilter3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addFilter3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addFilter3");
        return Response.serverError().entity("query string NOT FOUND addFilter3").build();
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

  public Response editFilter7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter7");
        return Response.serverError().entity("query string NOT FOUND editFilter7").build();
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

  public Response addFilter() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addFilter");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addFilter");
        return Response.serverError().entity("query string NOT FOUND addFilter").build();
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

  public Response editFilter6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter6");
        return Response.serverError().entity("query string NOT FOUND editFilter6").build();
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

  public Response getFilterGroupDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getFilterGroupDescriptions");

      Query query = em.createNativeQuery(queryStr, OcFilterGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getFilterGroupDescriptions");
        return Response.serverError().entity("query string NOT FOUND getFilterGroupDescriptions").build();
      }

   

      List<OcFilterGroupDescription> list = (List<OcFilterGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getFilterGroupDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getFilterGroupDescriptions").build();
      }
      for (OcFilterGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getFilterDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getFilterDescriptions");

      Query query = em.createNativeQuery(queryStr, OcFilter.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getFilterDescriptions");
        return Response.serverError().entity("query string NOT FOUND getFilterDescriptions").build();
      }

   

      List<OcFilter> list = (List<OcFilter>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getFilterDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getFilterDescriptions").build();
      }
      for (OcFilter o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editFilter3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter3");
        return Response.serverError().entity("query string NOT FOUND editFilter3").build();
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

  public Response editFilter2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter2");
        return Response.serverError().entity("query string NOT FOUND editFilter2").build();
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

  public Response getTotalFilterGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalFilterGroups");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalFilterGroups");
        return Response.serverError().entity("query string NOT FOUND getTotalFilterGroups").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalFilterGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalFilterGroups").build();
      }
      for (Object[] o : list) {
        array.add(GettotalfiltergroupsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editFilter5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter5");
        return Response.serverError().entity("query string NOT FOUND editFilter5").build();
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

  public Response editFilter4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editFilter4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editFilter4");
        return Response.serverError().entity("query string NOT FOUND editFilter4").build();
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