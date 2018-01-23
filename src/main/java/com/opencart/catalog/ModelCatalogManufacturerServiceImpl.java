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
public class ModelCatalogManufacturerServiceImpl implements ModelCatalogManufacturerService {

  private final static Logger logger = Logger.getLogger(ModelCatalogManufacturerServiceImpl.class.getName());
  private ModelCatalogManufacturerDao dao;

  @Inject
  protected ModelCatalogManufacturerServiceImpl(final ModelCatalogManufacturerDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelCatalogManufacturer0Dto
   */
  @Override
  public List<ModelCatalogManufacturer0Dto> getManufacturer(Integer manufacturer_id,Integer store_id) {
    logger.info("getManufacturer - entered");

    final List<ModelCatalogManufacturer0Dto> returnList = dao.getManufacturer(manufacturer_id,store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelCatalogManufacturer0Dto
   */
  @Override
  public List<ModelCatalogManufacturer0Dto> getManufacturers(Integer store_id) {
    logger.info("getManufacturers - entered");

    final List<ModelCatalogManufacturer0Dto> returnList = dao.getManufacturers(store_id);

    logger.info(returnList.toString());

    return returnList;
  }
}