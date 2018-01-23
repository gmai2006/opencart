/*************************************************************************
 *
 * DATASCIENCE9 LLC CONFIDENTIAL
 * __________________
 *
 *  [2018] Datascience9 LLC
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Datascience9 LLC and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Datascience9 LLC
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Datascience9 LLC.
 * @author Paul Mai - Datascience9 LLC
 */
package com.opencart.catalog;

import static java.util.Objects.requireNonNull;

import java.util.List;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.inject.Inject;
import javax.ws.rs.core.MediaType;
import com.opencart.entity.*;
import com.opencart.entity.service.*;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)

public class ModelCatalogCategoryResource {
  private final static Logger logger = Logger.getLogger(ModelCatalogCategoryResource.class.getName());

  private final ModelCatalogCategoryService service;

  @Inject
  protected ModelCatalogCategoryResource(final ModelCatalogCategoryService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getFilterQuery")
  @GET
  public List<ModelCatalogCategory0Dto> getFilterQuery(Integer filter_group_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getFilterQuery(filter_group_id,language_id);
  }

  @Path("/getQuery")
  @GET
  public List<Integer> getQuery(Integer category_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQuery(category_id);
  }

  @Path("/getTotalCategoriesByCategoryId")
  @GET
  public java.math.BigInteger getTotalCategoriesByCategoryId(Integer parent_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalCategoriesByCategoryId(parent_id,store_id);
  }

  @Path("/getCategoryLayoutId")
  @GET
  public List<OcCategoryToLayout> getCategoryLayoutId(Integer category_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCategoryLayoutId(category_id,store_id);
  }

  @Path("/getFilterGroupQuery")
  @GET
  public List<ModelCatalogCategory1Dto> getFilterGroupQuery(Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getFilterGroupQuery(language_id);
  }

  @Path("/getCategory")
  @GET
  public List<ModelCatalogCategory2Dto> getCategory(Integer category_id,Integer language_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCategory(category_id,language_id,store_id);
  }

  @Path("/getCategories")
  @GET
  public List<ModelCatalogCategory2Dto> getCategories(Integer parent_id,Integer language_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCategories(parent_id,language_id,store_id);
  }
}