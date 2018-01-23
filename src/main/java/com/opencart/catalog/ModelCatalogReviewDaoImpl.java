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
public class ModelCatalogReviewDaoImpl implements ModelCatalogReviewDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelCatalogReviewDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelCatalogReview.getTotalReviewsByProductId.getTotalReviewsByProductId
   * SELECT COUNT(*) AS total FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = 'param0' AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = 'param1' 
   */
  @Override
  public java.math.BigInteger getTotalReviewsByProductId(Integer product_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogReview.getTotalReviewsByProductId.getTotalReviewsByProductId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("language_id", language_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelCatalogReview.getReviewsByProductId.getReviewsByProductId
   * SELECT r.review_id, r.author, r.rating, r.text, p.product_id, pd.name, p.price, p.image, r.date_added FROM oc_review r LEFT JOIN oc_product p ON (r.product_id = p.product_id) LEFT JOIN oc_product_description pd ON (p.product_id = pd.product_id) WHERE p.product_id = 'param0' AND p.date_available <= NOW() AND p.status = '1' AND r.status = '1' AND pd.language_id = 'param1' ORDER BY r.date_added DESC LIMIT param2,param3 
   */
  @Override
  public List<ModelCatalogReview0Dto> getReviewsByProductId(Integer product_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelCatalogReview.getReviewsByProductId.getReviewsByProductId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelCatalogReview0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelCatalogReview0Dto> fromListOfArrayModelCatalogReview0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelCatalogReview0Dto.fromArray(x)).collect(Collectors.toList());
  }
}