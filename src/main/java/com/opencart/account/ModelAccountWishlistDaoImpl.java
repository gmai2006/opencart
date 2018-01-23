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
public class ModelAccountWishlistDaoImpl implements ModelAccountWishlistDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountWishlistDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountWishlist.getWishlist.getWishlist
   * SELECT a FROM oc_customer_wishlist  a WHERE customer_id = 'param0'  
   */
  @Override
  public List<OcCustomerWishlist> getWishlist(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelAccountWishlist.getWishlist.getWishlist");

    final Query query = em.createNativeQuery(queryName, OcCustomerWishlist.class);

    query.setParameter("customer_id", customer_id);

    return query.getResultList();
  }

  /* *
   * ModelAccountWishlist.getTotalWishlist.getTotalWishlist
   * SELECT COUNT(*) AS total FROM oc_customer_wishlist WHERE customer_id = 'param0' 
   */
  @Override
  public java.math.BigInteger getTotalWishlist(Integer customer_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountWishlist.getTotalWishlist.getTotalWishlist");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("customer_id", customer_id);

    return (java.math.BigInteger)query.getSingleResult();
  }

}