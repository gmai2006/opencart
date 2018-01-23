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
package com.opencart.catalog;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelCatalogReviewServiceImpl implements ModelCatalogReviewService {

  private final static Logger logger = Logger.getLogger(ModelCatalogReviewServiceImpl.class.getName());
  private ModelCatalogReviewDao dao;

  @Inject
  protected ModelCatalogReviewServiceImpl(final ModelCatalogReviewDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalReviewsByProductId(Integer product_id,Integer language_id) {
    logger.info("getTotalReviewsByProductId - entered");

    final java.math.BigInteger returnList = dao.getTotalReviewsByProductId(product_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogReview0Dto
   */
  @Override
  public List<ModelCatalogReview0Dto> getReviewsByProductId(Integer product_id,Integer language_id) {
    logger.info("getReviewsByProductId - entered");

    final List<ModelCatalogReview0Dto> returnList = dao.getReviewsByProductId(product_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }
}