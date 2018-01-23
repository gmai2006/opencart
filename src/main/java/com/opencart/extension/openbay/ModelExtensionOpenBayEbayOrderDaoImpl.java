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
package com.opencart.extension.openbay;

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
public class ModelExtensionOpenBayEbayOrderDaoImpl implements ModelExtensionOpenBayEbayOrderDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionOpenBayEbayOrderDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.hasAddress.hasAddress
   * SELECT a FROM "oc_order"  a WHERE "order_id" = 'param0' AND "payment_firstname" != '' AND "payment_address_1" != '' AND "payment_country" != ''  
   */
  @Override
  public List<OcOrder> hasAddress(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.hasAddress.hasAddress");

    final Query query = em.createNativeQuery(queryName, OcOrder.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.confirm.getOrderStatusQuery
   * SELECT a FROM "oc_order_status"  a WHERE "order_status_id" = 'param0' AND "language_id" = 'param1'  
   */
  @Override
  public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.confirm.getOrderStatusQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderStatus.class);

    query.setParameter("order_status_id", order_status_id);
    query.setParameter("language_id", language_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.confirm.getOrderTotalQuery
   * SELECT a FROM "oc_order_total"  a WHERE "order_id" = 'param0' ORDER BY "sort_order" ASC 
   */
  @Override
  public List<OcOrderTotal> getOrderTotalQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.confirm.getOrderTotalQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderTotal.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.addOrderHistory.addOrderHistory
   * SELECT a FROM "oc_product"  a WHERE "product_id" = 'param0'  LIMIT 1
   */
  @Override
  public List<OcProduct> addOrderHistory(Integer product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.addOrderHistory.addOrderHistory");

    final Query query = em.createNativeQuery(queryName, OcProduct.class);

    query.setParameter("product_id", product_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.getHistory.getHistory
   * SELECT "order_status_id" FROM "oc_order_history" WHERE "order_id" = 'param0' 
   */
  @Override
  public List<Integer> getHistory(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.getHistory.getHistory");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.getCountryAddressFormat.getCountryAddressFormat
   * SELECT a FROM "oc_country"  a WHERE "iso_code_2" = 'param0'  LIMIT 1
   */
  @Override
  public List<OcCountry> getCountryAddressFormat(String iso_code_2) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.getCountryAddressFormat.getCountryAddressFormat");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("iso_code_2", iso_code_2);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.confirm.getOrderProductQuery
   * SELECT a FROM "oc_order_product"  a WHERE "order_id" = 'param0'  
   */
  @Override
  public List<OcOrderProduct> getOrderProductQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.confirm.getOrderProductQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderProduct.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.confirm.getOrderOptionQuery
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Override
  public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.confirm.getOrderOptionQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderOption.class);

    query.setParameter("order_id", order_id);
    query.setParameter("order_product_id", order_product_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayEbayOrder.update.update
   * SELECT a FROM oc_order_status  a WHERE order_status_id = 'param0' AND language_id = 'param1'  
   */
  @Override
  public List<OcOrderStatus> update(Integer order_status_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEbayOrder.update.update");

    final Query query = em.createNativeQuery(queryName, OcOrderStatus.class);

    query.setParameter("order_status_id", order_status_id);
    query.setParameter("language_id", language_id);

    return query.getResultList();
  }

}