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
public class OcReturnActionServiceImpl implements OcReturnActionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcReturnActionDao dao;

  @Inject
  protected OcReturnActionServiceImpl(final OcReturnActionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcReturnAction> select(int maxResult) {
      final List<OcReturnAction> result = dao.select(maxResult);
      logger.info("selectAll(OcReturnAction) - exited - return value={} result ");
      return result;
  }

  public List<OcReturnAction> selectAll() {
      final List<OcReturnAction> result = dao.selectAll();
      logger.info("selectAll(OcReturnAction) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcReturnAction create(OcReturnAction bean) {
    logger.info("create(OcReturnAction={}) - entered bean ");

    final OcReturnAction result = dao.create(bean);

    logger.info("create(OcReturnAction) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcReturnAction update(OcReturnAction bean) {
    logger.info("update(OcReturnAction={}) - entered bean ");

    final OcReturnAction result = dao.update(bean);

    logger.info("update(OcReturnAction) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcReturnAction bean) {
    logger.info("delete(OcReturnAction={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcReturnAction) - exited - return value={} result ");
  }
}