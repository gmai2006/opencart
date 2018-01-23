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
package com.opencart.extension.openbay;

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
public class ModelExtensionOpenBayEtsyOrderDaoImpl implements ModelExtensionOpenBayEtsyOrderDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionOpenBayEtsyOrderDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionOpenBayEtsyOrder.create.create
   * SELECT a FROM "oc_country"  a WHERE "iso_code_2" = 'param0'  
   */
  @Override
  public List<OcCountry> create(String iso_code_2) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayEtsyOrder.create.create");

    final Query query = em.createNativeQuery(queryName, OcCountry.class);

    query.setParameter("iso_code_2", iso_code_2);

    return query.getResultList();
  }

}