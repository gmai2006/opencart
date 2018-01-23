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
public class ModelExtensionTotalVoucherServiceImpl implements ModelExtensionTotalVoucherService {

  private final static Logger logger = Logger.getLogger(ModelExtensionTotalVoucherServiceImpl.class.getName());
  private ModelExtensionTotalVoucherDao dao;

  @Inject
  protected ModelExtensionTotalVoucherServiceImpl(final ModelExtensionTotalVoucherDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getOrderQuery(Integer order_id) {
    logger.info("getOrderQuery - entered");

    final List<Integer> returnList = dao.getOrderQuery(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelExtensionTotalVoucher0Dto
   */
  @Override
  public List<ModelExtensionTotalVoucher0Dto> getVoucherQuery(String code,Integer language_id) {
    logger.info("getVoucherQuery - entered");

    final List<ModelExtensionTotalVoucher0Dto> returnList = dao.getVoucherQuery(code,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getOrderVoucherQuery(Integer order_id,Integer voucher_id) {
    logger.info("getOrderVoucherQuery - entered");

    final List<Integer> returnList = dao.getOrderVoucherQuery(order_id,voucher_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigDecimal
   */
  @Override
  public java.math.BigDecimal getVoucherHistoryQuery(Integer voucher_id) {
    logger.info("getVoucherHistoryQuery - entered");

    final java.math.BigDecimal returnList = dao.getVoucherHistoryQuery(voucher_id);

    logger.info(returnList.toString());

    return returnList;
  }
}