package com.opencart.catalog.dao.model.checkout;
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

import com.opencart.catalog.model.*;

public class ModelCheckoutOrderDAOImpl implements ModelCheckoutOrderDAO {
  private Log logger = LogFactory.getLog(ModelCheckoutOrderDAOImpl.class);

  @Inject EntityManager em;

  public Response editOrder() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder");
        return Response.serverError().entity("query string NOT FOUND editOrder").build();
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

  public Response deleteOrder7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder7");
        return Response.serverError().entity("query string NOT FOUND deleteOrder7").build();
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

  public Response deleteOrder3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder3");
        return Response.serverError().entity("query string NOT FOUND deleteOrder3").build();
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

  public Response deleteOrder4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder4");
        return Response.serverError().entity("query string NOT FOUND deleteOrder4").build();
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

  public Response deleteOrder5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder5");
        return Response.serverError().entity("query string NOT FOUND deleteOrder5").build();
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

  public Response deleteOrder6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder6");
        return Response.serverError().entity("query string NOT FOUND deleteOrder6").build();
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

  public Response deleteOrder1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder1");
        return Response.serverError().entity("query string NOT FOUND deleteOrder1").build();
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

  public Response deleteOrder2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder2");
        return Response.serverError().entity("query string NOT FOUND deleteOrder2").build();
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

  public Response addOrderHistory() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory");

      Query query = em.createNativeQuery(queryStr, OcOrderTotal.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory").build();
      }

   

