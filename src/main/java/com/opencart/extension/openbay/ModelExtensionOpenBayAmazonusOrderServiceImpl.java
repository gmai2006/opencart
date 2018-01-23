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
public class ModelExtensionOpenBayAmazonusOrderServiceImpl implements ModelExtensionOpenBayAmazonusOrderService {

  private final static Logger logger = Logger.getLogger(ModelExtensionOpenBayAmazonusOrderServiceImpl.class.getName());
  private ModelExtensionOpenBayAmazonusOrderDao dao;

  @Inject
  protected ModelExtensionOpenBayAmazonusOrderServiceImpl(final ModelExtensionOpenBayAmazonusOrderDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getZoneId(String name) {
    logger.info("getZoneId - entered");

    final List<Integer> returnList = dao.getZoneId(name);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelExtensionOpenBayAmazonusOrder0Dto
   */
  @Override
  public List<ModelExtensionOpenBayAmazonusOrder0Dto> getProductOptionsByVar(Integer product_option_value_id,String language_id) {
    logger.info("getProductOptionsByVar - entered");

    final List<ModelExtensionOpenBayAmazonusOrder0Dto> returnList = dao.getProductOptionsByVar(product_option_value_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getCountryId(String iso_code_2) {
    logger.info("getCountryId - entered");

    final List<Integer> returnList = dao.getCountryId(iso_code_2);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> addAmazonusOrderProducts(String model,Integer order_id) {
    logger.info("addAmazonusOrderProducts - entered");

    final List<Integer> returnList = dao.addAmazonusOrderProducts(model,order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:Integer
   */
  @Override
  public List<Integer> getOrderStatus(Integer order_id) {
    logger.info("getOrderStatus - entered");

    final List<Integer> returnList = dao.getOrderStatus(order_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:String
   */
  @Override
  public List<String> getCountryName(String iso_code_2) {
    logger.info("getCountryName - entered");

    final List<String> returnList = dao.getCountryName(iso_code_2);

    logger.info(returnList.toString());

    return returnList;
  }
}