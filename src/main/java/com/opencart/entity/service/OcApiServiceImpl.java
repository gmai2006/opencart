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
public class OcApiServiceImpl implements OcApiService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcApiDao dao;

  @Inject
  protected OcApiServiceImpl(final OcApiDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcApi> select(int maxResult) {
      final List<OcApi> result = dao.select(maxResult);
      logger.info("selectAll(OcApi) - exited - return value={} result ");
      return result;
  }

  public List<OcApi> selectAll() {
      final List<OcApi> result = dao.selectAll();
      logger.info("selectAll(OcApi) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcApi create(OcApi bean) {
    logger.info("create(OcApi={}) - entered bean ");

    final OcApi result = dao.create(bean);

    logger.info("create(OcApi) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcApi update(OcApi bean) {
    logger.info("update(OcApi={}) - entered bean ");

    final OcApi result = dao.update(bean);

    logger.info("update(OcApi) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcApi bean) {
    logger.info("delete(OcApi={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcApi) - exited - return value={} result ");
  }
}