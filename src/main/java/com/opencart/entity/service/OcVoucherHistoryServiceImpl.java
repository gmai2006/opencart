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
public class OcVoucherHistoryServiceImpl implements OcVoucherHistoryService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcVoucherHistoryDao dao;

  @Inject
  protected OcVoucherHistoryServiceImpl(final OcVoucherHistoryDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcVoucherHistory> select(int maxResult) {
      final List<OcVoucherHistory> result = dao.select(maxResult);
      logger.info("selectAll(OcVoucherHistory) - exited - return value={} result ");
      return result;
  }

  public List<OcVoucherHistory> selectAll() {
      final List<OcVoucherHistory> result = dao.selectAll();
      logger.info("selectAll(OcVoucherHistory) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcVoucherHistory create(OcVoucherHistory bean) {
    logger.info("create(OcVoucherHistory={}) - entered bean ");

    final OcVoucherHistory result = dao.create(bean);

    logger.info("create(OcVoucherHistory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcVoucherHistory update(OcVoucherHistory bean) {
    logger.info("update(OcVoucherHistory={}) - entered bean ");

    final OcVoucherHistory result = dao.update(bean);

    logger.info("update(OcVoucherHistory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcVoucherHistory bean) {
    logger.info("delete(OcVoucherHistory={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcVoucherHistory) - exited - return value={} result ");
  }
}