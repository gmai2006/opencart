package com.opencart.admin.dao.model.localisation;
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

public class ModelLocalisationLanguageDAOImpl implements ModelLocalisationLanguageDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationLanguageDAOImpl.class);

  @Inject EntityManager em;

  public Response addLanguage9() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage9");

      Query query = em.createNativeQuery(queryStr, OcCustomerGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage9");
        return Response.serverError().entity("query string NOT FOUND addLanguage9").build();
      }

   

      List<OcCustomerGroupDescription> list = (List<OcCustomerGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage9");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage9").build();
      }
      for (OcCustomerGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getLanguages() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLanguages");

      Query query = em.createNativeQuery(queryStr, OcLanguage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLanguages");
        return Response.serverError().entity("query string NOT FOUND getLanguages").build();
      }

   

      List<OcLanguage> list = (List<OcLanguage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLanguages");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLanguages").build();
      }
      for (OcLanguage o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage29() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage29");

      Query query = em.createNativeQuery(queryStr, OcOrderStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage29");
        return Response.serverError().entity("query string NOT FOUND addLanguage29").build();
      }

   

      List<OcOrderStatus> list = (List<OcOrderStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage29");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage29").build();
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

  public Response addLanguage36() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage36");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage36");
        return Response.serverError().entity("query string NOT FOUND addLanguage36").build();
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

  public Response addLanguage37() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage37");

      Query query = em.createNativeQuery(queryStr, OcReturnReason.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage37");
        return Response.serverError().entity("query string NOT FOUND addLanguage37").build();
      }

   

      List<OcReturnReason> list = (List<OcReturnReason>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage37");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage37").build();
      }
      for (OcReturnReason o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage38() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage38");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage38");
        return Response.serverError().entity("query string NOT FOUND addLanguage38").build();
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

  public Response addLanguage39() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage39");

      Query query = em.createNativeQuery(queryStr, OcReturnStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage39");
        return Response.serverError().entity("query string NOT FOUND addLanguage39").build();
      }

   

      List<OcReturnStatus> list = (List<OcReturnStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage39");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage39").build();
      }
      for (OcReturnStatus o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage32() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage32");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage32");
        return Response.serverError().entity("query string NOT FOUND addLanguage32").build();
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

  public Response addLanguage33() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage33");

      Query query = em.createNativeQuery(queryStr, OcProductAttribute.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage33");
        return Response.serverError().entity("query string NOT FOUND addLanguage33").build();
      }

   

      List<OcProductAttribute> list = (List<OcProductAttribute>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage33");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage33").build();
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

  public Response addLanguage34() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage34");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage34");
        return Response.serverError().entity("query string NOT FOUND addLanguage34").build();
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

  public Response addLanguage35() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage35");

      Query query = em.createNativeQuery(queryStr, OcReturnAction.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage35");
        return Response.serverError().entity("query string NOT FOUND addLanguage35").build();
      }

   

      List<OcReturnAction> list = (List<OcReturnAction>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage35");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage35").build();
      }
      for (OcReturnAction o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage30() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage30");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage30");
        return Response.serverError().entity("query string NOT FOUND addLanguage30").build();
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

  public Response addLanguage31() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage31");

      Query query = em.createNativeQuery(queryStr, OcProductDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage31");
        return Response.serverError().entity("query string NOT FOUND addLanguage31").build();
      }

   

      List<OcProductDescription> list = (List<OcProductDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage31");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage31").build();
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

  public Response addLanguage18() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage18");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage18");
        return Response.serverError().entity("query string NOT FOUND addLanguage18").build();
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

  public Response addLanguage19() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage19");

      Query query = em.createNativeQuery(queryStr, OcFilterGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage19");
        return Response.serverError().entity("query string NOT FOUND addLanguage19").build();
      }

   

      List<OcFilterGroupDescription> list = (List<OcFilterGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage19");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage19").build();
      }
      for (OcFilterGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response getLanguageByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLanguageByCode");

      Query query = em.createNativeQuery(queryStr, OcLanguage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLanguageByCode");
        return Response.serverError().entity("query string NOT FOUND getLanguageByCode").build();
      }

   

      List<OcLanguage> list = (List<OcLanguage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLanguageByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLanguageByCode").build();
      }
      for (OcLanguage o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage25() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage25");

      Query query = em.createNativeQuery(queryStr, OcOptionDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage25");
        return Response.serverError().entity("query string NOT FOUND addLanguage25").build();
      }

   

      List<OcOptionDescription> list = (List<OcOptionDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage25");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage25").build();
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

  public Response addLanguage26() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage26");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage26");
        return Response.serverError().entity("query string NOT FOUND addLanguage26").build();
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

  public Response addLanguage27() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage27");

      Query query = em.createNativeQuery(queryStr, OcOptionValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage27");
        return Response.serverError().entity("query string NOT FOUND addLanguage27").build();
      }

   

      List<OcOptionValueDescription> list = (List<OcOptionValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage27");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage27").build();
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

  public Response addLanguage28() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage28");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage28");
        return Response.serverError().entity("query string NOT FOUND addLanguage28").build();
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

  public Response addLanguage21() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage21");

      Query query = em.createNativeQuery(queryStr, OcInformationDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage21");
        return Response.serverError().entity("query string NOT FOUND addLanguage21").build();
      }

   

      List<OcInformationDescription> list = (List<OcInformationDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage21");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage21").build();
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

  public Response addLanguage22() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage22");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage22");
        return Response.serverError().entity("query string NOT FOUND addLanguage22").build();
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

  public Response addLanguage23() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage23");

      Query query = em.createNativeQuery(queryStr, OcLengthClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage23");
        return Response.serverError().entity("query string NOT FOUND addLanguage23").build();
      }

   

      List<OcLengthClassDescription> list = (List<OcLengthClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage23");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage23").build();
      }
      for (OcLengthClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage24() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage24");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage24");
        return Response.serverError().entity("query string NOT FOUND addLanguage24").build();
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

  public Response editLanguage(  String Code) {
    JsonArray array = new JsonArray();

    if (null == Code ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("editLanguage");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLanguage");
        return Response.serverError().entity("query string NOT FOUND editLanguage").build();
      }

        query.setParameter("Code", Code); 

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for editLanguage");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for editLanguage").build();
      }
      for (Object[] o : list) {
        array.add(EditlanguageDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage20() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage20");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage20");
        return Response.serverError().entity("query string NOT FOUND addLanguage20").build();
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

  public Response deleteLanguage12() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage12");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage12");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage12").build();
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

  public Response addLanguage14() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage14");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage14");
        return Response.serverError().entity("query string NOT FOUND addLanguage14").build();
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

  public Response deleteLanguage13() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage13");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage13");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage13").build();
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

  public Response addLanguage15() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage15");

      Query query = em.createNativeQuery(queryStr, OcDownloadDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage15");
        return Response.serverError().entity("query string NOT FOUND addLanguage15").build();
      }

   

      List<OcDownloadDescription> list = (List<OcDownloadDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage15");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage15").build();
      }
      for (OcDownloadDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLanguage14() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage14");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage14");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage14").build();
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

  public Response addLanguage16() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage16");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage16");
        return Response.serverError().entity("query string NOT FOUND addLanguage16").build();
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

  public Response deleteLanguage15() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage15");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage15");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage15").build();
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

  public Response addLanguage17() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage17");

      Query query = em.createNativeQuery(queryStr, OcFilterDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage17");
        return Response.serverError().entity("query string NOT FOUND addLanguage17").build();
      }

   

      List<OcFilterDescription> list = (List<OcFilterDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage17");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage17").build();
      }
      for (OcFilterDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage10() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage10");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage10");
        return Response.serverError().entity("query string NOT FOUND addLanguage10").build();
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

  public Response addLanguage11() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage11");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage11");
        return Response.serverError().entity("query string NOT FOUND addLanguage11").build();
      }

   

      List<OcCustomFieldDescription> list = (List<OcCustomFieldDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage11");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage11").build();
      }
      for (OcCustomFieldDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLanguage10() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage10");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage10");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage10").build();
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

  public Response getTotalLanguages() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getTotalLanguages");

      Query query = em.createNativeQuery(queryStr);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getTotalLanguages");
        return Response.serverError().entity("query string NOT FOUND getTotalLanguages").build();
      }

   

      List<Object[]> list = (List<Object[]>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getTotalLanguages");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getTotalLanguages").build();
      }
      for (Object[] o : list) {
        array.add(GettotallanguagesDTO.fromArray(o).toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage12() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage12");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage12");
        return Response.serverError().entity("query string NOT FOUND addLanguage12").build();
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

  public Response deleteLanguage11() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage11");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage11");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage11").build();
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

  public Response deleteLanguage() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage").build();
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

  public Response addLanguage13() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage13");

      Query query = em.createNativeQuery(queryStr, OcCustomFieldValueDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage13");
        return Response.serverError().entity("query string NOT FOUND addLanguage13").build();
      }

   

      List<OcCustomFieldValueDescription> list = (List<OcCustomFieldValueDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage13");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage13").build();
      }
      for (OcCustomFieldValueDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage50() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage50");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage50");
        return Response.serverError().entity("query string NOT FOUND addLanguage50").build();
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

  public Response addLanguage() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage");
        return Response.serverError().entity("query string NOT FOUND addLanguage").build();
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

  public Response deleteLanguage16() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage16");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage16");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage16").build();
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

  public Response deleteLanguage17() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage17");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage17");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage17").build();
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

  public Response deleteLanguage18() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage18");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage18");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage18").build();
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

  public Response deleteLanguage19() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage19");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage19");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage19").build();
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

  public Response getLanguage() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getLanguage");

      Query query = em.createNativeQuery(queryStr, OcLanguage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getLanguage");
        return Response.serverError().entity("query string NOT FOUND getLanguage").build();
      }

   

      List<OcLanguage> list = (List<OcLanguage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getLanguage");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getLanguage").build();
      }
      for (OcLanguage o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLanguage9() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage9");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage9");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage9").build();
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

  public Response deleteLanguage8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage8");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage8").build();
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

  public Response deleteLanguage7() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage7");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage7");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage7").build();
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

  public Response deleteLanguage6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage6");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage6").build();
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

  public Response editLanguage2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLanguage2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLanguage2");
        return Response.serverError().entity("query string NOT FOUND editLanguage2").build();
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

  public Response deleteLanguage5() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage5");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage5");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage5").build();
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

  public Response editLanguage3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLanguage3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLanguage3");
        return Response.serverError().entity("query string NOT FOUND editLanguage3").build();
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

  public Response deleteLanguage4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage4");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage4").build();
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

  public Response deleteLanguage3() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage3");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage3");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage3").build();
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

  public Response deleteLanguage2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage2");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage2").build();
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

  public Response addLanguage47() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage47");

      Query query = em.createNativeQuery(queryStr, OcRecurringDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage47");
        return Response.serverError().entity("query string NOT FOUND addLanguage47").build();
      }

   

      List<OcRecurringDescription> list = (List<OcRecurringDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage47");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage47").build();
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

  public Response deleteLanguage1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage1");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage1").build();
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

  public Response addLanguage48() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage48");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage48");
        return Response.serverError().entity("query string NOT FOUND addLanguage48").build();
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

  public Response addLanguage49() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage49");

      Query query = em.createNativeQuery(queryStr, OcBannerImage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage49");
        return Response.serverError().entity("query string NOT FOUND addLanguage49").build();
      }

   

      List<OcBannerImage> list = (List<OcBannerImage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage49");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage49").build();
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

  public Response editLanguage1() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("editLanguage1");

      if (null == queryStr) {
        logger.error("query string NOT FOUND editLanguage1");
        return Response.serverError().entity("query string NOT FOUND editLanguage1").build();
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

  public Response addLanguage43() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage43");

      Query query = em.createNativeQuery(queryStr, OcVoucherThemeDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage43");
        return Response.serverError().entity("query string NOT FOUND addLanguage43").build();
      }

   

      List<OcVoucherThemeDescription> list = (List<OcVoucherThemeDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage43");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage43").build();
      }
      for (OcVoucherThemeDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLanguage20() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage20");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage20");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage20").build();
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

  public Response addLanguage44() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage44");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage44");
        return Response.serverError().entity("query string NOT FOUND addLanguage44").build();
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

  public Response deleteLanguage21() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage21");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage21");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage21").build();
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

  public Response addLanguage45() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage45");

      Query query = em.createNativeQuery(queryStr, OcWeightClassDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage45");
        return Response.serverError().entity("query string NOT FOUND addLanguage45").build();
      }

   

      List<OcWeightClassDescription> list = (List<OcWeightClassDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage45");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage45").build();
      }
      for (OcWeightClassDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response deleteLanguage22() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("deleteLanguage22");

      if (null == queryStr) {
        logger.error("query string NOT FOUND deleteLanguage22");
        return Response.serverError().entity("query string NOT FOUND deleteLanguage22").build();
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

  public Response addLanguage46() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage46");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage46");
        return Response.serverError().entity("query string NOT FOUND addLanguage46").build();
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

  public Response addLanguage8() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage8");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage8");
        return Response.serverError().entity("query string NOT FOUND addLanguage8").build();
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

  public Response addLanguage7() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage7");

      Query query = em.createNativeQuery(queryStr, OcCategoryDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage7");
        return Response.serverError().entity("query string NOT FOUND addLanguage7").build();
      }

   

      List<OcCategoryDescription> list = (List<OcCategoryDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage7");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage7").build();
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

  public Response addLanguage40() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage40");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage40");
        return Response.serverError().entity("query string NOT FOUND addLanguage40").build();
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

  public Response addLanguage6() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage6");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage6");
        return Response.serverError().entity("query string NOT FOUND addLanguage6").build();
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

  public Response addLanguage41() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage41");

      Query query = em.createNativeQuery(queryStr, OcStockStatus.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage41");
        return Response.serverError().entity("query string NOT FOUND addLanguage41").build();
      }

   

      List<OcStockStatus> list = (List<OcStockStatus>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage41");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage41").build();
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

  public Response addLanguage5() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage5");

      Query query = em.createNativeQuery(queryStr, OcBannerImage.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage5");
        return Response.serverError().entity("query string NOT FOUND addLanguage5").build();
      }

   

      List<OcBannerImage> list = (List<OcBannerImage>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage5");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage5").build();
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

  public Response addLanguage42() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage42");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage42");
        return Response.serverError().entity("query string NOT FOUND addLanguage42").build();
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

  public Response addLanguage4() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage4");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage4");
        return Response.serverError().entity("query string NOT FOUND addLanguage4").build();
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

  public Response addLanguage3() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage3");

      Query query = em.createNativeQuery(queryStr, OcAttributeGroupDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage3");
        return Response.serverError().entity("query string NOT FOUND addLanguage3").build();
      }

   

      List<OcAttributeGroupDescription> list = (List<OcAttributeGroupDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage3");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage3").build();
      }
      for (OcAttributeGroupDescription o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addLanguage2() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addLanguage2");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage2");
        return Response.serverError().entity("query string NOT FOUND addLanguage2").build();
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

  public Response addLanguage1() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("addLanguage1");

      Query query = em.createNativeQuery(queryStr, OcAttributeDescription.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND addLanguage1");
        return Response.serverError().entity("query string NOT FOUND addLanguage1").build();
      }

   

      List<OcAttributeDescription> list = (List<OcAttributeDescription>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for addLanguage1");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for addLanguage1").build();
      }
      for (OcAttributeDescription o : list) {
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