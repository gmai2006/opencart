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
public class ModelDesignThemeServiceImpl implements ModelDesignThemeService {

  private final static Logger logger = Logger.getLogger(ModelDesignThemeServiceImpl.class.getName());
  private ModelDesignThemeDao dao;

  @Inject
  protected ModelDesignThemeServiceImpl(final ModelDesignThemeDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcTheme
   */
  @Override
  public List<OcTheme> getTheme(Integer store_id,String theme,String route) {
    logger.info("getTheme - entered");

    final List<OcTheme> returnList = dao.getTheme(store_id,theme,route);

    logger.info(returnList.toString());

    return returnList;
  }
}