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
public class ModelExtensionTotalCouponDaoImpl implements ModelExtensionTotalCouponDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionTotalCouponDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionTotalCoupon.getCoupon.getCouponHistoryQuery
   * SELECT COUNT(*) AS total FROM "oc_coupon_history" ch WHERE ch.coupon_id = 'param0' AND ch.customer_id = 'param1' 
   */
  @Override
  public java.math.BigInteger getCouponHistoryQuery(Integer coupon_id,Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalCoupon.getCoupon.getCouponHistoryQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("coupon_id", coupon_id);
    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelExtensionTotalCoupon.getCoupon.getCouponQuery
   * SELECT a FROM "oc_coupon"  a WHERE code = 'param0' AND(( date_start = '0000-00-00' OR date_start < NOW( ) ) AND( date_end = '0000-00-00' OR date_end > NOW( ) ) ) AND status = '1'  
   */
  @Override
  public List<OcCoupon> getCouponQuery(String code) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionTotalCoupon.getCoupon.getCouponQuery");

    final Query query = em.createNativeQuery(queryName, OcCoupon.class);

    query.setParameter("code", code);

    return query.getResultList();
  }

  /* *
   * ModelExtensionTotalCoupon.getCoupon.getCouponCategoryQuery
   * SELECT COUNT(*) AS total FROM "oc_product_to_category" WHERE "product_id" = 'param0' AND category_id = 'param1' 
   */
  @Override
  public java.math.BigInteger getCouponCategoryQuery(Integer product_id,Integer category_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalCoupon.getCoupon.getCouponCategoryQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("category_id", category_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelExtensionTotalCoupon.getCoupon.getCouponProductQuery
   * SELECT a FROM "oc_coupon_product"  a WHERE coupon_id = 'param0'  
   */
  @Override
  public List<OcCouponProduct> getCouponProductQuery(Integer coupon_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionTotalCoupon.getCoupon.getCouponProductQuery");

    final Query query = em.createNativeQuery(queryName, OcCouponProduct.class);

    query.setParameter("coupon_id", coupon_id);

    return query.getResultList();
  }

}