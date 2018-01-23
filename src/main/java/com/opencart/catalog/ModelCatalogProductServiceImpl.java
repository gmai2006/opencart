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
public class ModelCatalogProductServiceImpl implements ModelCatalogProductService {

  private final static Logger logger = Logger.getLogger(ModelCatalogProductServiceImpl.class.getName());
  private ModelCatalogProductDao dao;

  @Inject
  protected ModelCatalogProductServiceImpl(final ModelCatalogProductDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelCatalogProduct0Dto
   */
  @Override
  public List<ModelCatalogProduct0Dto> getProductAttributeQuery(Integer product_id,Integer attribute_group_id,Integer language_id) {
    logger.info("getProductAttributeQuery - entered");

    final List<ModelCatalogProduct0Dto> returnList = dao.getProductAttributeQuery(product_id,attribute_group_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalProductSpecials(Integer store_id,Integer customer_group_id) {
    logger.info("getTotalProductSpecials - entered");

    final java.math.BigInteger returnList = dao.getTotalProductSpecials(store_id,customer_group_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getLatestProducts(Integer store_id) {
    logger.info("getLatestProducts - entered");

    final List<Integer> returnList = dao.getLatestProducts(store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct1Dto
   */
  @Override
  public List<ModelCatalogProduct1Dto> getProductOptionValueQuery(Integer product_id,Integer product_option_id,Integer language_id) {
    logger.info("getProductOptionValueQuery - entered");

    final List<ModelCatalogProduct1Dto> returnList = dao.getProductOptionValueQuery(product_id,product_option_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getPopularProducts(Integer store_id) {
    logger.info("getPopularProducts - entered");

    final List<Integer> returnList = dao.getPopularProducts(store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductDiscount
   */
  @Override
  public List<OcProductDiscount> getProductDiscounts(Integer product_id,Integer customer_group_id) {
    logger.info("getProductDiscounts - entered");

    final List<OcProductDiscount> returnList = dao.getProductDiscounts(product_id,customer_group_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct2Dto
   */
  @Override
  public List<ModelCatalogProduct2Dto> getProfiles(Integer product_id,Integer customer_group_id) {
    logger.info("getProfiles - entered");

    final List<ModelCatalogProduct2Dto> returnList = dao.getProfiles(product_id,customer_group_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct3Dto
   */
  @Override
  public List<ModelCatalogProduct3Dto> getProfile(Integer recurring_id,Integer customer_group_id) {
    logger.info("getProfile - entered");

    final List<ModelCatalogProduct3Dto> returnList = dao.getProfile(recurring_id,customer_group_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductToLayout
   */
  @Override
  public List<OcProductToLayout> getProductLayoutId(Integer product_id,Integer store_id) {
    logger.info("getProductLayoutId - entered");

    final List<OcProductToLayout> returnList = dao.getProductLayoutId(product_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct4Dto
   */
  @Override
  public List<ModelCatalogProduct4Dto> getProduct(String customer_group_id,Integer language_id,Integer product_id,Integer store_id) {
    logger.info("getProduct - entered");

    final List<ModelCatalogProduct4Dto> returnList = dao.getProduct(customer_group_id,language_id,product_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductToCategory
   */
  @Override
  public List<OcProductToCategory> getCategories(Integer product_id) {
    logger.info("getCategories - entered");

    final List<OcProductToCategory> returnList = dao.getCategories(product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct5Dto
   */
  @Override
  public List<ModelCatalogProduct5Dto> getProductAttributeGroupQuery(Integer product_id,Integer language_id) {
    logger.info("getProductAttributeGroupQuery - entered");

    final List<ModelCatalogProduct5Dto> returnList = dao.getProductAttributeGroupQuery(product_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductImage
   */
  @Override
  public List<OcProductImage> getProductImages(Integer product_id) {
    logger.info("getProductImages - entered");

    final List<OcProductImage> returnList = dao.getProductImages(product_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct6Dto
   */
  @Override
  public List<ModelCatalogProduct6Dto> getProductOptionQuery(Integer product_id,Integer language_id) {
    logger.info("getProductOptionQuery - entered");

    final List<ModelCatalogProduct6Dto> returnList = dao.getProductOptionQuery(product_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct7Dto
   */
  @Override
  public List<ModelCatalogProduct7Dto> getProductRelated(Integer product_id,Integer store_id) {
    logger.info("getProductRelated - entered");

    final List<ModelCatalogProduct7Dto> returnList = dao.getProductRelated(product_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogProduct8Dto
   */
  @Override
  public List<ModelCatalogProduct8Dto> getBestSellerProducts(Integer store_id) {
    logger.info("getBestSellerProducts - entered");

    final List<ModelCatalogProduct8Dto> returnList = dao.getBestSellerProducts(store_id);

    logger.info(returnList.toString());

    return returnList;
  }
}