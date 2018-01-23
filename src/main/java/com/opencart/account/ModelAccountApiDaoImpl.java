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
public class ModelAccountApiDaoImpl implements ModelAccountApiDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountApiDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountApi.getApiByKey.getApiByKey
   * SELECT a FROM "oc_api"  a WHERE "key" = 'param0' AND status = '1'  
   */
  @Override
  public List<OcApi> getApiByKey(String key) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountApi.getApiByKey.getApiByKey");

    final Query query = em.createNativeQuery(queryName, OcApi.class);

    query.setParameter("key", key);

    return query.getResultList();
  }

  /* *
   * ModelAccountApi.getApiIps.getApiIps
   * SELECT a FROM "oc_api_ip"  a WHERE api_id = 'param0'  
   */
  @Override
  public List<OcApiIp> getApiIps(Integer api_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountApi.getApiIps.getApiIps");

    final Query query = em.createNativeQuery(queryName, OcApiIp.class);

    query.setParameter("api_id", api_id);

    return query.getResultList();
  }

}