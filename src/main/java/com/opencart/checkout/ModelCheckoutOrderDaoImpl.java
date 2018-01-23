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
package com.opencart.checkout;

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
public class ModelCheckoutOrderDaoImpl implements ModelCheckoutOrderDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelCheckoutOrderDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getOrderVoucherQuery
   * SELECT a FROM oc_order_voucher  a WHERE order_id = 'param0'  
   */
  @Override
  public List<OcOrderVoucher> getOrderVoucherQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getOrderVoucherQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderVoucher.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getOptionQuery
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Override
  public List<OcOrderOption> getOptionQuery(Integer order_id,Integer order_product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getOptionQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderOption.class);

    query.setParameter("order_id", order_id);
    query.setParameter("order_product_id", order_product_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getProductQuery
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Override
  public List<OcOrderProduct> getProductQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getProductQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderProduct.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getOrderProductQuery
   * SELECT a FROM oc_order_product  a WHERE order_id = 'param0'  
   */
  @Override
  public List<OcOrderProduct> getOrderProductQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getOrderProductQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderProduct.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.getOrder.getOrderQuery
   * SELECT *, (SELECT os.name FROM "oc_order_status" os WHERE os.order_status_id = o.order_status_id AND os.language_id = o.language_id) AS order_status FROM "oc_order" o WHERE o.order_id = 'param0' 
   */
  @Override
  public List<ModelCheckoutOrder0Dto> getOrderQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.getOrder.getOrderQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return fromListOfArrayModelCheckoutOrder0Dto(query.getResultList());
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getOrderTotalQuery
   * SELECT a FROM "oc_order_total"  a WHERE order_id = 'param0' ORDER BY sort_order ASC 
   */
  @Override
  public List<OcOrderTotal> getOrderTotalQuery(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getOrderTotalQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderTotal.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getProductDownloadQuery
   * SELECT COUNT(*) AS total FROM "oc_product_to_download" WHERE product_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getProductDownloadQuery(Integer product_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getProductDownloadQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelCheckoutOrder.getOrder.getCountryQuery
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Override
  public List<OcCountry> getCountryQuery(Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.getOrder.getCountryQuery");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.getOrder.getZoneQuery
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Override
  public List<OcZone> getZoneQuery(Integer zone_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.getOrder.getZoneQuery");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("zone_id", zone_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getOrderOptionQuery
   * SELECT a FROM oc_order_option  a WHERE order_id = 'param0' AND order_product_id = 'param1'  
   */
  @Override
  public List<OcOrderOption> getOrderOptionQuery(Integer order_id,Integer order_product_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getOrderOptionQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderOption.class);

    query.setParameter("order_id", order_id);
    query.setParameter("order_product_id", order_product_id);

    return query.getResultList();
  }

  /* *
   * ModelCheckoutOrder.addOrderHistory.getOrderStatusQuery
   * SELECT a FROM oc_order_status  a WHERE order_status_id = 'param0' AND language_id = 'param1'  
   */
  @Override
  public List<OcOrderStatus> getOrderStatusQuery(Integer order_status_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCheckoutOrder.addOrderHistory.getOrderStatusQuery");

    final Query query = em.createNativeQuery(queryName, OcOrderStatus.class);

    query.setParameter("order_status_id", order_status_id);
    query.setParameter("language_id", language_id);

    return query.getResultList();
  }

  /*
   * Java8 version
   */
  private static List<ModelCheckoutOrder0Dto> fromListOfArrayModelCheckoutOrder0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCheckoutOrder0Dto.fromArray(x)).collect(Collectors.toList());
  }
}