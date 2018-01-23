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
package com.opencart.affiliate;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelAffiliateAffiliateServiceImpl implements ModelAffiliateAffiliateService {

  private final static Logger logger = Logger.getLogger(ModelAffiliateAffiliateServiceImpl.class.getName());
  private ModelAffiliateAffiliateDao dao;

  @Inject
  protected ModelAffiliateAffiliateServiceImpl(final ModelAffiliateAffiliateDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:java.math.BigDecimal
   */
  @Override
  public java.math.BigDecimal getTransactionTotal(Integer affiliate_id) {
    logger.info("getTransactionTotal - entered");

    final java.math.BigDecimal returnList = dao.getTransactionTotal(affiliate_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAffiliate
   */
  @Override
  public List<OcAffiliate> getAffiliate(Integer affiliate_id) {
    logger.info("getAffiliate - entered");

    final List<OcAffiliate> returnList = dao.getAffiliate(affiliate_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAffiliate
   */
  @Override
  public List<OcAffiliate> getAffiliateByEmail(String email) {
    logger.info("getAffiliateByEmail - entered");

    final List<OcAffiliate> returnList = dao.getAffiliateByEmail(email);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalAffiliatesByEmail(String email) {
    logger.info("getTotalAffiliatesByEmail - entered");

    final java.math.BigInteger returnList = dao.getTotalAffiliatesByEmail(email);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAffiliate
   */
  @Override
  public List<OcAffiliate> getAffiliateByCode(String code) {
    logger.info("getAffiliateByCode - entered");

    final List<OcAffiliate> returnList = dao.getAffiliateByCode(code);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAffiliateLogin
   */
  @Override
  public List<OcAffiliateLogin> addLoginAttempt(String email,String ip) {
    logger.info("addLoginAttempt - entered");

    final List<OcAffiliateLogin> returnList = dao.addLoginAttempt(email,ip);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAffiliateLogin
   */
  @Override
  public List<OcAffiliateLogin> getLoginAttempts(String email) {
    logger.info("getLoginAttempts - entered");

    final List<OcAffiliateLogin> returnList = dao.getLoginAttempts(email);

    logger.info(returnList.toString());

    return returnList;
  }
}