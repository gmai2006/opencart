package com.opencart.catalog.dao.model.design;
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

public class ModelDesignBannerDAOImpl implements ModelDesignBannerDAO {
  private Log logger = LogFactory.getLog(ModelDesignBannerDAOImpl.class);

  @Inject EntityManager em;

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

}