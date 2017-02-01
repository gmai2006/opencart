package com.opencart.admin.dao.model.catalog;
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

public class ModelCatalogProductDAOImpl implements ModelCatalogProductDAO {
  private Log logger = LogFactory.getLog(ModelCatalogProductDAOImpl.class);

  @Inject EntityManager em;

  public Response getProductAttributes1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductAttributes1");

      Query query = em.createNativeQuery(queryStr, OcProductAttribute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductAttributes1");
        return Response.serverError().entity("query string NOT FOUND getProductAttributes1").build();
      }

   

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

  public Response deleteProduct19() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct19");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct19");
        return Response.serverError().entity("query string NOT FOUND deleteProduct19").build();
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

  public Response deleteProduct17() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct17");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct17");
        return Response.serverError().entity("query string NOT FOUND deleteProduct17").build();
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

  public Response deleteProduct15() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct15");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct15");
        return Response.serverError().entity("query string NOT FOUND deleteProduct15").build();
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

  public Response deleteProduct16() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct16");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct16");
        return Response.serverError().entity("query string NOT FOUND deleteProduct16").build();
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

  public Response deleteProduct13() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct13");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct13");
        return Response.serverError().entity("query string NOT FOUND deleteProduct13").build();
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

  public Response deleteProduct14() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct14");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct14");
        return Response.serverError().entity("query string NOT FOUND deleteProduct14").build();
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

  public Response getTotalProductsByAttributeId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByAttributeId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByAttributeId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByAttributeId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByAttributeId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByAttributeId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbyattributeidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteProduct11() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct11");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct11");
        return Response.serverError().entity("query string NOT FOUND deleteProduct11").build();
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

  public Response deleteProduct12() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct12");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct12");
        return Response.serverError().entity("query string NOT FOUND deleteProduct12").build();
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

  public Response deleteProduct10() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct10");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct10");
        return Response.serverError().entity("query string NOT FOUND deleteProduct10").build();
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

  public Response getProductRewards() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductRewards");

      Query query = em.createNativeQuery(queryStr, OcProductReward.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductRewards");
        return Response.serverError().entity("query string NOT FOUND getProductRewards").build();
      }

   

      List<OcProductReward> list = (List<OcProductReward>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductRewards");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductRewards").build();
      }
      for (OcProductReward o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteProduct1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct1");
        return Response.serverError().entity("query string NOT FOUND deleteProduct1").build();
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

  public Response deleteProduct3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct3");
        return Response.serverError().entity("query string NOT FOUND deleteProduct3").build();
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

  public Response deleteProduct2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct2");
        return Response.serverError().entity("query string NOT FOUND deleteProduct2").build();
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

  public Response getTotalProductsByTaxClassId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByTaxClassId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByTaxClassId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByTaxClassId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByTaxClassId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByTaxClassId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbytaxclassidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalProductsByLengthClassId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByLengthClassId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByLengthClassId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByLengthClassId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByLengthClassId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByLengthClassId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbylengthclassidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteProduct9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct9");
        return Response.serverError().entity("query string NOT FOUND deleteProduct9").build();
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

  public Response deleteProduct8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct8");
        return Response.serverError().entity("query string NOT FOUND deleteProduct8").build();
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

  public Response getProductCategories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductCategories");

      Query query = em.createNativeQuery(queryStr, OcProductToCategory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductCategories");
        return Response.serverError().entity("query string NOT FOUND getProductCategories").build();
      }

   

      List<OcProductToCategory> list = (List<OcProductToCategory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductCategories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductCategories").build();
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

  public Response deleteProduct5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct5");
        return Response.serverError().entity("query string NOT FOUND deleteProduct5").build();
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

  public Response deleteProduct4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct4");
        return Response.serverError().entity("query string NOT FOUND deleteProduct4").build();
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

  public Response deleteProduct7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct7");
        return Response.serverError().entity("query string NOT FOUND deleteProduct7").build();
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

  public Response deleteProduct6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct6");
        return Response.serverError().entity("query string NOT FOUND deleteProduct6").build();
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

  public Response editProduct39() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct39");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct39");
        return Response.serverError().entity("query string NOT FOUND editProduct39").build();
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

  public Response editProduct38() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct38");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct38");
        return Response.serverError().entity("query string NOT FOUND editProduct38").build();
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

  public Response getTotalProductsByWeightClassId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByWeightClassId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByWeightClassId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByWeightClassId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByWeightClassId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByWeightClassId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbyweightclassidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalProductsByOptionId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByOptionId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByOptionId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByOptionId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByOptionId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByOptionId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbyoptionidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addProduct() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct");
        return Response.serverError().entity("query string NOT FOUND addProduct").build();
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

  public Response getProductStores() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductStores");

      Query query = em.createNativeQuery(queryStr, OcProductToStore.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductStores");
        return Response.serverError().entity("query string NOT FOUND getProductStores").build();
      }

   

      List<OcProductToStore> list = (List<OcProductToStore>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductStores");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductStores").build();
      }
      for (OcProductToStore o : list) {
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

      Query query = em.createNativeQuery(queryStr, OcProductOptionValue.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductOptions1");
        return Response.serverError().entity("query string NOT FOUND getProductOptions1").build();
      }

   

      List<OcProductOptionValue> list = (List<OcProductOptionValue>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductOptions1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductOptions1").build();
      }
      for (OcProductOptionValue o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editProduct31() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct31");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct31");
        return Response.serverError().entity("query string NOT FOUND editProduct31").build();
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

  public Response editProduct30() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct30");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct30");
        return Response.serverError().entity("query string NOT FOUND editProduct30").build();
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

  public Response editProduct35() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct35");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct35");
        return Response.serverError().entity("query string NOT FOUND editProduct35").build();
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

  public Response editProduct34() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct34");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct34");
        return Response.serverError().entity("query string NOT FOUND editProduct34").build();
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

  public Response editProduct33() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct33");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct33");
        return Response.serverError().entity("query string NOT FOUND editProduct33").build();
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

  public Response editProduct32() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct32");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct32");
        return Response.serverError().entity("query string NOT FOUND editProduct32").build();
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

  public Response editProduct() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct");
        return Response.serverError().entity("query string NOT FOUND editProduct").build();
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

  public Response getProductDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductDescriptions");

      Query query = em.createNativeQuery(queryStr, OcProductDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductDescriptions");
        return Response.serverError().entity("query string NOT FOUND getProductDescriptions").build();
      }

   

      List<OcProductDescription> list = (List<OcProductDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductDescriptions").build();
      }
      for (OcProductDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductOptionValue(  Integer OptionValueId) {
    JsonArray array = new JsonArray();

    if (null == OptionValueId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getProductOptionValue");

      Query query = em.createNativeQuery(queryStr, OcOptionValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductOptionValue");
        return Response.serverError().entity("query string NOT FOUND getProductOptionValue").build();
      }

        query.setParameter("OptionValueId", OptionValueId); 

      List<OcOptionValueDescription> list = (List<OcOptionValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductOptionValue");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductOptionValue").build();
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

  public Response getTotalProductsByDownloadId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByDownloadId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByDownloadId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByDownloadId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByDownloadId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByDownloadId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbydownloadidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editProduct28() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct28");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct28");
        return Response.serverError().entity("query string NOT FOUND editProduct28").build();
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

  public Response editProduct27() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct27");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct27");
        return Response.serverError().entity("query string NOT FOUND editProduct27").build();
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

  public Response editProduct26() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct26");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct26");
        return Response.serverError().entity("query string NOT FOUND editProduct26").build();
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

  public Response editProduct25() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct25");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct25");
        return Response.serverError().entity("query string NOT FOUND editProduct25").build();
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

  public Response getProductDownloads() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductDownloads");

      Query query = em.createNativeQuery(queryStr, OcProductToDownload.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductDownloads");
        return Response.serverError().entity("query string NOT FOUND getProductDownloads").build();
      }

   

      List<OcProductToDownload> list = (List<OcProductToDownload>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductDownloads");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductDownloads").build();
      }
      for (OcProductToDownload o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editProduct29() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct29");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct29");
        return Response.serverError().entity("query string NOT FOUND editProduct29").build();
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

  public Response editProduct20() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct20");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct20");
        return Response.serverError().entity("query string NOT FOUND editProduct20").build();
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

  public Response editProduct24() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct24");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct24");
        return Response.serverError().entity("query string NOT FOUND editProduct24").build();
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

  public Response editProduct23() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct23");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct23");
        return Response.serverError().entity("query string NOT FOUND editProduct23").build();
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

  public Response editProduct22() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct22");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct22");
        return Response.serverError().entity("query string NOT FOUND editProduct22").build();
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

  public Response getRecurrings() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getRecurrings");

      Query query = em.createNativeQuery(queryStr, OcProductRecurring.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getRecurrings");
        return Response.serverError().entity("query string NOT FOUND getRecurrings").build();
      }

   

      List<OcProductRecurring> list = (List<OcProductRecurring>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getRecurrings");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getRecurrings").build();
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

  public Response editProduct21() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct21");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct21");
        return Response.serverError().entity("query string NOT FOUND editProduct21").build();
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

  public Response editProduct17() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct17");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct17");
        return Response.serverError().entity("query string NOT FOUND editProduct17").build();
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

  public Response editProduct16() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct16");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct16");
        return Response.serverError().entity("query string NOT FOUND editProduct16").build();
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

  public Response editProduct15() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct15");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct15");
        return Response.serverError().entity("query string NOT FOUND editProduct15").build();
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

  public Response editProduct14() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct14");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct14");
        return Response.serverError().entity("query string NOT FOUND editProduct14").build();
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

  public Response getProductAttributes(  Integer AttributeId) {
    JsonArray array = new JsonArray();

    if (null == AttributeId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getProductAttributes");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductAttributes");
        return Response.serverError().entity("query string NOT FOUND getProductAttributes").build();
      }

        query.setParameter("AttributeId", AttributeId); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductAttributes");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductAttributes").build();
      }
      for (Object[] o : list) {
        array.add(GetproductattributesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editProduct19() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct19");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct19");
        return Response.serverError().entity("query string NOT FOUND editProduct19").build();
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

  public Response editProduct18() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct18");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct18");
        return Response.serverError().entity("query string NOT FOUND editProduct18").build();
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

  public Response editProduct13() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct13");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct13");
        return Response.serverError().entity("query string NOT FOUND editProduct13").build();
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

  public Response editProduct12() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct12");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct12");
        return Response.serverError().entity("query string NOT FOUND editProduct12").build();
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

  public Response editProduct11() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct11");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct11");
        return Response.serverError().entity("query string NOT FOUND editProduct11").build();
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

  public Response editProduct10() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct10");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct10");
        return Response.serverError().entity("query string NOT FOUND editProduct10").build();
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

  public Response getProductsByCategoryId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductsByCategoryId");

      Query query = em.createNativeQuery(queryStr, OcProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductsByCategoryId");
        return Response.serverError().entity("query string NOT FOUND getProductsByCategoryId").build();
      }

   

      List<OcProduct> list = (List<OcProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductsByCategoryId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductsByCategoryId").build();
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

  public Response getTotalProductsByLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByLayoutId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByLayoutId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByLayoutId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByLayoutId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbylayoutidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteProduct() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteProduct");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteProduct");
        return Response.serverError().entity("query string NOT FOUND deleteProduct").build();
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

  public Response addProduct19() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct19");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct19");
        return Response.serverError().entity("query string NOT FOUND addProduct19").build();
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

  public Response addProduct17() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct17");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct17");
        return Response.serverError().entity("query string NOT FOUND addProduct17").build();
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

  public Response addProduct18() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct18");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct18");
        return Response.serverError().entity("query string NOT FOUND addProduct18").build();
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

  public Response addProduct15() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct15");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct15");
        return Response.serverError().entity("query string NOT FOUND addProduct15").build();
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

  public Response addProduct16() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct16");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct16");
        return Response.serverError().entity("query string NOT FOUND addProduct16").build();
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

  public Response addProduct13() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct13");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct13");
        return Response.serverError().entity("query string NOT FOUND addProduct13").build();
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

  public Response addProduct14() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct14");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct14");
        return Response.serverError().entity("query string NOT FOUND addProduct14").build();
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

  public Response getProductFilters() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductFilters");

      Query query = em.createNativeQuery(queryStr, OcProductFilter.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductFilters");
        return Response.serverError().entity("query string NOT FOUND getProductFilters").build();
      }

   

      List<OcProductFilter> list = (List<OcProductFilter>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductFilters");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductFilters").build();
      }
      for (OcProductFilter o : list) {
        array.add(o.toJson());
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

      Query query = em.createNativeQuery(queryStr, OcProductRelated.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductRelated");
        return Response.serverError().entity("query string NOT FOUND getProductRelated").build();
      }

   

      List<OcProductRelated> list = (List<OcProductRelated>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductRelated");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductRelated").build();
      }
      for (OcProductRelated o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalProductsByManufacturerId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByManufacturerId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByManufacturerId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByManufacturerId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByManufacturerId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByManufacturerId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbymanufactureridDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getProductLayouts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductLayouts");

      Query query = em.createNativeQuery(queryStr, OcProductToLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductLayouts");
        return Response.serverError().entity("query string NOT FOUND getProductLayouts").build();
      }

   

      List<OcProductToLayout> list = (List<OcProductToLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductLayouts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductLayouts").build();
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

  public Response getProductSpecials() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getProductSpecials");

      Query query = em.createNativeQuery(queryStr, OcProductSpecial.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getProductSpecials");
        return Response.serverError().entity("query string NOT FOUND getProductSpecials").build();
      }

   

      List<OcProductSpecial> list = (List<OcProductSpecial>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getProductSpecials");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getProductSpecials").build();
      }
      for (OcProductSpecial o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addProduct11() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct11");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct11");
        return Response.serverError().entity("query string NOT FOUND addProduct11").build();
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

  public Response addProduct12() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct12");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct12");
        return Response.serverError().entity("query string NOT FOUND addProduct12").build();
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

  public Response addProduct10() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct10");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct10");
        return Response.serverError().entity("query string NOT FOUND addProduct10").build();
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

  public Response editProduct8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct8");
        return Response.serverError().entity("query string NOT FOUND editProduct8").build();
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

  public Response editProduct7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct7");
        return Response.serverError().entity("query string NOT FOUND editProduct7").build();
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

  public Response editProduct6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct6");
        return Response.serverError().entity("query string NOT FOUND editProduct6").build();
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

  public Response getTotalProductsByProfileId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByProfileId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByProfileId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByProfileId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByProfileId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByProfileId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbyprofileidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editProduct5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct5");
        return Response.serverError().entity("query string NOT FOUND editProduct5").build();
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

  public Response editProduct9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct9");
        return Response.serverError().entity("query string NOT FOUND editProduct9").build();
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

  public Response copyProduct() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("copyProduct");

      Query query = em.createNativeQuery(queryStr, OcProduct.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND copyProduct");
        return Response.serverError().entity("query string NOT FOUND copyProduct").build();
      }

   

      List<OcProduct> list = (List<OcProduct>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for copyProduct");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for copyProduct").build();
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

  public Response addProduct23() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct23");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct23");
        return Response.serverError().entity("query string NOT FOUND addProduct23").build();
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

  public Response addProduct20() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct20");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct20");
        return Response.serverError().entity("query string NOT FOUND addProduct20").build();
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

  public Response addProduct21() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct21");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct21");
        return Response.serverError().entity("query string NOT FOUND addProduct21").build();
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

  public Response editProduct4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct4");
        return Response.serverError().entity("query string NOT FOUND editProduct4").build();
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

  public Response editProduct3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct3");
        return Response.serverError().entity("query string NOT FOUND editProduct3").build();
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

  public Response editProduct2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct2");
        return Response.serverError().entity("query string NOT FOUND editProduct2").build();
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

  public Response getTotalProductsByStockStatusId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalProductsByStockStatusId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalProductsByStockStatusId");
        return Response.serverError().entity("query string NOT FOUND getTotalProductsByStockStatusId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalProductsByStockStatusId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalProductsByStockStatusId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalproductsbystockstatusidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editProduct1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editProduct1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editProduct1");
        return Response.serverError().entity("query string NOT FOUND editProduct1").build();
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

  public Response addProduct7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct7");
        return Response.serverError().entity("query string NOT FOUND addProduct7").build();
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

  public Response addProduct6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct6");
        return Response.serverError().entity("query string NOT FOUND addProduct6").build();
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

  public Response addProduct9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct9");
        return Response.serverError().entity("query string NOT FOUND addProduct9").build();
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

  public Response addProduct8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct8");
        return Response.serverError().entity("query string NOT FOUND addProduct8").build();
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

  public Response addProduct1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct1");
        return Response.serverError().entity("query string NOT FOUND addProduct1").build();
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

  public Response addProduct3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct3");
        return Response.serverError().entity("query string NOT FOUND addProduct3").build();
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

  public Response addProduct2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct2");
        return Response.serverError().entity("query string NOT FOUND addProduct2").build();
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

  public Response addProduct5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct5");
        return Response.serverError().entity("query string NOT FOUND addProduct5").build();
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

  public Response addProduct4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addProduct4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addProduct4");
        return Response.serverError().entity("query string NOT FOUND addProduct4").build();
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