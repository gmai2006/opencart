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
public class OcZoneServiceImpl implements OcZoneService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcZoneDao dao;

  @Inject
  protected OcZoneServiceImpl(final OcZoneDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcZone> select(int maxResult) {
      final List<OcZone> result = dao.select(maxResult);
      logger.info("selectAll(OcZone) - exited - return value={} result ");
      return result;
  }

  public List<OcZone> selectAll() {
      final List<OcZone> result = dao.selectAll();
      logger.info("selectAll(OcZone) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcZone create(OcZone bean) {
    logger.info("create(OcZone={}) - entered bean ");

    final OcZone result = dao.create(bean);

    logger.info("create(OcZone) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcZone update(OcZone bean) {
    logger.info("update(OcZone={}) - entered bean ");

    final OcZone result = dao.update(bean);

    logger.info("update(OcZone) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcZone bean) {
    logger.info("delete(OcZone={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcZone) - exited - return value={} result ");
  }
}