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

public class ModelCatalogInformationDAOImpl implements ModelCatalogInformationDAO {
  private Log logger = LogFactory.getLog(ModelCatalogInformationDAOImpl.class);

  @Inject EntityManager em;

  public Response getInformationLayouts() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformationLayouts");

      Query query = em.createNativeQuery(queryStr, OcInformationToLayout.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformationLayouts");
        return Response.serverError().entity("query string NOT FOUND getInformationLayouts").build();
      }

   

      List<OcInformationToLayout> list = (List<OcInformationToLayout>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformationLayouts");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformationLayouts").build();
      }
      for (OcInformationToLayout o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getTotalInformationsByLayoutId() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalInformationsByLayoutId");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalInformationsByLayoutId");
        return Response.serverError().entity("query string NOT FOUND getTotalInformationsByLayoutId").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalInformationsByLayoutId");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalInformationsByLayoutId").build();
      }
      for (Object[] o : list) {
        array.add(GettotalinformationsbylayoutidDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getInformations() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformations");

      Query query = em.createNativeQuery(queryStr, OcInformation.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformations");
        return Response.serverError().entity("query string NOT FOUND getInformations").build();
      }

   

      List<OcInformation> list = (List<OcInformation>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformations");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformations").build();
      }
      for (OcInformation o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getInformationDescriptions() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformationDescriptions");

      Query query = em.createNativeQuery(queryStr, OcInformationDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformationDescriptions");
        return Response.serverError().entity("query string NOT FOUND getInformationDescriptions").build();
      }

   

      List<OcInformationDescription> list = (List<OcInformationDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformationDescriptions");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformationDescriptions").build();
      }
      for (OcInformationDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addInformation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addInformation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addInformation");
        return Response.serverError().entity("query string NOT FOUND addInformation").build();
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

  public Response getTotalInformations() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalInformations");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalInformations");
        return Response.serverError().entity("query string NOT FOUND getTotalInformations").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalInformations");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalInformations").build();
      }
      for (Object[] o : list) {
        array.add(GettotalinformationsDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteInformation3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteInformation3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteInformation3");
        return Response.serverError().entity("query string NOT FOUND deleteInformation3").build();
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

  public Response deleteInformation2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteInformation2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteInformation2");
        return Response.serverError().entity("query string NOT FOUND deleteInformation2").build();
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

  public Response deleteInformation1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteInformation1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteInformation1");
        return Response.serverError().entity("query string NOT FOUND deleteInformation1").build();
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

  public Response getInformationStores() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getInformationStores");

      Query query = em.createNativeQuery(queryStr, OcInformationToStore.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getInformationStores");
        return Response.serverError().entity("query string NOT FOUND getInformationStores").build();
      }

   

      List<OcInformationToStore> list = (List<OcInformationToStore>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getInformationStores");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getInformationStores").build();
      }
      for (OcInformationToStore o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response editInformation6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation6");
        return Response.serverError().entity("query string NOT FOUND editInformation6").build();
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

  public Response deleteInformation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteInformation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteInformation");
        return Response.serverError().entity("query string NOT FOUND deleteInformation").build();
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

  public Response editInformation2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation2");
        return Response.serverError().entity("query string NOT FOUND editInformation2").build();
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

  public Response editInformation3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation3");
        return Response.serverError().entity("query string NOT FOUND editInformation3").build();
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

  public Response editInformation4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation4");
        return Response.serverError().entity("query string NOT FOUND editInformation4").build();
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

  public Response editInformation5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation5");
        return Response.serverError().entity("query string NOT FOUND editInformation5").build();
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

  public Response addInformation3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addInformation3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addInformation3");
        return Response.serverError().entity("query string NOT FOUND addInformation3").build();
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

  public Response editInformation() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation");
        return Response.serverError().entity("query string NOT FOUND editInformation").build();
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

  public Response editInformation1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editInformation1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editInformation1");
        return Response.serverError().entity("query string NOT FOUND editInformation1").build();
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

  public Response addInformation1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addInformation1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addInformation1");
        return Response.serverError().entity("query string NOT FOUND addInformation1").build();
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

  public Response addInformation2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addInformation2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addInformation2");
        return Response.serverError().entity("query string NOT FOUND addInformation2").build();
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