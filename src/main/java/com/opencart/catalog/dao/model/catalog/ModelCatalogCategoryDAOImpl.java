package com.opencart.catalog.dao.model.catalog;
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

public class ModelCatalogCategoryDAOImpl implements ModelCatalogCategoryDAO {
  private Log logger = LogFactory.getLog(ModelCatalogCategoryDAOImpl.class);

  @Inject EntityManager em;

  public Response getTotalCategoriesByCategoryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCategoriesByCategoryId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCategoriesByCategoryId");
        return Response.serverError().entity("query string NOT FOUND getTotalCategoriesByCategoryId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCategoriesByCategoryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCategoriesByCategoryId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcategoriesbycategoryidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategoryFilters(  Integer FilterId) {
    JsonArray array = new JsonArray();

    if (null == FilterId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getCategoryFilters");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryFilters");
        return Response.serverError().entity("query string NOT FOUND getCategoryFilters").build();
      }

        query.setParameter("FilterId", FilterId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryFilters");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryFilters").build();
      }
      for (Object[] o : list) {
        array.add(GetcategoryfiltersDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategoryLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategoryLayoutId");

      Query query = em.createNativeQuery(queryStr, OcCategoryToLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryLayoutId");
        return Response.serverError().entity("query string NOT FOUND getCategoryLayoutId").build();
      }

   

      List<OcCategoryToLayout> list = (List<OcCategoryToLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryLayoutId").build();
      }
      for (OcCategoryToLayout o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategories");

      Query query = em.createNativeQuery(queryStr, OcCategoryDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategories");
        return Response.serverError().entity("query string NOT FOUND getCategories").build();
      }

   

      List<OcCategoryDescription> list = (List<OcCategoryDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategories").build();
      }
      for (OcCategoryDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategoryFilters2(  Integer FilterId) {
    JsonArray array = new JsonArray();

    if (null == FilterId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getCategoryFilters2");

      Query query = em.createNativeQuery(queryStr, OcFilter.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryFilters2");
        return Response.serverError().entity("query string NOT FOUND getCategoryFilters2").build();
      }

        query.setParameter("FilterId", FilterId); 

      List<OcFilter> list = (List<OcFilter>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryFilters2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryFilters2").build();
      }
      for (OcFilter o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategory() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategory");

      Query query = em.createNativeQuery(queryStr, OcCategoryDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategory");
        return Response.serverError().entity("query string NOT FOUND getCategory").build();
      }

   

      List<OcCategoryDescription> list = (List<OcCategoryDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategory");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategory").build();
      }
      for (OcCategoryDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategoryFilters1(  Integer FilterGroupId) {
    JsonArray array = new JsonArray();

    if (null == FilterGroupId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getCategoryFilters1");

      Query query = em.createNativeQuery(queryStr, OcFilterGroup.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryFilters1");
        return Response.serverError().entity("query string NOT FOUND getCategoryFilters1").build();
      }

        query.setParameter("FilterGroupId", FilterGroupId); 

      List<OcFilterGroup> list = (List<OcFilterGroup>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryFilters1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryFilters1").build();
      }
      for (OcFilterGroup o : list) {
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