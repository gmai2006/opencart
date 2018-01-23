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

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelExtensionTotalCouponServiceImpl implements ModelExtensionTotalCouponService {

  private final static Logger logger = Logger.getLogger(ModelExtensionTotalCouponServiceImpl.class.getName());
  private ModelExtensionTotalCouponDao dao;

  @Inject
  protected ModelExtensionTotalCouponServiceImpl(final ModelExtensionTotalCouponDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getCouponHistoryQuery(Integer coupon_id,Integer customer_id) {
    logger.info("getCouponHistoryQuery - entered");

    final java.math.BigInteger returnList = dao.getCouponHistoryQuery(coupon_id,customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCoupon
   */
  @Override
  public List<OcCoupon> getCouponQuery(String code) {
    logger.info("getCouponQuery - entered");

    final List<OcCoupon> returnList = dao.getCouponQuery(code);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getCouponCategoryQuery(Integer product_id,Integer category_id) {
    logger.info("getCouponCategoryQuery - entered");

    final java.math.BigInteger returnList = dao.getCouponCategoryQuery(product_id,category_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCouponProduct
   */
  @Override
  public List<OcCouponProduct> getCouponProductQuery(Integer coupon_id) {
    logger.info("getCouponProductQuery - entered");

    final List<OcCouponProduct> returnList = dao.getCouponProductQuery(coupon_id);

    logger.info(returnList.toString());

    return returnList;
  }
}