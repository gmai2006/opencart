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
package com.opencart.account;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelAccountAddressServiceImpl implements ModelAccountAddressService {

  private final static Logger logger = Logger.getLogger(ModelAccountAddressServiceImpl.class.getName());
  private ModelAccountAddressDao dao;

  @Inject
  protected ModelAccountAddressServiceImpl(final ModelAccountAddressDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcAddress
   */
  @Override
  public List<OcAddress> getAddressQuery(Integer address_id,Integer customer_id) {
    logger.info("getAddressQuery - entered");

    final List<OcAddress> returnList = dao.getAddressQuery(address_id,customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalAddresses(Integer customer_id) {
    logger.info("getTotalAddresses - entered");

    final java.math.BigInteger returnList = dao.getTotalAddresses(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcZone
   */
  @Override
  public List<OcZone> getZoneQuery(Integer zone_id) {
    logger.info("getZoneQuery - entered");

    final List<OcZone> returnList = dao.getZoneQuery(zone_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcZone
   */
  @Override
  public List<OcZone> getZoneQuery0(Integer zone_id) {
    logger.info("getZoneQuery0 - entered");

    final List<OcZone> returnList = dao.getZoneQuery0(zone_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcAddress
   */
  @Override
  public List<OcAddress> getQuery(Integer customer_id) {
    logger.info("getQuery - entered");

    final List<OcAddress> returnList = dao.getQuery(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCountry
   */
  @Override
  public List<OcCountry> getCountryQuery(Integer country_id) {
    logger.info("getCountryQuery - entered");

    final List<OcCountry> returnList = dao.getCountryQuery(country_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcCountry
   */
  @Override
  public List<OcCountry> getCountryQuery1(Integer country_id) {
    logger.info("getCountryQuery1 - entered");

    final List<OcCountry> returnList = dao.getCountryQuery1(country_id);

    logger.info(returnList.toString());

    return returnList;
  }
}