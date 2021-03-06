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
public class ModelExtensionOpenBayAmazonOrderDaoImpl implements ModelExtensionOpenBayAmazonOrderDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionOpenBayAmazonOrderDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionOpenBayAmazonOrder.getProductOptionsByVar.getProductOptionsByVar
   * SELECT pov.product_option_id, pov.product_option_value_id, od.name, ovd.name as value, opt.type FROM "oc_product_option_value" as pov, "oc_product_option" as po, "oc_option" as opt, "oc_option_value_description" as ovd, "oc_option_description" as od WHERE pov.product_option_value_id = 'param0' AND po.product_option_id = pov.product_option_id AND opt.option_id = pov.option_id AND ovd.option_value_id = pov.option_value_id AND ovd.language_id = 'param1' AND od.option_id = pov.option_id AND od.language_id = 'param2'  
   */
  @Override
  public List<ModelExtensionOpenBayAmazonOrder0Dto> getProductOptionsByVar(Integer product_option_value_id,String language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayAmazonOrder.getProductOptionsByVar.getProductOptionsByVar");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("product_option_value_id", product_option_value_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelExtensionOpenBayAmazonOrder0Dto(query.getResultList());
  }

  /* *
   * ModelExtensionOpenBayAmazonOrder.getZoneId.getZoneId
   * SELECT "zone_id" FROM "oc_zone" WHERE LOWER("name") = 'param0' 
   */
  @Override
  public List<Integer> getZoneId(String name) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayAmazonOrder.getZoneId.getZoneId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("name", name);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayAmazonOrder.addAmazonOrderProducts.addAmazonOrderProducts
   * SELECT "order_product_id" FROM "oc_order_product" WHERE "model" = 'param0' AND "order_id" = param1 LIMIT 1 
   */
  @Override
  public List<Integer> addAmazonOrderProducts(String model,Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayAmazonOrder.addAmazonOrderProducts.addAmazonOrderProducts");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("model", model);
    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayAmazonOrder.getCountryId.getCountryId
   * SELECT "country_id" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0' 
   */
  @Override
  public List<Integer> getCountryId(String iso_code_2) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayAmazonOrder.getCountryId.getCountryId");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("iso_code_2", iso_code_2);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayAmazonOrder.getOrderStatus.getOrderStatus
   * SELECT "order_status_id" FROM "oc_order" WHERE "order_id" = param0 
   */
  @Override
  public List<Integer> getOrderStatus(Integer order_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayAmazonOrder.getOrderStatus.getOrderStatus");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("order_id", order_id);

    return query.getResultList();
  }

  /* *
   * ModelExtensionOpenBayAmazonOrder.getCountryName.getCountryName
   * SELECT "name" FROM "oc_country" WHERE LOWER("iso_code_2") = 'param0' 
   */
  @Override
  public List<String> getCountryName(String iso_code_2) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionOpenBayAmazonOrder.getCountryName.getCountryName");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("iso_code_2", iso_code_2);

    return query.getResultList();
  }

  /*
   * Java8 version
   */
  private static List<ModelExtensionOpenBayAmazonOrder0Dto> fromListOfArrayModelExtensionOpenBayAmazonOrder0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelExtensionOpenBayAmazonOrder0Dto.fromArray(x)).collect(Collectors.toList());
  }
}