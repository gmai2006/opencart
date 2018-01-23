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
public class ModelLocalisationLanguageDaoImpl implements ModelLocalisationLanguageDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelLocalisationLanguageDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelLocalisationLanguage.getLanguage.getLanguage
   * SELECT a FROM oc_language  a WHERE language_id = 'param0'  
   */
  @Override
  public List<OcLanguage> getLanguage(Integer language_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationLanguage.getLanguage.getLanguage");

    final Query query = em.createNativeQuery(queryName, OcLanguage.class);

    query.setParameter("language_id", language_id);

    return query.getResultList();
  }

  /* *
   * ModelLocalisationLanguage.getLanguages.getLanguages
   * SELECT a FROM oc_language  a WHERE status = '1' ORDER BY sort_order , name 
   */
  @Override
  public List<OcLanguage> getLanguages() {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationLanguage.getLanguages.getLanguages");

    final Query query = em.createNativeQuery(queryName, OcLanguage.class);


    return query.getResultList();
  }

}