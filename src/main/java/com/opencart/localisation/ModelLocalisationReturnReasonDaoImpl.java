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
public class ModelLocalisationReturnReasonDaoImpl implements ModelLocalisationReturnReasonDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelLocalisationReturnReasonDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelLocalisationReturnReason.getReturnReasons.getReturnReasons
   * SELECT return_reason_id, name FROM oc_return_reason WHERE language_id = 'param0' ORDER BY name 
   */
  @Override
  public List<ModelLocalisationReturnReason0Dto> getReturnReasons(Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelLocalisationReturnReason.getReturnReasons.getReturnReasons");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);

    return fromListOfArrayModelLocalisationReturnReason0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelLocalisationReturnReason0Dto> fromListOfArrayModelLocalisationReturnReason0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelLocalisationReturnReason0Dto.fromArray(x)).collect(Collectors.toList());
  }
}