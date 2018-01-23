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
package com.opencart.extension.payment;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelExtensionPaymentKlarnaCheckoutServiceImpl implements ModelExtensionPaymentKlarnaCheckoutService {

  private final static Logger logger = Logger.getLogger(ModelExtensionPaymentKlarnaCheckoutServiceImpl.class.getName());
  private ModelExtensionPaymentKlarnaCheckoutDao dao;

  @Inject
  protected ModelExtensionPaymentKlarnaCheckoutServiceImpl(final ModelExtensionPaymentKlarnaCheckoutDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcCountry
   */
  @Override
  public List<OcCountry> getCountryByIsoCode2(String iso_code_2) {
    logger.info("getCountryByIsoCode2 - entered");

    final List<OcCountry> returnList = dao.getCountryByIsoCode2(iso_code_2);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcZone
   */
  @Override
  public List<OcZone> getZoneByCode(String code,Integer country_id) {
    logger.info("getZoneByCode - entered");

    final List<OcZone> returnList = dao.getZoneByCode(code,country_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCountry
   */
  @Override
  public List<OcCountry> getCountryByIsoCode3(String iso_code_3) {
    logger.info("getCountryByIsoCode3 - entered");

    final List<OcCountry> returnList = dao.getCountryByIsoCode3(iso_code_3);

    logger.info(returnList.toString());

    return returnList;
  }
}