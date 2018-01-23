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
package com.opencart.extension.total;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelExtensionTotalVoucherThemeServiceImpl implements ModelExtensionTotalVoucherThemeService {

  private final static Logger logger = Logger.getLogger(ModelExtensionTotalVoucherThemeServiceImpl.class.getName());
  private ModelExtensionTotalVoucherThemeDao dao;

  @Inject
  protected ModelExtensionTotalVoucherThemeServiceImpl(final ModelExtensionTotalVoucherThemeDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelExtensionTotalVoucherTheme0Dto
   */
  @Override
  public List<ModelExtensionTotalVoucherTheme0Dto> getVoucherThemes(Integer language_id) {
    logger.info("getVoucherThemes - entered");

    final List<ModelExtensionTotalVoucherTheme0Dto> returnList = dao.getVoucherThemes(language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelExtensionTotalVoucherTheme0Dto
   */
  @Override
  public List<ModelExtensionTotalVoucherTheme0Dto> getVoucherTheme(Integer voucher_theme_id,Integer language_id) {
    logger.info("getVoucherTheme - entered");

    final List<ModelExtensionTotalVoucherTheme0Dto> returnList = dao.getVoucherTheme(voucher_theme_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }
}