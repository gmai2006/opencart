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
package com.opencart.affiliate;

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
public class ModelAffiliateTransactionDaoImpl implements ModelAffiliateTransactionDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAffiliateTransactionDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAffiliateTransaction.getTotalTransactions.getTotalTransactions
   * SELECT COUNT(*) AS total FROM "oc_affiliate_transaction" WHERE affiliate_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalTransactions(Integer affiliate_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAffiliateTransaction.getTotalTransactions.getTotalTransactions");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("affiliate_id", affiliate_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAffiliateTransaction.getBalance.getBalance
   * SELECT SUM(amount) AS total FROM "oc_affiliate_transaction" WHERE affiliate_id = 'param0' GROUP BY affiliate_id 
   */
  @Override
  public java.math.BigDecimal getBalance(Integer affiliate_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAffiliateTransaction.getBalance.getBalance");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("affiliate_id", affiliate_id);

    return (java.math.BigDecimal)query.getSingleResult();
  }

}