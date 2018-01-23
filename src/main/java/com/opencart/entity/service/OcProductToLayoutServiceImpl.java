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
public class OcProductToLayoutServiceImpl implements OcProductToLayoutService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcProductToLayoutDao dao;

  @Inject
  protected OcProductToLayoutServiceImpl(final OcProductToLayoutDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcProductToLayout> select(int maxResult) {
      final List<OcProductToLayout> result = dao.select(maxResult);
      logger.info("selectAll(OcProductToLayout) - exited - return value={} result ");
      return result;
  }

  public List<OcProductToLayout> selectAll() {
      final List<OcProductToLayout> result = dao.selectAll();
      logger.info("selectAll(OcProductToLayout) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcProductToLayout create(OcProductToLayout bean) {
    logger.info("create(OcProductToLayout={}) - entered bean ");

    final OcProductToLayout result = dao.create(bean);

    logger.info("create(OcProductToLayout) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcProductToLayout update(OcProductToLayout bean) {
    logger.info("update(OcProductToLayout={}) - entered bean ");

    final OcProductToLayout result = dao.update(bean);

    logger.info("update(OcProductToLayout) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcProductToLayout bean) {
    logger.info("delete(OcProductToLayout={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcProductToLayout) - exited - return value={} result ");
  }
}