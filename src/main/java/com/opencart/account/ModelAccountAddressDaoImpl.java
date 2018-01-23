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
public class ModelAccountAddressDaoImpl implements ModelAccountAddressDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountAddressDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountAddress.getAddress.getAddressQuery
   * SELECT a FROM oc_address  a WHERE address_id = 'param0' AND customer_id = 'param1'  
   */
  @Override
  public List<OcAddress> getAddressQuery(Integer address_id,Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getAddress.getAddressQuery");

    final Query query = em.createNativeQuery(queryName, OcAddress.class);

    query.setParameter("address_id", address_id);
    query.setParameter("customer_id", customer_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountAddress.getTotalAddresses.getTotalAddresses
   * SELECT COUNT(*) AS total FROM oc_address WHERE customer_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalAddresses(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getTotalAddresses.getTotalAddresses");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountAddress.getAddresses.getZoneQuery
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Override
  public List<OcZone> getZoneQuery(Integer zone_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getAddresses.getZoneQuery");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("zone_id", zone_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountAddress.getAddress.getZoneQuery
   * SELECT a FROM "oc_zone"  a WHERE zone_id = 'param0'  
   */
  @Override
  public List<OcZone> getZoneQuery0(Integer zone_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getAddress.getZoneQuery");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("zone_id", zone_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountAddress.getAddresses.getQuery
   * SELECT a FROM oc_address  a WHERE customer_id = 'param0'  
   */
  @Override
  public List<OcAddress> getQuery(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getAddresses.getQuery");

    final Query query = em.createNativeQuery(queryName, OcAddress.class);

    query.setParameter("customer_id", customer_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountAddress.getAddress.getCountryQuery
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Override
  public List<OcCountry> getCountryQuery(Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getAddress.getCountryQuery");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountAddress.getAddresses.getCountryQuery
   * SELECT a FROM "oc_country"  a WHERE country_id = 'param0'  
   */
  @Override
  public List<OcCountry> getCountryQuery1(Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountAddress.getAddresses.getCountryQuery");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

}