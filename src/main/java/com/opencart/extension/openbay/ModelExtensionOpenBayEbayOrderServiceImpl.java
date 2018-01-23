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

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelExtensionOpenBayEbayOrderServiceImpl implements ModelExtensionOpenBayEbayOrderService {

  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayEbayOrderServiceImpl.class.getName());
  private ModelExtensionOpenBayEbayOrderDao dao;

  @Inject
  protected ModelExtensionOpenBayEbayOrderServiceImpl(final ModelExtensionOpenBayEbayOrderDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcOrder
   */
  @Override
  public List<OcOrder> hasAddress(Integer order_id) {
    logger.info("hasAddress - entered");

    final List<OcOrder> returnList = dao.hasAddress(order_id);

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
   source file name:OcProduct
   */
  @Override
  public List<OcProduct> addOrderHistory(Integer product_id) {
    logger.info("addOrderHistory - entered");

    final List<OcProduct> returnList = dao.addOrderHistory(product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getHistory(Integer order_id) {
    logger.info("getHistory - entered");

    final List<Integer> returnList = dao.getHistory(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCountry
   */
  @Override
  public List<OcCountry> getCountryAddressFormat(String iso_code_2) {
    logger.info("getCountryAddressFormat - entered");

    final List<OcCountry> returnList = dao.getCountryAddressFormat(iso_code_2);

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
  public List<OcOrderStatus> update(Integer order_status_id,Integer language_id) {
    logger.info("update - entered");

    final List<OcOrderStatus> returnList = dao.update(order_status_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }
}