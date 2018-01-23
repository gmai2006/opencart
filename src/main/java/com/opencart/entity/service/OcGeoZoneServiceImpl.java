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

package com.opencart.entity.service;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import com.opencart.entity.dao.*;
import com.opencart.entity.*;
/**
* auto generated from SQL files
*/
public class OcGeoZoneServiceImpl implements OcGeoZoneService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcGeoZoneDao dao;

  @Inject
  protected OcGeoZoneServiceImpl(final OcGeoZoneDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcGeoZone> select(int maxResult) {
      final List<OcGeoZone> result = dao.select(maxResult);
      logger.info("selectAll(OcGeoZone) - exited - return value={} result ");
      return result;
  }

  public List<OcGeoZone> selectAll() {
      final List<OcGeoZone> result = dao.selectAll();
      logger.info("selectAll(OcGeoZone) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcGeoZone create(OcGeoZone bean) {
    logger.info("create(OcGeoZone={}) - entered bean ");

    final OcGeoZone result = dao.create(bean);

    logger.info("create(OcGeoZone) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcGeoZone update(OcGeoZone bean) {
    logger.info("update(OcGeoZone={}) - entered bean ");

    final OcGeoZone result = dao.update(bean);

    logger.info("update(OcGeoZone) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcGeoZone bean) {
    logger.info("delete(OcGeoZone={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcGeoZone) - exited - return value={} result ");
  }
}