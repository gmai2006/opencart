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
package com.opencart.localisation;

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
public class ModelLocalisationCurrencyDaoImpl implements ModelLocalisationCurrencyDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelLocalisationCurrencyDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelLocalisationCurrency.getCurrencies.getCurrencies
   * SELECT a FROM oc_currency a  ORDER BY title ASC 
   */
  @Override
  public List<OcCurrency> getCurrencies() {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationCurrency.getCurrencies.getCurrencies");

    final Query query = em.createNativeQuery(queryName, OcCurrency.class);


    return query.getResultList();
  }

  /* *
   * ModelLocalisationCurrency.getCurrencyByCode.getCurrencyByCode
   * SELECT a FROM oc_currency  a WHERE code = 'param0'  
   */
  @Override
  public List<OcCurrency> getCurrencyByCode(String code) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationCurrency.getCurrencyByCode.getCurrencyByCode");

    final Query query = em.createNativeQuery(queryName, OcCurrency.class);

    query.setParameter("code", code);

    return query.getResultList();
  }

}