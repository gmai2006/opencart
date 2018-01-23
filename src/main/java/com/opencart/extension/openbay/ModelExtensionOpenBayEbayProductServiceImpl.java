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
package com.opencart.extension.openbay;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelExtensionOpenBayEbayProductServiceImpl implements ModelExtensionOpenBayEbayProductService {

  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayEbayProductServiceImpl.class.getName());
  private ModelExtensionOpenBayEbayProductDao dao;

  @Inject
  protected ModelExtensionOpenBayEbayProductServiceImpl(final ModelExtensionOpenBayEbayProductDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> lengthClassExists(String title) {
    logger.info("lengthClassExists - entered");

    final List<Integer> returnList = dao.lengthClassExists(title);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductOption
   */
  @Override
  public List<OcProductOption> getProductOption(Integer product_id,Integer option_id) {
    logger.info("getProductOption - entered");

    final List<OcProductOption> returnList = dao.getProductOption(product_id,option_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelExtensionOpenBayEbayProduct0Dto
   */
  @Override
  public List<ModelExtensionOpenBayEbayProduct0Dto> getOption(String name) {
    logger.info("getOption - entered");

    final List<ModelExtensionOpenBayEbayProduct0Dto> returnList = dao.getOption(name);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAttributeGroupDescription
   */
  @Override
  public List<OcAttributeGroupDescription> getQry(String name,Integer language_id) {
    logger.info("getQry - entered");

    final List<OcAttributeGroupDescription> returnList = dao.getQry(name,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAttributeDescription
   */
  @Override
  public List<OcAttributeDescription> getQry0(String name,Integer language_id,String attribute_group_id) {
    logger.info("getQry0 - entered");

    final List<OcAttributeDescription> returnList = dao.getQry0(name,language_id,attribute_group_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductOptionValue
   */
  @Override
  public List<OcProductOptionValue> getProductOptionValue(Integer product_id,Integer option_id,Integer product_option_id,Integer option_value_id) {
    logger.info("getProductOptionValue - entered");

    final List<OcProductOptionValue> returnList = dao.getProductOptionValue(product_id,option_id,product_option_id,option_value_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcProductAttribute
   */
  @Override
  public List<OcProductAttribute> attributeAdd(Integer product_id,Integer attribute_id,Integer language_id) {
    logger.info("attributeAdd - entered");

    final List<OcProductAttribute> returnList = dao.attributeAdd(product_id,attribute_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcManufacturer
   */
  @Override
  public List<OcManufacturer> getQry1(String name) {
    logger.info("getQry1 - entered");

    final List<OcManufacturer> returnList = dao.getQry1(name);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getQry2() {
    logger.info("getQry2 - entered");

    final List<Integer> returnList = dao.getQry2();

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getQry22() {
    logger.info("getQry22 - entered");

    final List<Integer> returnList = dao.getQry22();

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCategoryPath
   */
  @Override
  public List<OcCategoryPath> repairCategories(Integer category_id) {
    logger.info("repairCategories - entered");

    final List<OcCategoryPath> returnList = dao.repairCategories(category_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getQry23() {
    logger.info("getQry23 - entered");

    final List<Integer> returnList = dao.getQry23();

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> weightClassExists(String title) {
    logger.info("weightClassExists - entered");

    final List<Integer> returnList = dao.weightClassExists(title);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCategory
   */
  @Override
  public List<OcCategory> importItems(Integer parent_id,String name) {
    logger.info("importItems - entered");

    final List<OcCategory> returnList = dao.importItems(parent_id,name);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcOption
   */
  @Override
  public List<OcOption> createOption(Integer option_id) {
    logger.info("createOption - entered");

    final List<OcOption> returnList = dao.createOption(option_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelExtensionOpenBayEbayProduct1Dto
   */
  @Override
  public List<ModelExtensionOpenBayEbayProduct1Dto> getOptionValue(String name,Integer option_id) {
    logger.info("getOptionValue - entered");

    final List<ModelExtensionOpenBayEbayProduct1Dto> returnList = dao.getOptionValue(name,option_id);

    logger.info(returnList.toString());

    return returnList;
  }
}