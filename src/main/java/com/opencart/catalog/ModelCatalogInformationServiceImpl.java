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
public class ModelCatalogInformationServiceImpl implements ModelCatalogInformationService {

  private final static Logger logger = Logger.getLogger(ModelCatalogInformationServiceImpl.class.getName());
  private ModelCatalogInformationDao dao;

  @Inject
  protected ModelCatalogInformationServiceImpl(final ModelCatalogInformationDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelCatalogInformation0Dto
   */
  @Override
  public List<ModelCatalogInformation0Dto> getInformation(Integer information_id,Integer language_id,Integer store_id) {
    logger.info("getInformation - entered");

    final List<ModelCatalogInformation0Dto> returnList = dao.getInformation(information_id,language_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogInformation0Dto
   */
  @Override
  public List<ModelCatalogInformation0Dto> getInformations(Integer language_id,Integer store_id) {
    logger.info("getInformations - entered");

    final List<ModelCatalogInformation0Dto> returnList = dao.getInformations(language_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcInformationToLayout
   */
  @Override
  public List<OcInformationToLayout> getInformationLayoutId(Integer information_id,Integer store_id) {
    logger.info("getInformationLayoutId - entered");

    final List<OcInformationToLayout> returnList = dao.getInformationLayoutId(information_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }
}