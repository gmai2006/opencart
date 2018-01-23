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
public class ModelAccountCustomerGroupDaoImpl implements ModelAccountCustomerGroupDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountCustomerGroupDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountCustomerGroup.getCustomerGroup.getCustomerGroup
   * SELECT cg.customer_group_id, cg.approval, cg.sort_order, cgd.customer_group_id as customer_group_id0, cgd.language_id, cgd.name, cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id = cgd.customer_group_id ) WHERE cg.customer_group_id = 'param0' AND cgd.language_id = 'param1' 
   */
  @Override
  public List<ModelAccountCustomerGroup0Dto> getCustomerGroup(Integer customer_group_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomerGroup.getCustomerGroup.getCustomerGroup");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_group_id", customer_group_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountCustomerGroup0Dto(query.getResultList());
  }

  /* *
   * ModelAccountCustomerGroup.getCustomerGroups.getCustomerGroups
   * SELECT cg.customer_group_id, cg.approval, cg.sort_order, cgd.customer_group_id as customer_group_id0, cgd.language_id, cgd.name, cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id = cgd.customer_group_id ) WHERE cgd.language_id = 'param0' ORDER BY cg.sort_order ASC , cgd.name ASC 
   */
  @Override
  public List<ModelAccountCustomerGroup0Dto> getCustomerGroups(Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomerGroup.getCustomerGroups.getCustomerGroups");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountCustomerGroup0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountCustomerGroup0Dto> fromListOfArrayModelAccountCustomerGroup0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountCustomerGroup0Dto.fromArray(x)).collect(Collectors.toList());
  }
}