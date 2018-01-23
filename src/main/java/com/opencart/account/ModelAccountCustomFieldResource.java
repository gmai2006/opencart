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
package com.opencart.account;

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

public class ModelAccountCustomFieldResource {
  private final static Logger logger = Logger.getLogger(ModelAccountCustomFieldResource.class.getName());

  private final ModelAccountCustomFieldService service;

  @Inject
  protected ModelAccountCustomFieldResource(final ModelAccountCustomFieldService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getCustomFieldValueQuery")
  @GET
  public List<ModelAccountCustomField0Dto> getCustomFieldValueQuery(Integer custom_field_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomFieldValueQuery(custom_field_id,language_id);
  }

  @Path("/getCustomFieldQuery")
  @GET
  public List<ModelAccountCustomField1Dto> getCustomFieldQuery(Integer language_id,Integer customer_group_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomFieldQuery(language_id,customer_group_id);
  }

  @Path("/getCustomField")
  @GET
  public List<ModelAccountCustomField2Dto> getCustomField(Integer custom_field_id,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getCustomField(custom_field_id,language_id);
  }
}