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
public class OcCurrencyServiceImpl implements OcCurrencyService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcCurrencyDao dao;

  @Inject
  protected OcCurrencyServiceImpl(final OcCurrencyDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcCurrency> select(int maxResult) {
      final List<OcCurrency> result = dao.select(maxResult);
      logger.info("selectAll(OcCurrency) - exited - return value={} result ");
      return result;
  }

  public List<OcCurrency> selectAll() {
      final List<OcCurrency> result = dao.selectAll();
      logger.info("selectAll(OcCurrency) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcCurrency create(OcCurrency bean) {
    logger.info("create(OcCurrency={}) - entered bean ");

    final OcCurrency result = dao.create(bean);

    logger.info("create(OcCurrency) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcCurrency update(OcCurrency bean) {
    logger.info("update(OcCurrency={}) - entered bean ");

    final OcCurrency result = dao.update(bean);

    logger.info("update(OcCurrency) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcCurrency bean) {
    logger.info("delete(OcCurrency={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcCurrency) - exited - return value={} result ");
  }
}