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

public class ModelCatalogOptionDAOImpl implements ModelCatalogOptionDAO {
  private Log logger = LogFactory.getLog(ModelCatalogOptionDAOImpl.class);

  @Inject EntityManager em;

  public Response deleteOption1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOption1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOption1");
        return Response.serverError().entity("query string NOT FOUND deleteOption1").build();
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

  public Response getOptionDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOptionDescriptions");

      Query query = em.createNativeQuery(queryStr, OcOptionDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOptionDescriptions");
        return Response.serverError().entity("query string NOT FOUND getOptionDescriptions").build();
      }

   

      List<OcOptionDescription> list = (List<OcOptionDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOptionDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOptionDescriptions").build();
      }
      for (OcOptionDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteOption3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOption3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOption3");
        return Response.serverError().entity("query string NOT FOUND deleteOption3").build();
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

  public Response deleteOption2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOption2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOption2");
        return Response.serverError().entity("query string NOT FOUND deleteOption2").build();
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

  public Response getOptionValueDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOptionValueDescriptions");

      Query query = em.createNativeQuery(queryStr, OcOptionValue.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOptionValueDescriptions");
        return Response.serverError().entity("query string NOT FOUND getOptionValueDescriptions").build();
      }

   

      List<OcOptionValue> list = (List<OcOptionValue>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOptionValueDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOptionValueDescriptions").build();
      }
      for (OcOptionValue o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteOption() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOption");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOption");
        return Response.serverError().entity("query string NOT FOUND deleteOption").build();
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

  public Response getOption() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOption");

      Query query = em.createNativeQuery(queryStr, OcOptionDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOption");
        return Response.serverError().entity("query string NOT FOUND getOption").build();
      }

   

      List<OcOptionDescription> list = (List<OcOptionDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOption");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOption").build();
      }
      for (OcOptionDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOptionValueDescriptions1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOptionValueDescriptions1");

      Query query = em.createNativeQuery(queryStr, OcOptionValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOptionValueDescriptions1");
        return Response.serverError().entity("query string NOT FOUND getOptionValueDescriptions1").build();
      }

   

      List<OcOptionValueDescription> list = (List<OcOptionValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOptionValueDescriptions1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOptionValueDescriptions1").build();
      }
      for (OcOptionValueDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOption() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption");
        return Response.serverError().entity("query string NOT FOUND editOption").build();
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

  public Response editOption2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption2");
        return Response.serverError().entity("query string NOT FOUND editOption2").build();
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

  public Response editOption1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption1");
        return Response.serverError().entity("query string NOT FOUND editOption1").build();
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

  public Response addOption() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOption");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOption");
        return Response.serverError().entity("query string NOT FOUND addOption").build();
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

  public Response editOption6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption6");
        return Response.serverError().entity("query string NOT FOUND editOption6").build();
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

  public Response editOption5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption5");
        return Response.serverError().entity("query string NOT FOUND editOption5").build();
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

  public Response editOption4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption4");
        return Response.serverError().entity("query string NOT FOUND editOption4").build();
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

  public Response getOptionValue() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOptionValue");

      Query query = em.createNativeQuery(queryStr, OcOptionValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOptionValue");
        return Response.serverError().entity("query string NOT FOUND getOptionValue").build();
      }

   

      List<OcOptionValueDescription> list = (List<OcOptionValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOptionValue");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOptionValue").build();
      }
      for (OcOptionValueDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOptionValues() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOptionValues");

      Query query = em.createNativeQuery(queryStr, OcOptionValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOptionValues");
        return Response.serverError().entity("query string NOT FOUND getOptionValues").build();
      }

   

      List<OcOptionValueDescription> list = (List<OcOptionValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOptionValues");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOptionValues").build();
      }
      for (OcOptionValueDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOption3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption3");
        return Response.serverError().entity("query string NOT FOUND editOption3").build();
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

  public Response addOption1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOption1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOption1");
        return Response.serverError().entity("query string NOT FOUND addOption1").build();
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

  public Response editOption7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOption7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOption7");
        return Response.serverError().entity("query string NOT FOUND editOption7").build();
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

  public Response addOption3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOption3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOption3");
        return Response.serverError().entity("query string NOT FOUND addOption3").build();
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

  public Response getTotalOptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOptions");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOptions");
        return Response.serverError().entity("query string NOT FOUND getTotalOptions").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOptions").build();
      }
      for (Object[] o : list) {
        array.add(GettotaloptionsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOption2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOption2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOption2");
        return Response.serverError().entity("query string NOT FOUND addOption2").build();
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