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
public class ModelLocalisationLocationDaoImpl implements ModelLocalisationLocationDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelLocalisationLocationDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelLocalisationLocation.getLocation.getLocation
   * SELECT location_id, name, address, geocode, telephone, fax, image, open, comment FROM oc_location WHERE location_id = 'param0' 
   */
  @Override
  public List<ModelLocalisationLocation0Dto> getLocation(Integer location_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelLocalisationLocation.getLocation.getLocation");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("location_id", location_id);

    return fromListOfArrayModelLocalisationLocation0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelLocalisationLocation0Dto> fromListOfArrayModelLocalisationLocation0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelLocalisationLocation0Dto.fromArray(x)).collect(Collectors.toList());
  }
}