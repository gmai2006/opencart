package com.opencart.catalog.dao.model.setting;
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

public class ModelSettingApiDAOImpl implements ModelSettingApiDAO {
  private Log logger = LogFactory.getLog(ModelSettingApiDAOImpl.class);

  @Inject EntityManager em;

  public Response login() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("login");

      Query query = em.createNativeQuery(queryStr, OcApi.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND login");
        return Response.serverError().entity("query string NOT FOUND login").build();
      }

   

      List<OcApi> list = (List<OcApi>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for login");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for login").build();
      }
      for (OcApi o : list) {
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