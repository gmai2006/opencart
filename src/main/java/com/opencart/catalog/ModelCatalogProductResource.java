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

public class ModelCatalogProductResource {
  private final static Logger logger = Logger.getLogger(ModelCatalogProductResource.class.getName());

  private final ModelCatalogProductService service;

  @Inject
  protected ModelCatalogProductResource(final ModelCatalogProductService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getProductAttributeQuery")
  @GET
  public List<ModelCatalogProduct0Dto> getProductAttributeQuery(Integer product_id,Integer attribute_group_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductAttributeQuery(product_id,attribute_group_id,language_id);
  }

  @Path("/getTotalProductSpecials")
  @GET
  public java.math.BigInteger getTotalProductSpecials(Integer store_id,Integer customer_group_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getTotalProductSpecials(store_id,customer_group_id);
  }

  @Path("/getLatestProducts")
  @GET
  public List<Integer> getLatestProducts(Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getLatestProducts(store_id);
  }

  @Path("/getProductOptionValueQuery")
  @GET
  public List<ModelCatalogProduct1Dto> getProductOptionValueQuery(Integer product_id,Integer product_option_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductOptionValueQuery(product_id,product_option_id,language_id);
  }

  @Path("/getPopularProducts")
  @GET
  public List<Integer> getPopularProducts(Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getPopularProducts(store_id);
  }

  @Path("/getProductDiscounts")
  @GET
  public List<OcProductDiscount> getProductDiscounts(Integer product_id,Integer customer_group_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductDiscounts(product_id,customer_group_id);
  }

  @Path("/getProfiles")
  @GET
  public List<ModelCatalogProduct2Dto> getProfiles(Integer product_id,Integer customer_group_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProfiles(product_id,customer_group_id);
  }

  @Path("/getProfile")
  @GET
  public List<ModelCatalogProduct3Dto> getProfile(Integer recurring_id,Integer customer_group_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProfile(recurring_id,customer_group_id);
  }

  @Path("/getProductLayoutId")
  @GET
  public List<OcProductToLayout> getProductLayoutId(Integer product_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductLayoutId(product_id,store_id);
  }

  @Path("/getProduct")
  @GET
  public List<ModelCatalogProduct4Dto> getProduct(String customer_group_id,Integer language_id,Integer product_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProduct(customer_group_id,language_id,product_id,store_id);
  }

  @Path("/getCategories")
  @GET
  public List<OcProductToCategory> getCategories(Integer product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCategories(product_id);
  }

  @Path("/getProductAttributeGroupQuery")
  @GET
  public List<ModelCatalogProduct5Dto> getProductAttributeGroupQuery(Integer product_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductAttributeGroupQuery(product_id,language_id);
  }

  @Path("/getProductImages")
  @GET
  public List<OcProductImage> getProductImages(Integer product_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductImages(product_id);
  }

  @Path("/getProductOptionQuery")
  @GET
  public List<ModelCatalogProduct6Dto> getProductOptionQuery(Integer product_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductOptionQuery(product_id,language_id);
  }

  @Path("/getProductRelated")
  @GET
  public List<ModelCatalogProduct7Dto> getProductRelated(Integer product_id,Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductRelated(product_id,store_id);
  }

  @Path("/getBestSellerProducts")
  @GET
  public List<ModelCatalogProduct8Dto> getBestSellerProducts(Integer store_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getBestSellerProducts(store_id);
  }
}