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
public class OcEventServiceImpl implements OcEventService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcEventDao dao;

  @Inject
  protected OcEventServiceImpl(final OcEventDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcEvent> select(int maxResult) {
      final List<OcEvent> result = dao.select(maxResult);
      logger.info("selectAll(OcEvent) - exited - return value={} result ");
      return result;
  }

  public List<OcEvent> selectAll() {
      final List<OcEvent> result = dao.selectAll();
      logger.info("selectAll(OcEvent) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcEvent create(OcEvent bean) {
    logger.info("create(OcEvent={}) - entered bean ");

    final OcEvent result = dao.create(bean);

    logger.info("create(OcEvent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcEvent update(OcEvent bean) {
    logger.info("update(OcEvent={}) - entered bean ");

    final OcEvent result = dao.update(bean);

    logger.info("update(OcEvent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcEvent bean) {
    logger.info("delete(OcEvent={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcEvent) - exited - return value={} result ");
  }
}