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
package com.opencart.extension.total;

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
public class ModelExtensionTotalVoucherDaoImpl implements ModelExtensionTotalVoucherDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionTotalVoucherDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionTotalVoucher.getVoucher.getOrderQuery
   * SELECT order_id FROM "oc_order" WHERE order_id = 'param0' AND order_status_id IN(param1) 
   */
  @Override
  public List<Integer> getOrderQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalVoucher.getVoucher.getOrderQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionTotalVoucher.getVoucher.getVoucherQuery
   * SELECT *, vtd.name AS theme FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON (v.voucher_theme_id = vt.voucher_theme_id) LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE v.code = 'param0' AND vtd.language_id = 'param1' AND v.status = '1' 
   */
  @Override
  public List<ModelExtensionTotalVoucher0Dto> getVoucherQuery(String code,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalVoucher.getVoucher.getVoucherQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("code", code);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelExtensionTotalVoucher0Dto(query.getResultList());
  }

  /* *
   * ModelExtensionTotalVoucher.getVoucher.getOrderVoucherQuery
   * SELECT order_voucher_id FROM "oc_order_voucher" WHERE order_id = 'param0' AND voucher_id = 'param1' 
   */
  @Override
  public List<Integer> getOrderVoucherQuery(Integer order_id,Integer voucher_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalVoucher.getVoucher.getOrderVoucherQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);
    query.setParameter("voucher_id", voucher_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionTotalVoucher.getVoucher.getVoucherHistoryQuery
   * SELECT SUM(amount) AS total FROM "oc_voucher_history" vh WHERE vh.voucher_id = 'param0' GROUP BY vh.voucher_id 
   */
  @Override
  public java.math.BigDecimal getVoucherHistoryQuery(Integer voucher_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalVoucher.getVoucher.getVoucherHistoryQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("voucher_id", voucher_id);

    return (java.math.BigDecimal)query.getSingleResult();
  }

  /*
   * Java8 version
   */
  private static List<ModelExtensionTotalVoucher0Dto> fromListOfArrayModelExtensionTotalVoucher0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelExtensionTotalVoucher0Dto.fromArray(x)).collect(Collectors.toList());
  }
}