package com.opencart.admin.dao.model.localisation;
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

public class ModelLocalisationTaxClassDAOImpl implements ModelLocalisationTaxClassDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationTaxClassDAOImpl.class);

  @Inject EntityManager em;

  public Response editTaxClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTaxClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTaxClass");
        return Response.serverError().entity("query string NOT FOUND editTaxClass").build();
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

  public Response getTaxClass() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTaxClass");

      Query query = em.createNativeQuery(queryStr, OcTaxClass.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTaxClass");
        return Response.serverError().entity("query string NOT FOUND getTaxClass").build();
      }

   

      List<OcTaxClass> list = (List<OcTaxClass>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTaxClass");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTaxClass").build();
      }
      for (OcTaxClass o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addTaxClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addTaxClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addTaxClass");
        return Response.serverError().entity("query string NOT FOUND addTaxClass").build();
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

  public Response deleteTaxClass() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteTaxClass");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteTaxClass");
        return Response.serverError().entity("query string NOT FOUND deleteTaxClass").build();
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

  public Response getTotalTaxClasses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTaxClasses");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTaxClasses");
        return Response.serverError().entity("query string NOT FOUND getTotalTaxClasses").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTaxClasses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTaxClasses").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltaxclassesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editTaxClass2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTaxClass2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTaxClass2");
        return Response.serverError().entity("query string NOT FOUND editTaxClass2").build();
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

  public Response getTotalTaxRulesByTaxRateId(  Integer TaxClassId) {
    JsonArray array = new JsonArray();

    if (null == TaxClassId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTotalTaxRulesByTaxRateId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTaxRulesByTaxRateId");
        return Response.serverError().entity("query string NOT FOUND getTotalTaxRulesByTaxRateId").build();
      }

        query.setParameter("TaxClassId", TaxClassId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTaxRulesByTaxRateId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTaxRulesByTaxRateId").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltaxrulesbytaxrateidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editTaxClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTaxClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTaxClass1");
        return Response.serverError().entity("query string NOT FOUND editTaxClass1").build();
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

  public Response getTaxRules() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTaxRules");

      Query query = em.createNativeQuery(queryStr, OcTaxRule.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTaxRules");
        return Response.serverError().entity("query string NOT FOUND getTaxRules").build();
      }

   

      List<OcTaxRule> list = (List<OcTaxRule>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTaxRules");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTaxRules").build();
      }
      for (OcTaxRule o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteTaxClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteTaxClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteTaxClass1");
        return Response.serverError().entity("query string NOT FOUND deleteTaxClass1").build();
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

  public Response getTaxClasses() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTaxClasses");

      Query query = em.createNativeQuery(queryStr, OcTaxClass.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTaxClasses");
        return Response.serverError().entity("query string NOT FOUND getTaxClasses").build();
      }

   

      List<OcTaxClass> list = (List<OcTaxClass>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTaxClasses");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTaxClasses").build();
      }
      for (OcTaxClass o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addTaxClass1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addTaxClass1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addTaxClass1");
        return Response.serverError().entity("query string NOT FOUND addTaxClass1").build();
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