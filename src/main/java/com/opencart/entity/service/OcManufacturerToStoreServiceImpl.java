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
public class OcManufacturerToStoreServiceImpl implements OcManufacturerToStoreService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcManufacturerToStoreDao dao;

  @Inject
  protected OcManufacturerToStoreServiceImpl(final OcManufacturerToStoreDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcManufacturerToStore> select(int maxResult) {
      final List<OcManufacturerToStore> result = dao.select(maxResult);
      logger.info("selectAll(OcManufacturerToStore) - exited - return value={} result ");
      return result;
  }

  public List<OcManufacturerToStore> selectAll() {
      final List<OcManufacturerToStore> result = dao.selectAll();
      logger.info("selectAll(OcManufacturerToStore) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcManufacturerToStore create(OcManufacturerToStore bean) {
    logger.info("create(OcManufacturerToStore={}) - entered bean ");

    final OcManufacturerToStore result = dao.create(bean);

    logger.info("create(OcManufacturerToStore) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcManufacturerToStore update(OcManufacturerToStore bean) {
    logger.info("update(OcManufacturerToStore={}) - entered bean ");

    final OcManufacturerToStore result = dao.update(bean);

    logger.info("update(OcManufacturerToStore) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcManufacturerToStore bean) {
    logger.info("delete(OcManufacturerToStore={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcManufacturerToStore) - exited - return value={} result ");
  }
}