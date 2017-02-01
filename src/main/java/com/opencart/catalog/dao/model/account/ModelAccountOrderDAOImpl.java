package com.opencart.catalog.dao.model.account;
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

public class ModelAccountOrderDAOImpl implements ModelAccountOrderDAO {
  private Log logger = LogFactory.getLog(ModelAccountOrderDAOImpl.class);

  @Inject EntityManager em;

  public Response getOrderHistories(  java.sql.Timestamp DateAdded) {
    JsonArray array = new JsonArray();

    if (null == DateAdded ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getOrderHistories");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderHistories");
        return Response.serverError().entity("query string NOT FOUND getOrderHistories").build();
      }

        query.setParameter("DateAdded", DateAdded); 

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderHistories").build();
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

  public Response getOrderOptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderOptions");

      Query query = em.createNativeQuery(queryStr, OcOrderOption.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderOptions");
        return Response.serverError().entity("query string NOT FOUND getOrderOptions").build();
      }

   

      List<OcOrderOption> list = (List<OcOrderOption>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderOptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderOptions").build();
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

  public Response getOrderProducts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderProducts");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderProducts");
        return Response.serverError().entity("query string NOT FOUND getOrderProducts").build();
      }

   

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderProducts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderProducts").build();
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

  public Response getOrderVouchers() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderVouchers");

      Query query = em.createNativeQuery(queryStr, OcOrderVoucher.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderVouchers");
        return Response.serverError().entity("query string NOT FOUND getOrderVouchers").build();
      }

   

      List<OcOrderVoucher> list = (List<OcOrderVoucher>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderVouchers");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderVouchers").build();
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

  public Response getOrders(  Integer OrderId) {
    JsonArray array = new JsonArray();

    if (null == OrderId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getOrders");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrders");
        return Response.serverError().entity("query string NOT FOUND getOrders").build();
      }

        query.setParameter("OrderId", OrderId); 

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrders");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrders").build();
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

  public Response getOrderTotals() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderTotals");

      Query query = em.createNativeQuery(queryStr, OcOrderTotal.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderTotals");
        return Response.serverError().entity("query string NOT FOUND getOrderTotals").build();
      }

   

      List<OcOrderTotal> list = (List<OcOrderTotal>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderTotals");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderTotals").build();
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

  public Response getOrder() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder");

      Query query = em.createNativeQuery(queryStr, OcOrder.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder");
        return Response.serverError().entity("query string NOT FOUND getOrder").build();
      }

   

      List<OcOrder> list = (List<OcOrder>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder").build();
      }
      for (OcOrder o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrderVouchersByOrderId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrderVouchersByOrderId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrderVouchersByOrderId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrderVouchersByOrderId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrderVouchersByOrderId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrderVouchersByOrderId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordervouchersbyorderidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getOrderProduct() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderProduct");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderProduct");
        return Response.serverError().entity("query string NOT FOUND getOrderProduct").build();
      }

   

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderProduct");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderProduct").build();
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

  public Response getTotalOrders() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrders");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrders");
        return Response.serverError().entity("query string NOT FOUND getTotalOrders").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrders");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrders").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrderProductsByOrderId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrderProductsByOrderId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrderProductsByOrderId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrderProductsByOrderId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrderProductsByOrderId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrderProductsByOrderId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalorderproductsbyorderidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}