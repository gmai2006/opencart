package com.opencart.admin.dao.model.setting;
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

public class ModelSettingStoreDAOImpl implements ModelSettingStoreDAO {
  private Log logger = LogFactory.getLog(ModelSettingStoreDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalStoresByLanguage() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByLanguage");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByLanguage");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByLanguage").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByLanguage");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByLanguage").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbylanguageDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStoresByCountryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByCountryId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByCountryId");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByCountryId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByCountryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByCountryId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbycountryidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getStores() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getStores");

      Query query = em.createNativeQuery(queryStr, OcStore.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getStores");
        return Response.serverError().entity("query string NOT FOUND getStores").build();
      }

   

      List<OcStore> list = (List<OcStore>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getStores");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getStores").build();
      }
      for (OcStore o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStoresByCustomerGroupId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByCustomerGroupId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByCustomerGroupId");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByCustomerGroupId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByCustomerGroupId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByCustomerGroupId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbycustomergroupidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getStore() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getStore");

      Query query = em.createNativeQuery(queryStr, OcStore.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getStore");
        return Response.serverError().entity("query string NOT FOUND getStore").build();
      }

   

      List<OcStore> list = (List<OcStore>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getStore");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getStore").build();
      }
      for (OcStore o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStoresByInformationId1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByInformationId1");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByInformationId1");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByInformationId1").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByInformationId1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByInformationId1").build();
      }
      for (Object[] o : list) {
        array.add(Gettotalstoresbyinformationid1DTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editStore() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editStore");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editStore");
        return Response.serverError().entity("query string NOT FOUND editStore").build();
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

  public Response getTotalStoresByZoneId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByZoneId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByZoneId");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByZoneId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByZoneId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByZoneId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbyzoneidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteStore1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteStore1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteStore1");
        return Response.serverError().entity("query string NOT FOUND deleteStore1").build();
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

  public Response addStore() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addStore");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addStore");
        return Response.serverError().entity("query string NOT FOUND addStore").build();
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

  public Response getTotalStoresByCurrency() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByCurrency");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByCurrency");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByCurrency").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByCurrency");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByCurrency").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbycurrencyDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteStore() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteStore");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteStore");
        return Response.serverError().entity("query string NOT FOUND deleteStore").build();
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

  public Response getTotalStoresByInformationId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByInformationId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByInformationId");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByInformationId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByInformationId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByInformationId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbyinformationidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addStore2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addStore2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addStore2");
        return Response.serverError().entity("query string NOT FOUND addStore2").build();
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

  public Response addStore1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addStore1");

      Query query = em.createNativeQuery(queryStr, OcLayoutRoute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addStore1");
        return Response.serverError().entity("query string NOT FOUND addStore1").build();
      }

   

      List<OcLayoutRoute> list = (List<OcLayoutRoute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addStore1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addStore1").build();
      }
      for (OcLayoutRoute o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStoresByOrderStatusId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByOrderStatusId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByOrderStatusId");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByOrderStatusId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByOrderStatusId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByOrderStatusId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbyorderstatusidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStores() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStores");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStores");
        return Response.serverError().entity("query string NOT FOUND getTotalStores").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStores");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStores").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalStoresByLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalStoresByLayoutId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalStoresByLayoutId");
        return Response.serverError().entity("query string NOT FOUND getTotalStoresByLayoutId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalStoresByLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalStoresByLayoutId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalstoresbylayoutidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}