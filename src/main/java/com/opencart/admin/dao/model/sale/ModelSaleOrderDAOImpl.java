package com.opencart.admin.dao.model.sale;
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

public class ModelSaleOrderDAOImpl implements ModelSaleOrderDAO {
  private Log logger = LogFactory.getLog(ModelSaleOrderDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalOrdersByProcessingStatus() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByProcessingStatus");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByProcessingStatus");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByProcessingStatus").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByProcessingStatus");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByProcessingStatus").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersbyprocessingstatusDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrdersByLanguageId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByLanguageId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByLanguageId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByLanguageId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByLanguageId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByLanguageId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersbylanguageidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

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

  public Response getTotalOrdersByCompleteStatus() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByCompleteStatus");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByCompleteStatus");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByCompleteStatus").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByCompleteStatus");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByCompleteStatus").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersbycompletestatusDTO.fromArray(o).toJson());
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

  public Response getOrderVoucherByVoucherId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrderVoucherByVoucherId");

      Query query = em.createNativeQuery(queryStr, OcOrderVoucher.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrderVoucherByVoucherId");
        return Response.serverError().entity("query string NOT FOUND getOrderVoucherByVoucherId").build();
      }

   

      List<OcOrderVoucher> list = (List<OcOrderVoucher>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrderVoucherByVoucherId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrderVoucherByVoucherId").build();
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

  public Response deleteOrder8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder8");
        return Response.serverError().entity("query string NOT FOUND deleteOrder8").build();
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

  public Response deleteOrder9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteOrder9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteOrder9");
        return Response.serverError().entity("query string NOT FOUND deleteOrder9").build();
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

  public Response getTotalOrderHistoriesByOrderStatusId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrderHistoriesByOrderStatusId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrderHistoriesByOrderStatusId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrderHistoriesByOrderStatusId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrderHistoriesByOrderStatusId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrderHistoriesByOrderStatusId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalorderhistoriesbyorderstatusidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
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

  public Response createInvoiceNo(  Integer InvoiceNo) {
    JsonArray array = new JsonArray();

    if (null == InvoiceNo ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("createInvoiceNo");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND createInvoiceNo");
        return Response.serverError().entity("query string NOT FOUND createInvoiceNo").build();
      }

        query.setParameter("InvoiceNo", InvoiceNo); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for createInvoiceNo");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for createInvoiceNo").build();
      }
      for (Object[] o : list) {
        array.add(CreateinvoicenoDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
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

  public Response getTotalOrdersByOrderStatusId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByOrderStatusId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByOrderStatusId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByOrderStatusId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByOrderStatusId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByOrderStatusId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersbyorderstatusidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
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

  public Response getTotalEmailsByProductsOrdered(  String Email) {
    JsonArray array = new JsonArray();

    if (null == Email ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTotalEmailsByProductsOrdered");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalEmailsByProductsOrdered");
        return Response.serverError().entity("query string NOT FOUND getTotalEmailsByProductsOrdered").build();
      }

        query.setParameter("Email", Email); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalEmailsByProductsOrdered");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalEmailsByProductsOrdered").build();
      }
      for (Object[] o : list) {
        array.add(GettotalemailsbyproductsorderedDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
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

  public Response getEmailsByProductsOrdered(  String Email) {
    JsonArray array = new JsonArray();

    if (null == Email ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getEmailsByProductsOrdered");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getEmailsByProductsOrdered");
        return Response.serverError().entity("query string NOT FOUND getEmailsByProductsOrdered").build();
      }

        query.setParameter("Email", Email); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getEmailsByProductsOrdered");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getEmailsByProductsOrdered").build();
      }
      for (Object[] o : list) {
        array.add(GetemailsbyproductsorderedDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalOrdersByCurrencyId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByCurrencyId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByCurrencyId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByCurrencyId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByCurrencyId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByCurrencyId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersbycurrencyidDTO.fromArray(o).toJson());
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

  public Response getTotalOrdersByStoreId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrdersByStoreId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrdersByStoreId");
        return Response.serverError().entity("query string NOT FOUND getTotalOrdersByStoreId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrdersByStoreId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrdersByStoreId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalordersbystoreidDTO.fromArray(o).toJson());
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

  public Response getOrder5() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder5");

      Query query = em.createNativeQuery(queryStr, OcOrderProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder5");
        return Response.serverError().entity("query string NOT FOUND getOrder5").build();
      }

   

      List<OcOrderProduct> list = (List<OcOrderProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder5");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder5").build();
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

  public Response getTotalOrderHistories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalOrderHistories");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalOrderHistories");
        return Response.serverError().entity("query string NOT FOUND getTotalOrderHistories").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalOrderHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalOrderHistories").build();
      }
      for (Object[] o : list) {
        array.add(GettotalorderhistoriesDTO.fromArray(o).toJson());
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

  public Response getOrder() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getOrder");

      Query query = em.createNativeQuery(queryStr, OcCustomer.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getOrder");
        return Response.serverError().entity("query string NOT FOUND getOrder").build();
      }

   

      List<OcCustomer> list = (List<OcCustomer>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getOrder");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getOrder").build();
      }
      for (OcCustomer o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response createInvoiceNo1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("createInvoiceNo1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND createInvoiceNo1");
        return Response.serverError().entity("query string NOT FOUND createInvoiceNo1").build();
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