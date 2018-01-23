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
package com.opencart.extension.openbay;

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

public class ModelExtensionOpenBayEbayProductResource {
  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayEbayProductResource.class.getName());

  private final ModelExtensionOpenBayEbayProductService service;

  @Inject
  protected ModelExtensionOpenBayEbayProductResource(final ModelExtensionOpenBayEbayProductService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/lengthClassExists")
  @GET
  public List<Integer> lengthClassExists(String title) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.lengthClassExists(title);
  }

  @Path("/getProductOption")
  @GET
  public List<OcProductOption> getProductOption(Integer product_id,Integer option_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductOption(product_id,option_id);
  }

  @Path("/getOption")
  @GET
  public List<ModelExtensionOpenBayEbayProduct0Dto> getOption(String name) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOption(name);
  }

  @Path("/getQry")
  @GET
  public List<OcAttributeGroupDescription> getQry(String name,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQry(name,language_id);
  }

  @Path("/getQry0")
  @GET
  public List<OcAttributeDescription> getQry0(String name,Integer language_id,String attribute_group_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQry0(name,language_id,attribute_group_id);
  }

  @Path("/getProductOptionValue")
  @GET
  public List<OcProductOptionValue> getProductOptionValue(Integer product_id,Integer option_id,Integer product_option_id,Integer option_value_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getProductOptionValue(product_id,option_id,product_option_id,option_value_id);
  }

  @Path("/attributeAdd")
  @GET
  public List<OcProductAttribute> attributeAdd(Integer product_id,Integer attribute_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.attributeAdd(product_id,attribute_id,language_id);
  }

  @Path("/getQry1")
  @GET
  public List<OcManufacturer> getQry1(String name) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQry1(name);
  }

  @Path("/getQry2")
  @GET
  public List<Integer> getQry2() {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQry2();
  }

  @Path("/getQry22")
  @GET
  public List<Integer> getQry22() {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQry22();
  }

  @Path("/repairCategories")
  @GET
  public List<OcCategoryPath> repairCategories(Integer category_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.repairCategories(category_id);
  }

  @Path("/getQry23")
  @GET
  public List<Integer> getQry23() {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getQry23();
  }

  @Path("/weightClassExists")
  @GET
  public List<Integer> weightClassExists(String title) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.weightClassExists(title);
  }

  @Path("/importItems")
  @GET
  public List<OcCategory> importItems(Integer parent_id,String name) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.importItems(parent_id,name);
  }

  @Path("/createOption")
  @GET
  public List<OcOption> createOption(Integer option_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.createOption(option_id);
  }

  @Path("/getOptionValue")
  @GET
  public List<ModelExtensionOpenBayEbayProduct1Dto> getOptionValue(String name,Integer option_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOptionValue(name,option_id);
  }
}