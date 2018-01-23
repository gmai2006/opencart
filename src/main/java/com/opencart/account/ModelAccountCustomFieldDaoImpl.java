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
public class ModelAccountCustomFieldDaoImpl implements ModelAccountCustomFieldDao {
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  protected ModelAccountCustomFieldDaoImpl(final Provider<EntityManager> entityManagerProvider) {
      requireNonNull(entityManagerProvider);

      this.entityManagerProvider = entityManagerProvider;
  }

  /* *
   * ModelAccountCustomField.getCustomFields.getCustomFieldValueQuery
   * SELECT cfv.custom_field_value_id, cfv.custom_field_id, cfv.sort_order, cfvd.custom_field_value_id as custom_field_value_id0, cfvd.language_id, cfvd.custom_field_id as custom_field_id0, cfvd.name FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON( cfv.custom_field_value_id = cfvd.custom_field_value_id ) WHERE cfv.custom_field_id = 'param0' AND cfvd.language_id = 'param1' ORDER BY cfv.sort_order ASC 
   */
  @Override
  public List<ModelAccountCustomField0Dto> getCustomFieldValueQuery(Integer custom_field_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomField.getCustomFields.getCustomFieldValueQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("custom_field_id", custom_field_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountCustomField0Dto(query.getResultList());
  }

  /* *
   * ModelAccountCustomField.getCustomFields.getCustomFieldQuery
   * SELECT cfcg.custom_field_id, cfcg.customer_group_id, cfcg.required, cf.custom_field_id as custom_field_id0, cf.type, cf.value, cf.validation, cf.location, cf.status, cf.sort_order, cfd.custom_field_id as custom_field_id01, cfd.language_id, cfd.name FROM "oc_custom_field_customer_group" cfcg LEFT JOIN "oc_custom_field" cf ON( cfcg.custom_field_id = cf.custom_field_id ) LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id ) WHERE cf.status = '1' AND cfd.language_id = 'param0' AND cfcg.customer_group_id = 'param1' ORDER BY cf.sort_order ASC 
   */
  @Override
  public List<ModelAccountCustomField1Dto> getCustomFieldQuery(Integer language_id,Integer customer_group_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomField.getCustomFields.getCustomFieldQuery");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("language_id", language_id);
    query.setParameter("customer_group_id", customer_group_id);

    return fromListOfArrayModelAccountCustomField1Dto(query.getResultList());
  }

  /* *
   * ModelAccountCustomField.getCustomField.getCustomField
   * SELECT cf.custom_field_id, cf.type, cf.value, cf.validation, cf.location, cf.status, cf.sort_order, cfd.custom_field_id as custom_field_id0, cfd.language_id, cfd.name FROM "oc_custom_field" cf LEFT JOIN "oc_custom_field_description" cfd ON( cf.custom_field_id = cfd.custom_field_id ) WHERE cf.status = '1' AND cf.custom_field_id = 'param0' AND cfd.language_id = 'param1' 
   */
  @Override
  public List<ModelAccountCustomField2Dto> getCustomField(Integer custom_field_id,Integer language_id) {

    final EntityManager em = entityManagerProvider.get();

    final String queryName = DaoUtils.getQuery("ModelAccountCustomField.getCustomField.getCustomField");

    final Query query = em.createNativeQuery(queryName);

    query.setParameter("custom_field_id", custom_field_id);
    query.setParameter("language_id", language_id);

    return fromListOfArrayModelAccountCustomField2Dto(query.getResultList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountCustomField0Dto> fromListOfArrayModelAccountCustomField0Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountCustomField0Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountCustomField1Dto> fromListOfArrayModelAccountCustomField1Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountCustomField1Dto.fromArray(x)).collect(Collectors.toList());
  }

  /*
   * Java8 version
   */
  private static List<ModelAccountCustomField2Dto> fromListOfArrayModelAccountCustomField2Dto(List<Object[]> list) {
    return list.stream().map(x -> ModelAccountCustomField2Dto.fromArray(x)).collect(Collectors.toList());
  }
}