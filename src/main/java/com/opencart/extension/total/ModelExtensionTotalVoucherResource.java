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
package com.opencart.extension.total;

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

public class ModelExtensionTotalVoucherResource {
  private final static Logger logger = Logger.getLogger(ModelExtensionTotalVoucherResource.class.getName());

  private final ModelExtensionTotalVoucherService service;

  @Inject
  protected ModelExtensionTotalVoucherResource(final ModelExtensionTotalVoucherService service) {
      requireNonNull(service);
      this.service = service;
  }

  @Path("/getOrderQuery")
  @GET
  public List<Integer> getOrderQuery(Integer order_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderQuery(order_id);
  }

  @Path("/getVoucherQuery")
  @GET
  public List<ModelExtensionTotalVoucher0Dto> getVoucherQuery(String code,Integer language_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getVoucherQuery(code,language_id);
  }

  @Path("/getOrderVoucherQuery")
  @GET
  public List<Integer> getOrderVoucherQuery(Integer order_id,Integer voucher_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getOrderVoucherQuery(order_id,voucher_id);
  }

  @Path("/getVoucherHistoryQuery")
  @GET
  public java.math.BigDecimal getVoucherHistoryQuery(Integer voucher_id) {
  //TOTO
  //Normally no business logic should in RESTful but may be form validation can be here
  //TODO
    return service.getVoucherHistoryQuery(voucher_id);
  }
}