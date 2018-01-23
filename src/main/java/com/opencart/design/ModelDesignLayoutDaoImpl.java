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
public class ModelDesignLayoutDaoImpl implements ModelDesignLayoutDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelDesignLayoutDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelDesignLayout.getLayout.getLayout
   * SELECT a FROM oc_layout_route  a WHERE 'param0' LIKE route AND store_id = 'param1' ORDER BY route DESC LIMIT 1
   */
  @Override
  public List<OcLayoutRoute> getLayout(Integer store_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelDesignLayout.getLayout.getLayout");

    final Query query = em.createNativeQuery(queryName, OcLayoutRoute.class);

    query.setParameter("store_id", store_id);

    return query.getResultList();
  }

  /* *
   * ModelDesignLayout.getLayoutModules.getLayoutModules
   * SELECT a FROM oc_layout_module  a WHERE layout_id = 'param0' AND position = 'param1' ORDER BY sort_order 
   */
  @Override
  public List<OcLayoutModule> getLayoutModules(Integer layout_id,String position) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelDesignLayout.getLayoutModules.getLayoutModules");

    final Query query = em.createNativeQuery(queryName, OcLayoutModule.class);

    query.setParameter("layout_id", layout_id);
    query.setParameter("position", position);

    return query.getResultList();
  }

}