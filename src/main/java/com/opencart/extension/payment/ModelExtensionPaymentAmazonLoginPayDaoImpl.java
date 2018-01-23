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
public class ModelExtensionPaymentAmazonLoginPayDaoImpl implements ModelExtensionPaymentAmazonLoginPayDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionPaymentAmazonLoginPayDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionPaymentAmazonLoginPay.addAddress.addAddress
   * SELECT a FROM "oc_address"  a WHERE "firstname" = 'param0' AND "lastname" = 'param1' AND "address_1" = 'param2' AND "address_2" = 'param3' AND "postcode" = 'param4' AND "city" = 'param5' AND "zone_id" = 'param6' AND "country_id" = 'param7'  
   */
  @Override
  public List<OcAddress> addAddress(String firstname,String lastname,String address_1,String address_2,String postcode,String city,Integer zone_id,Integer country_id) {

    final EntityManager em = entityManagerProvider.get();


    final String queryName = DaoUtils.getQuery("ModelExtensionPaymentAmazonLoginPay.addAddress.addAddress");

    final Query query = em.createNativeQuery(queryName, OcAddress.class);

    query.setParameter("firstname", firstname);
    query.setParameter("lastname", lastname);
    query.setParameter("address_1", address_1);
    query.setParameter("address_2", address_2);
    query.setParameter("postcode", postcode);
    query.setParameter("city", city);
    query.setParameter("zone_id", zone_id);
    query.setParameter("country_id", country_id);

    return query.getResultList();
  }

}