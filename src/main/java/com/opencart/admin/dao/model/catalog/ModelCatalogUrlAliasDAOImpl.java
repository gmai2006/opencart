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

public class ModelCatalogUrlAliasDAOImpl implements ModelCatalogUrlAliasDAO {
  private Log logger = LogFactory.getLog(ModelCatalogUrlAliasDAOImpl.class);

  @Inject EntityManager em;

  public Response getUrlAlias() {
    JsonArray array = new JsonArray();


    try {
      String queryStr = BeanUtils.getQueryString("getUrlAlias");

      Query query = em.createNativeQuery(queryStr, OcUrlAlias.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getUrlAlias");
        return Response.serverError().entity("query string NOT FOUND getUrlAlias").build();
      }

   

      List<OcUrlAlias> list = (List<OcUrlAlias>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getUrlAlias");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getUrlAlias").build();
      }
      for (OcUrlAlias o : list) {
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