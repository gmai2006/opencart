package com.opencart.admin.dao.model.marketing;
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

public class ModelMarketingCouponDAOImpl implements ModelMarketingCouponDAO {
  private Log logger = LogFactory.getLog(ModelMarketingCouponDAOImpl.class);

  @Inject EntityManager em;

  public Response getCouponCategories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCouponCategories");

      Query query = em.createNativeQuery(queryStr, OcCouponCategory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCouponCategories");
        return Response.serverError().entity("query string NOT FOUND getCouponCategories").build();
      }

   

      List<OcCouponCategory> list = (List<OcCouponCategory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCouponCategories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCouponCategories").build();
      }
      for (OcCouponCategory o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCoupon3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCoupon3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCoupon3");
        return Response.serverError().entity("query string NOT FOUND deleteCoupon3").build();
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

  public Response deleteCoupon2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCoupon2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCoupon2");
        return Response.serverError().entity("query string NOT FOUND deleteCoupon2").build();
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

  public Response deleteCoupon1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCoupon1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCoupon1");
        return Response.serverError().entity("query string NOT FOUND deleteCoupon1").build();
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

  public Response getCoupon() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCoupon");

      Query query = em.createNativeQuery(queryStr, OcCoupon.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCoupon");
        return Response.serverError().entity("query string NOT FOUND getCoupon").build();
      }

   

      List<OcCoupon> list = (List<OcCoupon>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCoupon");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCoupon").build();
      }
      for (OcCoupon o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCouponByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCouponByCode");

      Query query = em.createNativeQuery(queryStr, OcCoupon.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCouponByCode");
        return Response.serverError().entity("query string NOT FOUND getCouponByCode").build();
      }

   

      List<OcCoupon> list = (List<OcCoupon>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCouponByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCouponByCode").build();
      }
      for (OcCoupon o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalCouponHistories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCouponHistories");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCouponHistories");
        return Response.serverError().entity("query string NOT FOUND getTotalCouponHistories").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCouponHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCouponHistories").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcouponhistoriesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCouponProducts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCouponProducts");

      Query query = em.createNativeQuery(queryStr, OcCouponProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCouponProducts");
        return Response.serverError().entity("query string NOT FOUND getCouponProducts").build();
      }

   

      List<OcCouponProduct> list = (List<OcCouponProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCouponProducts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCouponProducts").build();
      }
      for (OcCouponProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCoupon() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCoupon");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCoupon");
        return Response.serverError().entity("query string NOT FOUND deleteCoupon").build();
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

  public Response editCoupon4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCoupon4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCoupon4");
        return Response.serverError().entity("query string NOT FOUND editCoupon4").build();
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

  public Response editCoupon1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCoupon1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCoupon1");
        return Response.serverError().entity("query string NOT FOUND editCoupon1").build();
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

  public Response getCouponHistories(  Integer OrderId) {
    JsonArray array = new JsonArray();

    if (null == OrderId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getCouponHistories");

      Query query = em.createNativeQuery(queryStr, OcCouponHistory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCouponHistories");
        return Response.serverError().entity("query string NOT FOUND getCouponHistories").build();
      }

        query.setParameter("OrderId", OrderId); 

      List<OcCouponHistory> list = (List<OcCouponHistory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCouponHistories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCouponHistories").build();
      }
      for (OcCouponHistory o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCoupon3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCoupon3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCoupon3");
        return Response.serverError().entity("query string NOT FOUND editCoupon3").build();
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

  public Response editCoupon2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCoupon2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCoupon2");
        return Response.serverError().entity("query string NOT FOUND editCoupon2").build();
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

  public Response editCoupon() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCoupon");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCoupon");
        return Response.serverError().entity("query string NOT FOUND editCoupon").build();
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

  public Response addCoupon() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCoupon");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCoupon");
        return Response.serverError().entity("query string NOT FOUND addCoupon").build();
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

  public Response addCoupon2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCoupon2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCoupon2");
        return Response.serverError().entity("query string NOT FOUND addCoupon2").build();
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

  public Response addCoupon1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCoupon1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCoupon1");
        return Response.serverError().entity("query string NOT FOUND addCoupon1").build();
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

  public Response getTotalCoupons() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCoupons");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCoupons");
        return Response.serverError().entity("query string NOT FOUND getTotalCoupons").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCoupons");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCoupons").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcouponsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

}