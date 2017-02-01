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

public class ModelSaleVoucherDAOImpl implements ModelSaleVoucherDAO {
  private Log logger = LogFactory.getLog(ModelSaleVoucherDAOImpl.class);

  @Inject EntityManager em;

  public Response deleteVoucher() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteVoucher");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteVoucher");
        return Response.serverError().entity("query string NOT FOUND deleteVoucher").build();
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

  public Response editVoucher() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editVoucher");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editVoucher");
        return Response.serverError().entity("query string NOT FOUND editVoucher").build();
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

  public Response deleteVoucher1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteVoucher1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteVoucher1");
        return Response.serverError().entity("query string NOT FOUND deleteVoucher1").build();
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

  public Response getVoucherByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getVoucherByCode");

      Query query = em.createNativeQuery(queryStr, OcVoucher.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getVoucherByCode");
        return Response.serverError().entity("query string NOT FOUND getVoucherByCode").build();
      }

   

      List<OcVoucher> list = (List<OcVoucher>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getVoucherByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getVoucherByCode").build();
      }
      for (OcVoucher o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addVoucher() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addVoucher");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addVoucher");
        return Response.serverError().entity("query string NOT FOUND addVoucher").build();
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

  public Response getTotalVouchersByVoucherThemeId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalVouchersByVoucherThemeId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalVouchersByVoucherThemeId");
        return Response.serverError().entity("query string NOT FOUND getTotalVouchersByVoucherThemeId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalVouchersByVoucherThemeId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalVouchersByVoucherThemeId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalvouchersbyvoucherthemeidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getVoucher() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getVoucher");

      Query query = em.createNativeQuery(queryStr, OcVoucher.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getVoucher");
        return Response.serverError().entity("query string NOT FOUND getVoucher").build();
      }

   

      List<OcVoucher> list = (List<OcVoucher>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getVoucher");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getVoucher").build();
      }
      for (OcVoucher o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalVoucherHistories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalVoucherHistories");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalVoucherHistories");
        return Response.serverError().entity("query string NOT FOUND getTotalVoucherHistories").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalVoucherHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalVoucherHistories").build();
      }
      for (Object[] o : list) {
        array.add(GettotalvoucherhistoriesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getVoucherHistories(  Integer OrderId) {
    JsonArray array = new JsonArray();

    if (null == OrderId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getVoucherHistories");

      Query query = em.createNativeQuery(queryStr, OcVoucherHistory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getVoucherHistories");
        return Response.serverError().entity("query string NOT FOUND getVoucherHistories").build();
      }

        query.setParameter("OrderId", OrderId); 

      List<OcVoucherHistory> list = (List<OcVoucherHistory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getVoucherHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getVoucherHistories").build();
      }
      for (OcVoucherHistory o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalVouchers() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalVouchers");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalVouchers");
        return Response.serverError().entity("query string NOT FOUND getTotalVouchers").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalVouchers");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalVouchers").build();
      }
      for (Object[] o : list) {
        array.add(GettotalvouchersDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}