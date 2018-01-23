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
public class ModelAccountReturnDaoImpl implements ModelAccountReturnDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountReturnDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountReturn.getReturns.getReturns
   * SELECT r.return_id, r.order_id, r.firstname, r.lastname, rs.name as status, r.date_added FROM "oc_return" r LEFT JOIN oc_return_status rs ON (r.return_status_id = rs.return_status_id) WHERE r.customer_id = 'param0' AND rs.language_id = 'param1' ORDER BY r.return_id DESC LIMIT param2,param3 
   */
  @Override
  public List<ModelAccountReturn0Dto> getReturns(Integer customer_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountReturn.getReturns.getReturns");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountReturn0Dto(query.getResultList());
  }

  /* *
   * ModelAccountReturn.getTotalReturns.getTotalReturns
   * SELECT COUNT(*) AS total FROM "oc_return" WHERE customer_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalReturns(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountReturn.getTotalReturns.getTotalReturns");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountReturn.getReturnHistories.getReturnHistories
   * SELECT rh.date_added, rs.name AS status, rh.comment FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id = rs.return_status_id WHERE rh.return_id = 'param0' AND rs.language_id = 'param1' ORDER BY rh.date_added ASC 
   */
  @Override
  public List<ModelAccountReturn1Dto> getReturnHistories(Integer return_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountReturn.getReturnHistories.getReturnHistories");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("return_id", return_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountReturn1Dto(query.getResultList());
  }

  /* *
   * ModelAccountReturn.getReturn.getReturn
   * SELECT r.return_id, r.order_id, r.firstname, r.lastname, r.email, r.telephone, r.product, r.model, r.quantity, r.opened, (SELECT rr.name FROM oc_return_reason rr WHERE rr.return_reason_id = r.return_reason_id AND rr.language_id = 'param0') AS reason, (SELECT ra.name FROM oc_return_action ra WHERE ra.return_action_id = r.return_action_id AND ra.language_id = 'param1') AS action, (SELECT rs.name FROM oc_return_status rs WHERE rs.return_status_id = r.return_status_id AND rs.language_id = 'param2') AS status, r.comment, r.date_ordered, r.date_added, r.date_modified FROM "oc_return" r WHERE r.return_id = 'param3' AND r.customer_id = 'param4' 
   */
  @Override
  public List<ModelAccountReturn2Dto> getReturn(String language_id,Integer return_id,Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountReturn.getReturn.getReturn");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);
    query.setParameter("return_id", return_id);
    query.setParameter("customer_id", customer_id);

    return fromListOfArrayModelAccountReturn2Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountReturn0Dto> fromListOfArrayModelAccountReturn0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountReturn0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountReturn1Dto> fromListOfArrayModelAccountReturn1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountReturn1Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountReturn2Dto> fromListOfArrayModelAccountReturn2Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountReturn2Dto.fromArray(x)).collect(Collectors.toList());
  }
}