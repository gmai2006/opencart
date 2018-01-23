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
package com.opencart.design;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelDesignLayoutServiceImpl implements ModelDesignLayoutService {

  private final static Logger logger = Logger.getLogger(ModelDesignLayoutServiceImpl.class.getName());
  private ModelDesignLayoutDao dao;

  @Inject
  protected ModelDesignLayoutServiceImpl(final ModelDesignLayoutDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcLayoutRoute
   */
  @Override
  public List<OcLayoutRoute> getLayout(Integer store_id) {
    logger.info("getLayout - entered");

    final List<OcLayoutRoute> returnList = dao.getLayout(store_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcLayoutModule
   */
  @Override
  public List<OcLayoutModule> getLayoutModules(Integer layout_id,String position) {
    logger.info("getLayoutModules - entered");

    final List<OcLayoutModule> returnList = dao.getLayoutModules(layout_id,position);

    logger.info(returnList.toString());

    return returnList;
  }
}