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
public class ModelAccountTransactionServiceImpl implements ModelAccountTransactionService {

  private final static Logger logger = Logger.getLogger(ModelAccountTransactionServiceImpl.class.getName());
  private ModelAccountTransactionDao dao;

  @Inject
  protected ModelAccountTransactionServiceImpl(final ModelAccountTransactionDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalTransactions(Integer customer_id) {
    logger.info("getTotalTransactions - entered");

    final java.math.BigInteger returnList = dao.getTotalTransactions(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigDecimal
   */
  @Override
  public java.math.BigDecimal getTotalAmount(Integer customer_id) {
    logger.info("getTotalAmount - entered");

    final java.math.BigDecimal returnList = dao.getTotalAmount(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }
}