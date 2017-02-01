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

public class ModelSettingSettingDAOImpl implements ModelSettingSettingDAO {
  private Log logger = LogFactory.getLog(ModelSettingSettingDAOImpl.class);

  @Inject EntityManager em;

  public Response getSetting() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getSetting");

      Query query = em.createNativeQuery(queryStr, OcSetting.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getSetting");
        return Response.serverError().entity("query string NOT FOUND getSetting").build();
      }

   

      List<OcSetting> list = (List<OcSetting>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getSetting");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getSetting").build();
      }
      for (OcSetting o : list) {
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