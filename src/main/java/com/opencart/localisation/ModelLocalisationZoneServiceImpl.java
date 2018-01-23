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
package com.opencart.localisation;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelLocalisationZoneServiceImpl implements ModelLocalisationZoneService {

  private final static Logger logger = Logger.getLogger(ModelLocalisationZoneServiceImpl.class.getName());
  private ModelLocalisationZoneDao dao;

  @Inject
  protected ModelLocalisationZoneServiceImpl(final ModelLocalisationZoneDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:OcZone
   */
  @Override
  public List<OcZone> getZonesByCountryId(Integer country_id) {
    logger.info("getZonesByCountryId - entered");

    final List<OcZone> returnList = dao.getZonesByCountryId(country_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:OcZone
   */
  @Override
  public List<OcZone> getZone(Integer zone_id) {
    logger.info("getZone - entered");

    final List<OcZone> returnList = dao.getZone(zone_id);

    logger.info(returnList.toString());

    return returnList;
  }
}