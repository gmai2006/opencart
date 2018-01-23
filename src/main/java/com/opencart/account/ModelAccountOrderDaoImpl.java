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
public class ModelAccountOrderDaoImpl implements ModelAccountOrderDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountOrderDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountOrder.getOrderVouchers.getOrderVouchers
   * SELECT a FROM "oc_order_voucher"  a WHERE order_id = 'param0'  
   */
  @Override
  public List<OcOrderVoucher> getOrderVouchers(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrderVouchers.getOrderVouchers");

    final Query query = em.createNativeQuery(queryName, OcOrderVoucher.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getOrder.getZoneQuery
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Override
  public List<OcZone> getZoneQuery(Integer zone_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrder.getZoneQuery");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("zone_id", zone_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getOrderProduct.getOrderProduct
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Override
  public List<OcOrderProduct> getOrderProduct(Integer order_id,Integer order_product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrderProduct.getOrderProduct");

    final Query query = em.createNativeQuery(queryName, OcOrderProduct.class);

    query.setParameter("order_id", order_id);
    query.setParameter("order_product_id", order_product_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getOrderOptions.getOrderOptions
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Override
  public List<OcOrderOption> getOrderOptions(Integer order_id,Integer order_product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrderOptions.getOrderOptions");

    final Query query = em.createNativeQuery(queryName, OcOrderOption.class);

    query.setParameter("order_id", order_id);
    query.setParameter("order_product_id", order_product_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getTotalOrderProductsByOrderId.getTotalOrderProductsByOrderId
   * SELECT COUNT(*) AS total FROM oc_order_product WHERE order_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalOrderProductsByOrderId(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getTotalOrderProductsByOrderId.getTotalOrderProductsByOrderId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountOrder.getOrderProducts.getOrderProducts
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Override
  public List<OcOrderProduct> getOrderProducts(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrderProducts.getOrderProducts");

    final Query query = em.createNativeQuery(queryName, OcOrderProduct.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getOrder.getCountryQuery
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Override
  public List<OcCountry> getCountryQuery(Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrder.getCountryQuery");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getTotalOrderVouchersByOrderId.getTotalOrderVouchersByOrderId
   * SELECT COUNT(*) AS total FROM "oc_order_voucher" WHERE order_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalOrderVouchersByOrderId(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getTotalOrderVouchersByOrderId.getTotalOrderVouchersByOrderId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountOrder.getOrderHistories.getOrderHistories
   * SELECT date_added, os.name AS status, oh.comment, oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = 'param0' AND os.language_id = 'param1' ORDER BY oh.date_added 
   */
  @Override
  public List<ModelAccountOrder0Dto> getOrderHistories(Integer order_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrderHistories.getOrderHistories");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountOrder0Dto(query.getResultList());
  }

  /* *
   * ModelAccountOrder.getOrderTotals.getOrderTotals
   * SELECT a FROM oc_order_total  a WHERE order_id = 'param0' ORDER BY sort_order 
   */
  @Override
  public List<OcOrderTotal> getOrderTotals(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrderTotals.getOrderTotals");

    final Query query = em.createNativeQuery(queryName, OcOrderTotal.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getOrders.getOrders
   * SELECT o.order_id, o.firstname, o.lastname, os.name as status, o.date_added, o.total, o.currency_code, o.currency_value FROM "oc_order" o LEFT JOIN oc_order_status os ON (o.order_status_id = os.order_status_id) WHERE o.customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' AND os.language_id = 'param2' ORDER BY o.order_id DESC LIMIT param3,param4 
   */
  @Override
  public List<ModelAccountOrder1Dto> getOrders(Integer customer_id,Integer store_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrders.getOrders");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);
    query.setParameter("store_id", store_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountOrder1Dto(query.getResultList());
  }

  /* *
   * ModelAccountOrder.getOrder.getOrderQuery
   * SELECT a FROM "oc_order"  a WHERE order_id = 'param0' AND customer_id = 'param1' AND order_status_id > '0'  
   */
  @Override
  public List<OcOrder> getOrderQuery(Integer order_id,Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getOrder.getOrderQuery");

    final Query query = em.createNativeQuery(queryName, OcOrder.class);

    query.setParameter("order_id", order_id);
    query.setParameter("customer_id", customer_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountOrder.getTotalOrders.getTotalOrders
   * SELECT COUNT(*) AS total FROM "oc_order" o WHERE customer_id = 'param0' AND o.order_status_id > '0' AND o.store_id = 'param1' 
   */
  @Override
  public java.math.BigInteger getTotalOrders(Integer customer_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountOrder.getTotalOrders.getTotalOrders");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);
    query.setParameter("store_id", store_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountOrder0Dto> fromListOfArrayModelAccountOrder0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountOrder0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountOrder1Dto> fromListOfArrayModelAccountOrder1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountOrder1Dto.fromArray(x)).collect(Collectors.toList());
  }
}