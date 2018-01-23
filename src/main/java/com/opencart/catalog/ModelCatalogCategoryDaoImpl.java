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
public class ModelCatalogCategoryDaoImpl implements ModelCatalogCategoryDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelCatalogCategoryDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelCatalogCategory.getCategoryFilters.getFilterQuery
   * SELECT DISTINCT f.filter_id, fd.name FROM oc_filter f LEFT JOIN oc_filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id IN (param0) AND f.filter_group_id = 'param1' AND fd.language_id = 'param2' ORDER BY f.sort_order, LCASE(fd.name) 
   */
  @Override
  public List<ModelCatalogCategory0Dto> getFilterQuery(Integer filter_group_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getCategoryFilters.getFilterQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("filter_group_id", filter_group_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogCategory0Dto(query.getResultList());
  }

  /* *
   * ModelCatalogCategory.getCategoryFilters.getQuery
   * SELECT filter_id FROM oc_category_filter WHERE category_id = 'param0' 
   */
  @Override
  public List<Integer> getQuery(Integer category_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getCategoryFilters.getQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("category_id", category_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogCategory.getTotalCategoriesByCategoryId.getTotalCategoriesByCategoryId
   * SELECT COUNT(*) AS total FROM oc_category c LEFT JOIN oc_category_to_store c2s ON (c.category_id = c2s.category_id) WHERE c.parent_id = 'param0' AND c2s.store_id = 'param1' AND c.status = '1' 
   */
  @Override
  public java.math.BigInteger getTotalCategoriesByCategoryId(Integer parent_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getTotalCategoriesByCategoryId.getTotalCategoriesByCategoryId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("parent_id", parent_id);
    query.setParameter("store_id", store_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelCatalogCategory.getCategoryLayoutId.getCategoryLayoutId
   * SELECT a FROM oc_category_to_layout  a WHERE category_id = 'param0' AND store_id = 'param1'  
   */
  @Override
  public List<OcCategoryToLayout> getCategoryLayoutId(Integer category_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getCategoryLayoutId.getCategoryLayoutId");

    final Query query = em.createNativeQuery(queryName, OcCategoryToLayout.class);

    query.setParameter("category_id", category_id);
    query.setParameter("store_id", store_id);

    return query.getResultList();
  }

  /* *
   * ModelCatalogCategory.getCategoryFilters.getFilterGroupQuery
   * SELECT DISTINCT f.filter_group_id, fgd.name, fg.sort_order FROM oc_filter f LEFT JOIN oc_filter_group fg ON (f.filter_group_id = fg.filter_group_id) LEFT JOIN oc_filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE f.filter_id IN (param0) AND fgd.language_id = 'param1' GROUP BY f.filter_group_id ORDER BY fg.sort_order, LCASE(fgd.name) 
   */
  @Override
  public List<ModelCatalogCategory1Dto> getFilterGroupQuery(Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getCategoryFilters.getFilterGroupQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogCategory1Dto(query.getResultList());
  }

  /* *
   * ModelCatalogCategory.getCategory.getCategory
   * SELECT c.category_id, c.image, c.parent_id, c.top, c.column, c.sort_order, c.status, c.date_added, c.date_modified, cd.category_id as category_id0, cd.language_id, cd.name, cd.description, cd.meta_title, cd.meta_description, cd.meta_keyword, c2s.category_id as category_id01, c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id ) WHERE c.category_id = 'param0' AND cd.language_id = 'param1' AND c2s.store_id = 'param2' AND c.status = '1' 
   */
  @Override
  public List<ModelCatalogCategory2Dto> getCategory(Integer category_id,Integer language_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getCategory.getCategory");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("category_id", category_id);
    query.setParameter("language_id", language_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogCategory2Dto(query.getResultList());
  }

  /* *
   * ModelCatalogCategory.getCategories.getCategories
   * SELECT c.category_id, c.image, c.parent_id, c.top, c.column, c.sort_order, c.status, c.date_added, c.date_modified, cd.category_id as category_id0, cd.language_id, cd.name, cd.description, cd.meta_title, cd.meta_description, cd.meta_keyword, c2s.category_id as category_id01, c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id = cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id = c2s.category_id ) WHERE c.parent_id = 'param0' AND cd.language_id = 'param1' AND c2s.store_id = 'param2' AND c.status = '1' ORDER BY c.sort_order , LCASE( cd.name ) 
   */
  @Override
  public List<ModelCatalogCategory2Dto> getCategories(Integer parent_id,Integer language_id,Integer store_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogCategory.getCategories.getCategories");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("parent_id", parent_id);
    query.setParameter("language_id", language_id);
    query.setParameter("store_id", store_id);

    return fromListOfArrayModelCatalogCategory2Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogCategory0Dto> fromListOfArrayModelCatalogCategory0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogCategory0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogCategory1Dto> fromListOfArrayModelCatalogCategory1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogCategory1Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogCategory2Dto> fromListOfArrayModelCatalogCategory2Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogCategory2Dto.fromArray(x)).collect(Collectors.toList());
  }
}