      List<OcOrderTotal> list = (List<OcOrderTotal>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory").build();
      }
      for (OcOrderTotal o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrder4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrder4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrder4");
        return Response.serverError().entity("query string NOT FOUND addOrder4").build();
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

  public Response addOrder3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrder3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrder3");
        return Response.serverError().entity("query string NOT FOUND addOrder3").build();
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

  public Response addOrder2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrder2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrder2");
        return Response.serverError().entity("query string NOT FOUND addOrder2").build();
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

  public Response addOrder1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrder1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrder1");
        return Response.serverError().entity("query string NOT FOUND addOrder1").build();
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

  public Response addOrder5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrder5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrder5");
        return Response.serverError().entity("query string NOT FOUND addOrder5").build();
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

  public Response addOrderHistory20() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory20");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory20");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory20").build();
      }

   

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory20");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory20").build();
      }
      for (OcOrderStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrder() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrder");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrder");
        return Response.serverError().entity("query string NOT FOUND addOrder").build();
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

  public Response deleteOrder() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder");
        return Response.serverError().entity("query string NOT FOUND deleteOrder").build();
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

  public Response addOrderHistory6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory6");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory6").build();
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

  public Response editOrder3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder3");
        return Response.serverError().entity("query string NOT FOUND editOrder3").build();
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

  public Response addOrderHistory5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory5");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory5").build();
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

  public Response editOrder2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder2");
        return Response.serverError().entity("query string NOT FOUND editOrder2").build();
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

  public Response addOrderHistory4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory4");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory4").build();
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

  public Response getOrder4() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder4");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder4");
        return Response.serverError().entity("query string NOT FOUND getOrder4").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder4");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder4").build();
      }
      for (OcZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOrder1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder1");
        return Response.serverError().entity("query string NOT FOUND editOrder1").build();
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

  public Response addOrderHistory3() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory3");

      Query query = em.createNativeQuery(queryStr, OcOrderOption.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory3");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory3").build();
      }

   

      List<OcOrderOption> list = (List<OcOrderOption>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory3");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory3").build();
      }
      for (OcOrderOption o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory2");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory2").build();
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

  public Response getOrder2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder2");

      Query query = em.createNativeQuery(queryStr, OcZone.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder2");
        return Response.serverError().entity("query string NOT FOUND getOrder2").build();
      }

   

      List<OcZone> list = (List<OcZone>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder2").build();
      }
      for (OcZone o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory1");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory1");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory1").build();
      }

   

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory1").build();
      }
      for (OcOrderProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOrder3() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder3");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder3");
        return Response.serverError().entity("query string NOT FOUND getOrder3").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder3");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder3").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOrder1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder1");

      Query query = em.createNativeQuery(queryStr, OcCountry.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder1");
        return Response.serverError().entity("query string NOT FOUND getOrder1").build();
      }

   

      List<OcCountry> list = (List<OcCountry>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder1").build();
      }
      for (OcCountry o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory10() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory10");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory10");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory10").build();
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

  public Response addOrderHistory11() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory11");

      Query query = em.createNativeQuery(queryStr, OcOrderTotal.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory11");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory11").build();
      }

   

      List<OcOrderTotal> list = (List<OcOrderTotal>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory11");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory11").build();
      }
      for (OcOrderTotal o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOrder9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder9");
        return Response.serverError().entity("query string NOT FOUND editOrder9").build();
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

  public Response editOrder8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder8");
        return Response.serverError().entity("query string NOT FOUND editOrder8").build();
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

  public Response editOrder7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder7");
        return Response.serverError().entity("query string NOT FOUND editOrder7").build();
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

  public Response addOrderHistory9() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory9");

      Query query = em.createNativeQuery(queryStr, OcOrderOption.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory9");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory9").build();
      }

   

      List<OcOrderOption> list = (List<OcOrderOption>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory9");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory9").build();
      }
      for (OcOrderOption o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOrder6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder6");
        return Response.serverError().entity("query string NOT FOUND editOrder6").build();
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

  public Response addOrderHistory8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory8");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory8").build();
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

  public Response editOrder5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder5");
        return Response.serverError().entity("query string NOT FOUND editOrder5").build();
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

  public Response addOrderHistory7() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory7");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory7");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory7").build();
      }

   

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory7");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory7").build();
      }
      for (OcOrderProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editOrder4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editOrder4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editOrder4");
        return Response.serverError().entity("query string NOT FOUND editOrder4").build();
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

  public Response getOrder() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder");
        return Response.serverError().entity("query string NOT FOUND getOrder").build();
      }

   

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder").build();
      }
      for (OcOrderStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory18() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory18");

      Query query = em.createNativeQuery(queryStr, OcOrderOption.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory18");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory18").build();
      }

   

      List<OcOrderOption> list = (List<OcOrderOption>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory18");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory18").build();
      }
      for (OcOrderOption o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory19() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory19");

      Query query = em.createNativeQuery(queryStr, OcOrderOption.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory19");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory19").build();
      }

   

      List<OcOrderOption> list = (List<OcOrderOption>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory19");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory19").build();
      }
      for (OcOrderOption o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory16() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory16");

      Query query = em.createNativeQuery(queryStr, OcOrderVoucher.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory16");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory16").build();
      }

   

      List<OcOrderVoucher> list = (List<OcOrderVoucher>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory16");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory16").build();
      }
      for (OcOrderVoucher o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory17() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory17");

      Query query = em.createNativeQuery(queryStr, OcOrderTotal.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory17");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory17").build();
      }

   

      List<OcOrderTotal> list = (List<OcOrderTotal>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory17");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory17").build();
      }
      for (OcOrderTotal o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory14() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory14");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory14");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory14").build();
      }

   

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory14");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory14").build();
      }
      for (OcOrderStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory15() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory15");

      Query query = em.createNativeQuery(queryStr, OcOrderOption.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory15");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory15").build();
      }

   

      List<OcOrderOption> list = (List<OcOrderOption>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory15");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory15").build();
      }
      for (OcOrderOption o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory12() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory12");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory12");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory12").build();
      }

   

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory12");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory12").build();
      }
      for (OcOrderProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addOrderHistory13() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addOrderHistory13");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addOrderHistory13");
        return Response.serverError().entity("query string NOT FOUND addOrderHistory13").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addOrderHistory13");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addOrderHistory13").build();
      }
      for (Object[] o : list) {
        array.add(Addorderhistory13DTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}