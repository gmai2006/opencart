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

public class ModelCatalogProductDAOImpl implements ModelCatalogProductDAO {
  private Log logger = LogFactory.getLog(ModelCatalogProductDAOImpl.class);

  @Inject EntityManager em;

  public Response getProductDiscounts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductDiscounts");

      Query query = em.createNativeQuery(queryStr, OcProductDiscount.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductDiscounts");
        return Response.serverError().entity("query string NOT FOUND getProductDiscounts").build();
      }

   

      List<OcProductDiscount> list = (List<OcProductDiscount>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductDiscounts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductDiscounts").build();
      }
      for (OcProductDiscount o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductAttributes1(  Integer AttributeId) {
    JsonArray array = new JsonArray();

    if (null == AttributeId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getProductAttributes1");

      Query query = em.createNativeQuery(queryStr, OcProductAttribute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductAttributes1");
        return Response.serverError().entity("query string NOT FOUND getProductAttributes1").build();
      }

        query.setParameter("AttributeId", AttributeId); 

      List<OcProductAttribute> list = (List<OcProductAttribute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductAttributes1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductAttributes1").build();
      }
      for (OcProductAttribute o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductOptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductOptions");

      Query query = em.createNativeQuery(queryStr, OcOptionDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductOptions");
        return Response.serverError().entity("query string NOT FOUND getProductOptions").build();
      }

   

      List<OcOptionDescription> list = (List<OcOptionDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductOptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductOptions").build();
      }
      for (OcOptionDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProduct() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProduct");

      Query query = em.createNativeQuery(queryStr, OcStockStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProduct");
        return Response.serverError().entity("query string NOT FOUND getProduct").build();
      }

   

      List<OcStockStatus> list = (List<OcStockStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProduct");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProduct").build();
      }
      for (OcStockStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductImages() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductImages");

      Query query = em.createNativeQuery(queryStr, OcProductImage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductImages");
        return Response.serverError().entity("query string NOT FOUND getProductImages").build();
      }

   

      List<OcProductImage> list = (List<OcProductImage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductImages");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductImages").build();
      }
      for (OcProductImage o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductAttributes(  Integer AttributeGroupId) {
    JsonArray array = new JsonArray();

    if (null == AttributeGroupId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getProductAttributes");

      Query query = em.createNativeQuery(queryStr, OcProductAttribute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductAttributes");
        return Response.serverError().entity("query string NOT FOUND getProductAttributes").build();
      }

        query.setParameter("AttributeGroupId", AttributeGroupId); 

      List<OcProductAttribute> list = (List<OcProductAttribute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductAttributes");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductAttributes").build();
      }
      for (OcProductAttribute o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductOptions1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductOptions1");

      Query query = em.createNativeQuery(queryStr, OcOptionValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductOptions1");
        return Response.serverError().entity("query string NOT FOUND getProductOptions1").build();
      }

   

      List<OcOptionValueDescription> list = (List<OcOptionValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductOptions1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductOptions1").build();
      }
      for (OcOptionValueDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProfile() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProfile");

      Query query = em.createNativeQuery(queryStr, OcProductRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProfile");
        return Response.serverError().entity("query string NOT FOUND getProfile").build();
      }

   

      List<OcProductRecurring> list = (List<OcProductRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProfile");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProfile").build();
      }
      for (OcProductRecurring o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalProductSpecials(  Integer ProductId) {
    JsonArray array = new JsonArray();

    if (null == ProductId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductSpecials");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductSpecials");
        return Response.serverError().entity("query string NOT FOUND getTotalProductSpecials").build();
      }

        query.setParameter("ProductId", ProductId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductSpecials");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductSpecials").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductspecialsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductRelated() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductRelated");

      Query query = em.createNativeQuery(queryStr, OcProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductRelated");
        return Response.serverError().entity("query string NOT FOUND getProductRelated").build();
      }

   

      List<OcProduct> list = (List<OcProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductRelated");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductRelated").build();
      }
      for (OcProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getLatestProducts(  Integer ProductId) {
    JsonArray array = new JsonArray();

    if (null == ProductId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getLatestProducts");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLatestProducts");
        return Response.serverError().entity("query string NOT FOUND getLatestProducts").build();
      }

        query.setParameter("ProductId", ProductId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLatestProducts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLatestProducts").build();
      }
      for (Object[] o : list) {
        array.add(GetlatestproductsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getBestSellerProducts(  Integer ProductId) {
    JsonArray array = new JsonArray();

    if (null == ProductId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getBestSellerProducts");

      Query query = em.createNativeQuery(queryStr, OcProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getBestSellerProducts");
        return Response.serverError().entity("query string NOT FOUND getBestSellerProducts").build();
      }

        query.setParameter("ProductId", ProductId); 

      List<OcProduct> list = (List<OcProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getBestSellerProducts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getBestSellerProducts").build();
      }
      for (OcProduct o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductLayoutId");

      Query query = em.createNativeQuery(queryStr, OcProductToLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductLayoutId");
        return Response.serverError().entity("query string NOT FOUND getProductLayoutId").build();
      }

   

      List<OcProductToLayout> list = (List<OcProductToLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductLayoutId").build();
      }
      for (OcProductToLayout o : list) {
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

      Query query = em.createNativeQuery(queryStr, OcProductToCategory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategories");
        return Response.serverError().entity("query string NOT FOUND getCategories").build();
      }

   

      List<OcProductToCategory> list = (List<OcProductToCategory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategories").build();
      }
      for (OcProductToCategory o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getPopularProducts(  Integer ProductId) {
    JsonArray array = new JsonArray();

    if (null == ProductId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getPopularProducts");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getPopularProducts");
        return Response.serverError().entity("query string NOT FOUND getPopularProducts").build();
      }

        query.setParameter("ProductId", ProductId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getPopularProducts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getPopularProducts").build();
      }
      for (Object[] o : list) {
        array.add(GetpopularproductsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProfiles() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProfiles");

      Query query = em.createNativeQuery(queryStr, OcRecurringDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProfiles");
        return Response.serverError().entity("query string NOT FOUND getProfiles").build();
      }

   

      List<OcRecurringDescription> list = (List<OcRecurringDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProfiles");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProfiles").build();
      }
      for (OcRecurringDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response updateViewed() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("updateViewed");

      if (null == queryStr) {
        logger.error("query string NOT FOUND updateViewed");
        return Response.serverError().entity("query string NOT FOUND updateViewed").build();
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