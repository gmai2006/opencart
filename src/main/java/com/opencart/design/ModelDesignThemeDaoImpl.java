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
public class ModelDesignThemeDaoImpl implements ModelDesignThemeDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelDesignThemeDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelDesignTheme.getTheme.getTheme
   * SELECT a FROM oc_theme  a WHERE store_id = 'param0' AND theme = 'param1' AND route = 'param2'  
   */
  @Override
  public List<OcTheme> getTheme(Integer store_id,String theme,String route) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelDesignTheme.getTheme.getTheme");

    final Query query = em.createNativeQuery(queryName, OcTheme.class);

    query.setParameter("store_id", store_id);
    query.setParameter("theme", theme);
    query.setParameter("route", route);

    return query.getResultList();
  }

}