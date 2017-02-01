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

public class ModelCatalogCategoryDAOImpl implements ModelCatalogCategoryDAO {
  private Log logger = LogFactory.getLog(ModelCatalogCategoryDAOImpl.class);

  @Inject EntityManager em;

  public Response editCategory10() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("editCategory10");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory10");
        return Response.serverError().entity("query string NOT FOUND editCategory10").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for editCategory10");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for editCategory10").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getCategoryStores() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategoryStores");

      Query query = em.createNativeQuery(queryStr, OcCategoryToStore.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryStores");
        return Response.serverError().entity("query string NOT FOUND getCategoryStores").build();
      }

   

      List<OcCategoryToStore> list = (List<OcCategoryToStore>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryStores");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryStores").build();
      }
      for (OcCategoryToStore o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCategory17() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory17");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory17");
        return Response.serverError().entity("query string NOT FOUND editCategory17").build();
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

  public Response repairCategories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("repairCategories");

      Query query = em.createNativeQuery(queryStr, OcCategory.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND repairCategories");
        return Response.serverError().entity("query string NOT FOUND repairCategories").build();
      }

   

      List<OcCategory> list = (List<OcCategory>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for repairCategories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for repairCategories").build();
      }
      for (OcCategory o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCategory18() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory18");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory18");
        return Response.serverError().entity("query string NOT FOUND editCategory18").build();
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

  public Response editCategory15() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory15");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory15");
        return Response.serverError().entity("query string NOT FOUND editCategory15").build();
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

  public Response editCategory16() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory16");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory16");
        return Response.serverError().entity("query string NOT FOUND editCategory16").build();
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

  public Response editCategory13() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory13");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory13");
        return Response.serverError().entity("query string NOT FOUND editCategory13").build();
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

  public Response editCategory14() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory14");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory14");
        return Response.serverError().entity("query string NOT FOUND editCategory14").build();
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

  public Response editCategory11() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory11");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory11");
        return Response.serverError().entity("query string NOT FOUND editCategory11").build();
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

  public Response getCategoryFilters() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategoryFilters");

      Query query = em.createNativeQuery(queryStr, OcCategoryFilter.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryFilters");
        return Response.serverError().entity("query string NOT FOUND getCategoryFilters").build();
      }

   

      List<OcCategoryFilter> list = (List<OcCategoryFilter>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryFilters");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryFilters").build();
      }
      for (OcCategoryFilter o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addCategory7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory7");
        return Response.serverError().entity("query string NOT FOUND addCategory7").build();
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

  public Response addCategory8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory8");
        return Response.serverError().entity("query string NOT FOUND addCategory8").build();
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

  public Response addCategory3() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addCategory3");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory3");
        return Response.serverError().entity("query string NOT FOUND addCategory3").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addCategory3");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addCategory3").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addCategory4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory4");
        return Response.serverError().entity("query string NOT FOUND addCategory4").build();
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

  public Response addCategory5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory5");
        return Response.serverError().entity("query string NOT FOUND addCategory5").build();
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

  public Response addCategory6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory6");
        return Response.serverError().entity("query string NOT FOUND addCategory6").build();
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

  public Response addCategory1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory1");
        return Response.serverError().entity("query string NOT FOUND addCategory1").build();
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

  public Response getCategoryLayouts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategoryLayouts");

      Query query = em.createNativeQuery(queryStr, OcCategoryToLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryLayouts");
        return Response.serverError().entity("query string NOT FOUND getCategoryLayouts").build();
      }

   

      List<OcCategoryToLayout> list = (List<OcCategoryToLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryLayouts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryLayouts").build();
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

  public Response addCategory2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addCategory2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addCategory2");
        return Response.serverError().entity("query string NOT FOUND addCategory2").build();
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

  public Response getCategoryDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getCategoryDescriptions");

      Query query = em.createNativeQuery(queryStr, OcCategoryDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryDescriptions");
        return Response.serverError().entity("query string NOT FOUND getCategoryDescriptions").build();
      }

   

      List<OcCategoryDescription> list = (List<OcCategoryDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryDescriptions").build();
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

  public Response repairCategories2() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("repairCategories2");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND repairCategories2");
        return Response.serverError().entity("query string NOT FOUND repairCategories2").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for repairCategories2");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for repairCategories2").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response repairCategories1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("repairCategories1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND repairCategories1");
        return Response.serverError().entity("query string NOT FOUND repairCategories1").build();
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

  public Response repairCategories3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("repairCategories3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND repairCategories3");
        return Response.serverError().entity("query string NOT FOUND repairCategories3").build();
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

  public Response getTotalCategoriesByLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCategoriesByLayoutId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCategoriesByLayoutId");
        return Response.serverError().entity("query string NOT FOUND getTotalCategoriesByLayoutId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCategoriesByLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCategoriesByLayoutId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcategoriesbylayoutidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCategory9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory9");
        return Response.serverError().entity("query string NOT FOUND editCategory9").build();
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

  public Response getCategoryPath(  Integer CategoryId) {
    JsonArray array = new JsonArray();

    if (null == CategoryId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getCategoryPath");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getCategoryPath");
        return Response.serverError().entity("query string NOT FOUND getCategoryPath").build();
      }

        query.setParameter("CategoryId", CategoryId); 

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getCategoryPath");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getCategoryPath").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCategory9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory9");
        return Response.serverError().entity("query string NOT FOUND deleteCategory9").build();
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

  public Response deleteCategory() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory");
        return Response.serverError().entity("query string NOT FOUND deleteCategory").build();
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

  public Response getTotalCategories() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalCategories");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalCategories");
        return Response.serverError().entity("query string NOT FOUND getTotalCategories").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalCategories");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalCategories").build();
      }
      for (Object[] o : list) {
        array.add(GettotalcategoriesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCategory5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory5");
        return Response.serverError().entity("query string NOT FOUND deleteCategory5").build();
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

  public Response editCategory1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory1");
        return Response.serverError().entity("query string NOT FOUND editCategory1").build();
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

  public Response deleteCategory6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory6");
        return Response.serverError().entity("query string NOT FOUND deleteCategory6").build();
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

  public Response deleteCategory7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory7");
        return Response.serverError().entity("query string NOT FOUND deleteCategory7").build();
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

  public Response editCategory3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory3");
        return Response.serverError().entity("query string NOT FOUND editCategory3").build();
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

  public Response editCategory2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory2");
        return Response.serverError().entity("query string NOT FOUND editCategory2").build();
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

  public Response editCategory5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editCategory5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory5");
        return Response.serverError().entity("query string NOT FOUND editCategory5").build();
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

  public Response deleteCategory1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory1");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory1");
        return Response.serverError().entity("query string NOT FOUND deleteCategory1").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for deleteCategory1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for deleteCategory1").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCategory2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory2");
        return Response.serverError().entity("query string NOT FOUND deleteCategory2").build();
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

  public Response editCategory4() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("editCategory4");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory4");
        return Response.serverError().entity("query string NOT FOUND editCategory4").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for editCategory4");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for editCategory4").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editCategory7() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("editCategory7");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory7");
        return Response.serverError().entity("query string NOT FOUND editCategory7").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for editCategory7");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for editCategory7").build();
      }
      for (OcCategoryPath o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteCategory3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory3");
        return Response.serverError().entity("query string NOT FOUND deleteCategory3").build();
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

  public Response deleteCategory4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteCategory4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteCategory4");
        return Response.serverError().entity("query string NOT FOUND deleteCategory4").build();
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

  public Response editCategory6() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("editCategory6");

      Query query = em.createNativeQuery(queryStr, OcCategoryPath.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND editCategory6");
        return Response.serverError().entity("query string NOT FOUND editCategory6").build();
      }

   

      List<OcCategoryPath> list = (List<OcCategoryPath>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for editCategory6");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for editCategory6").build();
      }
      for (OcCategoryPath o : list) {
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