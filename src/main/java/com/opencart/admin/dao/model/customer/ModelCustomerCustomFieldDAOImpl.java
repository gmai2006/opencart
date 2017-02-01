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

public class ModelCustomerCustomFieldDAOImpl implements ModelCustomerCustomFieldDAO {
  private Log logger = LogFactory.getLog(ModelCustomerCustomFieldDAOImpl.class);

  @Inject EntityManager em;

  public Response addCustomField4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomField4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomField4");
        return Response.serverError().entity("query string NOT FOUND addCustomField4").build();
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

  public Response editCustomField1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField1");
        return Response.serverError().entity("query string NOT FOUND editCustomField1").build();
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

  public Response getCustomFieldValue() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFieldValue");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldValue.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFieldValue");
        return Response.serverError().entity("query string NOT FOUND getCustomFieldValue").build();
      }

   

      List<OcCustomFieldValue> list = (List<OcCustomFieldValue>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFieldValue");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFieldValue").build();
      }
      for (OcCustomFieldValue o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCustomField2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField2");
        return Response.serverError().entity("query string NOT FOUND editCustomField2").build();
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

  public Response editCustomField3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField3");
        return Response.serverError().entity("query string NOT FOUND editCustomField3").build();
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

  public Response addCustomField() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomField");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomField");
        return Response.serverError().entity("query string NOT FOUND addCustomField").build();
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

  public Response addCustomField1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomField1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomField1");
        return Response.serverError().entity("query string NOT FOUND addCustomField1").build();
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

  public Response editCustomField5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField5");
        return Response.serverError().entity("query string NOT FOUND editCustomField5").build();
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

  public Response editCustomField6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField6");
        return Response.serverError().entity("query string NOT FOUND editCustomField6").build();
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

  public Response addCustomField3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCustomField3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCustomField3");
        return Response.serverError().entity("query string NOT FOUND addCustomField3").build();
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

  public Response editCustomField7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField7");
        return Response.serverError().entity("query string NOT FOUND editCustomField7").build();
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

  public Response editCustomField8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField8");
        return Response.serverError().entity("query string NOT FOUND editCustomField8").build();
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

  public Response getCustomFieldCustomerGroups() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFieldCustomerGroups");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldCustomerGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFieldCustomerGroups");
        return Response.serverError().entity("query string NOT FOUND getCustomFieldCustomerGroups").build();
      }

   

      List<OcCustomFieldCustomerGroup> list = (List<OcCustomFieldCustomerGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFieldCustomerGroups");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFieldCustomerGroups").build();
      }
      for (OcCustomFieldCustomerGroup o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCustomField9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField9");
        return Response.serverError().entity("query string NOT FOUND editCustomField9").build();
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

  public Response getCustomFieldDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFieldDescriptions");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFieldDescriptions");
        return Response.serverError().entity("query string NOT FOUND getCustomFieldDescriptions").build();
      }

   

      List<OcCustomFieldDescription> list = (List<OcCustomFieldDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFieldDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFieldDescriptions").build();
      }
      for (OcCustomFieldDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCustomField() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCustomField");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCustomField");
        return Response.serverError().entity("query string NOT FOUND editCustomField").build();
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

  public Response deleteCustomField() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomField");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomField");
        return Response.serverError().entity("query string NOT FOUND deleteCustomField").build();
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

  public Response getCustomFieldValues() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFieldValues");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldValue.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFieldValues");
        return Response.serverError().entity("query string NOT FOUND getCustomFieldValues").build();
      }

   

      List<OcCustomFieldValue> list = (List<OcCustomFieldValue>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFieldValues");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFieldValues").build();
      }
      for (OcCustomFieldValue o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomFieldValueDescriptions1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFieldValueDescriptions1");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFieldValueDescriptions1");
        return Response.serverError().entity("query string NOT FOUND getCustomFieldValueDescriptions1").build();
      }

   

      List<OcCustomFieldValueDescription> list = (List<OcCustomFieldValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFieldValueDescriptions1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFieldValueDescriptions1").build();
      }
      for (OcCustomFieldValueDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomField() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomField");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomField");
        return Response.serverError().entity("query string NOT FOUND getCustomField").build();
      }

   

      List<OcCustomFieldDescription> list = (List<OcCustomFieldDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomField");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomField").build();
      }
      for (OcCustomFieldDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCustomField2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomField2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomField2");
        return Response.serverError().entity("query string NOT FOUND deleteCustomField2").build();
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

  public Response deleteCustomField3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomField3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomField3");
        return Response.serverError().entity("query string NOT FOUND deleteCustomField3").build();
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

  public Response deleteCustomField4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomField4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomField4");
        return Response.serverError().entity("query string NOT FOUND deleteCustomField4").build();
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

  public Response deleteCustomField1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCustomField1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCustomField1");
        return Response.serverError().entity("query string NOT FOUND deleteCustomField1").build();
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

  public Response getTotalCustomFields() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCustomFields");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCustomFields");
        return Response.serverError().entity("query string NOT FOUND getTotalCustomFields").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCustomFields");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCustomFields").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcustomfieldsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCustomFieldValueDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCustomFieldValueDescriptions");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldValue.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCustomFieldValueDescriptions");
        return Response.serverError().entity("query string NOT FOUND getCustomFieldValueDescriptions").build();
      }

   

      List<OcCustomFieldValue> list = (List<OcCustomFieldValue>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCustomFieldValueDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCustomFieldValueDescriptions").build();
      }
      for (OcCustomFieldValue o : list) {
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