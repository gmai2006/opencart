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

public class ModelLocalisationTaxRateDAOImpl implements ModelLocalisationTaxRateDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationTaxRateDAOImpl.class);

  @Inject EntityManager em;

  public Response addTaxRate() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addTaxRate");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addTaxRate");
        return Response.serverError().entity("query string NOT FOUND addTaxRate").build();
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

  public Response editTaxRate2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTaxRate2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTaxRate2");
        return Response.serverError().entity("query string NOT FOUND editTaxRate2").build();
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

  public Response getTaxRate(  Integer TaxRateId) {
    JsonArray array = new JsonArray();

    if (null == TaxRateId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTaxRate");

      Query query = em.createNativeQuery(queryStr, OcTaxRate.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTaxRate");
        return Response.serverError().entity("query string NOT FOUND getTaxRate").build();
      }

        query.setParameter("TaxRateId", TaxRateId); 

      List<OcTaxRate> list = (List<OcTaxRate>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTaxRate");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTaxRate").build();
      }
      for (OcTaxRate o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editTaxRate1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTaxRate1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTaxRate1");
        return Response.serverError().entity("query string NOT FOUND editTaxRate1").build();
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

  public Response getTaxRateCustomerGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTaxRateCustomerGroups");

      Query query = em.createNativeQuery(queryStr, OcTaxRateToCustomerGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTaxRateCustomerGroups");
        return Response.serverError().entity("query string NOT FOUND getTaxRateCustomerGroups").build();
      }

   

      List<OcTaxRateToCustomerGroup> list = (List<OcTaxRateToCustomerGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTaxRateCustomerGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTaxRateCustomerGroups").build();
      }
      for (OcTaxRateToCustomerGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editTaxRate() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editTaxRate");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editTaxRate");
        return Response.serverError().entity("query string NOT FOUND editTaxRate").build();
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

  public Response deleteTaxRate() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteTaxRate");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteTaxRate");
        return Response.serverError().entity("query string NOT FOUND deleteTaxRate").build();
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

  public Response getTotalTaxRates() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTaxRates");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTaxRates");
        return Response.serverError().entity("query string NOT FOUND getTotalTaxRates").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTaxRates");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTaxRates").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltaxratesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteTaxRate1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteTaxRate1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteTaxRate1");
        return Response.serverError().entity("query string NOT FOUND deleteTaxRate1").build();
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

  public Response addTaxRate1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addTaxRate1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addTaxRate1");
        return Response.serverError().entity("query string NOT FOUND addTaxRate1").build();
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

  public Response getTotalTaxRatesByGeoZoneId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalTaxRatesByGeoZoneId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalTaxRatesByGeoZoneId");
        return Response.serverError().entity("query string NOT FOUND getTotalTaxRatesByGeoZoneId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalTaxRatesByGeoZoneId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalTaxRatesByGeoZoneId").build();
      }
      for (Object[] o : list) {
        array.add(GettotaltaxratesbygeozoneidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}