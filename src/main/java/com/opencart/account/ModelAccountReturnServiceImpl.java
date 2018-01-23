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
public class ModelAccountReturnServiceImpl implements ModelAccountReturnService {

  private final static Logger logger = Logger.getLogger(ModelAccountReturnServiceImpl.class.getName());
  private ModelAccountReturnDao dao;

  @Inject
  protected ModelAccountReturnServiceImpl(final ModelAccountReturnDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelAccountReturn0Dto
   */
  @Override
  public List<ModelAccountReturn0Dto> getReturns(Integer customer_id,Integer language_id) {
    logger.info("getReturns - entered");

    final List<ModelAccountReturn0Dto> returnList = dao.getReturns(customer_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalReturns(Integer customer_id) {
    logger.info("getTotalReturns - entered");

    final java.math.BigInteger returnList = dao.getTotalReturns(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountReturn1Dto
   */
  @Override
  public List<ModelAccountReturn1Dto> getReturnHistories(Integer return_id,Integer language_id) {
    logger.info("getReturnHistories - entered");

    final List<ModelAccountReturn1Dto> returnList = dao.getReturnHistories(return_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountReturn2Dto
   */
  @Override
  public List<ModelAccountReturn2Dto> getReturn(String language_id,Integer return_id,Integer customer_id) {
    logger.info("getReturn - entered");

    final List<ModelAccountReturn2Dto> returnList = dao.getReturn(language_id,return_id,customer_id);

    logger.info(returnList.toString());

    return returnList;
  }
}