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
public class OcProductDiscountServiceImpl implements OcProductDiscountService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OcProductDiscountDao dao;

  @Inject
  protected OcProductDiscountServiceImpl(final OcProductDiscountDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public List<OcProductDiscount> select(int maxResult) {
      final List<OcProductDiscount> result = dao.select(maxResult);
      logger.info("selectAll(OcProductDiscount) - exited - return value={} result ");
      return result;
  }

  public List<OcProductDiscount> selectAll() {
      final List<OcProductDiscount> result = dao.selectAll();
      logger.info("selectAll(OcProductDiscount) - exited - return value={} result ");
      return result;
  }

  @Override
  @Transactional
  public OcProductDiscount create(OcProductDiscount bean) {
    logger.info("create(OcProductDiscount={}) - entered bean ");

    final OcProductDiscount result = dao.create(bean);

    logger.info("create(OcProductDiscount) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OcProductDiscount update(OcProductDiscount bean) {
    logger.info("update(OcProductDiscount={}) - entered bean ");

    final OcProductDiscount result = dao.update(bean);

    logger.info("update(OcProductDiscount) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OcProductDiscount bean) {
    logger.info("delete(OcProductDiscount={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OcProductDiscount) - exited - return value={} result ");
  }
}