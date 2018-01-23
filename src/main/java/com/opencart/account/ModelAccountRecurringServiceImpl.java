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
public class ModelAccountRecurringServiceImpl implements ModelAccountRecurringService {

  private final static Logger logger = Logger.getLogger(ModelAccountRecurringServiceImpl.class.getName());
  private ModelAccountRecurringDao dao;

  @Inject
  protected ModelAccountRecurringServiceImpl(final ModelAccountRecurringDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelAccountRecurring0Dto
   */
  @Override
  public List<ModelAccountRecurring0Dto> getOrderRecurring(Integer order_recurring_id,Integer customer_id) {
    logger.info("getOrderRecurring - entered");

    final List<ModelAccountRecurring0Dto> returnList = dao.getOrderRecurring(order_recurring_id,customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalOrderRecurrings(Integer customer_id) {
    logger.info("getTotalOrderRecurrings - entered");

    final java.math.BigInteger returnList = dao.getTotalOrderRecurrings(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderRecurringTransaction
   */
  @Override
  public List<OcOrderRecurringTransaction> getOrderRecurringTransactions(Integer order_recurring_id) {
    logger.info("getOrderRecurringTransactions - entered");

    final List<OcOrderRecurringTransaction> returnList = dao.getOrderRecurringTransactions(order_recurring_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOrderRecurring
   */
  @Override
  public List<OcOrderRecurring> getOrderRecurringByReference(String reference) {
    logger.info("getOrderRecurringByReference - entered");

    final List<OcOrderRecurring> returnList = dao.getOrderRecurringByReference(reference);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountRecurring1Dto
   */
  @Override
  public List<ModelAccountRecurring1Dto> getOrderRecurrings(Integer customer_id) {
    logger.info("getOrderRecurrings - entered");

    final List<ModelAccountRecurring1Dto> returnList = dao.getOrderRecurrings(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }
}