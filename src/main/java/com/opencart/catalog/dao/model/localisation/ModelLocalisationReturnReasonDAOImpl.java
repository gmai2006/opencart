package com.opencart.catalog.dao.model.localisation;
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

public class ModelLocalisationReturnReasonDAOImpl implements ModelLocalisationReturnReasonDAO {
  private Log logger = LogFactory.getLog(ModelLocalisationReturnReasonDAOImpl.class);

  @Inject EntityManager em;

  public Response getReturnReasons(  Integer ReturnReasonId) {
    JsonArray array = new JsonArray();

    if (null == ReturnReasonId ) {
      return Response.serverError().entity("missing required params").build();
    }

    try {
      String queryStr = BeanUtils.getQueryString("getReturnReasons");

      Query query = em.createNativeQuery(queryStr, OcReturnReason.class);

      if (null == queryStr) {
        logger.error("query string NOT FOUND getReturnReasons");
        return Response.serverError().entity("query string NOT FOUND getReturnReasons").build();
      }

        query.setParameter("ReturnReasonId", ReturnReasonId); 

      List<OcReturnReason> list = (List<OcReturnReason>)query.getResultList();

      if (null == list || list.isEmpty()) {
        logger.warn("not record returned for getReturnReasons");
        return Response.status(Response.Status.NOT_FOUND).entity("no record returned for getReturnReasons").build();
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

}