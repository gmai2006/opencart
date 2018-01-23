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

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelAccountOrderServiceImpl implements ModelAccountOrderService {

  private final static Logger logger = Logger.getLogger(ModelAccountOrderServiceImpl.class.getName());
  private ModelAccountOrderDao dao;

  @Inject
  protected ModelAccountOrderServiceImpl(final ModelAccountOrderDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcOrderVoucher
   */
  @Override
  public List<OcOrderVoucher> getOrderVouchers(Integer order_id) {
    logger.info("getOrderVouchers - entered");

    final List<OcOrderVoucher> returnList = dao.getOrderVouchers(order_id);

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
   source file name:OcOrderProduct
   */
  @Override
  public List<OcOrderProduct> getOrderProduct(Integer order_id,Integer order_product_id) {
    logger.info("getOrderProduct - entered");

    final List<OcOrderProduct> returnList = dao.getOrderProduct(order_id,order_product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderOption
   */
  @Override
  public List<OcOrderOption> getOrderOptions(Integer order_id,Integer order_product_id) {
    logger.info("getOrderOptions - entered");

    final List<OcOrderOption> returnList = dao.getOrderOptions(order_id,order_product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalOrderProductsByOrderId(Integer order_id) {
    logger.info("getTotalOrderProductsByOrderId - entered");

    final java.math.BigInteger returnList = dao.getTotalOrderProductsByOrderId(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderProduct
   */
  @Override
  public List<OcOrderProduct> getOrderProducts(Integer order_id) {
    logger.info("getOrderProducts - entered");

    final List<OcOrderProduct> returnList = dao.getOrderProducts(order_id);

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
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalOrderVouchersByOrderId(Integer order_id) {
    logger.info("getTotalOrderVouchersByOrderId - entered");

    final java.math.BigInteger returnList = dao.getTotalOrderVouchersByOrderId(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountOrder0Dto
   */
  @Override
  public List<ModelAccountOrder0Dto> getOrderHistories(Integer order_id,Integer language_id) {
    logger.info("getOrderHistories - entered");

    final List<ModelAccountOrder0Dto> returnList = dao.getOrderHistories(order_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderTotal
   */
  @Override
  public List<OcOrderTotal> getOrderTotals(Integer order_id) {
    logger.info("getOrderTotals - entered");

    final List<OcOrderTotal> returnList = dao.getOrderTotals(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountOrder1Dto
   */
  @Override
  public List<ModelAccountOrder1Dto> getOrders(Integer customer_id,Integer store_id,Integer language_id) {
    logger.info("getOrders - entered");

    final List<ModelAccountOrder1Dto> returnList = dao.getOrders(customer_id,store_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrder
   */
  @Override
  public List<OcOrder> getOrderQuery(Integer order_id,Integer customer_id) {
    logger.info("getOrderQuery - entered");

    final List<OcOrder> returnList = dao.getOrderQuery(order_id,customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalOrders(Integer customer_id,Integer store_id) {
    logger.info("getTotalOrders - entered");

    final java.math.BigInteger returnList = dao.getTotalOrders(customer_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }
}