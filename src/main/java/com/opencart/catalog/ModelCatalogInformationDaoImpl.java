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
public class ModelCatalogInformationDaoImpl implements ModelCatalogInformationDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelCatalogInformationDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelCatalogInformation.getInformation.getInformation
   * SELECT i.information_id, i.bottom, i.sort_order, i.status, id.information_id as information_id0, id.language_id, id.title, id.description, id.meta_title, id.meta_description, id.meta_keyword, i2s.information_id as information_id01, i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id ) WHERE i.information_id = 'param0' AND id.language_id = 'param1' AND i2s.store_id = 'param2' AND i.status = '1' 
   */
  @Override
  public List<ModelCatalogInformation0Dto> getInformation(Integer information_id,Integer language_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogInformation.getInformation.getInformation");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("information_id", information_id);
    query.setParameter("language_id", language_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogInformation0Dto(query.getResultList());
  }

  /* *
   * ModelCatalogInformation.getInformations.getInformations
   * SELECT i.information_id, i.bottom, i.sort_order, i.status, id.information_id as information_id0, id.language_id, id.title, id.description, id.meta_title, id.meta_description, id.meta_keyword, i2s.information_id as information_id01, i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id ) WHERE id.language_id = 'param0' AND i2s.store_id = 'param1' AND i.status = '1' ORDER BY i.sort_order , LCASE( id.title ) ASC 
   */
  @Override
  public List<ModelCatalogInformation0Dto> getInformations(Integer language_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogInformation.getInformations.getInformations");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogInformation0Dto(query.getResultList());
  }

  /* *
   * ModelCatalogInformation.getInformationLayoutId.getInformationLayoutId
   * SELECT a FROM oc_information_to_layout  a WHERE information_id = 'param0' AND store_id = 'param1'  
   */
  @Override
  public List<OcInformationToLayout> getInformationLayoutId(Integer information_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCatalogInformation.getInformationLayoutId.getInformationLayoutId");

    final Query query = em.createNativeQuery(queryName, OcInformationToLayout.class);

    query.setParameter("information_id", information_id);
    query.setParameter("store_id", store_id);

    return query.getResultList();
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogInformation0Dto> fromListOfArrayModelCatalogInformation0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogInformation0Dto.fromArray(x)).collect(Collectors.toList());
  }
}