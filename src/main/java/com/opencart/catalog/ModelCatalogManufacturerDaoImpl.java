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
package com.opencart.catalog;

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
public class ModelCatalogManufacturerDaoImpl implements ModelCatalogManufacturerDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelCatalogManufacturerDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelCatalogManufacturer.getManufacturer.getManufacturer
   * SELECT m.manufacturer_id, m.name, m.image, m.sort_order, m2s.manufacturer_id as manufacturer_id0, m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id ) WHERE m.manufacturer_id = 'param0' AND m2s.store_id = 'param1' 
   */
  @Override
  public List<ModelCatalogManufacturer0Dto> getManufacturer(Integer manufacturer_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogManufacturer.getManufacturer.getManufacturer");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("manufacturer_id", manufacturer_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogManufacturer0Dto(query.getResultList());
  }

  /* *
   * ModelCatalogManufacturer.getManufacturers.getManufacturers
   * SELECT m.manufacturer_id, m.name, m.image, m.sort_order, m2s.manufacturer_id as manufacturer_id0, m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id = m2s.manufacturer_id ) WHERE m2s.store_id = 'param0' ORDER BY name 
   */
  @Override
  public List<ModelCatalogManufacturer0Dto> getManufacturers(Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogManufacturer.getManufacturers.getManufacturers");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogManufacturer0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogManufacturer0Dto> fromListOfArrayModelCatalogManufacturer0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogManufacturer0Dto.fromArray(x)).collect(Collectors.toList());
  }
}