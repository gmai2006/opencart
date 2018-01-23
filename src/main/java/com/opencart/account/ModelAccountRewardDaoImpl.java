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
package com.opencart.account;

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
public class ModelAccountRewardDaoImpl implements ModelAccountRewardDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountRewardDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountReward.getTotalPoints.getTotalPoints
   * SELECT SUM(points) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' GROUP BY customer_id 
   */
  @Override
  public java.math.BigDecimal getTotalPoints(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountReward.getTotalPoints.getTotalPoints");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigDecimal)query.getSingleResult();
  }

  /* *
   * ModelAccountReward.getTotalRewards.getTotalRewards
   * SELECT COUNT(*) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalRewards(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountReward.getTotalRewards.getTotalRewards");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

}