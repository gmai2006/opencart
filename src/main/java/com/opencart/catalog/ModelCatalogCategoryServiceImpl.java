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
public class ModelCatalogCategoryServiceImpl implements ModelCatalogCategoryService {

  private final static Logger logger = Logger.getLogger(ModelCatalogCategoryServiceImpl.class.getName());
  private ModelCatalogCategoryDao dao;

  @Inject
  protected ModelCatalogCategoryServiceImpl(final ModelCatalogCategoryDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelCatalogCategory0Dto
   */
  @Override
  public List<ModelCatalogCategory0Dto> getFilterQuery(Integer filter_group_id,Integer language_id) {
    logger.info("getFilterQuery - entered");

    final List<ModelCatalogCategory0Dto> returnList = dao.getFilterQuery(filter_group_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getQuery(Integer category_id) {
    logger.info("getQuery - entered");

    final List<Integer> returnList = dao.getQuery(category_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalCategoriesByCategoryId(Integer parent_id,Integer store_id) {
    logger.info("getTotalCategoriesByCategoryId - entered");

    final java.math.BigInteger returnList = dao.getTotalCategoriesByCategoryId(parent_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCategoryToLayout
   */
  @Override
  public List<OcCategoryToLayout> getCategoryLayoutId(Integer category_id,Integer store_id) {
    logger.info("getCategoryLayoutId - entered");

    final List<OcCategoryToLayout> returnList = dao.getCategoryLayoutId(category_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogCategory1Dto
   */
  @Override
  public List<ModelCatalogCategory1Dto> getFilterGroupQuery(Integer language_id) {
    logger.info("getFilterGroupQuery - entered");

    final List<ModelCatalogCategory1Dto> returnList = dao.getFilterGroupQuery(language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogCategory2Dto
   */
  @Override
  public List<ModelCatalogCategory2Dto> getCategory(Integer category_id,Integer language_id,Integer store_id) {
    logger.info("getCategory - entered");

    final List<ModelCatalogCategory2Dto> returnList = dao.getCategory(category_id,language_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogCategory2Dto
   */
  @Override
  public List<ModelCatalogCategory2Dto> getCategories(Integer parent_id,Integer language_id,Integer store_id) {
    logger.info("getCategories - entered");

    final List<ModelCatalogCategory2Dto> returnList = dao.getCategories(parent_id,language_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }
}