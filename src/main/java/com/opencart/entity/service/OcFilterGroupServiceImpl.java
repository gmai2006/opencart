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
public class OcFilterGroupServiceImpl implements OcFilterGroupService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcFilterGroupDao dao;

  @Inject
  protected OcFilterGroupServiceImpl(final OcFilterGroupDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcFilterGroup> select(int maxResult) {
      final List<OcFilterGroup> result = dao.select(maxResult);
      logger.info("selectAll(OcFilterGroup) - exited - return value={} result ");
      return result;
  }

  public List<OcFilterGroup> selectAll() {
      final List<OcFilterGroup> result = dao.selectAll();
      logger.info("selectAll(OcFilterGroup) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcFilterGroup create(OcFilterGroup bean) {
    logger.info("create(OcFilterGroup={}) - entered bean ");

    final OcFilterGroup result = dao.create(bean);

    logger.info("create(OcFilterGroup) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcFilterGroup update(OcFilterGroup bean) {
    logger.info("update(OcFilterGroup={}) - entered bean ");

    final OcFilterGroup result = dao.update(bean);

    logger.info("update(OcFilterGroup) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcFilterGroup bean) {
    logger.info("delete(OcFilterGroup={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcFilterGroup) - exited - return value={} result ");
  }
}