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
public class OcProductToCategoryServiceImpl implements OcProductToCategoryService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcProductToCategoryDao dao;

  @Inject
  protected OcProductToCategoryServiceImpl(final OcProductToCategoryDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcProductToCategory> select(int maxResult) {
      final List<OcProductToCategory> result = dao.select(maxResult);
      logger.info("selectAll(OcProductToCategory) - exited - return value={} result ");
      return result;
  }

  public List<OcProductToCategory> selectAll() {
      final List<OcProductToCategory> result = dao.selectAll();
      logger.info("selectAll(OcProductToCategory) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcProductToCategory create(OcProductToCategory bean) {
    logger.info("create(OcProductToCategory={}) - entered bean ");

    final OcProductToCategory result = dao.create(bean);

    logger.info("create(OcProductToCategory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcProductToCategory update(OcProductToCategory bean) {
    logger.info("update(OcProductToCategory={}) - entered bean ");

    final OcProductToCategory result = dao.update(bean);

    logger.info("update(OcProductToCategory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcProductToCategory bean) {
    logger.info("delete(OcProductToCategory={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcProductToCategory) - exited - return value={} result ");
  }
}