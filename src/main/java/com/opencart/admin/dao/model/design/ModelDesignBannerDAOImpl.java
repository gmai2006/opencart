package com.opencart.admin.dao.model.design;
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

public class ModelDesignBannerDAOImpl implements ModelDesignBannerDAO {
  private Log logger = LogFactory.getLog(ModelDesignBannerDAOImpl.class);

  @Inject EntityManager em;

  public Response addBanner() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addBanner");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addBanner");
        return Response.serverError().entity("query string NOT FOUND addBanner").build();
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

  public Response addBanner1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addBanner1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addBanner1");
        return Response.serverError().entity("query string NOT FOUND addBanner1").build();
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

  public Response getBannerImages() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getBannerImages");

      Query query = em.createNativeQuery(queryStr, OcBannerImage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getBannerImages");
        return Response.serverError().entity("query string NOT FOUND getBannerImages").build();
      }

   

      List<OcBannerImage> list = (List<OcBannerImage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getBannerImages");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getBannerImages").build();
      }
      for (OcBannerImage o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteBanner() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteBanner");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteBanner");
        return Response.serverError().entity("query string NOT FOUND deleteBanner").build();
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

  public Response editBanner2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editBanner2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editBanner2");
        return Response.serverError().entity("query string NOT FOUND editBanner2").build();
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

  public Response editBanner() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editBanner");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editBanner");
        return Response.serverError().entity("query string NOT FOUND editBanner").build();
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

  public Response getTotalBanners() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalBanners");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalBanners");
        return Response.serverError().entity("query string NOT FOUND getTotalBanners").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalBanners");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalBanners").build();
      }
      for (Object[] o : list) {
        array.add(GettotalbannersDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editBanner1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editBanner1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editBanner1");
        return Response.serverError().entity("query string NOT FOUND editBanner1").build();
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

  public Response getBanner() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getBanner");

      Query query = em.createNativeQuery(queryStr, OcBanner.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getBanner");
        return Response.serverError().entity("query string NOT FOUND getBanner").build();
      }

   

      List<OcBanner> list = (List<OcBanner>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getBanner");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getBanner").build();
      }
      for (OcBanner o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteBanner1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteBanner1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteBanner1");
        return Response.serverError().entity("query string NOT FOUND deleteBanner1").build();
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