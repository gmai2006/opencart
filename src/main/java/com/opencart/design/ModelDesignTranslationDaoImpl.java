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
package com.opencart.design;

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
public class ModelDesignTranslationDaoImpl implements ModelDesignTranslationDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelDesignTranslationDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelDesignTranslation.getTranslations.getTranslations
   * SELECT a FROM oc_translation  a WHERE store_id = 'param0' AND language_id = 'param1' AND route = 'param2'  
   */
  @Override
  public List<OcTranslation> getTranslations(Integer store_id,Integer language_id,String route) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelDesignTranslation.getTranslations.getTranslations");

    final Query query = em.createNativeQuery(queryName, OcTranslation.class);

    query.setParameter("store_id", store_id);
    query.setParameter("language_id", language_id);
    query.setParameter("route", route);

    return query.getResultList();
  }

}