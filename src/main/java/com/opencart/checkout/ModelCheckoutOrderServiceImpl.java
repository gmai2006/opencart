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
package com.opencart.checkout;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelCheckoutOrderServiceImpl implements ModelCheckoutOrderService {

  private final static Logger logger = Logger.getLogger(ModelCheckoutOrderServiceImpl.class.getName());
  private ModelCheckoutOrderDao dao;

  @Inject
  protected ModelCheckoutOrderServiceImpl(final ModelCheckoutOrderDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcOrderVoucher
   */
  @Override
  public List<OcOrderVoucher> getOrderVoucherQuery(Integer order_id) {
    logger.info("getOrderVoucherQuery - entered");

    final List<OcOrderVoucher> returnList = dao.getOrderVoucherQuery(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderOption
   */
  @Override
  public List<OcOrderOption> getOptionQuery(Integer order_id,Integer order_product_id) {
    logger.info("getOptionQuery - entered");

    final List<OcOrderOption> returnList = dao.getOptionQuery(order_id,order_product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderProduct
   */
  @Override
  public List<OcOrderProduct> getProductQuery(Integer order_id) {
    logger.info("getProductQuery - entered");

    final List<OcOrderProduct> returnList = dao.getProductQuery(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderProduct
   */
  @Override
  public List<OcOrderProduct> getOrderProductQuery(Integer order_id) {
    logger.info("getOrderProductQuery - entered");

    final List<OcOrderProduct> returnList = dao.getOrderProductQuery(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCheckoutOrder0Dto
   */
  @Override
  public List<ModelCheckoutOrder0Dto> getOrderQuery(Integer order_id) {
    logger.info("getOrderQuery - entered");

    final List<ModelCheckoutOrder0Dto> returnList = dao.getOrderQuery(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderTotal
   */
  @Override
  public List<OcOrderTotal> getOrderTotalQuery(Integer order_id) {
    logger.info("getOrderTotalQuery - entered");

    final List<OcOrderTotal> returnList = dao.getOrderTotalQuery(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getProductDownloadQuery(Integer product_id) {
    logger.info("getProductDownloadQuery - entered");

    final java.math.BigInteger returnList = dao.getProductDownloadQuery(product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCountry
   */
  @Override
  public List<OcCountry> getCountryQuery(Integer country_id) {
    logger.info("getCountryQuery - entered");

    final List<OcCountry> returnList = dao.getCountryQuery(country_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcZone
   */
  @Override
  public List<OcZone> getZoneQuery(Integer zone_id) {
    logger.info("getZoneQuery - entered");

    final List<OcZone> returnList = dao.getZoneQuery(zone_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderOption
   */
  @Override
  public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id) {
    logger.info("getOrderOptionQuery - entered");

    final List<OcOrderOption> returnList = dao.getOrderOptionQuery(order_id,order_product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderStatus
   */
  @Override
  public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id) {
    logger.info("getOrderStatusQuery - entered");

    final List<OcOrderStatus> returnList = dao.getOrderStatusQuery(order_status_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }
}