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
public class ModelAccountCustomerServiceImpl implements ModelAccountCustomerService {

  private final static Logger logger = Logger.getLogger(ModelAccountCustomerServiceImpl.class.getName());
  private ModelAccountCustomerDao dao;

  @Inject
  protected ModelAccountCustomerServiceImpl(final ModelAccountCustomerDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcCustomerLogin
   */
  @Override
  public List<OcCustomerLogin> addLoginAttempt(String email,String ip) {
    logger.info("addLoginAttempt - entered");

    final List<OcCustomerLogin> returnList = dao.addLoginAttempt(email,ip);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCustomer
   */
  @Override
  public List<OcCustomer> getCustomerByEmail(String email) {
    logger.info("getCustomerByEmail - entered");

    final List<OcCustomer> returnList = dao.getCustomerByEmail(email);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCustomerIp
   */
  @Override
  public List<OcCustomerIp> getIps(Integer customer_id) {
    logger.info("getIps - entered");

    final List<OcCustomerIp> returnList = dao.getIps(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCustomerLogin
   */
  @Override
  public List<OcCustomerLogin> getLoginAttempts(String email) {
    logger.info("getLoginAttempts - entered");

    final List<OcCustomerLogin> returnList = dao.getLoginAttempts(email);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigDecimal
   */
  @Override
  public java.math.BigDecimal getRewardTotal(Integer customer_id) {
    logger.info("getRewardTotal - entered");

    final java.math.BigDecimal returnList = dao.getRewardTotal(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountCustomer0Dto
   */
  @Override
  public List<ModelAccountCustomer0Dto> getCustomerByCode(String code) {
    logger.info("getCustomerByCode - entered");

    final List<ModelAccountCustomer0Dto> returnList = dao.getCustomerByCode(code);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalCustomersByEmail(String email) {
    logger.info("getTotalCustomersByEmail - entered");

    final java.math.BigInteger returnList = dao.getTotalCustomersByEmail(email);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCustomer
   */
  @Override
  public List<OcCustomer> getCustomer(Integer customer_id) {
    logger.info("getCustomer - entered");

    final List<OcCustomer> returnList = dao.getCustomer(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCustomer
   */
  @Override
  public List<OcCustomer> getCustomerByToken(String token) {
    logger.info("getCustomerByToken - entered");

    final List<OcCustomer> returnList = dao.getCustomerByToken(token);

    logger.info(returnList.toString());

    return returnList;
  }
}