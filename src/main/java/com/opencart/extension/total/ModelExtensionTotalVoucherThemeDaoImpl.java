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
package com.opencart.extension.total;

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
public class ModelExtensionTotalVoucherThemeDaoImpl implements ModelExtensionTotalVoucherThemeDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelExtensionTotalVoucherThemeDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelExtensionTotalVoucherTheme.getVoucherThemes.getVoucherThemes
   * SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vtd.language_id = 'param0' ORDER BY vtd.name 
   */
  @Override
  public List<ModelExtensionTotalVoucherTheme0Dto> getVoucherThemes(Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalVoucherTheme.getVoucherThemes.getVoucherThemes");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);

    return fromListOfArrayModelExtensionTotalVoucherTheme0Dto(query.getResultList());
  }

  /* *
   * ModelExtensionTotalVoucherTheme.getVoucherTheme.getVoucherTheme
   * SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vt.voucher_theme_id = 'param0' AND vtd.language_id = 'param1' 
   */
  @Override
  public List<ModelExtensionTotalVoucherTheme0Dto> getVoucherTheme(Integer voucher_theme_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelExtensionTotalVoucherTheme.getVoucherTheme.getVoucherTheme");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("voucher_theme_id", voucher_theme_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelExtensionTotalVoucherTheme0Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelExtensionTotalVoucherTheme0Dto> fromListOfArrayModelExtensionTotalVoucherTheme0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelExtensionTotalVoucherTheme0Dto.fromArray(x)).collect(Collectors.toList());
  }
}