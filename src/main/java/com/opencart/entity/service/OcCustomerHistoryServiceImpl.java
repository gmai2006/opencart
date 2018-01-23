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
public class OcCustomerHistoryServiceImpl implements OcCustomerHistoryService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcCustomerHistoryDao dao;

  @Inject
  protected OcCustomerHistoryServiceImpl(final OcCustomerHistoryDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcCustomerHistory> select(int maxResult) {
      final List<OcCustomerHistory> result = dao.select(maxResult);
      logger.info("selectAll(OcCustomerHistory) - exited - return value={} result ");
      return result;
  }

  public List<OcCustomerHistory> selectAll() {
      final List<OcCustomerHistory> result = dao.selectAll();
      logger.info("selectAll(OcCustomerHistory) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcCustomerHistory create(OcCustomerHistory bean) {
    logger.info("create(OcCustomerHistory={}) - entered bean ");

    final OcCustomerHistory result = dao.create(bean);

    logger.info("create(OcCustomerHistory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcCustomerHistory update(OcCustomerHistory bean) {
    logger.info("update(OcCustomerHistory={}) - entered bean ");

    final OcCustomerHistory result = dao.update(bean);

    logger.info("update(OcCustomerHistory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcCustomerHistory bean) {
    logger.info("delete(OcCustomerHistory={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcCustomerHistory) - exited - return value={} result ");
  }
}