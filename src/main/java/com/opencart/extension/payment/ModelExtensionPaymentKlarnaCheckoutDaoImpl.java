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
public class ModelExtensionPaymentKlarnaCheckoutDaoImpl implements ModelExtensionPaymentKlarnaCheckoutDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionPaymentKlarnaCheckoutDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode2.getCountryByIsoCode2
   * SELECT a FROM oc_country  a WHERE "iso_code_2" = 'param0' AND "status" = '1'  
   */
  @Override
  public List<OcCountry> getCountryByIsoCode2(String iso_code_2) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode2.getCountryByIsoCode2");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("iso_code_2", iso_code_2);

    return query.getResultList();
  }

  /* *
   * ModelExtensionPaymentKlarnaCheckout.getZoneByCode.getZoneByCode
   * SELECT a FROM oc_zone  a WHERE "code" = 'param0' AND "country_id" = 'param1' AND "status" = '1'  
   */
  @Override
  public List<OcZone> getZoneByCode(String code,Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentKlarnaCheckout.getZoneByCode.getZoneByCode");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("code", code);
    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode3.getCountryByIsoCode3
   * SELECT a FROM oc_country  a WHERE "iso_code_3" = 'param0' AND "status" = '1'  
   */
  @Override
  public List<OcCountry> getCountryByIsoCode3(String iso_code_3) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode3.getCountryByIsoCode3");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("iso_code_3", iso_code_3);

    return query.getResultList();
  }

}