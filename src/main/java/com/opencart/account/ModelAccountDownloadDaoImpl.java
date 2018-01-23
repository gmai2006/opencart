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
package com.opencart.account;

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
public class ModelAccountDownloadDaoImpl implements ModelAccountDownloadDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountDownloadDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountDownload.getTotalDownloads.getTotalDownloads
   * SELECT COUNT(*) AS total FROM "oc_order" o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) WHERE o.customer_id = 'param0' AND (param1) 
   */
  @Override
  public java.math.BigInteger getTotalDownloads(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountDownload.getTotalDownloads.getTotalDownloads");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountDownload.getDownloads.getDownloads
   * SELECT DISTINCT d.download_id, o.order_id, o.date_added, dd.name, d.filename FROM "oc_order" o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN oc_download d ON (p2d.download_id = d.download_id) LEFT JOIN oc_download_description dd ON (d.download_id = dd.download_id) WHERE o.customer_id = 'param0' AND dd.language_id = 'param1' AND (param2) ORDER BY o.date_added DESC LIMIT param3,param4 
   */
  @Override
  public List<ModelAccountDownload0Dto> getDownloads(Integer customer_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountDownload.getDownloads.getDownloads");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountDownload0Dto(query.getResultList());
  }

  /* *
   * ModelAccountDownload.getDownload.getDownload
   * SELECT d.filename, d.mask FROM "oc_order" o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN oc_download d ON (p2d.download_id = d.download_id) WHERE o.customer_id = 'param0' AND (param1) AND d.download_id = 'param2' 
   */
  @Override
  public List<ModelAccountDownload1Dto> getDownload(Integer customer_id,Integer download_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountDownload.getDownload.getDownload");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);
    query.setParameter("download_id", download_id);

    return fromListOfArrayModelAccountDownload1Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountDownload0Dto> fromListOfArrayModelAccountDownload0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountDownload0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountDownload1Dto> fromListOfArrayModelAccountDownload1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountDownload1Dto.fromArray(x)).collect(Collectors.toList());
  }
}