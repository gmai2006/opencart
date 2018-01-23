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
public class ModelLocalisationZoneDaoImpl implements ModelLocalisationZoneDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelLocalisationZoneDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelLocalisationZone.getZonesByCountryId.getZonesByCountryId
   * SELECT a FROM oc_zone  a WHERE country_id = 'param0' AND status = '1' ORDER BY name 
   */
  @Override
  public List<OcZone> getZonesByCountryId(Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationZone.getZonesByCountryId.getZonesByCountryId");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelLocalisationZone.getZone.getZone
   * SELECT a FROM oc_zone  a WHERE zone_id = 'param0' AND status = '1'  
   */
  @Override
  public List<OcZone> getZone(Integer zone_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelLocalisationZone.getZone.getZone");

    final Query query = em.createNativeQuery(queryName, OcZone.class);

    query.setParameter("zone_id", zone_id);

    return query.getResultList();
  }

}