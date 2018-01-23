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
public class ModelAccountCustomerDaoImpl implements ModelAccountCustomerDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountCustomerDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountCustomer.addLoginAttempt.addLoginAttempt
   * SELECT a FROM oc_customer_login  a WHERE email = 'param0' AND ip = 'param1'  
   */
  @Override
  public List<OcCustomerLogin> addLoginAttempt(String email,String ip) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.addLoginAttempt.addLoginAttempt");

    final Query query = em.createNativeQuery(queryName, OcCustomerLogin.class);

    query.setParameter("email", email);
    query.setParameter("ip", ip);

    return query.getResultList();
  }

  /* *
   * ModelAccountCustomer.getCustomerByEmail.getCustomerByEmail
   * SELECT a FROM oc_customer  a WHERE LOWER( email ) = 'param0'  
   */
  @Override
  public List<OcCustomer> getCustomerByEmail(String email) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getCustomerByEmail.getCustomerByEmail");

    final Query query = em.createNativeQuery(queryName, OcCustomer.class);

    query.setParameter("email", email);

    return query.getResultList();
  }

  /* *
   * ModelAccountCustomer.getIps.getIps
   * SELECT a FROM "oc_customer_ip"  a WHERE customer_id = 'param0'  
   */
  @Override
  public List<OcCustomerIp> getIps(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getIps.getIps");

    final Query query = em.createNativeQuery(queryName, OcCustomerIp.class);

    query.setParameter("customer_id", customer_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountCustomer.getLoginAttempts.getLoginAttempts
   * SELECT a FROM "oc_customer_login"  a WHERE email = 'param0'  
   */
  @Override
  public List<OcCustomerLogin> getLoginAttempts(String email) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getLoginAttempts.getLoginAttempts");

    final Query query = em.createNativeQuery(queryName, OcCustomerLogin.class);

    query.setParameter("email", email);

    return query.getResultList();
  }

  /* *
   * ModelAccountCustomer.getRewardTotal.getRewardTotal
   * SELECT SUM(points) AS total FROM oc_customer_reward WHERE customer_id = 'param0' 
   */
  @Override
  public java.math.BigDecimal getRewardTotal(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getRewardTotal.getRewardTotal");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigDecimal)query.getSingleResult();
  }

  /* *
   * ModelAccountCustomer.getCustomerByCode.getCustomerByCode
   * SELECT customer_id, firstname, lastname, email FROM "oc_customer" WHERE code = 'param0' AND code != '' 
   */
  @Override
  public List<ModelAccountCustomer0Dto> getCustomerByCode(String code) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getCustomerByCode.getCustomerByCode");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("code", code);

    return fromListOfArrayModelAccountCustomer0Dto(query.getResultList());
  }

  /* *
   * ModelAccountCustomer.getTotalCustomersByEmail.getTotalCustomersByEmail
   * SELECT COUNT(*) AS total FROM oc_customer WHERE LOWER(email) = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalCustomersByEmail(String email) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getTotalCustomersByEmail.getTotalCustomersByEmail");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("email", email);

    return (java.math.BigInteger)query.getSingleResult();
  }

  /* *
   * ModelAccountCustomer.getCustomer.getCustomer
   * SELECT a FROM oc_customer  a WHERE customer_id = 'param0'  
   */
  @Override
  public List<OcCustomer> getCustomer(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getCustomer.getCustomer");

    final Query query = em.createNativeQuery(queryName, OcCustomer.class);

    query.setParameter("customer_id", customer_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountCustomer.getCustomerByToken.getCustomerByToken
   * SELECT a FROM oc_customer  a WHERE token = 'param0' AND token != ''  
   */
  @Override
  public List<OcCustomer> getCustomerByToken(String token) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountCustomer.getCustomerByToken.getCustomerByToken");

    final Query query = em.createNativeQuery(queryName, OcCustomer.class);

    query.setParameter("token", token);

    return query.getResultList();
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountCustomer0Dto> fromListOfArrayModelAccountCustomer0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountCustomer0Dto.fromArray(x)).collect(Collectors.toList());
  }
}