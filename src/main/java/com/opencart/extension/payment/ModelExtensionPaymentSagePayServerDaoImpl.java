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
public class ModelExtensionPaymentSagePayServerDaoImpl implements ModelExtensionPaymentSagePayServerDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionPaymentSagePayServerDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionPaymentSagePayServer.getProfile.getProfile
   * SELECT a FROM oc_order_recurring  a WHERE order_recurring_id = param0  
   */
  @Override
  public List<OcOrderRecurring> getProfile(Integer order_recurring_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentSagePayServer.getProfile.getProfile");

    final Query query = em.createNativeQuery(queryName, OcOrderRecurring.class);

    query.setParameter("order_recurring_id", order_recurring_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionPaymentSagePayServer.getMethod.getMethod
   * SELECT a FROM "oc_zone_to_geo_zone"  a WHERE geo_zone_id = 'param0' AND country_id = 'param1' AND( zone_id = 'param2' OR zone_id = '0' )  
   */
  @Override
  public List<OcZoneToGeoZone> getMethod(Integer geo_zone_id,Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentSagePayServer.getMethod.getMethod");

    final Query query = em.createNativeQuery(queryName, OcZoneToGeoZone.class);

    query.setParameter("geo_zone_id", geo_zone_id);
    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionPaymentSagePayServer.getRecurringOrders.getRecurringOrders
   * SELECT a FROM "oc_order_recurring"  a WHERE order_id = 'param0'  
   */
  @Override
  public List<OcOrderRecurring> getRecurringOrders(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentSagePayServer.getRecurringOrders.getRecurringOrders");

    final Query query = em.createNativeQuery(queryName, OcOrderRecurring.class);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

}