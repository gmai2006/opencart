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
package com.opencart.extension.payment;

import java.util.List;
import javax.inject.Inject;

import static java.util.Objects.requireNonNull;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.opencart.entity.*;

import com.google.inject.Provider;

import java.util.stream.Collectors;

import com.opencart.util.DaoUtils;

/**
* auto generated from SQL
*/
public class ModelExtensionPaymentPilibabaDaoImpl implements ModelExtensionPaymentPilibabaDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionPaymentPilibabaDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionPaymentPilibaba.getOrderTaxAmount.getOrderTaxAmount
   * SELECT SUM("value") AS "value" FROM "oc_order_total" WHERE "order_id" = 'param0' AND "code" = 'tax' 
   */
  @Override
  public java.math.BigDecimal getOrderTaxAmount(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentPilibaba.getOrderTaxAmount.getOrderTaxAmount");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return (java.math.BigDecimal)query.getSingleResult();
  }

}