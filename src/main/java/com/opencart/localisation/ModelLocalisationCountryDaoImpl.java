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
public class ModelLocalisationCountryDaoImpl implements ModelLocalisationCountryDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelLocalisationCountryDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelLocalisationCountry.getCountries.getCountries
   * SELECT a FROM oc_country  a WHERE status = '1' ORDER BY name ASC 
   */
  @Override
  public List<OcCountry> getCountries() {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationCountry.getCountries.getCountries");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);


    return query.getResultList();
  }

  /* *
   * ModelLocalisationCountry.getCountry.getCountry
   * SELECT a FROM oc_country  a WHERE country_id = 'param0' AND status = '1'  
   */
  @Override
  public List<OcCountry> getCountry(Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationCountry.getCountry.getCountry");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

}