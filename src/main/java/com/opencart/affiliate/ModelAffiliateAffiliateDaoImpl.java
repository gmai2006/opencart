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
package com.opencart.affiliate;

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
public class ModelAffiliateAffiliateDaoImpl implements ModelAffiliateAffiliateDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAffiliateAffiliateDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAffiliateAffiliate.getTransactionTotal.getTransactionTotal
   * SELECT SUM(amount) AS total FROM oc_affiliate_transaction WHERE affiliate_id = 'param0' 
   */
  @Override
  public java.math.BigDecimal getTransactionTotal(Integer affiliate_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.getTransactionTotal.getTransactionTotal");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("affiliate_id", affiliate_id);

    return (java.math.BigDecimal)query.getSingleResult();
  }

  /* *
   * ModelAffiliateAffiliate.getAffiliate.getAffiliate
   * SELECT a FROM oc_affiliate  a WHERE affiliate_id = 'param0'  
   */
  @Override
  public List<OcAffiliate> getAffiliate(Integer affiliate_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.getAffiliate.getAffiliate");

    final Query query = em.createNativeQuery(queryName, OcAffiliate.class);

    query.setParameter("affiliate_id", affiliate_id);

    return query.getResultList();
  }

  /* *
   * ModelAffiliateAffiliate.getAffiliateByEmail.getAffiliateByEmail
   * SELECT a FROM oc_affiliate  a WHERE LOWER( email ) = 'param0'  
   */
  @Override
  public List<OcAffiliate> getAffiliateByEmail(String email) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.getAffiliateByEmail.getAffiliateByEmail");

    final Query query = em.createNativeQuery(queryName, OcAffiliate.class);

    query.setParameter("email", email);

    return query.getResultList();
  }

  /* *
   * ModelAffiliateAffiliate.getTotalAffiliatesByEmail.getTotalAffiliatesByEmail
   * SELECT COUNT(*) AS total FROM oc_affiliate WHERE LOWER(email) = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalAffiliatesByEmail(String email) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.getTotalAffiliatesByEmail.getTotalAffiliatesByEmail");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("email", email);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAffiliateAffiliate.getAffiliateByCode.getAffiliateByCode
   * SELECT a FROM oc_affiliate  a WHERE code = 'param0'  
   */
  @Override
  public List<OcAffiliate> getAffiliateByCode(String code) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.getAffiliateByCode.getAffiliateByCode");

    final Query query = em.createNativeQuery(queryName, OcAffiliate.class);

    query.setParameter("code", code);

    return query.getResultList();
  }

  /* *
   * ModelAffiliateAffiliate.addLoginAttempt.addLoginAttempt
   * SELECT a FROM oc_affiliate_login  a WHERE email = 'param0' AND ip = 'param1'  
   */
  @Override
  public List<OcAffiliateLogin> addLoginAttempt(String email,String ip) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.addLoginAttempt.addLoginAttempt");

    final Query query = em.createNativeQuery(queryName, OcAffiliateLogin.class);

    query.setParameter("email", email);
    query.setParameter("ip", ip);

    return query.getResultList();
  }

  /* *
   * ModelAffiliateAffiliate.getLoginAttempts.getLoginAttempts
   * SELECT a FROM "oc_affiliate_login"  a WHERE email = 'param0'  
   */
  @Override
  public List<OcAffiliateLogin> getLoginAttempts(String email) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAffiliateAffiliate.getLoginAttempts.getLoginAttempts");

    final Query query = em.createNativeQuery(queryName, OcAffiliateLogin.class);

    query.setParameter("email", email);

    return query.getResultList();
  }

}