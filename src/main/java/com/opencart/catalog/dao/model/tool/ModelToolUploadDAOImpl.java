package com.opencart.catalog.dao.model.tool;
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

public class ModelToolUploadDAOImpl implements ModelToolUploadDAO {
  private Log logger = LogFactory.getLog(ModelToolUploadDAOImpl.class);

  @Inject EntityManager em;

  public Response getUploadByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUploadByCode");

      Query query = em.createNativeQuery(queryStr, OcUpload.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUploadByCode");
        return Response.serverError().entity("query string NOT FOUND getUploadByCode").build();
      }

   

      List<OcUpload> list = (List<OcUpload>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUploadByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUploadByCode").build();
      }
      for (OcUpload o : list) {
        array.add(o.toJson());
      }

    }
    catch (Exception ex) {
       logger.error("ERROR in methodName due to " + ex.getMessage());
       return Response.serverError().entity(ex.getMessage()).build();
    }
    return Response.ok(array).build();
  }

  public Response addUpload() {
    JsonArray array = new JsonArray();
    int result = -1;
    try {
      String queryStr = BeanUtils.getQueryString("addUpload");

      if (null == queryStr) {
        logger.error("query string NOT FOUND addUpload");
        return Response.serverError().entity("query string NOT FOUND addUpload").build();
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