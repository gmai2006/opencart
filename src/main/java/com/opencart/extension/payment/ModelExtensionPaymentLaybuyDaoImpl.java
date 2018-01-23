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
package com.opencart.extension.payment;

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
public class ModelExtensionPaymentLaybuyDaoImpl implements ModelExtensionPaymentLaybuyDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionPaymentLaybuyDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionPaymentLaybuy.getMethod.getQuery
   * SELECT a FROM "oc_zone_to_geo_zone"  a WHERE "geo_zone_id" = 'param0' AND "country_id" = 'param1' AND( "zone_id" = 'param2' OR "zone_id" = '0' )  
   */
  @Override
  public List<OcZoneToGeoZone> getQuery(Integer geo_zone_id,Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentLaybuy.getMethod.getQuery");

    final Query query = em.createNativeQuery(queryName, OcZoneToGeoZone.class);

    query.setParameter("geo_zone_id", geo_zone_id);
    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionPaymentLaybuy.getMethod.getProduct
   * SELECT GROUP_CONCAT("category_id") as "categories" FROM "oc_product_to_category" WHERE "product_id" = 'param0' 
   */
  @Override
  public String getProduct(Integer product_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentLaybuy.getMethod.getProduct");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_id", product_id);

    return (String)query.getSingleResult();
  }

}