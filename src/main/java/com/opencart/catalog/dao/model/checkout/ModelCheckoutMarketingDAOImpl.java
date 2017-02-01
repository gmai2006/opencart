package com.opencart.catalog.dao.model.checkout;
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

public class ModelCheckoutMarketingDAOImpl implements ModelCheckoutMarketingDAO {
  private Log logger = LogFactory.getLog(ModelCheckoutMarketingDAOImpl.class);

  @Inject EntityManager em;

  public Response getMarketingByCode() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getMarketingByCode");

      Query query = em.createNativeQuery(queryStr, OcMarketing.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getMarketingByCode");
        return Response.serverError().entity("query string NOT FOUND getMarketingByCode").build();
      }

   

      List<OcMarketing> list = (List<OcMarketing>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getMarketingByCode");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getMarketingByCode").build();
      }
      for (OcMarketing o : list) {
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