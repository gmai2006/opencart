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
public class ModelAccountRecurringDaoImpl implements ModelAccountRecurringDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountRecurringDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountRecurring.getOrderRecurring.getOrderRecurring
   * SELECT "or".*,"o"."payment_method","o"."payment_code","o"."currency_code" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "or"."order_recurring_id" = 'param0' AND "o"."customer_id" = 'param1' 
   */
  @Override
  public List<ModelAccountRecurring0Dto> getOrderRecurring(Integer order_recurring_id,Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountRecurring.getOrderRecurring.getOrderRecurring");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_recurring_id", order_recurring_id);
    query.setParameter("customer_id", customer_id);

    return fromListOfArrayModelAccountRecurring0Dto(query.getResultList());
  }

  /* *
   * ModelAccountRecurring.getTotalOrderRecurrings.getTotalOrderRecurrings
   * SELECT COUNT(*) AS total FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalOrderRecurrings(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountRecurring.getTotalOrderRecurrings.getTotalOrderRecurrings");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountRecurring.getOrderRecurringTransactions.getOrderRecurringTransactions
   * SELECT a FROM "oc_order_recurring_transaction"  a WHERE "order_recurring_id" = 'param0'  
   */
  @Override
  public List<OcOrderRecurringTransaction> getOrderRecurringTransactions(Integer order_recurring_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountRecurring.getOrderRecurringTransactions.getOrderRecurringTransactions");

    final Query query = em.createNativeQuery(queryName, OcOrderRecurringTransaction.class);

    query.setParameter("order_recurring_id", order_recurring_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountRecurring.getOrderRecurringByReference.getOrderRecurringByReference
   * SELECT a FROM "oc_order_recurring"  a WHERE "reference" = 'param0'  
   */
  @Override
  public List<OcOrderRecurring> getOrderRecurringByReference(String reference) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountRecurring.getOrderRecurringByReference.getOrderRecurringByReference");

    final Query query = em.createNativeQuery(queryName, OcOrderRecurring.class);

    query.setParameter("reference", reference);

    return query.getResultList();
  }

  /* *
   * ModelAccountRecurring.getOrderRecurrings.getOrderRecurrings
   * SELECT "or".*,"o"."payment_method","o"."currency_id","o"."currency_value" FROM "oc_order_recurring" "or" LEFT JOIN "oc_order" "o" ON "or"."order_id" = "o"."order_id" WHERE "o"."customer_id" = 'param0' ORDER BY "o"."order_id" DESC LIMIT param1,param2 
   */
  @Override
  public List<ModelAccountRecurring1Dto> getOrderRecurrings(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountRecurring.getOrderRecurrings.getOrderRecurrings");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return fromListOfArrayModelAccountRecurring1Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountRecurring0Dto> fromListOfArrayModelAccountRecurring0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountRecurring0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountRecurring1Dto> fromListOfArrayModelAccountRecurring1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountRecurring1Dto.fromArray(x)).collect(Collectors.toList());
  }
}